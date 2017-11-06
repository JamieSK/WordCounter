package com.example.jamie.wordcount;

import java.util.Collections;
import java.util.HashMap;

/**
 * Created by jamie on 06/11/2017.
 */

public class WordCounter {
  private static String[] splitTextToWords(String text) {
    return text.split("[^\\w']+");
  }

  public static int wordCount(String text) {
    return splitTextToWords(text).length;
  }

  public static HashMap<String, Integer> count(String text) {
    HashMap<String, Integer> result = new HashMap<>();

    for(String word : splitTextToWords(text)) {
      word = word.toLowerCase();
      if (!word.equals("")) {
        if (result.containsKey(word)) {
          result.put(word, result.remove(word) + 1);
        } else {
          result.put(word, 1);
        }
      }
    }

    return result;
  }

  public static String orderedStrings(String text) {
    HashMap<String, Integer> hash = count(text);
    StringBuilder result = new StringBuilder();

    for (int i = Collections.max(hash.values()); i > 0; i --) {
      for (String word : hash.keySet()) {
        if (hash.get(word) == i) {
          result.append(word).append(": ").append(i).append(", ");
        }
      }
    }

    return result.substring(0, result.length() - 2) + ".";
  }
}
