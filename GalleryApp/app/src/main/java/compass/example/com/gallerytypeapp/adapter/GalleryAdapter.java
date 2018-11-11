package compass.example.com.gallerytypeapp.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import compass.example.com.gallerytypeapp.R;
import compass.example.com.gallerytypeapp.model.GalleryEvent;

public class GalleryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<GalleryEvent> arrayList;
    private Context mContext;

    public GalleryAdapter(Context context, ArrayList<GalleryEvent> array) {
        this.mContext = context;
        this.arrayList = array;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case GalleryEvent.STAMP_TITLE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_gallery_title_layout, parent, false);
                return new StampTitleViewHolder(view);

            case GalleryEvent.STAMP_SIZE_TYPE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_stamp_size_layout, parent, false);
                return new StampSizeViewHolder(view);

            case GalleryEvent.SSLC_SIZE_TYPE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_sslc_size_layout, parent, false);
                return new SslcStampSizeViewHolder(view);

            case GalleryEvent.NORMAL_STAMP_SIZE_TYPE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_normal_stamp_size_layout, parent, false);
                return new NormalStampSizeViewHolder(view);

            case GalleryEvent.PAN_CARD_SIZE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_pancard_size_layout, parent, false);
                return new PanCardSizeViewHolder(view);

            case GalleryEvent.PASSPORT_SIZE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_passport_size_layout, parent, false);
                return new PassportSizeViewHolder(view);

            case GalleryEvent.NORMAL_SIZE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_normal_size_layout, parent, false);
                return new NormalSizeViewHolder(view);

            case GalleryEvent.USA_SIZE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_usa_size_layout, parent, false);
                return new USASizeViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        GalleryEvent object = arrayList.get(position);
        if (object != null) {
            switch (object.getmType()) {
                case GalleryEvent.STAMP_TITLE:
                    ((StampTitleViewHolder) holder).txtCityTitle.setText(object.getmName());
                    break;

                case GalleryEvent.STAMP_SIZE_TYPE:
                    StampSizeViewHolder stampSizeViewHolder = ((StampSizeViewHolder) holder);
                    GalleryStampSizeAdapter gallerItemsAdapter = new GalleryStampSizeAdapter(object.getmImage());
                    stampSizeViewHolder.photoRecyclerView.setAdapter(gallerItemsAdapter);
                    break;

                case GalleryEvent.SSLC_SIZE_TYPE:
                    SslcStampSizeViewHolder sslcStampSizeViewHolder = ((SslcStampSizeViewHolder) holder);
                    GallerySSLCAdapter gallerySSLCAdapter = new GallerySSLCAdapter(object.getmImage());
                    sslcStampSizeViewHolder.sslcRecylerview.setAdapter(gallerySSLCAdapter);
                    break;

                case GalleryEvent.NORMAL_STAMP_SIZE_TYPE:
                    NormalStampSizeViewHolder normalStampSizeViewHolder = ((NormalStampSizeViewHolder) holder);
                    GalleryNormalStampAdapter galleryNormalStampAdapter = new GalleryNormalStampAdapter(object.getmImage());
                    normalStampSizeViewHolder.normalStampRecyclerView.setAdapter(galleryNormalStampAdapter);
                    break;

                case GalleryEvent.PAN_CARD_SIZE:
                    PanCardSizeViewHolder panCardSizeViewHolder = ((PanCardSizeViewHolder) holder);
                    GalleryPanCardAdapter galleryPanCardAdapter = new GalleryPanCardAdapter(object.getmImage());
                    panCardSizeViewHolder.panCardRecyclerView.setAdapter(galleryPanCardAdapter);
                    break;

                case GalleryEvent.PASSPORT_SIZE:
                    PassportSizeViewHolder passportSizeViewHolder = ((PassportSizeViewHolder) holder);
                    GalleryPassportAdapter galleryPassportAdapter = new GalleryPassportAdapter(object.getmImage());
                    passportSizeViewHolder.passportRecyclerView.setAdapter(galleryPassportAdapter);
                    break;

                case GalleryEvent.NORMAL_SIZE:
                    NormalSizeViewHolder normalSizeViewHolder = ((NormalSizeViewHolder) holder);
                    GalleryNormalAdapter galleryNormalAdapter = new GalleryNormalAdapter(object.getmImage());
                    normalSizeViewHolder.normalRecyclerView.setAdapter(galleryNormalAdapter);
                    break;

                case GalleryEvent.USA_SIZE:
                    USASizeViewHolder usaSizeViewHolder = ((USASizeViewHolder) holder);
                    GalleryUsaAdapter galleryUsaAdapter = new GalleryUsaAdapter(object.getmImage());
                    usaSizeViewHolder.usaRecyclerView.setAdapter(galleryUsaAdapter);
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        if (arrayList == null)
            return 0;
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {

        if (arrayList != null) {
            GalleryEvent object = arrayList.get(position);
            if (object != null) {
                return object.getmType();
            }
        }
        return 0;
    }

    public static class StampTitleViewHolder extends RecyclerView.ViewHolder {
        TextView txtCityTitle;

        public StampTitleViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCityTitle = (TextView) itemView.findViewById(R.id.titleTextView);
        }
    }

    public class StampSizeViewHolder extends RecyclerView.ViewHolder {
        RecyclerView photoRecyclerView;

        public StampSizeViewHolder(@NonNull View itemView) {
            super(itemView);
            photoRecyclerView = itemView.findViewById(R.id.photoRecyclerView);
            GridLayoutManager layoutManager = new GridLayoutManager(mContext, 4);
            photoRecyclerView.setLayoutManager(layoutManager);
        }
    }

    public class SslcStampSizeViewHolder extends RecyclerView.ViewHolder {
        RecyclerView sslcRecylerview;

        public SslcStampSizeViewHolder(@NonNull View itemView) {
            super(itemView);
            sslcRecylerview = itemView.findViewById(R.id.row_sslc_recycler);
            GridLayoutManager layoutManager1 = new GridLayoutManager(mContext, 4);
            sslcRecylerview.setLayoutManager(layoutManager1);
        }
    }

    public class NormalStampSizeViewHolder extends RecyclerView.ViewHolder {
        RecyclerView normalStampRecyclerView;

        public NormalStampSizeViewHolder(@NonNull View itemView) {
            super(itemView);
            normalStampRecyclerView = itemView.findViewById(R.id.row_normal_stamp_recycler);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 3);
            normalStampRecyclerView.setLayoutManager(gridLayoutManager);
        }
    }

    public class PanCardSizeViewHolder extends RecyclerView.ViewHolder {
        RecyclerView panCardRecyclerView;

        public PanCardSizeViewHolder(@NonNull View itemView) {
            super(itemView);
            panCardRecyclerView = itemView.findViewById(R.id.row_pancard_recyclerview);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 3);
            panCardRecyclerView.setLayoutManager(gridLayoutManager);
        }
    }

    public class PassportSizeViewHolder extends RecyclerView.ViewHolder {
        RecyclerView passportRecyclerView;

        public PassportSizeViewHolder(@NonNull View itemView) {
            super(itemView);
            passportRecyclerView = itemView.findViewById(R.id.row_passport_recyclerview);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 3);
            passportRecyclerView.setLayoutManager(gridLayoutManager);
        }
    }

    public class NormalSizeViewHolder extends RecyclerView.ViewHolder {
        RecyclerView normalRecyclerView;

        public NormalSizeViewHolder(@NonNull View itemView) {
            super(itemView);
            normalRecyclerView = itemView.findViewById(R.id.row_normal_recyclerview);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 2);
            normalRecyclerView.setLayoutManager(gridLayoutManager);

        }
    }

    public class USASizeViewHolder extends RecyclerView.ViewHolder {
        RecyclerView usaRecyclerView;

        public USASizeViewHolder(@NonNull View itemView) {
            super(itemView);
            usaRecyclerView = itemView.findViewById(R.id.row_usa_recyclerview);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 2);
            usaRecyclerView.setLayoutManager(gridLayoutManager);
        }
    }

}
