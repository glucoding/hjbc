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
		@NamedQuery(name = "findAllOrdergoodss", query = "select myOrdergoods from Ordergoods myOrdergoods"),
		@NamedQuery(name = "findOrdergoodsByDescription", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.description = ?1"),
		@NamedQuery(name = "findOrdergoodsByDescriptionContaining", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.description like ?1"),
		@NamedQuery(name = "findOrdergoodsById", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.id = ?1"),
		@NamedQuery(name = "findOrdergoodsByIdContaining", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.id like ?1"),
		@NamedQuery(name = "findOrdergoodsByName", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.name = ?1"),
		@NamedQuery(name = "findOrdergoodsByNameContaining", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.name like ?1"),
		@NamedQuery(name = "findOrdergoodsByPrimaryKey", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.id = ?1"),
		@NamedQuery(name = "findOrdergoodsByProducer", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.producer = ?1"),
		@NamedQuery(name = "findOrdergoodsByProducerContaining", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.producer like ?1"),
		@NamedQuery(name = "findOrdergoodsByQuantity", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.quantity = ?1"),
		@NamedQuery(name = "findOrdergoodsBySerial", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.serial = ?1"),
		@NamedQuery(name = "findOrdergoodsBySerialContaining", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.serial like ?1"),
		@NamedQuery(name = "findOrdergoodsBySpec", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.spec = ?1"),
		@NamedQuery(name = "findOrdergoodsBySpecContaining", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.spec like ?1"),
		@NamedQuery(name = "findOrdergoodsByTaxRate", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.taxRate = ?1"),
		@NamedQuery(name = "findOrdergoodsByTotalAmount", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.totalAmount = ?1"),
		@NamedQuery(name = "findOrdergoodsByUnit", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.unit = ?1"),
		@NamedQuery(name = "findOrdergoodsByUnitContaining", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.unit like ?1"),
		@NamedQuery(name = "findOrdergoodsByUnitPrice", query = "select myOrdergoods from Ordergoods myOrdergoods where myOrdergoods.unitPrice = ?1") })
@Table(catalog = "hjdb", name = "OrderGoods")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "HejiaSCM/com/hejiascm/domain", name = "Ordergoods")
public class Ordergoods implements Serializable {
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

	@Column(name = "serial", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String serial;
	/**
	 */

	@Column(name = "name", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "description", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;
	/**
	 */

	@Column(name = "spec", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String spec;
	/**
	 */

	@Column(name = "unit", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String unit;
	/**
	 */

	@Column(name = "quantity", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer quantity;
	/**
	 */

	@Column(name = "producer", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String producer;
	/**
	 */

	@Column(name = "unitPrice", precision = 22, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal unitPrice;
	/**
	 */

	@Column(name = "taxRate", precision = 22, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal taxRate;
	/**
	 */

	@Column(name = "totalAmount", precision = 22, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal totalAmount;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "orderId", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	Order order;

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
	public void setSpec(String spec) {
		this.spec = spec;
	}

	/**
	 */
	public String getSpec() {
		return this.spec;
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
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 */
	@JsonIgnore
	public Order getOrder() {
		return order;
	}

	/**
	 */
	public Ordergoods() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Ordergoods that) {
		setId(that.getId());
		setSerial(that.getSerial());
		setName(that.getName());
		setDescription(that.getDescription());
		setSpec(that.getSpec());
		setUnit(that.getUnit());
		setQuantity(that.getQuantity());
		setProducer(that.getProducer());
		setUnitPrice(that.getUnitPrice());
		setTaxRate(that.getTaxRate());
		setTotalAmount(that.getTotalAmount());
		setOrder(that.getOrder());
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
		buffer.append("spec=[").append(spec).append("] ");
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
	    if (!(obj instanceof Ordergoods))
	        return false;
	    Ordergoods equalCheck = (Ordergoods) obj;
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
