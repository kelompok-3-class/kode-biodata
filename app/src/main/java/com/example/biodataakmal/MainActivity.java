package com.example.biodataakmal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnMember1 = findViewById(R.id.btnMember1);
        btnMember1.setOnClickListener(v -> openBiodata(1));

        Button btnMember2 = findViewById(R.id.btnMember2);
        btnMember2.setOnClickListener(v -> openBiodata(2));

        Button btnMember3 = findViewById(R.id.btnMember3);
        btnMember3.setOnClickListener(v -> openBiodata(3));

        Button btnGithub = findViewById(R.id.btnGithub);
        btnGithub.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/kelompok3/biodataakmal"));
            startActivity(intent);
        });

    }

    private void openBiodata(int personIndex) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("EXTRA_PERSON_INDEX", personIndex);
        startActivity(intent);
    }
}
