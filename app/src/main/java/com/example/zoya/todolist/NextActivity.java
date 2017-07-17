package com.example.zoya.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }
    public void finishActivity(View view) {
        Intent intent1 = new Intent(this, FinishActivity.class);
        startActivity(intent1);
    }
}
