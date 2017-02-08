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

public class Yellow extends Fragment
{
    Button ynext,yprev;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view =inflater .inflate(R.layout .yellow ,container ,false );
        ynext    =(Button )view .findViewById(R.id .btn2  );
        yprev   =(Button )view .findViewById(R.id .btn2 );
        ynext .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Blue blue = new Blue();
                getFragmentManager() .beginTransaction() .replace(R.id.l1 ,blue ).addToBackStack("").commit() ;
            }
        }) ;
        yprev .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager() .popBackStack() ;
            }
        }) ;
            return view ;

    }
}
