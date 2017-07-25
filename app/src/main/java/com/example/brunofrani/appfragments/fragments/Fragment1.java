package com.example.brunofrani.appfragments.fragments;
import android.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.brunofrani.appfragments.R;
import com.example.brunofrani.appfragments.activities.Main2Activity;

import static android.R.attr.fragment;
import static android.app.PendingIntent.getActivity;

/**
 * Created by Bruno Frani on 23/07/2017.
 */

public class Fragment1 extends Fragment  {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View frag = inflater.inflate(R.layout.fragment1,container,false);

        return frag;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
       Button butoni1= (Button) getView().findViewById(R.id.but1);
        Log.v("fragment", String.valueOf(butoni1));
        super.onActivityCreated(savedInstanceState);


    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */

}
