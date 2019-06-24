 package com.example.purushotham.bottomnavigationview;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener
{
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bnv);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.home:
                Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_LONG).show();
                return true;

            case R.id.cart:
                Toast.makeText(getApplicationContext(),"Cart",Toast.LENGTH_LONG).show();
                return true;

            case R.id.payment:
                Toast.makeText(getApplicationContext(),"Payment",Toast.LENGTH_LONG).show();
                return true;

            case R.id.share:

                Toast.makeText(getApplicationContext(),"Share",Toast.LENGTH_LONG).show();
                return true;


        }
        return true;
    }
}
