package com.example.jjesusmonroy.jjesusmonroyandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jjesusmonroy on 21/02/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<DataProvider> lista;
    private Context mCtx;

    public RecyclerAdapter(List<DataProvider> lista, Context mCtx) {
        this.lista = lista;
        this.mCtx = mCtx;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_layout,null);
        RecyclerViewHolder holder = new RecyclerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DataProvider producto = lista.get(position);

        holder.nombre.setText(producto.getNombre());
        holder.nocontrol.setText(producto.getNocontrol());
        holder.carrera.setText(producto.getCarrera());
        holder.imagen.setImageDrawable(mCtx.getResources().getDrawable(R.drawable.ic_launcher_background));
    }

    @Override
    public int getItemCount() {return lista.size();}

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView nombre,nocontrol,carrera;
        ImageView imagen;
        public RecyclerViewHolder(View itemView) {
            super(itemView);

            imagen=itemView.findViewById(R.id.logo);
            nombre=itemView.findViewById(R.id.nombre);
            nocontrol=itemView.findViewById(R.id.nocontrol);
            carrera=itemView.findViewById(R.id.carrera);
        }
    }
}
