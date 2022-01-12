package com.macy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_totals")
public class OrderTotalsEntity {
	@GeneratedValue
	@Id
	private int id;
	private double totalPurchaseAmount;
	private double seperatorOrderTotals0;

	public OrderTotalsEntity() {
	}

	public OrderTotalsEntity(int id, double totalPurchaseAmount, double seperatorOrderTotals0) {
		super();
		this.totalPurchaseAmount = totalPurchaseAmount;
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public double getTotalPurchaseAmount() {
		return totalPurchaseAmount;
	}

	public void setTotalPurchaseAmount(double totalPurchaseAmount) {
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

	public double getSeperatorOrderTotals0() {
		return seperatorOrderTotals0;
	}

	public void setSeperatorOrderTotals0(double seperatorOrderTotals0) {
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
	}

	@Override
	public String toString() {
		return "OrderTotals [totalPurchaseAmount=" + totalPurchaseAmount + ", seperatorOrderTotals0="
				+ seperatorOrderTotals0 + "]";
	}

}
