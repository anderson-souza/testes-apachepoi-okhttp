package com.anderson.testeapachepoi;

import javax.swing.JOptionPane;

import com.anderson.testeapachepoi.model.cep.CEPWS;
import com.anderson.testeapachepoi.model.receita.ReceitaWS;
import com.anderson.testeapachepoi.utils.UtilsWebService;

public class MainClass {

	public static void main(String[] args) {

		// 09376495000122
		// 87505080

		String cnpj = JOptionPane.showInputDialog("Entre com o CNPJ");

		ReceitaWS receita = new ReceitaWS();
		receita = UtilsWebService.getInstance().consultaReceita(cnpj);

		CEPWS cepConsulta = new CEPWS();
		String CEP = JOptionPane.showInputDialog("Entre com o CEP");

		cepConsulta = UtilsWebService.getInstance().consultaCEP(CEP);

		System.out.println(receita.getCnpj());
		System.out.println(cepConsulta.getBairro());

	}

}
