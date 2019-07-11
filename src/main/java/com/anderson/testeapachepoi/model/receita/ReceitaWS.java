
package com.anderson.testeapachepoi.model.receita;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "atividade_principal", "data_situacao", "nome", "uf", "telefone", "atividades_secundarias", "qsa",
		"situacao", "bairro", "logradouro", "numero", "cep", "municipio", "porte", "abertura", "natureza_juridica",
		"fantasia", "cnpj", "ultima_atualizacao", "status", "tipo", "complemento", "email", "efr", "motivo_situacao",
		"situacao_especial", "data_situacao_especial", "capital_social", "extra", "billing" })
public class ReceitaWS {

	@JsonProperty("atividade_principal")
	private List<AtividadePrincipal> atividadePrincipal = null;
	@JsonProperty("data_situacao")
	private String dataSituacao;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("uf")
	private String uf;
	@JsonProperty("telefone")
	private String telefone;
	@JsonProperty("atividades_secundarias")
	private List<AtividadesSecundaria> atividadesSecundarias = null;
	@JsonProperty("qsa")
	private List<Qsa> qsa = null;
	@JsonProperty("situacao")
	private String situacao;
	@JsonProperty("bairro")
	private String bairro;
	@JsonProperty("logradouro")
	private String logradouro;
	@JsonProperty("numero")
	private String numero;
	@JsonProperty("cep")
	private String cep;
	@JsonProperty("municipio")
	private String municipio;
	@JsonProperty("porte")
	private String porte;
	@JsonProperty("abertura")
	private String abertura;
	@JsonProperty("natureza_juridica")
	private String naturezaJuridica;
	@JsonProperty("fantasia")
	private String fantasia;
	@JsonProperty("cnpj")
	private String cnpj;
	@JsonProperty("ultima_atualizacao")
	private String ultimaAtualizacao;
	@JsonProperty("status")
	private String status;
	@JsonProperty("tipo")
	private String tipo;
	@JsonProperty("complemento")
	private String complemento;
	@JsonProperty("email")
	private String email;
	@JsonProperty("efr")
	private String efr;
	@JsonProperty("motivo_situacao")
	private String motivoSituacao;
	@JsonProperty("situacao_especial")
	private String situacaoEspecial;
	@JsonProperty("data_situacao_especial")
	private String dataSituacaoEspecial;
	@JsonProperty("capital_social")
	private String capitalSocial;
	@JsonProperty("extra")
	private Extra extra;
	@JsonProperty("billing")
	private Billing billing;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("atividade_principal")
	public List<AtividadePrincipal> getAtividadePrincipal() {
		return atividadePrincipal;
	}

	@JsonProperty("atividade_principal")
	public void setAtividadePrincipal(List<AtividadePrincipal> atividadePrincipal) {
		this.atividadePrincipal = atividadePrincipal;
	}

	@JsonProperty("data_situacao")
	public String getDataSituacao() {
		return dataSituacao;
	}

