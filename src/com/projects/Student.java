package com.projects;

public class Student extends Group {
	private String rollNumber;
	private String name;
	private double english;
	private double tamil;
	private double physics;
	private double chemistry;
	private double maths;
	private double computerScience;
	private double total;
	
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getTamil() {
		return tamil;
	}
	public void setTamil(double tamil) {
		this.tamil = tamil;
	}
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	public double getChemistry() {
		return chemistry;
	}
	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getComputerScience() {
		return computerScience;
	}
	public void setComputerScience(double computerScience) {
		this.computerScience = computerScience;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}