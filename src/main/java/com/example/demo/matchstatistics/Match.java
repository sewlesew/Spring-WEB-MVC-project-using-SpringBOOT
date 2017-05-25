package com.example.demo.matchstatistics;

import java.util.Date;

public class Match {
	private long matchKey;
	 private Date date;
	 private Date startTime;
	 private Stadium stadium;
	 private int homeScore;
	 private int visitorScore;
	 private Team visitorTeam; 
	 
	 public Match(){
		 
	 }
	 public Match(Date date,Date startTime,int homeScore){
		 this.date=date;
		 this.startTime=startTime;
		 this.homeScore=homeScore;
	 }
	 
	 public Team getVisitorTeam() {
		return visitorTeam;
	}

	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	private Team homeTeam;
	
	 
	 public long getMatchKey() {
		return matchKey;
	}
	public void setMatchKey(long matchKey) {
		this.matchKey = matchKey;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public int getHomeScore() {
		return homeScore;
	}
	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}
	public int getVisitorScore() {
		return visitorScore;
	}
	public void setVisitorScore(int visitorScore) {
		this.visitorScore = visitorScore;
	}
	


}
