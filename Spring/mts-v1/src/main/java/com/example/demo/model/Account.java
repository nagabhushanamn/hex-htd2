package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS", schema = "mts")
public class Account {

	@Id
	private String num;
	private String name;
	private double balance;
	@Enumerated(EnumType.STRING)
	@Column(name = "acc_type")
	private AccountType type;

	@Override
	public String toString() {
		return "Account [num=" + num + ", name=" + name + ", balance=" + balance + ", type=" + type + "]";
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

}
