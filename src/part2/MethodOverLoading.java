package part2;

public class MethodOverLoading {
	
	//same name of methods - different parameters
	
	void add(int a, int b) {//1
		
		System.out.println(a+b); 
	}

	void add(int a, double b) {//2
		
		System.out.println(a+b); 	
	}
	
	void add(double a, double b) {//3
		
		System.out.println(a+b); 
	}
	
	void add(int a, int b, int c) {//4
		
		System.out.println(a+b+c); 
	}

	public static void main(String[] args) {
		
		MethodOverLoading mo=new MethodOverLoading();
		mo.add(10, 20);//1
		mo.add(10, 20.30);//2
		mo.add(10.5, 20.5);//3
		mo.add(10, 20, 30);//4
		
		
	
	}

}
