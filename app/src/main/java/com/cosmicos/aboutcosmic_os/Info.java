package com.cosmicos.aboutcosmic_os;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Info extends AppCompatActivity {
    TextView mMainDevice, mName,mChangelog;
    FloatingActionButton mLink;
    ImageView mGit,mGplus,mTelegram,mWeb;
    de.hdodenhof.circleimageview.CircleImageView dp;
    CoordinatorLayout rootInfo;

    String [] device = {"yureka","yuphoria","bullhead", "wbl7511", "op3", "kenzo","a6000","opx","j5","z2plus","cosmic"};
    private static final String CHANGELOG_PATH = "/system/etc/Changelog.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.info);
        rootInfo = (CoordinatorLayout) findViewById(R.id.root_info);
        mName = (TextView) findViewById(R.id.name);
        mChangelog = (TextView)findViewById(R.id.changelog);
        mMainDevice = (TextView) findViewById(R.id.device);
        dp = (de.hdodenhof.circleimageview.CircleImageView) findViewById(R.id.profile_image);
        mGit = (ImageView) findViewById(R.id.git);
        mGplus = (ImageView) findViewById(R.id.gplus);
        mTelegram = (ImageView) findViewById(R.id.telegram);
        mWeb = (ImageView) findViewById(R.id.web);
        mLink = (FloatingActionButton) findViewById(R.id.link);

        Bundle mBundle = getIntent().getExtras();
        for (String aDevice : device) {
            if (mBundle.getInt(aDevice) == 1) {
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_7, null));
                mName.setText(R.string.Parthasarathy);
                mMainDevice.setText(R.string.Maintainer_Yureka);
                dp.setImageResource(R.drawable.partha);
                mGit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent git = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/zeromod"));
                        startActivity(git);
                    }
                });
                mGplus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+ZeroMod"));
                        startActivity(gplus);
                    }
                });
                mTelegram.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/zeromod"));
                        startActivity(tg);
                    }
                });
                mWeb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/imsarathy"));
                        startActivity(web);
                    }
                });
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_7_fab, null)));
            }
            if (mBundle.getInt(aDevice) == 2) {
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_6,null));
                mName.setText(R.string.SagarShah);
                mMainDevice.setText(R.string.Maintainer_Yuphoria);
                dp.setImageResource(R.drawable.sagar_team);
                mGit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent git = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Sagarshah1729"));
                        startActivity(git);
                    }
                });
                mGplus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+SagarShah1729"));
                        startActivity(gplus);
                    }
                });
                mTelegram.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/sagarshah1729"));
                        startActivity(tg);
                    }
                });
                mWeb.setVisibility(View.GONE);
//                mWeb.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/imsarathy"));
//                        startActivity(web);
//                    }
//                });
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_6_fab, null)));
            }
            if (mBundle.getInt(aDevice) == 3) {
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_1,null));
                mName.setText(R.string.SidSun);
                mMainDevice.setText(R.string.Maintainer_Bullhead);
                dp.setImageResource(R.drawable.bullhead);
                mGit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent git = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Sid-Sun"));
                        startActivity(git);
                    }
                });
                mGplus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+SidharthS53"));
                        startActivity(gplus);
                    }
                });
                mTelegram.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/SidSun"));
                        startActivity(tg);
                    }
                });
                mWeb.setVisibility(View.GONE);
//            mWeb.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/rocknegi69"));
//                    startActivity(web);
//                }
//            });
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_1_fab, null)));

            }
            if (mBundle.getInt(aDevice) == 4) {
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_4,null));
                mName.setText(R.string.IacobIonut);
                mMainDevice.setText(R.string.Maintainer_wbl7511);
                dp.setImageResource(R.drawable.lab);
                mGit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent git = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/DarkWoodens"));
                        startActivity(git);
                    }
                });
                mGplus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+DarkWoodens"));
                        startActivity(gplus);
                    }
                });
                mTelegram.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/iacobionut"));
                        startActivity(tg);
                    }
                });
                mWeb.setVisibility(View.GONE);
