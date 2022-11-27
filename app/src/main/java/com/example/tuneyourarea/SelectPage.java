package com.example.tuneyourarea;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;


public class SelectPage extends AppCompatActivity {

    Button btn1, btn2;
    FrameLayout layout1, layout2;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectpage);
//
//        btn1 = findViewById(R.id.hiddenbtn1);
//        btn2 = findViewById(R.id.hiddenbtn2);

//        layout1 = findViewById(R.id.fl1);
//        layout2 = findViewById(R.id.fl2);
//
//        btn1.setOnClickListener(click);
//        btn2.setOnClickListener(click);

    }
//
//    View.OnClickListener click = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            switch (view.getId()){
//                case R.id.hiddenbtn1:
//                    layout1.setBackgroundColor(context.getResources().getColor(R.color.change));
//                    Log.i("히든버튼1","히든버튼1");
//                    break;
//                case R.id.hiddenbtn2:
//                    layout2.setBackgroundColor(context.getResources().getColor(R.color.change));
//                    Log.i("히든버튼2","히든버튼2");
//                    break;
//            }
//        }
//    };
}
