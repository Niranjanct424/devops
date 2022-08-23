package org.birlasoft.els.pojos;

import java.time.LocalDate;

public class Leave {

	private int id;
	private LocalDate leavedate;
	private String description;
	private String category;
	private String email;
	
	public Leave() {
		// TODO Auto-generated constructor stub
	}

	public Leave(int id, LocalDate leavedate, String description, String category, String email) {
		super();
		this.id = id;
		this.leavedate = leavedate;
		this.description = description;
		this.category = category;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(LocalDate leavedate) {
		this.leavedate = leavedate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
