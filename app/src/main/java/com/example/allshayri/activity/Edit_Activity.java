package com.example.allshayri.activity;

import static com.example.allshayri.Allshyri.colour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.allshayri.Allshyri;
import com.example.allshayri.R;
import com.example.allshayri.adpter.ColorsAdapter;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class Edit_Activity extends AppCompatActivity {

    TextView background, edit_shyri,txtcolour,fontbtn;
    GridView gridView;
    ImageView expend;
    ColorsAdapter colorsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        String shyri = getIntent().getStringExtra("edit_shayri");
        edit_shyri=findViewById(R.id.edit_shyri);
        edit_shyri.setText(shyri);
        background=findViewById(R.id.background);
        txtcolour=findViewById(R.id.txtcolour);
        fontbtn=findViewById(R.id.fontbtn);
        expend=findViewById(R.id.expend);

        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(Edit_Activity.this);
                //view= LayoutInflater.from(Edit_Activity.this).inflate(R.layout.layout_background,null);
                bottomSheetDialog.setContentView(R.layout.layout_background);
                gridView=bottomSheetDialog.findViewById(R.id.gridView);
                colorsAdapter=new ColorsAdapter(Edit_Activity.this, colour);
                gridView.setAdapter(colorsAdapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        edit_shyri.setBackgroundColor(getResources().getColor(colour[i]));
                    }
                });
                bottomSheetDialog.show();
            }
        });
        txtcolour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(Edit_Activity.this);
                //view= LayoutInflater.from(Edit_Activity.this).inflate(R.layout.layout_background,null);
                bottomSheetDialog.setContentView(R.layout.layout_background);
                gridView=bottomSheetDialog.findViewById(R.id.gridView);
                colorsAdapter=new ColorsAdapter(Edit_Activity.this, colour);
                gridView.setAdapter(colorsAdapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        edit_shyri.setTextColor(getResources().getColor(colour[i]));
                    }
                });
                bottomSheetDialog.show();
            }
        });
        fontbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(Edit_Activity.this);
                bottomSheetDialog.setContentView(R.layout.edit_font);

                ImageView closebtn = bottomSheetDialog.findViewById(R.id.closebtn);
                closebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        bottomSheetDialog.dismiss();
                    }
                });


                bottomSheetDialog.show();

            }
        });
        expend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }
        });

    }
}
