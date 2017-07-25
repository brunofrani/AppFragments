package com.example.brunofrani.appfragments.activities;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.example.brunofrani.appfragments.R;
import com.example.brunofrani.appfragments.fragments.Fragment1;
import com.example.brunofrani.appfragments.fragments.Fragment2;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    Fragment1 fragment1;
    Fragment2 fragmenti2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "dissmis", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });


        FragmentManager fm = getFragmentManager();
        FragmentTransaction ftran = fm.beginTransaction();
        fragment1 = new Fragment1();
        ftran.add( R.id.frame,fragment1,"fr1");
        ftran.commit();








    }

    @Override
    protected void onStart() {

        super.onStart();
    }

    @Override
    protected void onResume() {

        super.onResume();
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

    }
}
