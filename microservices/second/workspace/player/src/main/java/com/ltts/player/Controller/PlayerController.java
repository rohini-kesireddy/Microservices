package com.ltts.player.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.player.dao.PlayerDao;
import com.ltts.player.model.Player;
@RestController
public class PlayerController {
		@Autowired
		PlayerDao pd;
		@RequestMapping("/players")
		public List<Player> getPlayers()
		{
			return pd.getAllPlayers();
		}
}
