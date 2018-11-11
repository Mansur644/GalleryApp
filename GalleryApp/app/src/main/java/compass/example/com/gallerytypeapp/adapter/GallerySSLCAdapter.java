package compass.example.com.gallerytypeapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import compass.example.com.gallerytypeapp.R;

public class GallerySSLCAdapter extends RecyclerView.Adapter<GallerySSLCAdapter.MyViewHolder> {

    private ArrayList<Integer> dataSet;

    public GallerySSLCAdapter(ArrayList<Integer> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public GallerySSLCAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_gallery_sslc_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GallerySSLCAdapter.MyViewHolder holder, int position) {
        ImageView imageView = holder.imgSslcImage;
        imageView.setImageResource(dataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgSslcImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgSslcImage = itemView.findViewById(R.id.row_sslc_size_image);
        }
    }
}
