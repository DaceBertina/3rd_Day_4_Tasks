package arrays;

public class Array {

	public static void main(String[] args) {
	//Task 1 - creating 2-dimensional array for multiplying numbers 1 - 10:
		int i, j;
		int [] [] multTable = new int [10] [10];
		
		for (i = 1; i <= multTable.length; i++) {
			for (j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
	//Task 2
		copyArray();
	}
	
	//Task 2 - copying array:
	static void copyArray() {
		int [] initArray = {18, 23, 34, 47};
		int [] copiedArray = new int [initArray.length]; 
		
		for (int i = 0; i < initArray.length; i++) {
			copiedArray [i] = initArray [i];
			System.out.print(copiedArray [i] + " ");
		}
	}

}
