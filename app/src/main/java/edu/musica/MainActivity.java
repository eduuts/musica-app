package edu.musica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView albums1 = (TextView) findViewById(R.id.albums);

        albums1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        TextView best = (TextView) findViewById(R.id.bestSongs);

        best.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent bestIntent = new Intent(MainActivity.this, BestSongs.class);
                startActivity(bestIntent);
            }
        });
        TextView folsom = (TextView) findViewById(R.id.folsom);

        folsom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent folsomIntent = new Intent(MainActivity.this, FolsomPrison.class);
                startActivity(folsomIntent);
            }
        });
        TextView buy = (TextView) findViewById(R.id.buy);

        buy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(MainActivity.this, BuyAlbum.class);
                startActivity(buyIntent);
            }
        });

    }
}
