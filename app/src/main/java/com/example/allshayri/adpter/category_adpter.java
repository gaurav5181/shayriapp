package com.example.allshayri.adpter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.allshayri.R;

public class category_adpter extends BaseAdapter {

    Context context;
    int[] images;
    String[]  category_name;

    ImageView imgeofmlist;
    TextView textviewm;

    public category_adpter(Context context, int[] images, String[] category_name) {
        this.context = context;
        this.images = images;
        this.category_name = category_name;
    }

    @Override
    public int getCount() {
        return category_name.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view= LayoutInflater.from(context).inflate(R.layout.shcategory,viewGroup,false);
        imgeofmlist =view.findViewById(R.id.imgeofmlist);
        textviewm=view.findViewById(R.id.textviewm);
        imgeofmlist.setImageResource(images[i]);
        textviewm.setText(category_name[i]);
        return view;



    }
}
