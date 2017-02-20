package com.example.charl.spaceinvaders;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Button btn=(Button) findViewById(R.id.btnCambio);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SplashScreen.this,SpaceInvadersActivity.class);
                startActivityForResult(intent,0);
            }

            });
        }

    public void cambiarpantalla(View v){
        setContentView(R.layout.activity_space_invaders);
        Intent intent = new Intent();
        intent.setClass(SplashScreen.this,SpaceInvadersActivity.class);
        SplashScreen.this.startActivityForResult(intent,0);

    }

    @Override
    protected void onPause(){
        super.onPause();
    }

}
