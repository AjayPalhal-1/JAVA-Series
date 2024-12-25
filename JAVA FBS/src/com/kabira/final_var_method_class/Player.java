package com.kabira.final_var_method_class;

public class Player {
	
	static final  int id = 101;
	String name;
	int jerseyNo;
	
	
	
	public Player(int id, String name, int jerseyNo) {
		
//		this.id = id;
		this.name = name;
		this.jerseyNo = jerseyNo;
	}
	public int getId() {
		return id;
	
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
	
	public void display()
	{
	
		System.out.println("Player ID :"+this.getId());
		System.out.println("Player Name :"+this.getName());
		System.out.println("Player Jersey No.S :"+this.getJerseyNo());

	}
	
	

}
