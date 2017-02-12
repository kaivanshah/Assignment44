package com.kaivanshah.assignment44;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kaivanrasiklal.s on 12-02-2017.
 */

public class CustomAdapter extends BaseAdapter {

    ArrayList<ImageClass> ImageList;
    Context myContext;
    int TotalCount;

    public CustomAdapter(int RowCount, Context oContext, ArrayList<ImageClass> oImageList)
    {
        TotalCount = RowCount;
        myContext = oContext;
        ImageList = oImageList;
    }


    @Override
    public int getCount() {
        return TotalCount;
    }

    @Override
    public Object getItem(int position) {
        return ImageList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(myContext);
            row = inflater.inflate(R.layout.list_row, parent, false);
        }
        TextView tv_Text = (TextView)(row.findViewById(R.id.tv_Text));
        ImageView ImgView = (ImageView)(row.findViewById(R.id.ImgView));
        ImageClass oImageClass = (ImageClass) getItem(position);
        tv_Text.setText(oImageClass.getName());
        ImgView.setImageResource(oImageClass.getImageURL());
        return  row;
    }
}
