package com.example.atividades;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Atividade05_HttpClient {
    private OkHttpClient client;

    public Atividade05_HttpClient(OkHttpClient okHttpClient) {
		 client = okHttpClient;
	}

	public String getDataFromApi(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
