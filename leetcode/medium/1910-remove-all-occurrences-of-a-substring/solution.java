class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int m = part.length();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));

            if (sb.length() >= m && sb.substring(sb.length() - m).equals(part)) {
                sb.setLength(sb.length() - m);
            }
        }

        return sb.toString();
    }
}