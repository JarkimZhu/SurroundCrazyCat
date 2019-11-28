package me.jarkimzhu.surroundcrazycat.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import cn.winapk.sdk.IAdCallback;
import cn.winapk.sdk.WinApk;
import me.jarkimzhu.advertisement.Event;
import me.jarkimzhu.surroundcrazycat.views.GameView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GameView gameView = new GameView(this);
        setContentView(gameView);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
