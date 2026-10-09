package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

public class DocumentFetcher {
    private final  OkHttpClient client = new OkHttpClient();

    public String fetchFromUrl(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        ResponseBody body = response.body();
            if (body == null){
                throw new IOException("Response body was null for URL : "+url);
            }
        return body.string();
    }
}
