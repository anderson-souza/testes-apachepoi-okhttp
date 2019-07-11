package com.anderson.testeapachepoi.utils;

import com.anderson.testeapachepoi.model.cep.CEPWS;
import com.anderson.testeapachepoi.model.receita.ReceitaWS;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class UtilsWebService {

	private static final UtilsWebService INSTANCE = new UtilsWebService();
	private final OkHttpClient client;
	private ObjectMapper objectMapper;

	private UtilsWebService() {
		client = new OkHttpClient();
		objectMapper = new ObjectMapper();
	}

	public static UtilsWebService getInstance() {
		return INSTANCE;
	}

	public ReceitaWS consultaReceita(String CNPJ) {

		CNPJ = CNPJ.replaceAll("[^A-Za-z0-9]", "");

		final String BASE_URL = "https://www.receitaws.com.br/v1/cnpj";
		Request request = new Request.Builder().url(BASE_URL + "/" + CNPJ).build();
		ReceitaWS receitaWS = null;
		try (Response response = client.newCall(request).execute()) {
			receitaWS = objectMapper.readValue(response.body().bytes(), ReceitaWS.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return receitaWS;
	}

	public CEPWS consultaCEP(String CEP) {

		CEP = CEP.replaceAll("[^A-Za-z0-9]", "");

		final String BASE_URL = "https://api.postmon.com.br/v1/cep/";
		Request request = new Request.Builder().url(BASE_URL + "/" + CEP).build();
		CEPWS cepWS = null;
		try (Response response = client.newCall(request).execute()) {
			cepWS = objectMapper.readValue(response.body().bytes(), CEPWS.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cepWS;
	}

}
