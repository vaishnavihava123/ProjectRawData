package chandan.prasad.androidsliderapplication;

import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView cardView, cardView1, cardView2, cardView3, cardView4, cardView5;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardView = findViewById(R.id.cardViewA);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });
        cardView1 = findViewById(R.id.cardViewB);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });

        cardView2 = findViewById(R.id.cardViewC);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });

        cardView3 = findViewById(R.id.cardViewD);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });

        cardView4 = findViewById(R.id.cardViewE);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });
    }
}