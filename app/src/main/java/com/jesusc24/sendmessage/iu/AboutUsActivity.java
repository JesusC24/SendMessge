package com.jesusc24.sendmessage.iu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jesusc24.sendmessage.R;
import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

public class AboutUsActivity extends AppCompatActivity {

    private static final String TAG = "SendMesssageProject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AboutView view = AboutBuilder.with(this)
                .setPhoto(R.mipmap.profile_picture)
                .setCover(R.mipmap.profile_cover)
                .setName("Jesús Cortés Ocaña")
                .setSubTitle("Mobile Devepoler")
                .setBrief("I'm warmed of mobile technologies. Ideas maker, curious and nature lover.")
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .addGitHubLink("https://github.com/JesusC24/")
                .addFiveStarsAction()
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .setShowAsCard(true)
                .build();

        setContentView(view);

        Log.i(TAG, "AboutUsActivity -> onCreate()");
    }

    // region Métodos de ciclo de vida
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "AboutUsActivity -> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "AboutUsActivity -> onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "AboutUsActivity -> onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "AboutUsActivity -> onStop()");
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "AboutUsActivity -> onDestroy()");
        super.onDestroy();
    }
    //endregion

}