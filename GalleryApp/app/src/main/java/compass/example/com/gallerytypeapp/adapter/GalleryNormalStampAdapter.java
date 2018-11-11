package compass.example.com.gallerytypeapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import compass.example.com.gallerytypeapp.R;

public class GalleryNormalStampAdapter extends RecyclerView.Adapter<GalleryNormalStampAdapter.MyViewHolder> {

    ArrayList<Integer> dadaset;

    public GalleryNormalStampAdapter(ArrayList<Integer> dadaset) {
        this.dadaset = dadaset;
    }

    @NonNull
    @Override
    public GalleryNormalStampAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_gallery_normal_stamp_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryNormalStampAdapter.MyViewHolder holder, int position) {
        ImageView imageView = holder.imgNormalStampImage;
        imageView.setImageResource(dadaset.get(position));
    }

    @Override
    public int getItemCount() {
        return dadaset.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgNormalStampImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgNormalStampImage = itemView.findViewById(R.id.row_normal_stamp_image);
        }
    }
}
