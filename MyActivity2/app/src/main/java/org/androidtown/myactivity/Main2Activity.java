package org.androidtown.myactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent passedIntent=getIntent(); //receive data from activity
        if(passedIntent!=null) { //if data isn't null
            String name = passedIntent.getStringExtra("Name"); //get name value
            String age = passedIntent.getStringExtra("Age"); //get age
            Toast.makeText(getApplicationContext(), "Student info : " + name + ", " + age, Toast.LENGTH_LONG).show();
        } //toast is function that pop up the message to users.

        Button button2 = (Button) findViewById(R.id.button2); //assign button2's value in xml file
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){//if button is clicked
                finish(); //Finish activity
            }
        });
    }
}
