package com.example.comic_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Chacha2 extends AppCompatActivity {

    Button price1,buy;
    TextView titlea,price;
    FirebaseAuth auth;

    ImageView img;

    private FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chacha2);

        titlea = findViewById(R.id.name1);
        buy = findViewById(R.id.buy1);
        price = findViewById(R.id.pricebu);

        firestore = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = price.getText().toString();
                String str1 = titlea.getText().toString();
                Intent intent = new Intent(getApplicationContext(), BuyOption.class);
                intent.putExtra("message_key", str);
                intent.putExtra("message_key1", str1);
                intent.putExtra("resId", R.drawable.a21);
                startActivity(intent);
            }
        });

    }
}