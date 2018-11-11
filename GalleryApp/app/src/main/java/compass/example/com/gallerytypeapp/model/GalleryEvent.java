package compass.example.com.gallerytypeapp.model;

import java.util.ArrayList;

public class GalleryEvent {

    public static final int STAMP_TITLE = 0;
    public static final int STAMP_SIZE_TYPE = 1;
    public static final int SSLC_SIZE_TYPE = 2;
    public static final int NORMAL_STAMP_SIZE_TYPE = 3;
    public static final int PAN_CARD_SIZE = 4;       //  width == 2.5 and height == 3.5
    public static final int PASSPORT_SIZE = 5;       //  width == 3.5 and height == 3.5
    public static final int NORMAL_SIZE = 6;         //  width == 3.5 and height == 4.5
    public static final int USA_SIZE = 7;


    private String mName;
    private ArrayList<Integer> mImage;
    private int image;
    private int mType;

    public GalleryEvent(ArrayList<Integer> mImage, int mType) {
        this.mImage = mImage;
        this.mType = mType;
    }

    public GalleryEvent(int image, int mType) {
        this.image = image;
        this.mType = mType;
    }

    public GalleryEvent(String mName, int mType) {
        this.mName = mName;
        this.mType = mType;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public ArrayList<Integer> getmImage() {
        return mImage;
    }

    public void setmImage(ArrayList<Integer> mImage) {
        this.mImage = mImage;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

}
