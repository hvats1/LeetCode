import java.util.Arrays;

public class TrainPlatform {

	static int findPlatform(int[] arr, int[] dept, int n) {

		int result = 0;
		int platform = 0;
		int i = 0;
		int j = 0;

		Arrays.sort(arr);
		Arrays.sort(dept);

		while (i < n && j < n) {
			if (arr[i] < dept[j]) {
				platform++;
				i++;
			}

			else if (arr[i] > dept[j]) {
				platform--;
				j++;
			}

			if (result < platform) {
				result = platform;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {
			900, 940, 950, 1100, 1500, 1800
		};
		int dep[] = {
			910, 1200, 1120, 1130, 1900, 2000
		};
		int n = arr.length;
		System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));

	}

}
