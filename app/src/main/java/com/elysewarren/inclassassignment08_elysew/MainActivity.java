package com.elysewarren.inclassassignment08_elysew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String textThere;
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayText = (TextView) findViewById(R.id.dog_list);
        textThere = displayText.getText().toString();

    }

    public void add_dog(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivityForResult(intent, Keys.ADD_DOG);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Keys.ADD_DOG && resultCode == RESULT_OK) {
            Dog dog = (Dog) data.getSerializableExtra(Keys.Dog);
            textThere += dog.toString();
            displayText.setText(textThere);
        }
    }

}