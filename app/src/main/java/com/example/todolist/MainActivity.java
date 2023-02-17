package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity<layoutinflater> extends AppCompatActivity {

    private Random random;
    private List<Note> notes;
    private LayoutInflater layoutinflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayoutCompat = findViewById(R.id.linerLayout);

        random = new Random();
        notes = new ArrayList<>();
        for (int i = 0; i < notes.size(); i++) {
            notes.add(new Note(random.nextInt(3), "Note: " + i));
        }

        layoutinflater = getLayoutInflater();
        for (int i = 0; i < notes.size(); i++) {
            View note = layoutinflater.inflate(R.layout.note, linearLayoutCompat);
        }


    }
}