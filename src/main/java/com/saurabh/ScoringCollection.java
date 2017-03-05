package com.saurabh;

import java.util.ArrayList;
import java.util.List;

public class ScoringCollection {
	private List<Scoreable> scoreList=new ArrayList<Scoreable>();
	public void add(Scoreable score){
		this.scoreList.add(score);
	}
	
	public double getMeanScore(){
		return this.scoreList.stream().mapToInt(x->x.getScore()).sum()/this.scoreList.size();
	}
	
	public List<Scoreable> getScoreList(){
		return this.scoreList;
	}
}
