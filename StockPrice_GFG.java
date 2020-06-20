import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    	List<String> stockprice(int[] arr, int size) {

		List<String> ansList = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < size-1; i++) {
			if (arr[i + 1] > arr[i] && (ansList.isEmpty() || ansList.get(count - 1).equals(") "))) {
				ansList.add("(");
				ansList.add(String.valueOf(i)+" ");
				count += 2;
			}
			if (arr[i + 1] < arr[i] && !ansList.isEmpty() && !(ansList.get(count - 1).equals(") ")) ) {
				ansList.add(String.valueOf(i));
				ansList.add(") ");
				count += 2;
			}

		}
		
		if (ansList.isEmpty())
			ansList.add("No Profit");
		else
		{
			if(arr[size-1] > arr[size-2] && !ansList.get(count - 1).equals(") "))
			{
				ansList.add(String.valueOf(size-1));
				ansList.add(") ");

			}

		}

		return ansList;

	}
    
    
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = Integer.parseInt(sc.nextLine());
		List<List<String>> ansList = new ArrayList<List<String>>();
		while (testCase > 0) {
			int size = Integer.parseInt(sc.nextLine());
			String[] temp = sc.nextLine().split(" ");
			int[] arr = new int[size];

			int i = 0;
			for (String a : temp) {
				arr[i] = Integer.parseInt(a);
				i++;
			}

			ansList.add(new GFG().stockprice(arr, size));
			testCase--;
		}
		sc.close();

		for (int i = 0; i < ansList.size(); i++) {
			List<String> templist = ansList.get(i);

			templist.stream().forEach(p -> System.out.print(p));
			System.out.println();
		}
	}
}
