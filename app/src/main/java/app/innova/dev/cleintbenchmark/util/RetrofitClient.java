package app.innova.dev.cleintbenchmark.util;

import app.innova.dev.cleintbenchmark.beans.Example;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitClient {

    @GET("benchmark")
    Call<Example> getBenchmarkResults();
}
