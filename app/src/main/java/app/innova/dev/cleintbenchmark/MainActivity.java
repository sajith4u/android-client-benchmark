package app.innova.dev.cleintbenchmark;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import app.innova.dev.cleintbenchmark.async.UrlConnectionAsyncTask;
import app.innova.dev.cleintbenchmark.beans.Example;
import app.innova.dev.cleintbenchmark.util.RestClient;
import app.innova.dev.cleintbenchmark.util.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getName();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button retrofit = (Button) findViewById(R.id.retrofit);
        Button okhttp = (Button) findViewById(R.id.okhttp);
        Button android = (Button) findViewById(R.id.android);

        final RetrofitClient apiService =
                RestClient.getClient().create(RetrofitClient.class);
        retrofit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String format = sdf.format(new Date());
                Log.d(TAG, "Date : " + format);
                Call<Example> call = apiService.getBenchmarkResults();
                call.enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        Log.d(TAG, String.valueOf(response.code()));
                        Example movies = response.body();
                        if (movies != null) {
                            String format = sdf.format(new Date());
                            Log.d(TAG, "Date : " + format);
                            System.out.println("Data :" + movies.toString());
                            Log.d(TAG, "Data :" + movies.toString());
                        }

                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {
                        Log.e(TAG, t.toString());
                    }
                });
            }
        });
        okhttp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UrlConnectionAsyncTask urlConnectionAsyncTask = new UrlConnectionAsyncTask();
                urlConnectionAsyncTask.execute("");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
