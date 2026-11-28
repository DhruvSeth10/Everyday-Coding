class Solution {
    public int repeatedStringMatch(String a, String b) {
        int minRepeats = (b.length() + a.length() - 1) / a.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < minRepeats; i++) {
            sb.append(a);
        }

        // Check after reaching at least b.length()
        if (sb.indexOf(b) != -1) {
            return minRepeats;
        }

        // Check one additional repetition to handle boundary overlaps
        sb.append(a);
        if (sb.indexOf(b) != -1) {
            return minRepeats + 1;
        }

        return -1;
    }
}