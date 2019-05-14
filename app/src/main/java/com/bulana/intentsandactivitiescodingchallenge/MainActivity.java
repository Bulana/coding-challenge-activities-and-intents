package com.bulana.intentsandactivitiescodingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView kingJamesPassage;
    private TextView americanStandardPassage;
    private TextView twentiethCenturyPassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kingJamesPassage = findViewById(R.id.king_james);
        americanStandardPassage = findViewById(R.id.american_standard);
        twentiethCenturyPassage = findViewById(R.id.twentienth_century);
    }

    public void kingJames(View view) {
        Intent kingJamesIntent = new Intent(this, KingJameVersion.class);
        startActivity(kingJamesIntent);
    }

    public void americanStandard(View view) {
        Intent americanStandardIntent = new Intent(this, AmericanStandardVersion.class);
        startActivity(americanStandardIntent);
    }

    public void twentiethCentury(View view) {
        Intent twentiethCenturyIntent = new Intent(this, TwentiethCenturyVersion.class);
        startActivity(twentiethCenturyIntent);
    }
}
