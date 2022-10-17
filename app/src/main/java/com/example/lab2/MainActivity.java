package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    private Spinner spSelectOptions;
    private EditText edPhrase;
    private TextView tvMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edPhrase = findViewById(R.id.edPhrase);
        this.tvMain = findViewById(R.id.tvMain);

        this.spSelectOptions = (Spinner) findViewById(R.id.spSelectOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSelectOptions.setAdapter(adapter);

    }

    public void onBrnCountClick(View view) {
        String selectedOption = this.spSelectOptions.getSelectedItem().toString();
        String defaultCharsSelectedOption = getResources().getString(R.string.chars_selection);
        String defaultWordsSelectedOption = getResources().getString(R.string.words_selection);

        String userImput = this.edPhrase.getText().toString();
        Boolean isEmpty = userImput.isEmpty();

        if (!isEmpty) {
            if (selectedOption.equals(defaultCharsSelectedOption)) {
                String userImputText = this.edPhrase.getText().toString();
                String charsCount = TextCounter.getCharsCount(userImputText);
                this.tvMain.setText(charsCount);
            } else {
                if (selectedOption.equals(defaultWordsSelectedOption)) {
                    String userImputText = this.edPhrase.getText().toString();
                    String wordsCount = TextCounter.getWordsCount(userImputText);
                    this.tvMain.setText(wordsCount);
                }
            }
        } else {
            Toast.makeText(this, "Enter any input", Toast.LENGTH_SHORT).show();
        }

    }
}