package com.example.biodataakmal;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.second), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        int personIndex = getIntent().getIntExtra("EXTRA_PERSON_INDEX", 1);

        TextView tvNama = findViewById(R.id.tvNama);
        TextView tvTtl = findViewById(R.id.tvTtl);
        TextView tvJk = findViewById(R.id.tvJk);
        TextView tvAgama = findViewById(R.id.tvAgama);
        TextView tvAlamat = findViewById(R.id.tvAlamat);
        TextView tvStatus = findViewById(R.id.tvStatus);
        TextView tvNoHp = findViewById(R.id.tvNoHp);
        TextView tvEmail = findViewById(R.id.tvEmailCv);
        TextView tvSd = findViewById(R.id.tvSd);
        TextView tvSmp = findViewById(R.id.tvSmp);
        TextView tvSma = findViewById(R.id.tvSma);
        TextView tvKuliah = findViewById(R.id.tvKuliah);

        ImageView ivAvatar = findViewById(R.id.ivAvatar);

        switch (personIndex) {
            case 2:
                ivAvatar.setImageResource(R.drawable.gemini_generated_image_jpg6yljpg6yljpg6);
                break;
            case 3:
                ivAvatar.setImageResource(R.drawable.foto_dirham);
                break;
            default:
                ivAvatar.setImageResource(R.drawable.gemini_generated_image_pkz8oapkz8oapkz8);
                break;
        }

        switch (personIndex) {
            case 2:
                setField(tvNama, R.string.label_nama, R.string.person_2_nama);
                setField(tvTtl, R.string.label_ttl, R.string.person_2_ttl);
                setField(tvJk, R.string.label_jk, R.string.person_2_jk);
                setField(tvAgama, R.string.label_agama, R.string.person_2_agama);
                setField(tvAlamat, R.string.label_alamat, R.string.person_2_alamat);
                setField(tvStatus, R.string.label_status, R.string.person_2_status);
                setField(tvNoHp, R.string.label_no_hp, R.string.person_2_no_hp);
                setField(tvEmail, R.string.label_email, R.string.person_2_email);
                setField(tvSd, R.string.label_sd, R.string.person_2_sd);
                setField(tvSmp, R.string.label_smp, R.string.person_2_smp);
                setField(tvSma, R.string.label_sma, R.string.person_2_sma);
                setField(tvKuliah, R.string.label_kuliah, R.string.person_2_kuliah);
                break;
            case 3:
                setField(tvNama, R.string.label_nama, R.string.person_3_nama);
                setField(tvTtl, R.string.label_ttl, R.string.person_3_ttl);
                setField(tvJk, R.string.label_jk, R.string.person_3_jk);
                setField(tvAgama, R.string.label_agama, R.string.person_3_agama);
                setField(tvAlamat, R.string.label_alamat, R.string.person_3_alamat);
                setField(tvStatus, R.string.label_status, R.string.person_3_status);
                setField(tvNoHp, R.string.label_no_hp, R.string.person_3_no_hp);
                setField(tvEmail, R.string.label_email, R.string.person_3_email);
                setField(tvSd, R.string.label_sd, R.string.person_3_sd);
                setField(tvSmp, R.string.label_smp, R.string.person_3_smp);
                setField(tvSma, R.string.label_sma, R.string.person_3_sma);
                setField(tvKuliah, R.string.label_kuliah, R.string.person_3_kuliah);
                break;
            case 4:
                setField(tvNama, R.string.label_nama, R.string.person_4_nama);
                setField(tvTtl, R.string.label_ttl, R.string.person_4_ttl);
                setField(tvJk, R.string.label_jk, R.string.person_4_jk);
                setField(tvAgama, R.string.label_agama, R.string.person_4_agama);
                setField(tvAlamat, R.string.label_alamat, R.string.person_4_alamat);
                setField(tvStatus, R.string.label_status, R.string.person_4_status);
                setField(tvNoHp, R.string.label_no_hp, R.string.person_4_no_hp);
                setField(tvEmail, R.string.label_email, R.string.person_4_email);
                setField(tvSd, R.string.label_sd, R.string.person_4_sd);
                setField(tvSmp, R.string.label_smp, R.string.person_4_smp);
                setField(tvSma, R.string.label_sma, R.string.person_4_sma);
                setField(tvKuliah, R.string.label_kuliah, R.string.person_4_kuliah);
                break;
            default:
                setField(tvNama, R.string.label_nama, R.string.cv_nama);
                setField(tvTtl, R.string.label_ttl, R.string.cv_ttl);
                setField(tvJk, R.string.label_jk, R.string.cv_jk);
                setField(tvAgama, R.string.label_agama, R.string.cv_agama);
                setField(tvAlamat, R.string.label_alamat, R.string.cv_alamat);
                setField(tvStatus, R.string.label_status, R.string.cv_status);
                setField(tvNoHp, R.string.label_no_hp, R.string.cv_no_hp);
                setField(tvEmail, R.string.label_email, R.string.cv_email);
                setField(tvSd, R.string.label_sd, R.string.cv_sd);
                setField(tvSmp, R.string.label_smp, R.string.cv_smp);
                setField(tvSma, R.string.label_sma, R.string.cv_sma);
                setField(tvKuliah, R.string.label_kuliah, R.string.cv_kuliah);
                break;
        }

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }

    private void setField(TextView tv, int labelRes, int valueRes) {
        String label = getString(labelRes);
        String value = getString(valueRes);
        String text = label + " " + value;
        SpannableString ss = new SpannableString(text);
        ss.setSpan(new TextAppearanceSpan(this, R.style.CustomTextLabel),
                0, label.length(), SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new TextAppearanceSpan(this, R.style.CustomTextBody),
                label.length() + 1, text.length(), SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(ss);
    }
}
