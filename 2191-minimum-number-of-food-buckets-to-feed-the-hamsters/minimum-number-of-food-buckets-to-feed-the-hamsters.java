class Solution {
    public int minimumBuckets(String ham) {

        int n = ham.length();
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (ham.charAt(i) == 'H') {

                // Case 1: H . H  -> one bucket in middle
                if (i + 2 < n &&
                    ham.charAt(i + 1) == '.' &&
                    ham.charAt(i + 2) == 'H') {

                    count++;
                    i = i + 2; // skip next H (already served)
                }
                // Case 2: . H  -> bucket on left
                else if (i - 1 >= 0 && ham.charAt(i - 1) == '.') {
                    count++;
                }
                // Case 3: H .  -> bucket on right
                else if (i + 1 < n && ham.charAt(i + 1) == '.') {
                    count++;
                }
                // Case 4: impossible
                else {
                    return -1;
                }
            }
        }
        return count;
    }
}
