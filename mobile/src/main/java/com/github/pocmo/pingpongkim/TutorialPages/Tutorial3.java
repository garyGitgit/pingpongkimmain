package com.github.pocmo.pingpongkim.TutorialPages;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.pocmo.pingpongkim.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tutorial3 extends Tutorial {


    Tutorial.TutorialNextPage mListener;

    @Override
    public void onAttach(Activity activity) {

        //액티비티가 인터페이스를 구현하지 않으면 에러를 발생시킨다
        super.onAttach(activity);
        try{
            mListener = (Tutorial.TutorialNextPage)activity;
        }
        catch (ClassCastException e){
            throw new ClassCastException(activity.toString() + " must implement TutorialNextPage");
        }
    }

    //뷰
    Button buttonTemp;

    public Tutorial3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_tutorial3, container, false);
        buttonTemp = (Button)rootView.findViewById(R.id.buttonTemp);
        buttonTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onMoveNextPage();
            }
        });
        return rootView;
    }

}
