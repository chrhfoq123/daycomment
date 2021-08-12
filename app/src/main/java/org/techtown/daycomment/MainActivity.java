package org.techtown.daycomment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next_btn = findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Proverbfragment proverbfragment = new Proverbfragment();
                FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
                fragmenttransaction.replace(R.id.frame, proverbfragment);
                fragmenttransaction.addToBackStack(null);
                fragmenttransaction.commit();

            }
        });

    }
}