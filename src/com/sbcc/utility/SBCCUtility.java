package com.sbcc.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sbcc.model.Player;

public class SBCCUtility {
	public boolean validatePlayerId(String playerId) {

		String regex = "^[A-Z]{4}[0-9]{4}[A-Z]{1}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(playerId);

		return matcher.matches();
	}

	public Player parsePlayerDetails(String playerDetails) {

		String[] playerDetailArray = playerDetails.split(":");

		Player p = new Player();

		p.setPlayerId(playerDetailArray[0]);
		if (!validatePlayerId(p.getPlayerId())) {
			return null;
		} else {

			p.setPlayerName(playerDetailArray[1]);

			int matchPlayed = Integer.parseInt(playerDetailArray[2]);

			p.setmatchPlayed(matchPlayed);

			String[] runScored = new String[matchPlayed];

			for (int i = 0; i < matchPlayed; i++) {
				runScored[i] = playerDetailArray[3 + i];
			}

			p.setRunScored(p.calculateTotalRuns(runScored));
			
	//	    0       1   2  3  4  5   6   7   8
//      HXCB1234D:Dhoni:5:20:130:55:102:100:North:Batsman:3:1
			p.setPlayingZone(playerDetailArray[2 + matchPlayed + 1]);

		}
		return p;
	}
}