package com.kabira.final_var_method_class;

public class Player {
	
	int id;
	String name;
	int jerseyNo;
	public Player(int id, String name, int jerseyNo) {
		super();
		this.id = id;
		this.name = name;
		this.jerseyNo = jerseyNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	
	

}
