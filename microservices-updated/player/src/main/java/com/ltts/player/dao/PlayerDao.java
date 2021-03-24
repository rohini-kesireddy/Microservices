package com.ltts.player.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.player.model.Player;
@Repository
public class PlayerDao {
		public List<Player> getAllPlayers()
		{
			List<Player> li=new ArrayList<Player>();
			li.add(new Player(1,"Dhoni","Andhra Pradesh"));
			li.add(new Player(2,"Virat","Karnataka"));
			return li;
			
		}
}
