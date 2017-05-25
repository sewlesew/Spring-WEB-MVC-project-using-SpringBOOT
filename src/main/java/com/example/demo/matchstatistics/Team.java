package com.example.demo.matchstatistics;

import java.util.*;
public class Team {

	private int teamKey;
	 private String name;
	 private String city;
	 private String mascot;
	 private List<Player> players;
	 private Uniform homeUniform;
	 private Uniform visitUniform;
	 private List<Match> matchesAsHome;	 
	 private List<Match> matchesAsVisitor;
	 public Team(){		
		 matchesAsHome=new ArrayList<Match>();
		 matchesAsVisitor=new ArrayList<Match>();
		 players=new ArrayList<Player>();
	 }
	 public Team(String name,String city,String mascot){
		 this.name=name;
		 this.city=city;
		 this.mascot=mascot;
		
		 }
	 public List<Player> getPlayers() {
		return players;
	}
	public void addPlayers(Player player) {
         players.add(player);
	}
	public List<Match> getMatchesAsHome() {
		return matchesAsHome;
	}
	public void addMatchesAsHome(Match match) {
		matchesAsHome.add(match);
	}
	
	public int getTeamKey() {
		return teamKey;
	}
	public void setTeamKey(int teamKey) {
		this.teamKey = teamKey;
	}
	public List<Match> getMatchesAsVisitor() {
		return matchesAsVisitor;
	}
	public void addMatchesAsVisitor(Match match) {
	  matchesAsVisitor.add(match);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	

}
