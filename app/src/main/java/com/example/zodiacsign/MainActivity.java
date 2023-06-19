package com.example.zodiacsign;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            //calendar setup
            int year = datePicker.getYear();
            int month = datePicker.getMonth();
            int dayOfMonth = datePicker.getDayOfMonth();
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, dayOfMonth);

            //getting year
            int birth_year = calendar.get(Calendar.YEAR);

            //calling function
            String final_result = getZodiac(birth_year);

            //to transfer data over the second screen.
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            intent.putExtra("zodiacYear", birth_year);
            intent.putExtra("zodiac", final_result);
            startActivity(intent);
        });
    }

    private String getZodiac(int birthYear) {

        //right arrangement of zodiacs.
        String[] zodiacNames = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Ram", "Monkey", "Rooster", "Dog", "Pig"};
        int zodiacIndex = (birthYear - 1900) % 12; // it will be reduce one digit number like 0 1 2 3 etc.

        return zodiacNames[zodiacIndex];
    }
}
