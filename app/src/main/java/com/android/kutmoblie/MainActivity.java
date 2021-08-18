package com.android.kutmoblie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,mainfrag.onFragmentBtnSelected {
  DrawerLayout drawerLayout;
  ActionBarDrawerToggle actionBarDrawerToggle;
  Toolbar toolbar;
  NavigationView navigationView;
  FragmentTransaction fragmentTransaction;
  FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
         drawerLayout.addDrawerListener(actionBarDrawerToggle);
         actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
         actionBarDrawerToggle.syncState();

  fragmentManager = getSupportFragmentManager();
  fragmentTransaction = fragmentManager.beginTransaction();
  fragmentTransaction.add(R.id.item_frag,new mainfrag());
  fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()) {
            case R.id.home:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new mainfrag());
                fragmentTransaction.commit();
                return true;
            case R.id.cal:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new calender());
                fragmentTransaction.commit();
                return true;
            default:
                //default intent
                return true;
        }

    }

    @Override
    public void onButtonSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new calender());
        fragmentTransaction.commit();
    }
}