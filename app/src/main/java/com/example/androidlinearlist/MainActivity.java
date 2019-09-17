package com.example.androidlinearlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = findViewById(R.id.mainLayout);

        String[] classNameMember = new String[]{"nam", "hoa"};

        for (int i = 0; i < classNameMember.length; i++) {
            LinearLayout linearHorizontal = new LinearLayout(this);
            linearHorizontal.setOrientation(LinearLayout.HORIZONTAL);

            TextView mainTextView = new TextView(MainActivity.this);
            Button mainButton = new Button(MainActivity.this);
            mainButton.setText("OK");
            mainTextView.setText("" + classNameMember[i] + "\n");

            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,
                1.0f
            );
            mainTextView.setLayoutParams(param);

            linearHorizontal.addView(mainTextView);
            linearHorizontal.addView(mainButton);

            mainLayout.addView(linearHorizontal);
        }
    }
}
