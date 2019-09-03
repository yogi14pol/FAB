package com.clicks.yogi.fab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton MyFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    MyFab = findViewById(R.id.Myfab);

        MyFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Snackbar", Snackbar.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hello Friends", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
