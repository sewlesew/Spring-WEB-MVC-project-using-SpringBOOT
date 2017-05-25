package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.TeamDao;
import com.example.demo.matchstatistics.Match;
import com.example.demo.matchstatistics.Player;
import com.example.demo.matchstatistics.Team;

@Controller

public class HelloController {
	
	@Autowired
	private TeamDao teamDao;
	
	@RequestMapping("/")	
	public String home(Model model){
		model.addAttribute("teams",teamDao.getAllTeams());
		return "home";
	}
	
	@RequestMapping(value="/add/team", method=RequestMethod.POST)	
	public String add(){		
		return "addTeam";
	}
	
	@RequestMapping(value="/team", method=RequestMethod.POST)	
	public String addTeam(Team team){	
		teamDao.addTeam(team);
		return "redirect:/";
	}
	
	
	@RequestMapping("/clubs/{id}")	
	
	public String club(@PathVariable("id") int id, Model model){	
		model.addAttribute("team",teamDao.getTeam(id));	
		return "clubs";
	}
	
	
	@RequestMapping(value="/teams/{id}", method=RequestMethod.GET)
	public String getTeams(Model model, @PathVariable("id") int id){		
		model.addAttribute("team",teamDao.getTeam(id));
		return "editTeam";
	}
	
	@RequestMapping (value="/teams/{id}", method=RequestMethod.POST)
	public String update(Team team, @PathVariable("id") int id){
		team.setTeamKey(id);
		  teamDao.update(team,id);
		  return "redirect:/";
	}
	
			@RequestMapping(value="/teams/delete",method=RequestMethod.POST)
		public String deleteTeam(@RequestParam("teamId") int id){
				teamDao.delete(id);
				return "redirect:/";
			}
		
			@RequestMapping(value="/homematches/{id}", method=RequestMethod.GET)
			public String getHomeMatches(@PathVariable("id") int id,  Model model){
				model.addAttribute("matches",teamDao.findHomeMatches(id));
				model.addAttribute("team", teamDao.getTeam(id));
				return "homematches";
			}
			
			//replace this with static addMatch.html 
			@RequestMapping(value="/add/match/{id}", method=RequestMethod.GET)
			public String match(@PathVariable("id") int id,  Model model){
				model.addAttribute("team",teamDao.getTeam(id));
				return "addmatch";
			}
			
			@RequestMapping(value="/add/match/{id}", method=RequestMethod.POST)
			public String addMatch(@PathVariable("id") int id,  Match match){				    
				teamDao.addHomeMatch(id, match);				     
				return "redirect:/clubs/{id}";
			}
			
			//to display all away matches
			@RequestMapping(value="/awaymatches/{id}", method=RequestMethod.GET)
			public String away(@PathVariable("id") int id,  Model model){
				model.addAttribute("matches",teamDao.findAwayMatches(id));
				model.addAttribute("team", teamDao.getTeam(id));
				return "homematches";
			}
			
			//for away matches
			@RequestMapping(value="/add/away/match/{id}", method=RequestMethod.GET)
			public String awayMatch(@PathVariable("id") int id,  Model model){
				model.addAttribute("team",teamDao.getTeam(id));
				return "addAwayMatch";
			}
			
			@RequestMapping(value="/add/away/match/{id}", method=RequestMethod.POST)
			public String addAwayMatch(@PathVariable("id") int id, Match match){				
				teamDao.addAwayMatch(id, match);				
				return "redirect:/clubs/{id}";
			}
			
			@RequestMapping(value="/players/{id}", method=RequestMethod.GET)
			public String players(@PathVariable("id") int id, Model model){	
				     model.addAttribute("players",teamDao.findAllPlayers(id));
				     model.addAttribute("team",teamDao.getTeam(id));
				return "players";
			}
			
			@RequestMapping(value="/add/player/{id}", method=RequestMethod.GET)
			public String player(@PathVariable("id") int id, Model model){	
				     model.addAttribute("team",teamDao.getTeam(id));
				return "addplayer";
			}
			
			
			
			@RequestMapping(value="add/player/{id}", method=RequestMethod.POST)
			public String addPlayer(@PathVariable("id") int id, Player player){	
				    teamDao.addPlayer(id, player);
				return "redirect:/clubs/{id}";
			}
			
			
			@InitBinder
			public void initBuild(WebDataBinder binder){
				SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
				binder.registerCustomEditor(Date.class, "date", new CustomDateEditor(dateFormat, true));
				binder.registerCustomEditor(Date.class, "startTime", new CustomDateEditor(dateFormat, true));
				
			}


}
