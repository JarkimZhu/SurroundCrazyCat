package me.jarkimzhu.surroundcrazycat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import cn.winapk.sdk.IAdCallback;
import cn.winapk.sdk.WinApk;
import me.jarkimzhu.advertisement.Event;
import me.jarkimzhu.surroundcrazycat.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        WinApk.INSTANCE.init(this, new WinApk.Options("p-test"), null);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, GameActivity.class);
        startActivity(intent);
    }
}
