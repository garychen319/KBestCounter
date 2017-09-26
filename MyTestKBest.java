import java.util.List;
import java.util.Scanner;

public class TestKBest{

	public static void main(String[] args) {
			//Command line arguments to read in k
			Scanner s = new Scanner(System.in);
			System.out.println("This program outputs the k best values in a set of data");
			System.out.println("Please enter a value for k:");
			final int k = s.nextInt();
			s.close();
			
			
			//Start of integer tester
			KBestCounter<Integer> KBC = new KBestCounter<>(k);
			//Sample data set used for testing:
			Integer[] data = {-99,0,1,3,5,7,9,2,4,6,8};
			
			if(k > data.length){
				System.out.println("Please enter a k value smaller than the size of the data set");
			}
			
			else{
				//Call KBestCounter and print the results
				KBC.readData(data);
				List<Integer> result = KBC.kbest();
				System.out.print("k best values: ");
				for (Integer x : result) {
					System.out.print(x + " ");
				}
			}
			//End of integer tester
			
			//Start of String tester
			/*
			KBestCounter<String> KBC2 = new KBestCounter<>(k);
			String[] data2 = {"apple","bagle","cat","dog","elephant"};
			if(k > data2.length){
				System.out.println("Please enter a k value smaller than the size of the data set");
			}
			
			else{
				KBC2.readData(data2);
				List<String> result2 = KBC2.kbest();
				System.out.print("k best values: ");
				for (String  x : result2) {
					System.out.print(x + " ");
				}
			
			}
			*/
			//End of String tester
	}
}