
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		System.out.println(longestLength(new int[]{100, 27, 88, 2, 13, 67, 98, 97, 101}));
	}

	public static int longestLength(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		int[] dp = new int[arr.length];
		dp[0] = 1;
		int max = 1;
		for (int i = 1; i < dp.length; i++) {
			int tmp = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					tmp = Math.max(tmp, dp[j]);
				}
			}
			dp[i] = tmp + 1;
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
