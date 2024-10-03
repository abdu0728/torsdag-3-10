import java.util.ArrayList;

public class Main{
public static void main(String [] args){
ArrayList<String> playersName1 = new ArrayList<>();
        playersName1.add("player1");

        ArrayList<String> playersName2 = new ArrayList<>();
        playersName2.add("player2");

        ArrayList<String> playersName3 = new ArrayList<>();
        playersName3.add("player3");

        ArrayList<String> playersName4 = new ArrayList<>();
        playersName4.add("player4");

        ArrayList<String> playersName5 = new ArrayList<>();
        playersName5.add("player5");

        ArrayList<String> playersName6 = new ArrayList<>();
        playersName6.add("player6");
        Team team = new Team ("de uovervindelige", 0, playersName1); 
		Team team1 = new Team("løverne", 1, playersName2);
		Team team2 = new Team ( "brøndby", 2, playersName3);
		Team team3 = new Team ( "horsens", 4, playersName4);
		Team team4 = new Team("midtjylland", 5, playersName5);
		Team team5 = new Team("københavn", 6, playersName6);
				System.out.println(team);
				System.out.println(team1);
				System.out.println(team2);
				System.out.println(team3);
				System.out.println(team4);
				System.out.println(team5);
}
}