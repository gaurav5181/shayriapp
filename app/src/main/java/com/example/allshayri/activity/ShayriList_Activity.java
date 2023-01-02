package com.example.allshayri.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.allshayri.R;
import com.example.allshayri.adpter.ShyriList_Adpter;
import com.example.allshayri.Allshyri;

public class ShayriList_Activity extends AppCompatActivity {

    MainActivity mainActivity;
    ListView listviewclick;
    ShyriList_Adpter adpter2;
    String category;
    int pos1;
    int images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listclick);


        listviewclick = findViewById(R.id.listviewclick);
        pos1 = getIntent().getIntExtra("pos", 0);
        images = getIntent().getIntExtra("imeges", 0);
        category = getIntent().getStringExtra("category_name");
        adpter2 = new ShyriList_Adpter(pos1, images, this, Allshyri.allshyri);
        listviewclick.setAdapter(adpter2);
        listviewclick.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {

                Intent intent = new Intent(ShayriList_Activity.this, Show_Activity.class);
                intent.putExtra("pos1",i);
                intent.putExtra("pos2", i);

                startActivity(intent);

            }
        });


    }


}








