package com.example.spalacio.transqrv1;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by spalacio on 19/07/2016.
 */
public class lastQRAdaptor extends ArrayAdapter {

    String[] vals;

    public lastQRAdaptor(Context context, int resource, String[] valls) {
        super(context, resource, valls);
        this.vals=valls;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflator = LayoutInflater.from(getContext());

        View v = inflator.inflate(R.layout.listqrread, null);
        TextView QRDecode = (TextView) v.findViewById(R.id.qrdecode);
        QRDecode.setText(this.vals[position]);

        return v;
    }



}