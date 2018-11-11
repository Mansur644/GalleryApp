package compass.example.com.gallerytypeapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import compass.example.com.gallerytypeapp.R;

public class GalleryUsaAdapter extends RecyclerView.Adapter<GalleryUsaAdapter.MyViewHolder> {

    ArrayList<Integer> dataSet;

    public GalleryUsaAdapter(ArrayList<Integer> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public GalleryUsaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_gallery_usa_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryUsaAdapter.MyViewHolder holder, int position) {
        ImageView imageView = holder.imgUsaImage;
        imageView.setImageResource(dataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgUsaImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgUsaImage = itemView.findViewById(R.id.row_usa_image);
        }
    }
}
