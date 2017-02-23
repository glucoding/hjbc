package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Contractgoods implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	String serial;
	String name;
	String description;
	String specs;
	String unit;
	BigDecimal quantity;
	String producer;
	BigDecimal unitPrice;
	BigDecimal taxRate;
	BigDecimal totalAmount;
	Tradecontract tradecontract;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public String getSpecs() {
		return this.specs;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getProducer() {
		return this.producer;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTradecontract(Tradecontract tradecontract) {
		this.tradecontract = tradecontract;
	}

	@JsonIgnore
	public Tradecontract getTradecontract() {
		return tradecontract;
	}

	public Contractgoods() {
	}

	public void copy(Contractgoods that) {
		setId(that.getId());
		setSerial(that.getSerial());
		setName(that.getName());
		setDescription(that.getDescription());
		setSpecs(that.getSpecs());
		setUnit(that.getUnit());
		setQuantity(that.getQuantity());
		setProducer(that.getProducer());
		setUnitPrice(that.getUnitPrice());
		setTaxRate(that.getTaxRate());
		setTotalAmount(that.getTotalAmount());
		setTradecontract(that.getTradecontract());
	}

	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("serial=[").append(serial).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("specs=[").append(specs).append("] ");
		buffer.append("unit=[").append(unit).append("] ");
		buffer.append("quantity=[").append(quantity).append("] ");
		buffer.append("producer=[").append(producer).append("] ");
		buffer.append("unitPrice=[").append(unitPrice).append("] ");
		buffer.append("taxRate=[").append(taxRate).append("] ");
		buffer.append("totalAmount=[").append(totalAmount).append("] ");

		return buffer.toString();
	}

	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
	    result = (int) (prime * result + ((name== null) ? 0 : name.hashCode()));
	    return result;
	}

	public boolean equals(Object obj) {
	    if (obj == this)
	        return true;
	    if (!(obj instanceof Contractgoods))
	        return false;
	    Contractgoods equalCheck = (Contractgoods) obj;
	    if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
	        return false;
	    if (id != null && !id.equals(equalCheck.id))
	        return false;
	    if ((name == null && equalCheck.name != null) || (name != null && equalCheck.name == null))
	        return false;
	    if (name!= null && !name.equals(equalCheck.name))
	        return false;

	    return true;
	}
}
