
package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.matchstatistics.Match;

public class MatchDao {
	List<Match> matches;	
	
	public MatchDao(){
		matches=new ArrayList<Match>();
	}
	public void add(Match match){
		matches.add(match);
	}
	public void update(Match match){
		Match oldmatch=getMatch(match.getMatchKey());
		
		if(oldmatch!=null){
			matches.remove(oldmatch);
			matches.add(match);
		}
		
	}
	public Match getMatch(long id){
		
		for(Match match:matches){
			if(match.getMatchKey()==id){
				return match;
			}
		}		
		return null;		
	}	
	public void delete(Match match){
		if(match!=null){
		matches.remove(match);
		}
		
	}
	
	public List<Match> getAllMatches(){
		
		return matches;
	}

}
