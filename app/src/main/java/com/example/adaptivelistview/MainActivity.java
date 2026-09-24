package com.example.adaptivelistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] itemNames = {
            "Android Mobile App",
            "Java Programming",
            "Python Programming",
            "Database Management"
    };

    int[] itemImages = {
            R.drawable.android,
            R.drawable.java,
            R.drawable.python,
            R.drawable.database
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        CustomAdapter adapter =
                new CustomAdapter(this, itemNames, itemImages);

        listView.setAdapter(adapter);
    }
}
