package com.example.rv_a;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add extends AppCompatActivity {

    EditText name, num, address;

    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        name = findViewById(R.id.name);
        num = findViewById(R.id.phone);
        address = findViewById(R.id.address);

        save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("Name", name.getText().toString());
                intent.putExtra("Num", num.getText().toString());
                intent.putExtra("Address", address.getText().toString());
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

    }

}



