package recursion;
//using recursion
public class reverse_number {
	static int reverse(int n,int temp) { //n=23224,temp=0
		if(n==0)							// n!=0
			return temp;
		temp=(temp*10)+(n%10);				//temp=0+4=4
		return reverse(n/10,temp);		//2322,4
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=324324;
		int temp=reverse(n,0);
		System.out.println("reverse:"+temp);

	}

}
