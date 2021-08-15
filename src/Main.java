import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input number of items: ");
		int items = input.nextInt();
		
		double [] cart = new double[items];
		
		System.out.println("Please cost of each item: ");
		for(int i = 0; i < items; i++) {
			cart[i] = input.nextDouble();
		}
		
		System.out.println();
		
		//For testing the array
//		for(int i = 0; i < items; i++) {
//			System.out.println(cart[i]);
//		}
	}

}
