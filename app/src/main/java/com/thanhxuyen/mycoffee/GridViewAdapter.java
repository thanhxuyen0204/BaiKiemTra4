package com.thanhxuyen.mycoffee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private  String[] tenSanPham;
    private int[] hinhSanPham;

    public GridViewAdapter(Context context, String[] tenSanPham, int[] hinhSanPham) {
        this.context = context;
        this.tenSanPham = tenSanPham;
        this.hinhSanPham = hinhSanPham;
    }

    @Override
    public int getCount() {
        return tenSanPham.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.gridview_row,null);
        TextView textView = (TextView)convertView.findViewById(R.id.textView);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView);

        textView.setText(tenSanPham[position]);
        imageView.setImageResource(hinhSanPham[position]);

        return convertView;
    }
}
