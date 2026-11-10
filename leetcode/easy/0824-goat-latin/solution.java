
class Solution {
    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        int index = 1;

        for (String word : words) {

            char first = Character.toLowerCase(word.charAt(0));

            if (first == 'a' || first == 'e' || first == 'i' ||
                first == 'o' || first == 'u') {

                result.append(word);

            } else {

                result.append(word.substring(1));
                result.append(word.charAt(0));
            }

            result.append("ma");

            for (int i = 0; i < index; i++) {
                result.append('a');
            }

            if (index < words.length) {
                result.append(' ');
            }

            index++;
        }

        return result.toString();
    }
}
