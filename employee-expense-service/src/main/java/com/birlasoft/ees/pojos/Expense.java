package com.birlasoft.ees.pojos;

import java.time.LocalDate;

public class Expense {

	private int id;
	private String email;
	private String name;
	private double price;
	private String description;
	private LocalDate expensedate;
	
	public Expense() {
		// TODO Auto-generated constructor stub
	}

	public Expense(int id, String email, String name, double price, String description, LocalDate expensedate) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.price = price;
		this.description = description;
		this.expensedate = expensedate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getExpensedate() {
		return expensedate;
	}

	public void setExpensedate(LocalDate expensedate) {
		this.expensedate = expensedate;
	}	
}
