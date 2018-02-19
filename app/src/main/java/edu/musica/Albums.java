package edu.musica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        TextView home = (TextView) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Albums.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        TextView best = (TextView) findViewById(R.id.bestSongs);

        best.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent bestIntent = new Intent(Albums.this, BestSongs.class);
                startActivity(bestIntent);
            }
        });
        TextView folsom = (TextView) findViewById(R.id.folsom);

        folsom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent folsomIntent = new Intent(Albums.this, FolsomPrison.class);
                startActivity(folsomIntent);
            }
        });
        TextView buy = (TextView) findViewById(R.id.buy);

        buy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(Albums.this, BuyAlbum.class);
                startActivity(buyIntent);
            }
        });
    }
}
