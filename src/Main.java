import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Sort sort = new Sort();
		int keepGoing = 1;
		int choice = 0;
		
		ArrayList<Double> itemCost = new ArrayList<Double>();
		ArrayList<String> itemName = new ArrayList<String>();
		int numberItems = 0;
		
		while(keepGoing == 1) {
			
			System.out.println("Menu:");
			System.out.println("Enter 1 to enter order.");
			System.out.println("Enter 2 to get final cost of order.");
			System.out.println("Enter 3 to sort order from expensive to cheap.");
			System.out.println("Enter 4 to sort order from cheap to expensive.");
			System.out.println("Enter 5 to see order.");
			System.out.println("Enter 6 to exit.");
			
			choice = input.nextInt();
			
			System.out.println();
			
			if(choice == 1) { //Enter 1 to enter order.
				System.out.println("Please input the number of items: ");
				numberItems = input.nextInt();
				
				System.out.println("Please enter the name of the item and the cost: ");
				for(int i = 0; i < numberItems; i++) {
					itemName.add(i,input.next());
					itemCost.add(i,input.nextDouble());
				}
			}
			else if(choice == 2) {//Enter 2 to get final cost of order.
				if(numberItems == 0) {
					System.out.println("You are being redirected to the menu. Please enter order before doing anything else.");
				}
				else {
					FinalCost finalCost = new FinalCost(numberItems, itemCost, itemName);
					finalCost.cost();
				}
			}
			else if(choice == 3) {//Enter 3 to sort order from expensive to cheap.
				if(numberItems == 0) {
					System.out.println("You are being redirected to the menu. Please enter order before doing anything else.");
				}
				else {
					Sort.sortBigtoSmall(itemName, itemCost);
					for(int i = 0; i < itemName.size(); i++) {
						System.out.println(itemName.get(i) + " " + itemCost.get(i));
					}
				}
			}
			else if(choice == 4) {//Enter 4 to sort order from cheap to expensive.
				if(numberItems == 0) {
					System.out.println("You are being redirected to the menu. Please enter order before doing anything else.");
				}
				else {
					Sort.sortSmalltoBig(itemName, itemCost);
					for(int i = 0; i < itemName.size(); i++) {
						System.out.println(itemName.get(i) + " " + itemCost.get(i));
					}
				}
			}
			else if(choice == 5) {//Enter 5 to see order.
				if(numberItems == 0) {
					System.out.println("You are being redirected to the menu. Please enter order before doing anything else.");
				}
				else {
					for(int i = 0; i < itemName.size(); i++) {
						System.out.println(itemName.get(i) + " " + itemCost.get(i));
					}
				}
			}
			else {//Exit
				keepGoing = 0;
			}
			
			System.out.println();
		}
		
		
	}

}
