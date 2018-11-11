package compass.example.com.gallerytypeapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import compass.example.com.gallerytypeapp.R;
import compass.example.com.gallerytypeapp.adapter.GalleryAdapter;
import compass.example.com.gallerytypeapp.model.GalleryEvent;

public class GalleryActivity extends AppCompatActivity {

    // Reference : http://alexzh.com/tutorials/multiple-row-layouts-using-recyclerview/

    RecyclerView mRecyclerView;
    GalleryAdapter adapter;
    LinearLayoutManager layoutManager;
    ArrayList<GalleryEvent> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        mRecyclerView = (RecyclerView) findViewById(R.id.gallery_recycler);
        layoutManager = new LinearLayoutManager(GalleryActivity.this);
        mRecyclerView.setLayoutManager(layoutManager);

        arrayList = getDatas();
        adapter = new GalleryAdapter(GalleryActivity.this, arrayList);
        mRecyclerView.setAdapter(adapter);
    }

    private ArrayList<GalleryEvent> getDatas() {
        ArrayList<GalleryEvent> results = new ArrayList<>();

        ArrayList<Integer> imagesList = new ArrayList<>();
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);

        results.add(new GalleryEvent("Stamp Size", GalleryEvent.STAMP_TITLE));
        results.add(new GalleryEvent(imagesList, GalleryEvent.STAMP_SIZE_TYPE));

        imagesList = new ArrayList<>();
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);

        results.add(new GalleryEvent("SSLC Size", GalleryEvent.STAMP_TITLE));
        results.add(new GalleryEvent(imagesList, GalleryEvent.SSLC_SIZE_TYPE));

        imagesList = new ArrayList<>();
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        results.add(new GalleryEvent("Normal Stamp", GalleryEvent.STAMP_TITLE));
        results.add(new GalleryEvent(imagesList, GalleryEvent.NORMAL_STAMP_SIZE_TYPE));

        imagesList = new ArrayList<>();
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);

        results.add(new GalleryEvent("Pan Card", GalleryEvent.STAMP_TITLE));
        results.add(new GalleryEvent(imagesList, GalleryEvent.PAN_CARD_SIZE));

        imagesList = new ArrayList<>();
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        results.add(new GalleryEvent("Passport", GalleryEvent.STAMP_TITLE));
        results.add(new GalleryEvent(imagesList, GalleryEvent.PASSPORT_SIZE));

        imagesList = new ArrayList<>();
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);

        results.add(new GalleryEvent("Normal", GalleryEvent.STAMP_TITLE));
        results.add(new GalleryEvent(imagesList, GalleryEvent.NORMAL_SIZE));

        imagesList = new ArrayList<>();
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);
        imagesList.add(R.drawable.stamp);

        results.add(new GalleryEvent("USA", GalleryEvent.STAMP_TITLE));
        results.add(new GalleryEvent(imagesList, GalleryEvent.USA_SIZE));

        return results;
    }
}
