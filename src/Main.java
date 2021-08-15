import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Cart
		System.out.println("Please input the number of items: ");
		int items = input.nextInt();
		
		double [] cart = new double[items];
		
		System.out.println("Please enter the cost of each item: ");
		for(int i = 0; i < items; i++) {
			cart[i] = input.nextDouble();
		}
		
		System.out.println();
		
		//For testing the array
//		for(int i = 0; i < items; i++) {
//			System.out.println(cart[i]);
//		}
		
		//Coupons
		System.out.println("Please enter the number of coupons that you have: ");
		int numberCoupons = input.nextInt();
		
		double [] coupons = new double[numberCoupons];
		System.out.println("Please enter each of your coupons: ");
		for(int i = 0; i < numberCoupons; i++) {
			coupons[i] = input.nextDouble();
		}
		
		System.out.println();
		
		//Sales tax
		System.out.println("Please enter the sales tax: ");
		double sales = input.nextDouble();
		
		System.out.println();
		
		//Shipping
		System.out.println("Please enter the shipping cost: ");
		double shipping = input.nextDouble();
		
		System.out.println();
		
		//Final cost
		//Cost of items
		double preCost = 0.0;
		for(int i = 0; i < items; i++) {
			preCost = preCost + cart[i];
		}
		
		//Coupons
		double off = 0.0;
		for(int i = 0; i < numberCoupons; i++) {
			off = off + coupons[i];
		}
		
		double costSales = (preCost - off)*sales;
		
		double finalCost = preCost - off + costSales + shipping;
		
		System.out.println("The cost of the order is: $" + finalCost);
	}

}
