
package com.nt.stream;

import java.util.ArrayList;
import java.util.List;

record Player(Integer id,String name)
{
	
}

public class Stream_PlayerObject {
	
	public static void main(String[] args) {
		
		List<Player> playerList = createPlayer();
		List<String> list = playerList.stream().map(player->player.name().toUpperCase()).distinct().toList();
         System.out.println(list);
	}
	public static List<Player> createPlayer()
	{
		List<Player> al = new ArrayList<>();
		al.add(new Player(18,"Virat"));
		al.add(new Player(45,"Rohit"));
		al.add(new Player(7,"Dhoni"));
		al.add(new Player(18,"Virat"));
		al.add(new Player(90,"Bumrah"));
		al.add(new Player(67,"Hardik"));
		return al;
	}

}
