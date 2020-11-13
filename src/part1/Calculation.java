package part1;

public class Calculation {

	// int Values
	int x = 10;
	int y = 20;

	// case-1:Not tacking parameters and also not returned any value
//	void sum() {
//		System.out.println(x+y);
//	}

	// case-2:Not tacking parameters but returning value
//	int sum() {
//		return (x + y);
//	}

	//case-3:Tacking parameters but not returning any value
//	void sum(int a, int b) {
//		System.out.println(a+b);
//	}
	
	
	//case4:Tacking parameters and also returning a value
	int sum(int a, int b) {
		return(a+b);
	}
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		//cal.sum(); //case 1
		
		//int res=cal.sum();//case 2
		
		//cal.sum(100, 200); //case 3 
		
		System.out.println(cal.sum(100, 200)); //case 4
		
		

	}

}
