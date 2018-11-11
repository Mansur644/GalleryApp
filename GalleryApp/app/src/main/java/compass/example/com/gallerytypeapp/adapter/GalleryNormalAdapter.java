package compass.example.com.gallerytypeapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import compass.example.com.gallerytypeapp.R;

public class GalleryNormalAdapter extends RecyclerView.Adapter<GalleryNormalAdapter.MyViewHolder> {

    ArrayList<Integer> dataSet;

    public GalleryNormalAdapter(ArrayList<Integer> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_gallery_normal_adapter, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ImageView imageView = holder.imgNormalImage;
        imageView.setImageResource(dataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgNormalImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgNormalImage = itemView.findViewById(R.id.row_normal_image);
        }
    }
}
