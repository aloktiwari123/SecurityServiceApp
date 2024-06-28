package com.nagarro.SecurityServiceApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + name + "]";
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return name;
	}

	public void setRole(String role) {
		this.name = role;
	}

	public Role(long id, String role) {
		super();
		this.id = id;
		this.name = role;
	}

	public Role() {

	}
}
