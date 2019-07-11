package com.anderson.testeapachepoi.testes;

import com.anderson.testeapachepoi.model.cep.CEPWS;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TesteConsultaCEP {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();

		final OkHttpClient client = new OkHttpClient();
		final String BASE_URL = "https://api.postmon.com.br/v1/cep/";
		String CEP = "87505080";
		Request request = new Request.Builder().url(BASE_URL + "/" + CEP).build();

		try (Response response = client.newCall(request).execute()) {
			System.out.println(response.body().string());

			CEPWS ex = objectMapper.readValue(response.body().bytes(), CEPWS.class);

			System.out.println(ex);

		} catch (Exception e) {

		}
	}

}
