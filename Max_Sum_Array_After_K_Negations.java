class Solution {

    private static int ans(int[] arr) {
        int sum = 0;
        for (int a : arr)
            sum += a;
        return sum;
    }

    private static int processArrayElements(int[] arr, int K) {
            if (K % 2 != 0) 
                arr[0] = -arr[0];
        
            return ans(arr);
    }

    private static int ChangeAllNegativesToPositives(int[] arr, int K) {
        int index = 0;
        while (K > 0 && arr[index] < 0 && index < arr.length) {
            arr[index] = -arr[index++];
            K--;
        }
        if (K > 0 && K % 2 != 0) {
            if (arr[index - 1] > arr[index])
                arr[index] = -arr[index];
            else
                arr[index - 1] = -arr[index - 1];
        }
        return ans(arr);

    }

    public static int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        if (A[0] >= 0)
            return processArrayElements(A, K);
        else
            return ChangeAllNegativesToPositives(A, K);


    }

}
