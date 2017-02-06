package com.hejiascm.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.xml.bind.annotation.*;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllReceivinggoodss", query = "select myReceivinggoods from Receivinggoods myReceivinggoods"),
		@NamedQuery(name = "findReceivinggoodsByDescription", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.description = ?1"),
		@NamedQuery(name = "findReceivinggoodsByDescriptionContaining", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.description like ?1"),
		@NamedQuery(name = "findReceivinggoodsById", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.id = ?1"),
		@NamedQuery(name = "findReceivinggoodsByIdContaining", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.id like ?1"),
		@NamedQuery(name = "findReceivinggoodsByName", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.name = ?1"),
		@NamedQuery(name = "findReceivinggoodsByNameContaining", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.name like ?1"),
		@NamedQuery(name = "findReceivinggoodsByPrimaryKey", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.id = ?1"),
		@NamedQuery(name = "findReceivinggoodsByProducer", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.producer = ?1"),
		@NamedQuery(name = "findReceivinggoodsByProducerContaining", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.producer like ?1"),
		@NamedQuery(name = "findReceivinggoodsByQuantity", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.quantity = ?1"),
		@NamedQuery(name = "findReceivinggoodsBySerial", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.serial = ?1"),
		@NamedQuery(name = "findReceivinggoodsBySerialContaining", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.serial like ?1"),
		@NamedQuery(name = "findReceivinggoodsBySpecs", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.specs = ?1"),
		@NamedQuery(name = "findReceivinggoodsBySpecsContaining", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.specs like ?1"),
		@NamedQuery(name = "findReceivinggoodsByTaxRate", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.taxRate = ?1"),
		@NamedQuery(name = "findReceivinggoodsByTotalAmount", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.totalAmount = ?1"),
		@NamedQuery(name = "findReceivinggoodsByUnit", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.unit = ?1"),
		@NamedQuery(name = "findReceivinggoodsByUnitContaining", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.unit like ?1"),
		@NamedQuery(name = "findReceivinggoodsByUnitPrice", query = "select myReceivinggoods from Receivinggoods myReceivinggoods where myReceivinggoods.unitPrice = ?1") })
@Table(catalog = "hjdb", name = "ReceivingGoods")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Receivinggoods")
public class Receivinggoods implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid")
	@GeneratedValue(generator="idGenerator")
	@XmlElement
	String id;
	/**
	 */

	@Column(name = "serial")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String serial;
	/**
	 */

	@Column(name = "name")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;
	/**
	 */

	@Column(name = "specs")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String specs;
	/**
	 */

	@Column(name = "unit")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String unit;
	/**
	 */

	@Column(name = "quantity")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer quantity;
	/**
	 */

	@Column(name = "producer")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String producer;
	/**
	 */

	@Column(name = "unitPrice", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal unitPrice;
	/**
	 */

	@Column(name = "taxRate", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal taxRate;
	/**
	 */

	@Column(name = "totalAmount", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal totalAmount;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "receivingId", referencedColumnName = "id") })
	@XmlTransient
	Receivingrecord receivingrecord;

	/**
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 */
	public String getId() {
		return this.id;
	}

	/**
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 */
	public String getSerial() {
		return this.serial;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setSpecs(String specs) {
		this.specs = specs;
	}

	/**
	 */
	public String getSpecs() {
		return this.specs;
	}

	/**
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 */
	public String getUnit() {
		return this.unit;
	}

	/**
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 */
	public Integer getQuantity() {
		return this.quantity;
	}

	/**
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

	/**
	 */
	public String getProducer() {
		return this.producer;
	}

	/**
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 */
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	/**
	 */
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	/**
	 */
	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	/**
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 */
	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	/**
	 */
	public void setReceivingrecord(Receivingrecord receivingrecord) {
		this.receivingrecord = receivingrecord;
	}

	/**
	 */
	@JsonIgnore
	public Receivingrecord getReceivingrecord() {
		return receivingrecord;
	}

	/**
	 */
	public Receivinggoods() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Receivinggoods that) {
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
		setReceivingrecord(that.getReceivingrecord());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
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
	    if (!(obj instanceof Receivinggoods))
	        return false;
	    Receivinggoods equalCheck = (Receivinggoods) obj;
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
