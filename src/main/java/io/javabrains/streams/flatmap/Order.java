package io.javabrains.streams.flatmap;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Order implements Serializable {
	public Order(Integer id, String invoice, List<LineItem> lineItems, BigDecimal total) {
		super();
		this.id = id;
		this.invoice = invoice;
		this.lineItems = lineItems;
		this.total = total;
	}

	private static final long serialVersionUID = 2856047485979607589L;
	private Integer id;
	private String invoice;
	private List<LineItem> lineItems;
	private BigDecimal total;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
