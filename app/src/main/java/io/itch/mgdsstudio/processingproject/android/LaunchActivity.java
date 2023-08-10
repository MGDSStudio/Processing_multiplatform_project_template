package io.itch.mgdsstudio.processingproject.android;


import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import processing.android.CompatUtils;
import processing.android.PFragment;

public class LaunchActivity extends AppCompatActivity{
    private AndroidLauncher androidLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(null); 
        try {
            getSupportActionBar().hide();
            loadBundleData();
            androidLauncher = new AndroidLauncher();
            FrameLayout frame = new FrameLayout(this);
            frame.setId(CompatUtils.getUniqueViewId());
            setContentView(frame, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            PFragment fragment = new PFragment(androidLauncher);
            fragment.setView(frame, this);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private void loadBundleData() {
        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {

        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }




    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    public void onStop(){
        super.onStop();
    }



    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

    }

    @Override
    public void onBackPressed() {
        androidLauncher.onBackPressed();
    }


}
