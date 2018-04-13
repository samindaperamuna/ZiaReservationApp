package ziasrestaurant.com.reservationapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class GalleryImage implements Parcelable {

    public static final Creator<GalleryImage> CREATOR = new Creator<GalleryImage>() {
        @Override
        public GalleryImage createFromParcel(Parcel in) {
            return new GalleryImage(in);
        }

        @Override
        public GalleryImage[] newArray(int size) {
            return new GalleryImage[size];
        }
    };

    private String mUrl;
    private String mTitle;

    private GalleryImage(String url, String title) {
        mUrl = url;
        mTitle = title;
    }

    private GalleryImage(Parcel in) {
        mUrl = in.readString();
        mTitle = in.readString();
    }

    public static GalleryImage[] getGalleryImages() {
        return new GalleryImage[]{
                new GalleryImage("file:///android_asset/image/gallery-1.png", "gallery-1"),
                new GalleryImage("file:///android_asset/image/gallery-2.png", "gallery-2"),
                new GalleryImage("file:///android_asset/image/gallery-3.png", "gallery-3"),
                new GalleryImage("file:///android_asset/image/gallery-4.png", "gallery-4")
        };
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mUrl);
        parcel.writeString(mTitle);
    }
}
