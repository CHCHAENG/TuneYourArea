package com.example.tuneyourarea;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


public class SelectPage extends AppCompatActivity {



    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectpage);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ImageButton interiorbtn = (ImageButton) findViewById(R.id.interiorImage);
        ImageButton profilebtn = (ImageButton) findViewById(R.id.profileImage);

        Button gobtn = (Button) findViewById(R.id.next);

        Button hidden1 = (Button) findViewById(R.id.hidden1);
        Button in_hidden1 = (Button) findViewById(R.id.in_hidden1);

        Button hidden2 = (Button) findViewById(R.id.hidden2);
        Button in_hidden2 = (Button) findViewById(R.id.in_hidden2);

        gobtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MusicPlaylist.class);
                startActivity(intent);
            }
        });

        hidden1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                hidden1.setBackgroundColor(context.getResources().getColor(R.color.fill));
                in_hidden1.setBackgroundColor(context.getResources().getColor(R.color.out));
                Intent intent = new Intent(getApplicationContext(), PictureActivity.class);
                startActivity(intent);
            }
        });

        hidden2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                hidden2.setBackgroundColor(context.getResources().getColor(R.color.fill));
                in_hidden2.setBackgroundColor(context.getResources().getColor(R.color.out));
                Intent intent = new Intent(getApplicationContext(), PictureActivity.class);
                startActivity(intent);
            }
        });
    }

}
