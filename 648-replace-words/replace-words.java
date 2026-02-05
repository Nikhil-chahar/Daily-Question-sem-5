class Solution {
    public String replaceWords(List<String> dict, String sen) {

        Collections.sort(dict, (a, b) -> a.length() - b.length());

        StringBuilder sb = new StringBuilder();
        String[] s = sen.split(" ");

        for (String st : s) {
            boolean replaced = false;

            for (String root : dict) {
                if (st.startsWith(root)) {
                    sb.append(root).append(" ");
                    replaced = true;
                    break;
                }
            }

            if (!replaced) {
                sb.append(st).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
