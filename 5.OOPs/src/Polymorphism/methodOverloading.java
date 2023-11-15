package Polymorphism;
//declaring multiple methods with same method name but having different method signature.
//using one method performing several operations then we can use this method overloading.

public class methodOverloading {

	void sum(int x,int y) {
		System.out.println("sum ="+(x+y));
	}
	void sum(float x,float y) {
		System.out.println("sum ="+(x+y));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading m=new methodOverloading();
		m.sum(45, 33);			//sum int method called
		m.sum(43.44f, 546.343f);	//sum float method called
	}

}
