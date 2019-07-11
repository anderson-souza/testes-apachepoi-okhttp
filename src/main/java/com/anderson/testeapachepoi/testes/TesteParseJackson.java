package com.anderson.testeapachepoi.testes;

import com.anderson.testeapachepoi.model.receita.ReceitaWS;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TesteParseJackson {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		final OkHttpClient client = new OkHttpClient();
		String BASE_URL = "https://www.receitaws.com.br/v1/cnpj";
		Request request = new Request.Builder().url(BASE_URL + "/27865757000102").build();

		try {
			Response response = client.newCall(request).execute();
			System.out.println(response.body().string());

			ReceitaWS ex = objectMapper.readValue(response.body().bytes(), ReceitaWS.class);

			System.out.println(ex);

		} catch (Exception e) {

		}

	}

}
