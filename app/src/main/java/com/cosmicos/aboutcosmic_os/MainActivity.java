package com.cosmicos.aboutcosmic_os;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton yureka, yuphoria,bullhead,wbl7511, op3, kenzo,a6000,opx,j5,z2plus,cosmic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 5);
        myAnim.setInterpolator(interpolator);

        cosmic = (ImageButton)findViewById(R.id.cosmic_os);
        cosmic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cosmic = new Intent(MainActivity.this, Info.class);
                cosmic.putExtra("cosmic", 11);
                startActivity(cosmic);
            }
        });

        yureka = (ImageButton) findViewById(R.id.device_7);
        yureka.startAnimation(myAnim);
        yureka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tomato = new Intent(MainActivity.this, Info.class);
                tomato.putExtra("yureka", 1);
                startActivity(tomato);
            }
        });
        yuphoria = (ImageButton) findViewById(R.id.device_6);
        yuphoria.startAnimation(myAnim);
        yuphoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lettuce = new Intent(MainActivity.this, Info.class);
                lettuce.putExtra("yuphoria", 2);
                startActivity(lettuce);

            }
        });
        kenzo = (ImageButton) findViewById(R.id.device_2);
        kenzo.startAnimation(myAnim);
        kenzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kenzo = new Intent(MainActivity.this, Info.class);
                kenzo.putExtra("kenzo", 6);
                startActivity(kenzo);

            }
        });
        opx = (ImageButton) findViewById(R.id.device_9);
        opx.startAnimation(myAnim);
        opx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent op_x = new Intent(MainActivity.this, Info.class);
                op_x.putExtra("opx", 8);
                startActivity(op_x);
            }
            });

            z2plus = (ImageButton) findViewById(R.id.device_8);
            z2plus.startAnimation(myAnim);
            z2plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent z2_plus = new Intent(MainActivity.this, Info.class);
                    z2_plus.putExtra("z2plus", 10);
                    startActivity(z2_plus);
                }
            });
        bullhead = (ImageButton) findViewById(R.id.device_1);
        bullhead.startAnimation(myAnim);
        bullhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bullhead = new Intent(MainActivity.this, Info.class);
                bullhead.putExtra("bullhead", 3);
                startActivity(bullhead);
            }
        });
        wbl7511 = (ImageButton) findViewById(R.id.device_4);
        wbl7511.startAnimation(myAnim);
        wbl7511.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wbl7511 = new Intent(MainActivity.this, Info.class);
                wbl7511.putExtra("wbl7511", 4);
                startActivity(wbl7511);

            }
        });
        op3 = (ImageButton) findViewById(R.id.device_3);
        op3.startAnimation(myAnim);
//        op3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent op_3 = new Intent(MainActivity.this, Info.class);
//                op_3.putExtra("op3", 5);
//                startActivity(op_3);
//            }
//        });

        a6000 = (ImageButton) findViewById(R.id.device_10);
        a6000.startAnimation(myAnim);
        a6000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_6000 = new Intent(MainActivity.this, Info.class);
                a_6000.putExtra("a6000", 7);
                startActivity(a_6000);
            }
        });

        j5 = (ImageButton) findViewById(R.id.device_5);
        j5.startAnimation(myAnim);
//        j5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent j_5 = new Intent(MainActivity.this, Info.class);
//                j_5.putExtra("j5", 9);
//                startActivity(j_5);
//            }
//        });


    }


//    public void SetupEnterTransition(){
//        android.transition.Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.change_bound);
//        transition.setDuration(700);
//        getWindow().setSharedElementEnterTransition(transition);
//        transition.addListener(new android.transition.Transition.TransitionListener() {
//            @Override
//            public void onTransitionStart(android.transition.Transition transition) {
//
//            }
//
//            @Override
//            public void onTransitionEnd(android.transition.Transition transition) {
//
//            }
//
//            @Override
//            public void onTransitionCancel(android.transition.Transition transition) {
//
//            }
//
//            @Override
//            public void onTransitionPause(android.transition.Transition transition) {
//
//            }
//
//            @Override
//            public void onTransitionResume(android.transition.Transition transition) {
//
//            }
//        });
//    }

    private class MyBounceInterpolator implements android.view.animation.Interpolator {
        double mAmplitude = 1;
        double mFrequency = 10;

        MyBounceInterpolator(double amplitude, double frequency) {
            mAmplitude = amplitude;
            mFrequency = frequency;
        }

        public float getInterpolation(float time) {
            return (float) (-1 * Math.pow(Math.E, -time/ mAmplitude) *
                    Math.cos(mFrequency * time) + 1);
        }
    }
    @Override
    public void onBackPressed() {
       supportFinishAfterTransition();
    }


}
