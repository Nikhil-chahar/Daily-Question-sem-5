class Solution {
    public String largestMerge(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.substring(i).compareTo(s2.substring(j)) > 0) {
                sb.append(s1.charAt(i++));
            } else {
                sb.append(s2.charAt(j++));
            }
        }

        sb.append(s1.substring(i));
        sb.append(s2.substring(j));
        return sb.toString();
    }
}