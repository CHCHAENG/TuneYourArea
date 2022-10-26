package com.example.tuneyourarea;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SelectPage extends AppCompatActivity {

    private TopViewModel tViewmodel;
    private BottomViewModel bViewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectpage);
        //ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        tViewmodel = new TopViewModel(getApplicationContext());
        bViewmodel = new BottomViewModel(getApplicationContext());


    }

}
