package com.example.android_fragment_switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    void gantiFragment(int containerId, Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(containerId, fragment)
                .commit();

        getSupportFragmentManager().executePendingTransactions();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set sebagai fragment yang pertama muncul
        gantiFragment(R.id.tempat_fragment, new SatuFragment());

        Button btSatu = (Button) findViewById(R.id.bt_satu);
        Button btDua = (Button) findViewById(R.id.bt_dua);
        Button btTiga = (Button) findViewById(R.id.bt_tiga);

        btSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gantiFragment(R.id.tempat_fragment, new SatuFragment()); //silakan disesuaikan fragmentnya
            }
        });

        btDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gantiFragment(R.id.tempat_fragment, new DuaFragment()); //silakan disesuaikan fragmentnya
            }
        });

        btTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gantiFragment(R.id.tempat_fragment, new TigaFragment()); //silakan disesuaikan fragmentnya
            }
        });
    }

}
