package com.kaivanshah.assignment44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView GV_ImageList;
    ArrayList<ImageClass> ImgList;
    CustomAdapter oAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GV_ImageList = (GridView)(this.findViewById(R.id.GV_ImageList));

        ImgList = new ArrayList<ImageClass>();
        ImgList.add(new ImageClass("GingerBread", R.drawable.gingerbread));
        ImgList.add(new ImageClass("HoneyComb", R.drawable.honeycomb));
        ImgList.add(new ImageClass("IceCream", R.drawable.icecream));
        ImgList.add(new ImageClass("JellyBean", R.drawable.jellybean));
        ImgList.add(new ImageClass("Kitkat", R.drawable.kitkat));
        ImgList.add(new ImageClass("Lollipop", R.drawable.lollipop));

        oAdapter = new CustomAdapter(ImgList.size(), this, ImgList);
        GV_ImageList.setAdapter(oAdapter);

    }
}
