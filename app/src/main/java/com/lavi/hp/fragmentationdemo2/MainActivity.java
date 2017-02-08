package com.lavi.hp.fragmentationdemo2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
   private  Button r,y,b;
    private Fragment f1,f2,f3;
   private  LinearLayout l1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 =(LinearLayout)findViewById(R.id.l1 ) ;
        r =(Button)  findViewById(R.id.btnred ) ;
        y  =(Button)  findViewById(R.id.bynext  ) ;
        b  =(Button)  findViewById(R.id.b) ;
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1=new Red();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.l1,f1);
                ft.addToBackStack("");
                ft.commit();

            }
        });




    }
}
