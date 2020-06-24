	int lcss(String str1, String str2, int m, int n) {

		int[][] dp = new int[m + 1][n + 1];
		int max = -1;

		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;

				else if (str1.charAt(i - 1) == str2.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];

				else
					dp[i][j] = 0;

				if (max < dp[i][j])
					max = dp[i][j];

			}
		}
		return max;
	}
