package com.r222102518.customspinner;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NegaraAdapter extends BaseAdapter {
    private Context _context;
    private List<String> _negaraList;

    public NegaraAdapter(Context _context, List<String> _negaraList){
        this._context = _context;
        this._negaraList = _negaraList;
    }

    @Override
    public int getCount() {
        if (_negaraList != null) {
            return _negaraList.size();
        }
        else {
            return 0;
        }
    }

    @Override
    public Object getItem(int i) { return null; }
    @Override
    public long getItemId(int i) { return 0; }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(_context);
        view = inflater.inflate(R.layout.spinner_a, null);

        TextView textView1 = (TextView) view.findViewById(R.id.textView1);
        String negara = _negaraList.get(i);
        textView1.setText(negara);

        ImageView imageView1 = (ImageView) view.findViewById(R.id.imageView1);

        switch (negara) {
            case "China":
                imageView1.setImageResource(R.drawable.china);
                break;

            case "Indonesia":
                imageView1.setImageResource(R.drawable.indonesia);
                break;

            case "Kazakhstan":
                imageView1.setImageResource(R.drawable.kazakhstan);
                break;

            case "Russia":
                imageView1.setImageResource(R.drawable.russia);
                break;

            case "South_Korea":
                imageView1.setImageResource(R.drawable.south_korea);
                break;

            case "Vietnam":
                imageView1.setImageResource(R.drawable.vietnam);
                break;
        }
        return view;
    }
}
