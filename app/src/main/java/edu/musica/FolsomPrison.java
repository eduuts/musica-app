package edu.musica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FolsomPrison extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folsom_prison);
        TextView home = (TextView) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(FolsomPrison.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        TextView best = (TextView) findViewById(R.id.bestSongs);

        best.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent bestIntent = new Intent(FolsomPrison.this, BestSongs.class);
                startActivity(bestIntent);
            }
        });
        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(FolsomPrison.this, Albums.class);
                startActivity(albumsIntent);
            }
        });
        TextView buy = (TextView) findViewById(R.id.buy);

        buy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(FolsomPrison.this, BuyAlbum.class);
                startActivity(buyIntent);
            }
        });
    }
}
