package com.example.animotion_basic;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class activity_list_tree extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgV1, imgV2, imgV3, imgV4, imgV5;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tree);

        imgV1 = findViewById(R.id.imgV1);
        imgV2 = findViewById(R.id.imgV2);
        imgV3 = findViewById(R.id.imgV3);
        imgV4 = findViewById(R.id.imgV4);
        imgV5 = findViewById(R.id.imgV5);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);

        imgV1.setOnClickListener(this);
        imgV2.setOnClickListener(this);
        imgV3.setOnClickListener(this);
        imgV4.setOnClickListener(this);
        imgV5.setOnClickListener(this);
    }

    public void click() {
        Intent intent = new Intent(getBaseContext(), activity_list_tree.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                activity_list_tree.this, imgV1, ViewCompat.getTransitionName(imgV1));
        startActivity(intent, options.toBundle());
//        startActivity(intent);
//        overridePendingTransition(R.anim.exit_x, R.anim.enter_x);
    }

    @Override
    public void onClick(View v) {
        click();
    }
}