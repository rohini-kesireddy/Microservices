package com.ltts.DetailInfo.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.DetailInfo.model.Player;
import com.ltts.DetailInfo.model.Team;
@RestController
public class DetailController {
	@Autowired
	RestTemplate rt;
	@RequestMapping("/detail")
	public List<Team> getExternalTeam()
	{
		ResponseEntity<Team[]> response=rt.getForEntity("http://team-service/teams/", Team[].class);
		Team[] teams=response.getBody();
		List<Team> li=Arrays.asList(teams);
		return li;
	}
	@RequestMapping("/details")
	public List<Player> getExternalPlayer()
	{
		ResponseEntity<Player[]> response=rt.getForEntity("http://player-service/players/", Player[].class);
		Player[] players=response.getBody();
		List<Player> lp=Arrays.asList(players);
		return lp;
	}
}
