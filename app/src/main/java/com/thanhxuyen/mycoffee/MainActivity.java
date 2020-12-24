package com.thanhxuyen.mycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] ten = {
            "Bánh Mì",
            "Bánh Tráng Trộn",
            "Bánh Tráng Trứng Cút",
            "Bánh Tráng Tóp Mỡ",
            "Bún Chả Cá",
            "Bún Đậu Mắm Tôm",
            "Cơm ",
            "Hamburger",
            "Kem",
            "Sandwich"

    };
    int[ ] hinh = {
            R.drawable.banhmi,
            R.drawable.banhtrantron,
            R.drawable.btrantrontrungcut,
            R.drawable.btttopmo,
            R.drawable.bunchaca,
            R.drawable.bundaumamtom,
            R.drawable.com,
            R.drawable.hamburger,
            R.drawable.kem,
            R.drawable.sandwich
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);
        GridViewAdapter gridViewAdapter = new GridViewAdapter(this, ten,hinh);
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ten[position],Toast.LENGTH_SHORT).show();
            }
        });
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),GridItemActivity.class);
                intent.putExtra("name",ten[position] );
                intent.putExtra("image",hinh[position]);
                startActivity(intent);

                return false;
            }
        });
    }
}