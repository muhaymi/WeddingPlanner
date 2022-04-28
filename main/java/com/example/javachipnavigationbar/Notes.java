package com.example.javachipnavigationbar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Notes extends Fragment {
    Button btn_add;

    CallbackFragment callbackFragment;

    public Notes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notes, container, false);
//        btn_add = view.findViewById(R.id.button_add);
//
//        btn_add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//            }
//        });

        return view;
    }

}

//                if (callbackFragment != null) {
//                        callbackFragment.changeFragment();
//                        }

//    public void setCallbackFragment(CallbackFragment callbackFragment) {
//        this.callbackFragment = callbackFragment;
//    }
