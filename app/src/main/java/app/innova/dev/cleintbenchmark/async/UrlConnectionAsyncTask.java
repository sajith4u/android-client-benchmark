package app.innova.dev.cleintbenchmark.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

import app.innova.dev.cleintbenchmark.MainActivity;
import app.innova.dev.cleintbenchmark.beans.Example;
import app.innova.dev.cleintbenchmark.util.RestClient;

/**
 * Created by sajith on 4/5/17.
 */

public class UrlConnectionAsyncTask extends AsyncTask<String, Activity, Object> {

    private static String TAG = UrlConnectionAsyncTask.class.getName();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    protected Object doInBackground(String... params) {
        Object responseJson = null;
        Log.d(TAG, "SENDING TIME " + sdf.format(new Date()));
        try {
            responseJson = new RestClient().getObject(Example.class);
        } catch (Exception e) {
            Log.d(TAG, e.getMessage(), e.fillInStackTrace());
        }
        Log.d("JSON", "JSON object recieved in Async Task  \n >> " + responseJson);

        return responseJson;
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        if (o != null) {
            if (o instanceof Example) {
                Example example = (Example) o;
                Log.d(TAG, "END TIME " + sdf.format(new Date()));
                Log.d(TAG, "RESPONSE SUCCESS : " + example.toString());
            } else {
                Log.d(TAG, "RESPONSE Failed");
            }
        }
    }
}
