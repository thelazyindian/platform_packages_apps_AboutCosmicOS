package com.cosmicos.aboutcosmic_os;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ScrollingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("About"));
        tabLayout.setTabTextColors(getResources().getColorStateList(android.R.color.white,null));
        tabLayout.addTab(tabLayout.newTab().setText("Team"));
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.fab_enter);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.startAnimation(myAnim);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent device = new Intent(ScrollingActivity.this,MainActivity.class);
                startActivity(device);

//                View sharedView = fab;
//                String transitionName = getString(R.string.sick);
//
//                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(ScrollingActivity.this, sharedView, transitionName);
//                startActivity(device, transitionActivityOptions.toBundle());

//                // previously invisible view
//                View view_anim = findViewById(R.id.cosmic_home);
//
//                // get the center for the clipping circle
//                int centerX = (view_anim.getLeft() + view_anim.getRight()) / 2;
//                int centerY = (view_anim.getTop() + view_anim.getBottom()) / 2;
//
//                int startRadius = 0;
//
//                // get the final radius for the clipping circle
//                int endRadius = Math.max(view_anim.getWidth(), view_anim.getHeight());
//
//                // create the animator for this view (the start radius is zero)
//                Animator anim =
//                        ViewAnimationUtils.createCircularReveal(view_anim, centerX, centerY, startRadius, endRadius);
//                anim.setInterpolator(new AccelerateInterpolator());
//                anim.setDuration(400);
//
//                anim.addListener(new Animator.AnimatorListener() {
//                    @Override
//                    public void onAnimationStart(Animator animation) {
//
//
//                    }
//
//                    @Override
//                    public void onAnimationEnd(Animator animation) {
//                        Intent device = new Intent(ScrollingActivity.this,MainActivity.class);
//                        startActivity(device);
//                    }
//
//                    @Override
//                    public void onAnimationCancel(Animator animation) {
//
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(Animator animation) {
//
//                    }
//                });
//                // make the view visible and start the animation
//                view_anim.setVisibility(View.VISIBLE);
//                anim.start();

            }
        });
    }


    public static class AboutFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public AboutFragment() {
        }

        public static AboutFragment newInstance(int sectionNumber) {
            AboutFragment fragment = new AboutFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.content_scrolling, container, false);
            ImageView mGit,mGplus,mTelegram,mWeb;
            mGit = (ImageView) rootView.findViewById(R.id.git_cos);
            mGplus = (ImageView) rootView.findViewById(R.id.gplus_cos);
            mTelegram = (ImageView) rootView.findViewById(R.id.telegram_cos);
            mWeb = (ImageView) rootView.findViewById(R.id.web_cos);
            mGit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent git = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Cosmic-OS"));
                    startActivity(git);
                }
            });
            mGplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/communities/116339021564888810193"));
                    startActivity(gplus);
                }
            });
            mTelegram.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent tg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/cosmicosofficial"));
                    startActivity(tg);
                }
            });
            mWeb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("http://cosmic-os.com/"));
                    startActivity(web);
                }});

            return rootView;
        }
    }

    public static class TeamFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public TeamFragment() {
        }

        public static TeamFragment newInstance(int sectionNumber) {
            TeamFragment fragment = new TeamFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.team, container, false);
        }
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {
        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return AboutFragment.newInstance(position + 1);
                case 1:
                    return TeamFragment.newInstance(position + 1);
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "About";
                case 1:
                    return "Team";
            }
            return null;
        }
    }
}
