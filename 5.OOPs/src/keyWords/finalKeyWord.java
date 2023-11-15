package keyWords;
/*Final keyword
-> final is a keyword or modifier which can be used at variables, methods & classes.
-> If we declare a variable as final then we can�t modify value of the variable. The variable acts like a constant. Final field must be initialized when it is declared.
-> If we declare a method as final then we can't override that method
-> If we declare a class as final then we can't extend from that class. We cannot inherit final class in Java.
*/
public final class finalKeyWord {
	
	final int a =34;
//	a=343; invalid
	final void m1() {
	//	a=353; invalid
		System.out.println("final keyword");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finalKeyWord f=new finalKeyWord();
		f.m1();
	}

}
