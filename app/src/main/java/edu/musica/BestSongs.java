package edu.musica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BestSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_songs);
        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(BestSongs.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        TextView home = (TextView) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(BestSongs.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        TextView folsom = (TextView) findViewById(R.id.folsom);

        folsom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent folsomIntent = new Intent(BestSongs.this, FolsomPrison.class);
                startActivity(folsomIntent);
            }
        });
        TextView buy = (TextView) findViewById(R.id.buy);

        buy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(BestSongs.this, BuyAlbum.class);
                startActivity(buyIntent);
            }
        });
    }
}
