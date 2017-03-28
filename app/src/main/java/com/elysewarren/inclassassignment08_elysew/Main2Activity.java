package com.elysewarren.inclassassignment08_elysew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText displayBreed;
    private EditText displayAge;
    private CheckBox checkBox;

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
        Dog thatDog = new Dog(dogName, dogAge, isAllergic);
        Intent dog = new Intent();
        dog.putExtra(Keys.Dog, thatDog);
        setResult(RESULT_OK, dog);
        finish();


    }
}
