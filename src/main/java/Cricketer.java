import java.util.Scanner;

public class Cricketer 
{
	String name;
	private int matchplayed,rank;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatchplayed() {
		return matchplayed;
	}

	public void setMatchplayed(int matchplayed) {
		this.matchplayed = matchplayed;
	}

/*	public int getRank() {
		return rank;
	} */

	public void setRank(int rank) {
		this.rank = rank; 
	}

	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name,How many match played");
		name = sc.next();
		matchplayed = sc.nextInt();
	}
	
	void calculateRank()
	{
		if(matchplayed>=250)
		{
			rank=1;
		}
		else if(matchplayed>=100)
			rank=2;
		else if(matchplayed>=50)
			rank=3;
		else if(matchplayed<50)
			rank=4;
	}	
	void display()
	{
		System.out.println(name+ "\t" + matchplayed + "\t"+rank);
		
	}
	
	public static void main(String[] args) 
	{
		Cricketer c = new Cricketer();
		c.getData();
		c.calculateRank();
		c.display();
	}
}
		
	
			
	


	
	


