package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.matchstatistics.Match;
import com.example.demo.matchstatistics.Player;
import com.example.demo.matchstatistics.Team;

@Component
public class TeamDao {
	
	List<Team> teams;
	private static int count=1;
	private static long matchcounter=1;
	public TeamDao(){
		this.teams=new ArrayList<Team>();
		addTeam(new Team("Arsenal","London","Gunners"));
		addTeam(new Team("Manchester","London","Red devils"));
		
	}
	public List<Team> getAllTeams(){
		return teams;
	}
	public void addTeam(Team team){	
		team.setTeamKey(count);
		teams.add(team);
		count++;
	}
	public void update(Team team,int id){	
		
		Team oldteam=getTeam(id);
		
		if(oldteam!=null){
			
			teams.remove(oldteam);
			teams.add(team);
		}		
	}	
	public Team getTeam(int id){		
		for(Team team:teams){
			if(team.getTeamKey()==id){				
				return team;
			}			
		}
		return null;
	}
	public void addHomeMatch(int id,Match match){
		match.setMatchKey(matchcounter);
		Team team=new Team();
		 team=getTeam(id);
		System.out.println("testi"+id+"  match"+match.getMatchKey()+"id"+team.getTeamKey());
		team.addMatchesAsHome(match);
		System.out.println("testafter"+id+"  match"+match.getMatchKey());
		update(team,id);		
		matchcounter++;
	}
	public void addAwayMatch(int id, Match match){
		match.setMatchKey(matchcounter);
		Team team=getTeam(id);
		team.addMatchesAsVisitor(match);
		update(team,id);
		matchcounter++;
	}
	public List<Match> findHomeMatches(int id){
		
		return getTeam(id).getMatchesAsHome();
	}
	
  public List<Match> findAwayMatches(int id){		
		return getTeam(id).getMatchesAsVisitor();
	}
  public void addPlayer(int id,Player player){
	  Team team=getTeam(id);
	   team.addPlayers(player);
	   update(team,id);	  
  }
  public List<Player> findAllPlayers(int id){
	  return getTeam(id).getPlayers();
  }
	
	public void delete(int id){		
		teams.remove(getTeam(id));		
	}

}
