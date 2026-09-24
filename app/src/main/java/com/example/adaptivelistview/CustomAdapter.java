package com.example.adaptivelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] itemNames;
    int[] itemImages;

    public CustomAdapter(Context context, String[] itemNames, int[] itemImages) {
        this.context = context;
        this.itemNames = itemNames;
        this.itemImages = itemImages;
    }

    @Override
    public int getCount() {
        return itemNames.length;
    }

    @Override
    public Object getItem(int position) {
        return itemNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.list_item, parent, false);
        }

        ImageView itemImage = convertView.findViewById(R.id.itemImage);
        TextView itemText = convertView.findViewById(R.id.itemText);

        itemImage.setImageResource(itemImages[position]);
        itemText.setText(itemNames[position]);

        return convertView;
    }
}
