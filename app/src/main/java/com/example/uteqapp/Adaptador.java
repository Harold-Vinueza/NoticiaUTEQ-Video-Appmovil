package com.example.uteqapp;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import java.util.ArrayList;


public class Adaptador extends ArrayAdapter<Noticia> {


    public Adaptador(Context context, ArrayList<Noticia> datos)
    {
        super(context, R.layout. lyitem, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.lyitem,  null);


            TextView lblTitulo = (TextView)item.findViewById(R.id.lblTitulo);
            lblTitulo.setText(getItem(position).getTitulo());
            TextView lblFecha = (TextView)item.findViewById(R.id.lblFecha);
            lblFecha.setText(getItem(position).getFecha());
            TextView lblLink = (TextView)item.findViewById(R.id.lblLink);
            lblLink.setText(getItem(position).getLink());


        ImageView imageView = (ImageView)item.findViewById(R.id.imgPortada);
        Glide.with(this.getContext())
                .load(getItem(position).getPortada())
                .into(imageView);

            return(item);

    }

}