package com.example.rv_a;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    List<MyModel> ls;
    myAdaptor adaptor;
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv);
        iv=findViewById(R.id.img);
        ls=new ArrayList<>();





        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, add.class);
                startActivityForResult(intent, 32);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==32){

            ls.add(new MyModel(data.getStringExtra("Name"),data.getStringExtra("Num"),data.getStringExtra("Address")));

            adaptor=new myAdaptor(ls, MainActivity.this);

            RecyclerView.LayoutManager lm=new LinearLayoutManager(MainActivity.this);
            rv.setLayoutManager(lm);
            rv.setAdapter(adaptor);
        }

        }
}