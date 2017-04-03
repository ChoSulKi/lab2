package org.androidtown.myactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText Age;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.editText1);//find editText1's value in xml file
        Age = (EditText) findViewById(R.id.editText2);//find editText2's value in xml file
        button1 = (Button) findViewById(R.id.button1);//find button's value in xml file

        button1.setOnClickListener(new View.OnClickListener() {//connect to listener
            @Override
            public void onClick(View view) { //when button is clicked
                String name = Name.getText().toString();//assign input name
                String age = Age.getText().toString();//assign input age

                Intent intent = new Intent (getApplicationContext(), Main2Activity.class); //Make Intent and send data to Main2Activity.class
                intent.putExtra("Name", name); //input data name in Name and send Main2Activity.class
                intent.putExtra("Age", age);//input data age in Age and send Main2Activity.class
                startActivity(intent); //start send data
            }
        });
    }
}
