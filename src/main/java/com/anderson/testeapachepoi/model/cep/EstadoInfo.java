
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
@JsonPropertyOrder({ "area_km2", "codigo_ibge", "nome" })
public class EstadoInfo {

	@JsonProperty("area_km2")
	private String areaKm2;
	@JsonProperty("codigo_ibge")
	private String codigoIbge;
	@JsonProperty("nome")
	private String nome;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("area_km2")
	public String getAreaKm2() {
		return areaKm2;
	}

	@JsonProperty("area_km2")
	public void setAreaKm2(String areaKm2) {
		this.areaKm2 = areaKm2;
	}

	@JsonProperty("codigo_ibge")
	public String getCodigoIbge() {
		return codigoIbge;
	}

	@JsonProperty("codigo_ibge")
	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}

	@JsonProperty("nome")
	public void setNome(String nome) {
		this.nome = nome;
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
		return new ToStringBuilder(this).append("areaKm2", areaKm2).append("codigoIbge", codigoIbge)
				.append("nome", nome).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(nome).append(codigoIbge).append(areaKm2)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof EstadoInfo) == false) {
			return false;
		}
		EstadoInfo rhs = ((EstadoInfo) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(nome, rhs.nome)
				.append(codigoIbge, rhs.codigoIbge).append(areaKm2, rhs.areaKm2).isEquals();
	}

}
