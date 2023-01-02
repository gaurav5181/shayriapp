package com.example.allshayri.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.allshayri.R;
import com.example.allshayri.Allshyri;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Show_Activity extends AppCompatActivity {


    TextView showtxt,counter;
    int pos1,pos2;
    ImageView priveous,next,editpencil,expend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        showtxt=findViewById(R.id.showtxt);
        pos1=getIntent().getIntExtra("pos1",0);
        pos2=getIntent().getIntExtra("pos2",0);

        priveous=findViewById(R.id.priveous);
        next=findViewById(R.id.next);
        editpencil=findViewById(R.id.editpencil);
        counter=findViewById(R.id.counter);
        expend=findViewById(R.id.expend);

        showtxt.setText(Allshyri.allshyri[pos1][pos2]);
        counter.setText((pos2+1) + "/10");

        priveous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(pos2!=0)
                {
                    pos2--;
                    showtxt.setText(Allshyri.allshyri[pos1][pos2]);
                    counter.setText((pos2+1) + "/10");
                }

            }

        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(pos2!=9)
                {
                    pos2++;
                    showtxt.setText(Allshyri.allshyri[pos1][pos2]);
                    counter.setText((pos2+1) + "/10");

                }

            }
        });
        editpencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Show_Activity.this,Edit_Activity.class);
                intent.putExtra("edit_shayri", showtxt.getText().toString());
                startActivity(intent);

            }
        });
        expend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(Show_Activity.this);
                bottomSheetDialog.setContentView(R.layout.gradients_layout);
                bottomSheetDialog.show();

            }
        });





    }

}