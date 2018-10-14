package com.example.user.greenelf;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    private HomeFragment homeFragment;
    private FindFragment findFragment;
    private AlarmFragment alarmFragment;
    private IntroFragment introFragment;
    private MoreFragment moreFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mMainFrame = (FrameLayout)findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView)findViewById(R.id.main_nav);

        homeFragment = new HomeFragment();
        findFragment = new FindFragment();
        alarmFragment = new AlarmFragment();
        introFragment = new IntroFragment();
        moreFragment = new MoreFragment();

        setFragment(homeFragment);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.nav_home :
                        mMainNav.setItemBackgroundResource(R.color.colorGreenElf);
                        setFragment(homeFragment);
                        return true;

                    case R.id.nav_find :
                        mMainNav.setItemBackgroundResource(R.color.colorGreenElf);
                        setFragment(findFragment);
                        return true;

                    case R.id.nav_alarm :
                        mMainNav.setItemBackgroundResource(R.color.colorGreenElf);
                        setFragment(alarmFragment);
                        return true;

                    case R.id.nav_intro :
                        mMainNav.setItemBackgroundResource(R.color.colorGreenElf);
                        setFragment(introFragment);
                        return true;

                    case R.id.nav_menu :
                        mMainNav.setItemBackgroundResource(R.color.colorGreenElf);
                        setFragment(moreFragment);
                        return true;

                        default:
                            return false;
                }

            }
        });

    }

    private void setFragment(android.support.v4.app.Fragment fragment) {

        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();

    }

}
