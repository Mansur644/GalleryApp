package compass.example.com.gallerytypeapp.adapter;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import compass.example.com.gallerytypeapp.R;

public class GalleryPanCardAdapter extends RecyclerView.Adapter<GalleryPanCardAdapter.MyViewHolder> {

    ArrayList<Integer> dataSet;

    public GalleryPanCardAdapter(ArrayList<Integer> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public GalleryPanCardAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_gallery_pan_card_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryPanCardAdapter.MyViewHolder holder, int position) {
        ImageView imageView = holder.imgPanCardImageView;
        imageView.setImageResource(dataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPanCardImageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgPanCardImageView = itemView.findViewById(R.id.row_pancard_image);
        }
    }
}
