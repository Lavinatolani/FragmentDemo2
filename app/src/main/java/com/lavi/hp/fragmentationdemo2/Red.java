package com.lavi.hp.fragmentationdemo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by hp on 2/1/2017.
 */

public class Red extends Fragment {
    Button b1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater .inflate(R .layout .red,container ,false );
        b1    =(Button )view .findViewById(R.id .btn1 );

        b1  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Yellow yellow =new Yellow();
                getFragmentManager() .beginTransaction() .replace(R.id.l1 ,yellow ).addToBackStack("").commit() ;
            }
        });
        return view ;


    }
}
