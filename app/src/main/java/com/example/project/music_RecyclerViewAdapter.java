package com.example.project;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class music_RecyclerViewAdapter extends RecyclerView.Adapter<music_RecyclerViewAdapter.MyViewHolder>{
    Context context;
    ArrayList<Music> artists;
    public music_RecyclerViewAdapter(Context context, ArrayList<Music>artists){
        this.context = context;
        this.artists = artists;
    }
    @NonNull
    @Override
    public music_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyclerview_layout, parent, false);
        return new music_RecyclerViewAdapter.MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull music_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.textview.setText(artists.get(position).getName());
    }
    @Override
    public int getItemCount() {
        return artists.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textview = itemView.findViewById(R.id.title);
        }
    }
}
