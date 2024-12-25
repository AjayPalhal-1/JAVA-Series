package com.kabira.final_var_method_class;

public class CricketPlayer  extends Player{
	
	int totalRuns;

	public CricketPlayer(int id, String name, int jerseyNo, int totalRuns) {
		super(id, name, jerseyNo);
		this.totalRuns = totalRuns;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Player Runs : " +this.getTotalRuns());
	}

	
	
	

}
