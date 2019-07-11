package com.anderson.testeapachepoi.testes;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TesteGetWS {

	public static void main(String[] args) throws IOException {
		final OkHttpClient client = new OkHttpClient();
		String BASE_URL = "https://www.receitaws.com.br/v1/cnpj";
		Request request = new Request.Builder().url(BASE_URL + "/27865757000102").build();

		try (Response response = client.newCall(request).execute()) {
			System.out.println(response.body().string());
		}

	}

}
