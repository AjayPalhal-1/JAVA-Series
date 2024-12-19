package com.kabira;

public class Developer extends Employee {
	
	
	String skiSet;
	int bonus;
	
	public Developer(int id, String name, String skiSet, int bonus) {
		super(id, name);
		this.skiSet = skiSet;
		this.bonus = bonus;
	}
	public String getSkiSet() {
		return skiSet;
	}
	public void setSkiSet(String skiSet) {
		this.skiSet = skiSet;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void print() {
		System.out.println(" Develpoer :: ");
	}
	
	
	
	

}
