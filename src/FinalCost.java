import java.util.ArrayList;
import java.util.Scanner;

public class FinalCost {
	private double finalCost;
	private int numberCoupons;
	private double [] coupons;
	private double sales;
	private double shipping;
	private double preCost;
	private double off;
	double costSales;
	
	public FinalCost(int numberItems, ArrayList<Double> itemCost, ArrayList<String> itemName) {
		Scanner input = new Scanner(System.in);
		
		//For testing the array
//		System.out.println("Testing array");
//		for(int i = 0; i < numberItems; i++) {
//			System.out.println(itemName.get(i) + " " + itemCost.get(i));
//		}
//		System.out.println();
				
		//Coupons
		System.out.println("Please enter the number of coupons that you have: ");
		numberCoupons = input.nextInt();
		coupons = new double[numberCoupons];
		
		if(numberCoupons >= 1) {
			System.out.println("Please enter each of your coupons: ");
			for(int i = 0; i < numberCoupons; i++) {
				coupons[i] = input.nextDouble();
			}
		}
		
		System.out.println();
		
		//Sales tax
		System.out.println("Please enter the sales tax: ");
		sales = input.nextDouble();
		
		System.out.println();
		
		//Shipping
		System.out.println("Please enter the shipping cost: ");
		shipping = input.nextDouble();
		
		System.out.println();
		
		//Final cost
		//Cost of items
		preCost = 0.0;
		for(int i = 0; i < numberItems; i++) {
			preCost = preCost + itemCost.get(i);
		}
		
		//Coupons
		off = 0.0;
		if(numberCoupons >= 1) {
			for(int i = 0; i < numberCoupons; i++) {
				off = off + coupons[i];
			}
		}
		
		costSales = (preCost - off)*sales;
		
	}
	
	public void cost() {
		//For testing purposes
//		System.out.println("Precost: " + preCost);
//		System.out.println("Off: " + off);
//		System.out.println("Sales: " + costSales);
//		System.out.println("Shipping: " + shipping);
		
		finalCost = 0.0;
		if(preCost != 0) {
			finalCost = preCost - off + costSales + shipping;
		}
		System.out.printf("The cost of the order is: $%.2f", finalCost);
		System.out.println();
	}
}
