package com.android.kutmoblie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;

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
        setTheme(R.style.AppTheeme);
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
            case R.id.notif_m:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new notification());
                fragmentTransaction.commit();
                return true;
            case R.id.news:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new news());
                fragmentTransaction.commit();
                return true;
            case R.id.samad:
                Intent intentsamad = new Intent();
                intentsamad.setAction(Intent.ACTION_VIEW);
                intentsamad.addCategory(Intent.CATEGORY_BROWSABLE);
                intentsamad.setData(Uri.parse("http://food.kut.ac.ir/"));
                startActivity(intentsamad);
                return true;
            case R.id.heiat_m:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new heiat());
                fragmentTransaction.commit();
                return true;
            case R.id.golestan_m:
                Intent intentgolestan = new Intent();
                intentgolestan.setAction(Intent.ACTION_VIEW);
                intentgolestan.addCategory(Intent.CATEGORY_BROWSABLE);
                intentgolestan.setData(Uri.parse("https://golestan.kut.ac.ir/"));
                startActivity(intentgolestan);
                return true;
            case R.id.social_m:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new social());
                fragmentTransaction.commit();
                return true;
            case R.id.phone_m:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new phones());
                fragmentTransaction.commit();
                return true;
            case R.id.map_m:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new map());
                fragmentTransaction.commit();
                return true;
            case R.id.logout:
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
    public void calselected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new calender());
        fragmentTransaction.commit();
    }

    @Override
    public void newsselected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new news());
        fragmentTransaction.commit();
    }

    @Override
    public void notifselected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new notification());
        fragmentTransaction.commit();
    }

    @Override
    public void photoselected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new heiat());
        fragmentTransaction.commit();
    }

    @Override
    public void phoneselected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new phones());
        fragmentTransaction.commit();
    }

    @Override
    public void mapselected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new map());
        fragmentTransaction.commit();
    }

    @Override
    public void socialselected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new social());
        fragmentTransaction.commit();
    }

    @Override
    public void samadselected() {
        Intent intentsamad = new Intent();
        intentsamad.setAction(Intent.ACTION_VIEW);
        intentsamad.addCategory(Intent.CATEGORY_BROWSABLE);
        intentsamad.setData(Uri.parse("http://food.kut.ac.ir/"));
        startActivity(intentsamad);
    }

    @Override
    public void golestanselected() {
        Intent intentgolestan = new Intent();
        intentgolestan.setAction(Intent.ACTION_VIEW);
        intentgolestan.addCategory(Intent.CATEGORY_BROWSABLE);
        intentgolestan.setData(Uri.parse("https://golestan.kut.ac.ir/"));
        startActivity(intentgolestan);
    }
}