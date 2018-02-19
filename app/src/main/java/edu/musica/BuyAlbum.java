package edu.musica;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BuyAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_album);
        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(BuyAlbum.this, Albums.class);
                startActivity(numbersIntent);
            }
        });

        TextView best = (TextView) findViewById(R.id.bestSongs);

        best.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent bestIntent = new Intent(BuyAlbum.this, BestSongs.class);
                startActivity(bestIntent);
            }
        });
        TextView folsom = (TextView) findViewById(R.id.folsom);

        folsom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent folsomIntent = new Intent(BuyAlbum.this, FolsomPrison.class);
                startActivity(folsomIntent);
            }
        });

        TextView merry = (TextView) findViewById(R.id.merry);

        merry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String url = "https://www.microsoft.com/en-us/store/music/album/johnny-cash/stories-on-vinyl/8d6kgx0rqg10";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        TextView home = (TextView) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(BuyAlbum.this, MainActivity.class);
                startActivity(buyIntent);
            }
        });
    }
}
