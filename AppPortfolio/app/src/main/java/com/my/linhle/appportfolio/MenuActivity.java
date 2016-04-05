package com.my.linhle.appportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initView();
    }

    private void initView() {
        Button btnSpotify = (Button) findViewById(R.id.act_menu_btn_spotify);
        Button btnScore = (Button) findViewById(R.id.act_menu_btn_scores);
        Button btnLibrary = (Button) findViewById(R.id.act_menu_btn_library);
        Button btnBuild = (Button) findViewById(R.id.act_menu_btn_build);
        Button btnReader = (Button) findViewById(R.id.act_menu_btn_reader);
        Button btnCapstone = (Button) findViewById(R.id.act_menu_btn_capstone);

        btnSpotify.setOnClickListener(this);
        btnScore.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnBuild.setOnClickListener(this);
        btnReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_menu_btn_spotify:
                showToast("Spotify Streamer");
                break;
            case R.id.act_menu_btn_scores:
                showToast("Football Scores App");
                break;
            case R.id.act_menu_btn_library:
                showToast("Library App");
                break;
            case R.id.act_menu_btn_build:
                showToast("Build It Bigger App");
                break;
            case R.id.act_menu_btn_reader:
                showToast("XYZ Reader App");
                break;
            case R.id.act_menu_btn_capstone:
                showToast("Capstone App");
                break;

        }


    }

    private void showToast(String appName) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + appName + "!";
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
