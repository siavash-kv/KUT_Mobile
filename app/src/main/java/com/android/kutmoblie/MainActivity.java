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

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,MainFragment.onFragmentBtnSelected {
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
  fragmentTransaction.add(R.id.item_frag,new MainFragment());
  fragmentTransaction.commit();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()) {
            case R.id.home_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new MainFragment());
                fragmentTransaction.commit();
                return true;
            case R.id.calender_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new CalenderFragment());
                fragmentTransaction.commit();
                return true;
            case R.id.event_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new EventsFragmnet());
                fragmentTransaction.commit();
                return true;
            case R.id.news_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new NewsFragment());
                fragmentTransaction.commit();
                return true;
            case R.id.samad_menu_btn:
                Intent intent_samad = new Intent();
                intent_samad.setAction(Intent.ACTION_VIEW);
                intent_samad.addCategory(Intent.CATEGORY_BROWSABLE);
                intent_samad.setData(Uri.parse("http://food.kut.ac.ir/"));
                startActivity(intent_samad);
                return true;
            case R.id.heiat_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new HeiatFragment());
                fragmentTransaction.commit();
                return true;
            case R.id.golestan_menu_btn:
                Intent intent_golestan = new Intent();
                intent_golestan.setAction(Intent.ACTION_VIEW);
                intent_golestan.addCategory(Intent.CATEGORY_BROWSABLE);
                intent_golestan.setData(Uri.parse("https://golestan.kut.ac.ir/"));
                startActivity(intent_golestan);
                return true;
            case R.id.social_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new SocialFragmnet());
                fragmentTransaction.commit();
                return true;
            case R.id.phone_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new PhonesFragmnet());
                fragmentTransaction.commit();
                return true;
            case R.id.map_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new MapFragment());
                fragmentTransaction.commit();
                return true;
            case R.id.walfare_S_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new WalfareServiceFragment());
                fragmentTransaction.commit();
            case R.id.logout_menu_btn:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.item_frag,new CalenderFragment());
                fragmentTransaction.commit();
                return true;

            default:
                //default intent
                return true;
        }

    }

    @Override
    public void calender_selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new CalenderFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void news_selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new NewsFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void events_selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new EventsFragmnet());
        fragmentTransaction.commit();
    }

    @Override
    public void heiat_selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new HeiatFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void phone_selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new PhonesFragmnet());
        fragmentTransaction.commit();
    }

    @Override
    public void walfare_selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new WalfareServiceFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void social_selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.item_frag,new SocialFragmnet());
        fragmentTransaction.commit();
    }

    @Override
    public void samad_selected() {
        Intent intent_samad = new Intent();
        intent_samad.setAction(Intent.ACTION_VIEW);
        intent_samad.addCategory(Intent.CATEGORY_BROWSABLE);
        intent_samad.setData(Uri.parse("http://food.kut.ac.ir/"));
        startActivity(intent_samad);
    }

    @Override
    public void golestan_selected() {
        Intent intent_golestan = new Intent();
        intent_golestan.setAction(Intent.ACTION_VIEW);
        intent_golestan.addCategory(Intent.CATEGORY_BROWSABLE);
        intent_golestan.setData(Uri.parse("https://golestan.kut.ac.ir/"));
        startActivity(intent_golestan);
    }
}