//            mWeb.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
//                    startActivity(web);
//                }
//            });
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_4_fab, null)));

            }
            if (mBundle.getInt(aDevice) == 5) {
                //mName.setText("op3");
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_3_fab, null)));
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_3,null));
            }
            if (mBundle.getInt(aDevice) == 6) {
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_2,null));
                mName.setText(R.string.RohitSinghNegi);
                mMainDevice.setText(R.string.Maintainer_Kenzo);
                dp.setImageResource(R.drawable.kenzo);
                mGit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent git = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/rocknegi"));
                        startActivity(git);
                    }
                });
                mGplus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+rohitnegi69"));
                        startActivity(gplus);
                    }
                });
                mTelegram.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/rocknegi69"));
                        startActivity(tg);
                    }
                });
                mWeb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/rocknegi69"));
                        startActivity(web);
                    }
                });
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_2_fab, null)));


            }
            if (mBundle.getInt(aDevice) == 7) {
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_10,null));
                mName.setText(R.string.MahekThaker);
                mMainDevice.setText(R.string.Maintainer_A6000);
                dp.setImageResource(R.drawable.thakur);
//            mGit.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent git = new Intent(Intent.ACTION_VIEW,Uri.parse(""));
//                    startActivity(git);
//                }
//            });
//            mGplus.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
////                    startActivity(gplus);
//                }
//            });
                mTelegram.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/MRHACKER5476"));
                        startActivity(tg);
                    }
                });
//            mWeb.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
//                    startActivity(web);
//                }
//            });
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_10_fab, null)));
            }
            if (mBundle.getInt(aDevice) == 8) {
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_9,null));
                mName.setText(R.string.NicoFranke);
                mMainDevice.setText(R.string.Maintainer_OPX);
                dp.setImageResource(R.drawable.nico_team);
                mGit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent git = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ZerNico"));
                        startActivity(git);
                    }
                });
                mGplus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/u/2/103487503581748563170"));
                        startActivity(gplus);
                    }
                });
                mTelegram.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/nicofranke"));
                        startActivity(tg);
                    }
                });
                mWeb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-x/development/7-1-1-cosmic-os-oneplus-x-t3553552"));
                        startActivity(web);
                    }
                });
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_9_fab, null)));
            }
            if (mBundle.getInt(aDevice) == 9) {
                //mName.setText("j5");
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_5,null));
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_5_fab, null)));
            }
            if (mBundle.getInt(aDevice) == 10) {
                rootInfo.setBackgroundColor(getResources().getColor(R.color.device_8,null));
                mName.setText(R.string.MahekThaker);
                mMainDevice.setText(R.string.Maintainer_Z2Plus);
                dp.setImageResource(R.drawable.thakur);
//            mGit.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent git = new Intent(Intent.ACTION_VIEW,Uri.parse(""));
//                    startActivity(git);
//                }
//            });
//            mGplus.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent gplus = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
////                    startActivity(gplus);
//                }
//            });
                mTelegram.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/MRHACKER5476"));
                        startActivity(tg);
                    }
                });
//            mWeb.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
//                    startActivity(web);
//                }
//            });
                mLink.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.device_8_fab, null)));
            }
            if (mBundle.getInt(aDevice) == 11) {
                mName.setText(R.string.cos);
                mMainDevice.setText("7.1.2");
                dp.setImageResource(R.mipmap.cos);
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
                    }
                });
                mLink.setVisibility(View.GONE);
            }
        }

        //Implementation to display changelog
        InputStreamReader inputReader = null;
        String text = null;

        try {
            StringBuilder data = new StringBuilder();
            char tmp[] = new char[2048];
            int numRead;

            inputReader = new FileReader(CHANGELOG_PATH);
            while ((numRead = inputReader.read(tmp)) >= 0) {
                data.append(tmp, 0, numRead);
            }
            text = data.toString();
        } catch (IOException e) {
            text = getString(R.string.changelog_error);
        } finally {
            try {
                if (inputReader != null) {
                    inputReader.close();
                }
            } catch (IOException ignored) {
            }
        }
        mChangelog.setText(text);
    }

}