	@JsonProperty("data_situacao")
	public void setDataSituacao(String dataSituacao) {
		this.dataSituacao = dataSituacao;
	}

	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}

	@JsonProperty("nome")
	public void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("uf")
	public String getUf() {
		return uf;
	}

	@JsonProperty("uf")
	public void setUf(String uf) {
		this.uf = uf;
	}

	@JsonProperty("telefone")
	public String getTelefone() {
		return telefone;
	}

	@JsonProperty("telefone")
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@JsonProperty("atividades_secundarias")
	public List<AtividadesSecundaria> getAtividadesSecundarias() {
		return atividadesSecundarias;
	}

	@JsonProperty("atividades_secundarias")
	public void setAtividadesSecundarias(List<AtividadesSecundaria> atividadesSecundarias) {
		this.atividadesSecundarias = atividadesSecundarias;
	}

	@JsonProperty("qsa")
	public List<Qsa> getQsa() {
		return qsa;
	}

	@JsonProperty("qsa")
	public void setQsa(List<Qsa> qsa) {
		this.qsa = qsa;
	}

	@JsonProperty("situacao")
	public String getSituacao() {
		return situacao;
	}

	@JsonProperty("situacao")
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@JsonProperty("bairro")
	public String getBairro() {
		return bairro;
	}

	@JsonProperty("bairro")
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@JsonProperty("logradouro")
	public String getLogradouro() {
		return logradouro;
	}

	@JsonProperty("logradouro")
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@JsonProperty("numero")
	public String getNumero() {
		return numero;
	}

	@JsonProperty("numero")
	public void setNumero(String numero) {
		this.numero = numero;
	}

	@JsonProperty("cep")
	public String getCep() {
		return cep;
	}

	@JsonProperty("cep")
	public void setCep(String cep) {
		this.cep = cep;
	}

	@JsonProperty("municipio")
	public String getMunicipio() {
		return municipio;
	}

	@JsonProperty("municipio")
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	@JsonProperty("porte")
	public String getPorte() {
		return porte;
	}

	@JsonProperty("porte")
	public void setPorte(String porte) {
		this.porte = porte;
	}

	@JsonProperty("abertura")
	public String getAbertura() {
		return abertura;
	}

	@JsonProperty("abertura")
	public void setAbertura(String abertura) {
		this.abertura = abertura;
	}

	@JsonProperty("natureza_juridica")
	public String getNaturezaJuridica() {
		return naturezaJuridica;
	}

	@JsonProperty("natureza_juridica")
	public void setNaturezaJuridica(String naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}

	@JsonProperty("fantasia")
	public String getFantasia() {
		return fantasia;
	}

	@JsonProperty("fantasia")
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	@JsonProperty("cnpj")
	public String getCnpj() {
		return cnpj;
	}

	@JsonProperty("cnpj")
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@JsonProperty("ultima_atualizacao")
	public String getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	@JsonProperty("ultima_atualizacao")
	public void setUltimaAtualizacao(String ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("tipo")
	public String getTipo() {
		return tipo;
	}

	@JsonProperty("tipo")
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@JsonProperty("complemento")
	public String getComplemento() {
		return complemento;
	}

	@JsonProperty("complemento")
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("efr")
	public String getEfr() {
		return efr;
	}

	@JsonProperty("efr")
	public void setEfr(String efr) {
		this.efr = efr;
	}

	@JsonProperty("motivo_situacao")
	public String getMotivoSituacao() {
		return motivoSituacao;
	}

	@JsonProperty("motivo_situacao")
	public void setMotivoSituacao(String motivoSituacao) {
		this.motivoSituacao = motivoSituacao;
	}

	@JsonProperty("situacao_especial")
	public String getSituacaoEspecial() {
		return situacaoEspecial;
	}

	@JsonProperty("situacao_especial")
	public void setSituacaoEspecial(String situacaoEspecial) {
		this.situacaoEspecial = situacaoEspecial;
	}

	@JsonProperty("data_situacao_especial")
	public String getDataSituacaoEspecial() {
		return dataSituacaoEspecial;
	}

	@JsonProperty("data_situacao_especial")
	public void setDataSituacaoEspecial(String dataSituacaoEspecial) {
		this.dataSituacaoEspecial = dataSituacaoEspecial;
	}

	@JsonProperty("capital_social")
	public String getCapitalSocial() {
		return capitalSocial;
	}

	@JsonProperty("capital_social")
	public void setCapitalSocial(String capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	@JsonProperty("extra")
	public Extra getExtra() {
		return extra;
	}

	@JsonProperty("extra")
	public void setExtra(Extra extra) {
		this.extra = extra;
	}

	@JsonProperty("billing")
	public Billing getBilling() {
		return billing;
	}

	@JsonProperty("billing")
	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("atividadePrincipal", atividadePrincipal)
				.append("dataSituacao", dataSituacao).append("nome", nome).append("uf", uf).append("telefone", telefone)
				.append("atividadesSecundarias", atividadesSecundarias).append("qsa", qsa).append("situacao", situacao)
				.append("bairro", bairro).append("logradouro", logradouro).append("numero", numero).append("cep", cep)
				.append("municipio", municipio).append("porte", porte).append("abertura", abertura)
				.append("naturezaJuridica", naturezaJuridica).append("fantasia", fantasia).append("cnpj", cnpj)
				.append("ultimaAtualizacao", ultimaAtualizacao).append("status", status).append("tipo", tipo)
				.append("complemento", complemento).append("email", email).append("efr", efr)
				.append("motivoSituacao", motivoSituacao).append("situacaoEspecial", situacaoEspecial)
				.append("dataSituacaoEspecial", dataSituacaoEspecial).append("capitalSocial", capitalSocial)
				.append("extra", extra).append("billing", billing).append("additionalProperties", additionalProperties)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(dataSituacaoEspecial).append(motivoSituacao).append(cnpj)
				.append(ultimaAtualizacao).append(cep).append(capitalSocial).append(efr).append(situacao)
				.append(complemento).append(status).append(porte).append(uf).append(extra).append(naturezaJuridica)
				.append(atividadePrincipal).append(fantasia).append(qsa).append(numero).append(billing).append(bairro)
				.append(municipio).append(email).append(additionalProperties).append(tipo).append(telefone)
				.append(logradouro).append(dataSituacao).append(nome).append(abertura).append(atividadesSecundarias)
				.append(situacaoEspecial).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ReceitaWS) == false) {
			return false;
		}
		ReceitaWS rhs = ((ReceitaWS) other);
		return new EqualsBuilder().append(dataSituacaoEspecial, rhs.dataSituacaoEspecial)
				.append(motivoSituacao, rhs.motivoSituacao).append(cnpj, rhs.cnpj)
				.append(ultimaAtualizacao, rhs.ultimaAtualizacao).append(cep, rhs.cep)
				.append(capitalSocial, rhs.capitalSocial).append(efr, rhs.efr).append(situacao, rhs.situacao)
				.append(complemento, rhs.complemento).append(status, rhs.status).append(porte, rhs.porte)
				.append(uf, rhs.uf).append(extra, rhs.extra).append(naturezaJuridica, rhs.naturezaJuridica)
				.append(atividadePrincipal, rhs.atividadePrincipal).append(fantasia, rhs.fantasia).append(qsa, rhs.qsa)
				.append(numero, rhs.numero).append(billing, rhs.billing).append(bairro, rhs.bairro)
				.append(municipio, rhs.municipio).append(email, rhs.email)
				.append(additionalProperties, rhs.additionalProperties).append(tipo, rhs.tipo)
				.append(telefone, rhs.telefone).append(logradouro, rhs.logradouro)
				.append(dataSituacao, rhs.dataSituacao).append(nome, rhs.nome).append(abertura, rhs.abertura)
				.append(atividadesSecundarias, rhs.atividadesSecundarias).append(situacaoEspecial, rhs.situacaoEspecial)
				.isEquals();
	}

}
