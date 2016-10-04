package com.twoweeks.twoweeks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.twoweeks.twoweeks.MainActivity.addCompletedTask;
import static com.twoweeks.twoweeks.MainActivity.setTierLevel;

public class DayOneActivity extends AppCompatActivity {

    TextView mWelcomeText;
    Button mCompleteTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_one);

        mCompleteTask = (Button) findViewById(R.id.day_one_button_complete);
        mCompleteTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addCompletedTask(R.id.task_one);
                setTierLevel(2);
                Intent completeTask = new Intent(DayOneActivity.this, MainActivity.class);
                startActivity(completeTask);
            }
        });

    }
}
