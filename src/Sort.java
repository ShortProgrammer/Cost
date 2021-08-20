import java.util.ArrayList;

//Sorting the given info. Will be using selection sort since the number of
//items sorted will be small.
public class Sort {
	
	public static void sortBigtoSmall(ArrayList<String> name, ArrayList<Double> cost) {
		for (int i = 0; i < name.size()-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < name.size(); j++) 
            {
                if (cost.get(j) > cost.get(minIndex)) 
                {
                     minIndex = j;
                 }
            }
            //Have gone through all tests. minIndex must be smallest DO THE SWAP 
            //Swapping just int array
            double temp = cost.get(minIndex);
            cost.set(minIndex, cost.get(i));
            cost.set(i, temp);
            
            //Swapping just string array
            String stemp = name.get(minIndex);
            name.set(minIndex, name.get(i));
            name.set(i, stemp);

        }  
	}
	
	public static void sortSmalltoBig(ArrayList<String> name, ArrayList<Double> cost) {
		 for (int i = 0; i < name.size()-1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < name.size(); j++) 
	            {
	                if (cost.get(j) < cost.get(minIndex)) 
	                {
	                     minIndex = j;
	                 }
	            }
	            //Have gone through all tests. minIndex must be smallest DO THE SWAP 
	            //Swapping just int array
	            double temp = cost.get(minIndex);
	            cost.set(minIndex, cost.get(i));
	            cost.set(i, temp);
	            
	            //Swapping just string array
	            String stemp = name.get(minIndex);
	            name.set(minIndex, name.get(i));
	            name.set(i, stemp);

	        }  
	}
}
