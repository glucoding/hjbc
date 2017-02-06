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
		@NamedQuery(name = "findAllDeliverygoodss", query = "select myDeliverygoods from Deliverygoods myDeliverygoods"),
		@NamedQuery(name = "findDeliverygoodsByDescription", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.description = ?1"),
		@NamedQuery(name = "findDeliverygoodsByDescriptionContaining", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.description like ?1"),
		@NamedQuery(name = "findDeliverygoodsById", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.id = ?1"),
		@NamedQuery(name = "findDeliverygoodsByIdContaining", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.id like ?1"),
		@NamedQuery(name = "findDeliverygoodsByName", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.name = ?1"),
		@NamedQuery(name = "findDeliverygoodsByNameContaining", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.name like ?1"),
		@NamedQuery(name = "findDeliverygoodsByPrimaryKey", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.id = ?1"),
		@NamedQuery(name = "findDeliverygoodsByProducer", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.producer = ?1"),
		@NamedQuery(name = "findDeliverygoodsByProducerContaining", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.producer like ?1"),
		@NamedQuery(name = "findDeliverygoodsByQuantity", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.quantity = ?1"),
		@NamedQuery(name = "findDeliverygoodsBySerial", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.serial = ?1"),
		@NamedQuery(name = "findDeliverygoodsBySerialContaining", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.serial like ?1"),
		@NamedQuery(name = "findDeliverygoodsBySpecs", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.specs = ?1"),
		@NamedQuery(name = "findDeliverygoodsBySpecsContaining", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.specs like ?1"),
		@NamedQuery(name = "findDeliverygoodsByTaxRate", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.taxRate = ?1"),
		@NamedQuery(name = "findDeliverygoodsByTotalAmount", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.totalAmount = ?1"),
		@NamedQuery(name = "findDeliverygoodsByUnit", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.unit = ?1"),
		@NamedQuery(name = "findDeliverygoodsByUnitContaining", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.unit like ?1"),
		@NamedQuery(name = "findDeliverygoodsByUnitPrice", query = "select myDeliverygoods from Deliverygoods myDeliverygoods where myDeliverygoods.unitPrice = ?1") })
@Table(catalog = "hjdb", name = "DeliveryGoods")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Deliverygoods")
public class Deliverygoods implements Serializable {
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
	@JoinColumns({ @JoinColumn(name = "deliveryId", referencedColumnName = "id") })
	@XmlTransient
	Deliveryrecord deliveryrecord;

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
	public void setDeliveryrecord(Deliveryrecord deliveryrecord) {
		this.deliveryrecord = deliveryrecord;
	}

	/**
	 */
	@JsonIgnore
	public Deliveryrecord getDeliveryrecord() {
		return deliveryrecord;
	}

	/**
	 */
	public Deliverygoods() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Deliverygoods that) {
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
		setDeliveryrecord(that.getDeliveryrecord());
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
	    if (!(obj instanceof Deliverygoods))
	        return false;
	    Deliverygoods equalCheck = (Deliverygoods) obj;
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
