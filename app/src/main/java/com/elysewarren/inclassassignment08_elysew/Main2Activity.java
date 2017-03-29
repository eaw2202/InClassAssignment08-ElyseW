package com.elysewarren.inclassassignment08_elysew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {
    private EditText displayBreed;
    private EditText displayAge;
    private CheckBox checkBox;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference dogsRef = database.getReference("dogs");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        displayBreed = (EditText) findViewById(R.id.dog_breed);
        displayAge = (EditText) findViewById(R.id.dog_age);
        checkBox = (CheckBox) findViewById(R.id.allergy_type);
    }


    public void submitActivity(View view) {
        String dogName = displayBreed.getText().toString();
        int dogAge = Integer.parseInt(displayAge.getText().toString());
        boolean isAllergic = checkBox.isChecked();
        dogsRef.push().setValue(new Dog(dogName, dogAge, isAllergic));
        Intent dog = new Intent(this, MainActivity.class);
        startActivity(dog);

    }
}
