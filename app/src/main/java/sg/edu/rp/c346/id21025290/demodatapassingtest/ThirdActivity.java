package sg.edu.rp.c346.id21025290.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
TextView tvAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAns = findViewById(R.id.textView);
        Intent intentReceieved = getIntent();
        char value = intentReceieved.getCharExtra("value",'x');
        tvAns.setText("Character value received is: "+value);

    }
}