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

public class Blue extends Fragment  {
    Button b;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater .inflate(R .layout .red,container ,false );
        b    =(Button )view .findViewById(R.id .btn3  );

        b   .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager() .popBackStack() ;
            }
        });
        return view ;

    }
}
