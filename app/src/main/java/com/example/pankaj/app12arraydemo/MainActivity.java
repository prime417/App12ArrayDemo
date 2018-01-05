package com.example.pankaj.app12arraydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtIndex = findViewById(R.id.txtIndex);
        TextView txtValue = findViewById(R.id.txtValue);

        String oldIndexValue;
        String oldValueValue ;

    /*    int[] intArray = new int[10];

        intArray[2] = 25;
        txtIndex.setText(2 + "");
        txtValue.setText(intArray[2]  + "");
      */

       /* String[] stringValue = {"Animal","Home","Table"};

        for (int index = 0 ; index < stringValue.length; index++){

            oldIndexValue = txtIndex.getText().toString();
            oldValueValue = txtValue.getText().toString();
            txtIndex.setText(oldIndexValue + index + "\n");
            txtValue.setText(oldValueValue +stringValue[index] + "\n");

        }
        */

       int[] intValue =  new int[10];
       intValue[5] = 46;

       for (int counter = 0;counter < intValue.length; counter++){

           oldIndexValue = txtIndex.getText().toString();
           oldValueValue = txtValue.getText().toString();
           txtIndex.setText(oldIndexValue + counter + "\n");
           txtValue.setText(oldValueValue + intValue[counter] + "\n");
       }


    }
}
