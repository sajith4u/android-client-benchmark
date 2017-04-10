package app.innova.dev.cleintbenchmark.util;

import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class AsyncClient {

    private String MOCK_URL = "http://demo7836701.mockable.io/benchmark";

    private static String GET = "GET";

    private static int CONNECTION_TIMEOUT = 75000;

    private static int READ_TIMEOUT = 60000;

    public Object getObject(Class successClass) throws Exception {
        Object getResponse;
        StringBuilder responseString = new StringBuilder();
        String fullUrl = (MOCK_URL).replace(" ", "%20");
        URL requestUrl = new URL(fullUrl);
        HttpURLConnection conn = getConnection(GET, requestUrl);
        conn.connect();
        InputStream connectionInputStream = getConnectionInputStream(conn);
        BufferedReader reader = new BufferedReader(new InputStreamReader(connectionInputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            responseString.append(line);
        }
        Log.d("GET Response >>", responseString.toString());
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 299) {
            getResponse = new Gson().fromJson(responseString.toString(), successClass);
        } else {
            getResponse = new Gson().fromJson(responseString.toString(), String.class);
        }
        conn.disconnect();
        return getResponse;
    }

    private HttpURLConnection getConnection(String type, URL requestUrl) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) requestUrl.openConnection();
        conn.setDoOutput(false);
        conn.setRequestMethod(type);
        conn.setReadTimeout(READ_TIMEOUT);
        conn.setConnectTimeout(CONNECTION_TIMEOUT);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept-Encoding", "gzip,deflate");
        conn.setRequestProperty("accept", "application/json");
        return conn;
    }

    private InputStream getConnectionInputStream(HttpURLConnection httpURLConnection) throws Exception {
        InputStream in;
        if (httpURLConnection.getResponseCode() >= 200 && httpURLConnection.getResponseCode() <= 299) {
            in = new BufferedInputStream(httpURLConnection.getInputStream());
        } else {
            in = new BufferedInputStream(httpURLConnection.getErrorStream());
        }
        return in;
    }
}
