package com.example.allshayri.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.allshayri.R;
import com.example.allshayri.adpter.category_adpter;

public class MainActivity extends AppCompatActivity {

    int[] imgeofmlist = {R.drawable.bestwishesh, R.drawable.friend, R.drawable.fun, R.drawable.god,
            R.drawable.motivational, R.drawable.life, R.drawable.lovee, R.drawable.memories,
            R.drawable.othersh, R.drawable.politics, R.drawable.prem, R.drawable.hurt,
            R.drawable.bearbar, R.drawable.bewfa, R.drawable.birthday, R.drawable.holiimg};
    String[] category_name = {"शुभकमना शायरी", "दोस्ती शायरी", "मजेदार शायरी", "भगवन शायरी", "प्रेरणा स्त्रोत शायरी", "जीवन शायरी", "मोहब्बत शायरी",
            "यादें शायरी", "अन्य शायरी", "राजनीति शायरी", "प्रेम शायरी", "दर्द शायरी", "शराब शायरी", "बेवफा शायरी", "जन्मदिन शायरी",
            "होली शायरी"};

    ListView listView;
    category_adpter bAdptersh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.category);
        bAdptersh = new category_adpter(this, imgeofmlist, category_name);
        listView.setAdapter(bAdptersh);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Intent intent = new Intent(MainActivity.this, ShayriList_Activity.class);
                intent.putExtra("pos", i);
                intent.putExtra("imeges", imgeofmlist[i]);
                intent.putExtra("category_name", category_name[i]);
                startActivity(intent);


            }


        });
    }
}