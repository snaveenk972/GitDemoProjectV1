import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in); 
		ArrayList<State> states = new ArrayList();
		String stateOp;
		
		do {
			TreeSet city = new TreeSet();
			String cityOp;
			
			System.out.println("Please Enter the state name : ");
			String stateName = sc.next();
				do {
					System.out.println("Enter the city name");
					String cityName = sc.next();
					city.add(cityName);
					System.out.println("Do you want to enter one more city [yes/no]");
				cityOp = sc.next();
				}while(cityOp.equalsIgnoreCase("yes"));
			 states.add(new State(stateName,city));
			 
			 System.out.println("Do you want to enter one more state [yes/no]");
			 stateOp = sc.next();	
			}while(stateOp.equalsIgnoreCase("yes"));
				
		
		System.out.println("Do you want to know the cites of the state[YES/NO]");
		String o = sc.next();
		if(o.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter the state name: ");
			String name =  sc.next();
			boolean flag = false;
			for(State s:states)
			{
				if(s.getName().equals(name))
				{
					flag = true;
					System.out.println(s);
				}
			}
			if(flag == false)
			{
				System.out.println(name+" state doesn't exists ");
			}
		}
	}
	
}


