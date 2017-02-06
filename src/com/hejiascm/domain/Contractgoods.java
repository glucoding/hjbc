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
		@NamedQuery(name = "findAllContractgoodss", query = "select myContractgoods from Contractgoods myContractgoods"),
		@NamedQuery(name = "findContractgoodsByDescription", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.description = ?1"),
		@NamedQuery(name = "findContractgoodsByDescriptionContaining", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.description like ?1"),
		@NamedQuery(name = "findContractgoodsById", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.id = ?1"),
		@NamedQuery(name = "findContractgoodsByIdContaining", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.id like ?1"),
		@NamedQuery(name = "findContractgoodsByName", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.name = ?1"),
		@NamedQuery(name = "findContractgoodsByNameContaining", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.name like ?1"),
		@NamedQuery(name = "findContractgoodsByPrimaryKey", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.id = ?1"),
		@NamedQuery(name = "findContractgoodsByProducer", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.producer = ?1"),
		@NamedQuery(name = "findContractgoodsByProducerContaining", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.producer like ?1"),
		@NamedQuery(name = "findContractgoodsByQuantity", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.quantity = ?1"),
		@NamedQuery(name = "findContractgoodsBySerial", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.serial = ?1"),
		@NamedQuery(name = "findContractgoodsBySerialContaining", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.serial like ?1"),
		@NamedQuery(name = "findContractgoodsBySpecs", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.specs = ?1"),
		@NamedQuery(name = "findContractgoodsBySpecsContaining", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.specs like ?1"),
		@NamedQuery(name = "findContractgoodsByTaxRate", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.taxRate = ?1"),
		@NamedQuery(name = "findContractgoodsByTotalAmount", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.totalAmount = ?1"),
		@NamedQuery(name = "findContractgoodsByUnit", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.unit = ?1"),
		@NamedQuery(name = "findContractgoodsByUnitContaining", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.unit like ?1"),
		@NamedQuery(name = "findContractgoodsByUnitPrice", query = "select myContractgoods from Contractgoods myContractgoods where myContractgoods.unitPrice = ?1") })
@Table(catalog = "hjdb", name = "ContractGoods")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Contractgoods")
public class Contractgoods implements Serializable {
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

	@Column(name = "quantity", precision = 22)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal quantity;
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
	@JoinColumns({ @JoinColumn(name = "contractID", referencedColumnName = "id") })
	@XmlTransient
	Tradecontract tradecontract;

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
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	/**
	 */
	public BigDecimal getQuantity() {
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
	public void setTradecontract(Tradecontract tradecontract) {
		this.tradecontract = tradecontract;
	}

	/**
	 */
	@JsonIgnore
	public Tradecontract getTradecontract() {
		return tradecontract;
	}

	/**
	 */
	public Contractgoods() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
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
