class Solution {
    public int[] maximizeXor(int[] arr, int[][] queries) {
        int n = queries.length;

        // q[i] = {xi, mi, originalIndex}
        int q[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            q[i][0] = queries[i][0];  // xi
            q[i][1] = queries[i][1];  // mi
            q[i][2] = i;              // original index
        }

        // Sort queries based on mi
        Arrays.sort(q, (a, b) -> Integer.compare(a[1], b[1]));

        // Sort array
        Arrays.sort(arr);

        Trie trie = new Trie();
        int ans[] = new int[n];

        int j = 0;

        for (int[] query : q) {

            int xi = query[0];
            int mi = query[1];
            int idx = query[2];

            // Insert eligible elements into trie
            while (j < arr.length && arr[j] <= mi) {
                trie.add(arr[j]);
                j++;
            }

            if (j == 0) {
                ans[idx] = -1;   // no valid element
            } else {
                ans[idx] = trie.getMaxXor(xi);
            }
        }
        return ans;
    }
}


class Trie {

    class Node {
        Node zero;
        Node one;
    }

    Node root = new Node();

    // Insert number into Trie
    public void add(int num) {
        Node curr = root;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;

            if (bit == 0) {
                if (curr.zero == null) {
                    curr.zero = new Node();
                }
                curr = curr.zero;
            } else {
                if (curr.one == null) {
                    curr.one = new Node();
                }
                curr = curr.one;
            }
        }
    }

    // Get maximum XOR with x
    public int getMaxXor(int x) {
        Node curr = root;
        int maxXor = 0;

        for (int i = 31; i >= 0; i--) {

            int bit = (x >> i) & 1;

            // Try to take opposite bit to maximize XOR
            if (bit == 0) {
                if (curr.one != null) {
                    maxXor |= (1 << i);
                    curr = curr.one;
                } else {
                    curr = curr.zero;
                }
            } else {
                if (curr.zero != null) {
                    maxXor |= (1 << i);
                    curr = curr.zero;
                } else {
                    curr = curr.one;
                }
            }
        }

        return maxXor;
    }
}
