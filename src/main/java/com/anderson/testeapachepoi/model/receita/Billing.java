
package com.anderson.testeapachepoi.model.receita;

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
@JsonPropertyOrder({ "free", "database" })
public class Billing {

	@JsonProperty("free")
	private Boolean free;
	@JsonProperty("database")
	private Boolean database;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("free")
	public Boolean getFree() {
		return free;
	}

	@JsonProperty("free")
	public void setFree(Boolean free) {
		this.free = free;
	}

	@JsonProperty("database")
	public Boolean getDatabase() {
		return database;
	}

	@JsonProperty("database")
	public void setDatabase(Boolean database) {
		this.database = database;
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
		return new ToStringBuilder(this).append("free", free).append("database", database)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(free).append(additionalProperties).append(database).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Billing) == false) {
			return false;
		}
		Billing rhs = ((Billing) other);
		return new EqualsBuilder().append(free, rhs.free).append(additionalProperties, rhs.additionalProperties)
				.append(database, rhs.database).isEquals();
	}

}
