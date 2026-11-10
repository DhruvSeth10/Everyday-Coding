# Goat Latin

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `sentence` that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

- If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word. For example, the word "apple" becomes "applema".
- If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma". For example, the word "goat" becomes "oatgma".
- Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1. For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.

Return *the final sentence representing the conversion from sentence to Goat Latin*.

 

Original
Java
 **Example 1:** 

```
Input: sentence = "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

```

 **Example 2:** 

```
Input: sentence = "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

```

 

 **Constraints:** 

- 1 <= sentence.length <= 150
- sentence consists of English letters and spaces.
- sentence has no leading or trailing spaces.
- All the words in sentence are separated by a single space.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 93.15%)  
**Memory:** 42.8 MB (beats 85.44%)  
**Submitted:** 2026-11-10T18:04:38.040Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/goat-latin/)