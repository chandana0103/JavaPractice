package Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<3;i++) {
				for(int j=0;j<3;j++) {
			
			System.out.println(arr[i][j]+ " ");
		}
			System.out.println();
	}
		System.out.println("element at 1st row and second colum: "+arr[0][2]);

	}
}
