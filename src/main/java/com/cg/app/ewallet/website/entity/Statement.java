package com.cg.app.ewallet.website.entity;

import java.time.LocalDateTime;

public class Statement {
	private Integer statementId;
	private String transactionType;
	public Statement() {
		super();
	}
	private Double amount;
	private LocalDateTime dateTime;
	public Statement(Integer statementId, String transactionType, Double amount, LocalDateTime dateTime,
			Integer orderId, String transactionRemarks) {
		super();
		this.statementId = statementId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.orderId = orderId;
		this.transactionRemarks = transactionRemarks;
	}
	public Integer getStatementId() {
		return statementId;
	}
	public void setStatementId(Integer statementId) {
		this.statementId = statementId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getTransactionRemarks() {
		return transactionRemarks;
	}
	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}
	@Override
	public String toString() {
		return "Statement [statementId=" + statementId + ", transactionType=" + transactionType + ", amount=" + amount
				+ ", dateTime=" + dateTime + ", orderId=" + orderId + ", transactionRemarks=" + transactionRemarks
				+ "]";
	}
	private Integer orderId;
	private String transactionRemarks;

}
