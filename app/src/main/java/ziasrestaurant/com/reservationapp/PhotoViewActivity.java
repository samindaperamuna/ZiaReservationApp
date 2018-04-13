package ziasrestaurant.com.reservationapp;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import ziasrestaurant.com.reservationapp.model.GalleryImage;

public class PhotoViewActivity extends AppCompatActivity {

    public static final String EXTRA_GALLERY_IMAGE = "PhotoActivity.GALLERY_IMAGE";
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_view);

        mImageView = findViewById(R.id.image);
        GalleryImage galleryImage = getIntent().getParcelableExtra(EXTRA_GALLERY_IMAGE);

        Glide.with(this)
                .load(galleryImage.getUrl())
                .asBitmap()
                .error(R.mipmap.ic_launcher)
                .listener(new RequestListener<String, Bitmap>() {

                    @Override
                    public boolean onException(Exception e, String model, Target<Bitmap> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Bitmap resource, String model, Target<Bitmap> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        mImageView.setImageBitmap(resource);
                        mImageView.setBackgroundResource(R.drawable.image_view_bg);

                        return false;
                    }
                })
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(mImageView);
    }
}
