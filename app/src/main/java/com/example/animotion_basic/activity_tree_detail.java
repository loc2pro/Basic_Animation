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
import android.widget.Button;
public class activity_tree_detail extends AppCompatActivity {

    private Button btnBack;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_detail);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);

        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        activity_tree_detail.this, btnBack, ViewCompat.getTransitionName(btnBack));
                startActivity(intent, options.toBundle());
//                startActivity(intent);
//                overridePendingTransition(R.anim.enter_y, R.anim.exit_y);
            }
        });
    }
}
