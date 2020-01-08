// 1 => a + b = c
// 2 => a^2 + b^2 = c^2;
// 3 => a + b + c = k; k = 1000 for our problem
// Thus a + b = k - c
// Square the eq.4 and simplify to get:
// 2ab = k (k - 2c)

final class Solution {
	private static long solve(final long k) {
		for (long a = 1; a < k; a++) {
			for (long b = 1; b < k; b++) {
				final long c = 1000 - (a + b);
				if (c == 0) {
					continue;
				}
				if (2 * a * b == (k * (k - 2 * c))) {
					return a * b * c;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(solve(1000));
	}
}