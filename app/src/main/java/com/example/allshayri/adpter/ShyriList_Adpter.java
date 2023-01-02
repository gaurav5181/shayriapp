package com.example.allshayri.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.allshayri.R;

public class ShyriList_Adpter extends BaseAdapter {


    ImageView insideimage;
    TextView insidetext;
    int pos;
    int images;
    String[][] allshyri;
    Context context;

    public ShyriList_Adpter(int pos, int images, Context context, String[][] shyri) {
        this.pos = pos;
        this.images = images;
        this.context = context;
        this.allshyri = shyri;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {

        view= LayoutInflater.from(context).inflate(R.layout.listclickshyriee,viewGroup,false);
        insideimage=view.findViewById(R.id.insideimage);
        insidetext=view.findViewById(R.id.insidetext);
        insideimage.setImageResource(images);
        insidetext.setText(allshyri[pos][i]);

        return view;
    }
}
