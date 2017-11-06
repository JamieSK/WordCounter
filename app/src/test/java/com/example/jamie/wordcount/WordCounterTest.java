package com.example.jamie.wordcount;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 06/11/2017.
 */

public class WordCounterTest {
  @Test
  public void wordCount() {
    HashMap actual = WordCounter.count("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, …");

    HashMap<String, Integer> expected = new HashMap<>();
    expected.put("it", 6);
    expected.put("was", 6);
    expected.put("the", 6);
    expected.put("best", 1);
    expected.put("of", 6);
    expected.put("times", 2);
    expected.put("worst", 1);
    expected.put("age", 2);
    expected.put("wisdom", 1);
    expected.put("foolishness", 1);
    expected.put("epoch", 2);
    expected.put("belief", 1);
    expected.put("incredulity", 1);

    assertEquals(actual, expected);
  }
}
