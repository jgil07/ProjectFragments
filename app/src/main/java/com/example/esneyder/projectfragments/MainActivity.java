package com.example.esneyder.projectfragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity implements FragmentBlue.OnFragmentInteractionListener,
        FragmentGreen.OnFragmentInteractionListener, FragmentRed.OnFragmentInteractionListener, FragmentYellow.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();


        switch (item.getItemId()) {
            case R.id.yellow:
                Fragment currentFragment = getFragmentManager().findFragmentById(R.id.container);
                FragmentYellow fragment = new FragmentYellow();
                if(currentFragment == null) {
                    transaction.add(R.id.container, fragment);
                }else{
                    transaction.replace(R.id.container, fragment);}
                transaction.commit();
                return true;
            case R.id.blue:
                Fragment currentFragment1 = getFragmentManager().findFragmentById(R.id.container);
                FragmentBlue fragment1 = new FragmentBlue();
                if(currentFragment1 == null) {
                    transaction.add(R.id.container, fragment1);
                }else{
                    transaction.replace(R.id.container, fragment1);}
                transaction.commit();
                return true;
            case R.id.red:
                Fragment currentFragment2 = getFragmentManager().findFragmentById(R.id.container);
                FragmentRed fragment2 = new FragmentRed();
                if(currentFragment2 == null) {
                    transaction.add(R.id.container, fragment2);
                }else{
                    transaction.replace(R.id.container, fragment2);}
                transaction.commit();
                return true;

            case R.id.green:
                Fragment currentFragment3 = getFragmentManager().findFragmentById(R.id.container);
                FragmentGreen fragment3 = new FragmentGreen();
                if(currentFragment3 == null) {
                    transaction.add(R.id.container, fragment3);
                }else{
                    transaction.replace(R.id.container, fragment3);}
                transaction.commit();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    public void onFragmentInteraction(Uri uri) {

    }
}