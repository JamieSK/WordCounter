package com.example.jamie.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
  private TextView inputText;
  private TextView resultText;
  private TextView totalWords;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    inputText = findViewById(R.id.inputText);
    resultText = findViewById(R.id.resultText);
    totalWords = findViewById(R.id.totalWords);
  }

  public void countClick(View count) {
    String input = inputText.getText().toString();
    int wordTotal = WordCounter.wordCount(input);
    String total = getResources().getString(R.string.total, wordTotal);
    totalWords.setText(total);
    resultText.setText(WordCounter.orderedStrings(input));
  }
}
