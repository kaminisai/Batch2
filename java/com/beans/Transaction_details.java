package com.cg.bank.beans;

public class Transaction_details {
	private String tansaction_id,from_acc_no,to_acc_no;
	Float amount_transfered;
	public String getTansaction_id() {
		return tansaction_id;
	}
	public void setTansaction_id(String tansaction_id) {
		this.tansaction_id = tansaction_id;
	}
	public String getFrom_acc_no() {
		return from_acc_no;
	}
	public void setFrom_acc_no(String from_acc_no) {
		this.from_acc_no = from_acc_no;
	}
	public String getTo_acc_no() {
		return to_acc_no;
	}
	public void setTo_acc_no(String to_acc_no) {
		this.to_acc_no = to_acc_no;
	}
	public Float getAmount_transfered() {
		return amount_transfered;
	}
	public void setAmount_transfered(Float amount_transfered) {
		this.amount_transfered = amount_transfered;
	}
}
