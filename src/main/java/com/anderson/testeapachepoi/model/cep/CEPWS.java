
package com.anderson.testeapachepoi.model.cep;

import java.util.HashMap;
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
@JsonPropertyOrder({ "complemento", "bairro", "cidade", "logradouro", "estado_info", "cep", "cidade_info", "estado" })
public class CEPWS {

	@JsonProperty("complemento")
	private String complemento;
	@JsonProperty("bairro")
	private String bairro;
	@JsonProperty("cidade")
	private String cidade;
	@JsonProperty("logradouro")
	private String logradouro;
	@JsonProperty("estado_info")
	private EstadoInfo estadoInfo;
	@JsonProperty("cep")
	private String cep;
	@JsonProperty("cidade_info")
	private CidadeInfo cidadeInfo;
	@JsonProperty("estado")
	private String estado;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("complemento")
	public String getComplemento() {
		return complemento;
	}

	@JsonProperty("complemento")
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@JsonProperty("bairro")
	public String getBairro() {
		return bairro;
	}

	@JsonProperty("bairro")
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@JsonProperty("cidade")
	public String getCidade() {
		return cidade;
	}

	@JsonProperty("cidade")
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@JsonProperty("logradouro")
	public String getLogradouro() {
		return logradouro;
	}

	@JsonProperty("logradouro")
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@JsonProperty("estado_info")
	public EstadoInfo getEstadoInfo() {
		return estadoInfo;
	}

	@JsonProperty("estado_info")
	public void setEstadoInfo(EstadoInfo estadoInfo) {
		this.estadoInfo = estadoInfo;
	}

	@JsonProperty("cep")
	public String getCep() {
		return cep;
	}

	@JsonProperty("cep")
	public void setCep(String cep) {
		this.cep = cep;
	}

	@JsonProperty("cidade_info")
	public CidadeInfo getCidadeInfo() {
		return cidadeInfo;
	}

	@JsonProperty("cidade_info")
	public void setCidadeInfo(CidadeInfo cidadeInfo) {
		this.cidadeInfo = cidadeInfo;
	}

	@JsonProperty("estado")
	public String getEstado() {
		return estado;
	}

	@JsonProperty("estado")
	public void setEstado(String estado) {
		this.estado = estado;
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
		return new ToStringBuilder(this).append("complemento", complemento).append("bairro", bairro)
				.append("cidade", cidade).append("logradouro", logradouro).append("estadoInfo", estadoInfo)
				.append("cep", cep).append("cidadeInfo", cidadeInfo).append("estado", estado)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(cidadeInfo).append(cidade).append(bairro).append(estado).append(cep)
				.append(complemento).append(additionalProperties).append(logradouro).append(estadoInfo).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof CEPWS) == false) {
			return false;
		}
		CEPWS rhs = ((CEPWS) other);
		return new EqualsBuilder().append(cidadeInfo, rhs.cidadeInfo).append(cidade, rhs.cidade)
				.append(bairro, rhs.bairro).append(estado, rhs.estado).append(cep, rhs.cep)
				.append(complemento, rhs.complemento).append(additionalProperties, rhs.additionalProperties)
				.append(logradouro, rhs.logradouro).append(estadoInfo, rhs.estadoInfo).isEquals();
	}

}
