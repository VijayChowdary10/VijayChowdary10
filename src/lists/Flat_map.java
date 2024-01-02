package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Demo{
	int pricepool;
	String team;

	public Demo(int pricepool, String team){
		this.pricepool=pricepool;
		this.team=team;
	}
@Override
public String toString() {
	return "[the team = "+team+" the pricepool won = "+pricepool+"]";
}
}

public class Flat_map {
public static void main(String[] args) {
	ArrayList<Demo> esports = new ArrayList<>(Arrays.asList(new Demo(450000, "godl")));
    esports.add(new Demo(200000, "Mgz"));
	 esports.add(new Demo(150000, "8bit"));
	 
	 ArrayList<Demo> esports1=new ArrayList<>();
	 esports1.add(new Demo(500000,"soul"));
	 esports1.add(new Demo(325000,"Xspark"));
	 
	 ArrayList<ArrayList<Demo>> teams = new ArrayList<>(Arrays.asList(esports, esports1));
	 List<String> Esp_teams=teams.stream()
			   .flatMap(team -> team.stream().map(demo -> demo.team))
			 .collect(Collectors.toList());
//	 List<String> Esp_teams = teams.stream()
//             .flatMap(team -> team.stream().map(demo -> demo.team))
//             .collect(Collectors.toList());
System.out.println(Esp_teams);
}
}
