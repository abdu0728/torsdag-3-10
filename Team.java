import java.util.ArrayList;
public class Team{

private String teamsName;
private int teamsRank;
private ArrayList<String> playersName;

public Team( String teamsName, int teamsRank, ArrayList<String> playersName){

this.teamsName = teamsName;
this.teamsRank = teamsRank;
this.playersName = new ArrayList<>(playersName);

}

public void setRank(int rank){

this.teamsRank = rank;


}


public String getTeamsName(){

return teamsName;

}


public int getTeamsRank(){

	return teamsRank;
}

public void addplayer(String playerName){

this.playersName.add(playerName);
}



public String toString(){

return "Team Name: " + teamsName + ", Rank: " + teamsRank + ", Players: " + playersName;
    }

}


