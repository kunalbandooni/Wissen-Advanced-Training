package com.example.demo.Person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@Column(name="policy_id")
	private int policyId;
	
	@Column(name="name")
	private String name;

	@Column(name="policy_amount")
	private double policyAmount;
	
	@Column(name="emi")
	private double emi;
	
	public Person(){}
	
	public Person(int policyId, String name, double policyAmount, double emi)
	{
		this.policyId = policyId;
		this.name = name;
		this.policyAmount = policyAmount;
		this.emi = emi;
	}
	
	public int getPolicyId() {	
		return this.policyId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPolicyAmount() {
		return this.policyAmount;
	}
	
	public double getEmi() {
		return this.emi;
	}
	
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	public void setEmi(double emi) {
		this.emi = emi;
	}
	
}