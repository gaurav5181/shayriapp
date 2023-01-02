package com.example.allshayri.adpter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.allshayri.R;
import com.example.allshayri.activity.Edit_Activity;

public class ColorsAdapter extends BaseAdapter
{
    Activity activity;
    int[] colour;
    int[] gra;
    TextView textView;
    ImageView expend;

    public ColorsAdapter(Activity activity, int[] colour)
    {
        this.activity=activity;
        this.colour=colour;
        this.gra=gra;
    }

    @Override
    public int getCount() {
        return colour.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(activity).inflate(R.layout.layout_background_item,viewGroup,false);
        textView=view.findViewById(R.id.layout_back_item_bg);
        textView.setBackgroundColor(view.getResources().getColor(colour[i]));
        return view;
    }

}
