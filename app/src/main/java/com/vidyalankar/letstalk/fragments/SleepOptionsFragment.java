package com.vidyalankar.letstalk.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vidyalankar.letstalk.R;

public class SleepOptionsFragment extends Fragment {
    View sleep1, sleep2, sleep3;

    public SleepOptionsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sleep_options, container, false);

        sleep1= view.findViewById(R.id.sleep_view1);
        sleep2= view.findViewById(R.id.sleep_view2);
        sleep3= view.findViewById(R.id.sleep_view3);

        sleep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, new SleepWellnessCenterFragment()).addToBackStack(null).commit();
            }
        });

//        yogaTwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, new YogaTwoFragment()).addToBackStack(null).commit();
//            }
//        });
//
//        yogaThree.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, new YogaThreeFragment()).addToBackStack(null).commit();
//            }
//        });
//
//        yogaFour.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView2, new YogaFourFragment()).addToBackStack(null).commit();
//            }
//        });

        return view;
    }
}