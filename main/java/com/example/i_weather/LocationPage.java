package com.example.i_weather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LocationPage extends AppCompatActivity {
    private Button button;
    private EditText getLocation;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_page);
        button =(Button)findViewById(R.id.okButton);
        getLocation=(EditText)findViewById(R.id.getLocationEditText);

    }
    public void onClick(View v){
        String str=getLocation.getText().toString();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("message", str);

        startActivity(intent);
    }
}
