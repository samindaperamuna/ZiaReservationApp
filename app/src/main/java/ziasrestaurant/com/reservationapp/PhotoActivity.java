package ziasrestaurant.com.reservationapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import ziasrestaurant.com.reservationapp.model.GalleryImage;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_images);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        ImageGalleryAdapter adapter = new ImageGalleryAdapter(this, GalleryImage.getGalleryImages());
        recyclerView.setAdapter(adapter);
    }

    private class ImageGalleryAdapter extends RecyclerView.Adapter<ImageGalleryAdapter.MyViewHolder> {

        private GalleryImage[] mGalleryImages;
        private Context mContext;

        ImageGalleryAdapter(Context context, GalleryImage[] galleryImages) {
            mContext = context;
            mGalleryImages = galleryImages;
        }

        @NonNull
        @Override
        public ImageGalleryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);
            View photoView = inflater.inflate(R.layout.image_item, parent, false);
            return new MyViewHolder(photoView);
        }

        @Override
        public void onBindViewHolder(@NonNull final ImageGalleryAdapter.MyViewHolder holder, int position) {

            GalleryImage galleryImage = mGalleryImages[position];
            ImageView imageView = holder.mPhotoImageView;

            Glide.with(mContext)
                    .load(galleryImage.getUrl())
                    .asBitmap()
                    .listener(new RequestListener<String, Bitmap>() {
                        @Override
                        public boolean onException(Exception e, String model, Target<Bitmap> target, boolean isFirstResource) {
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Bitmap resource, String model, Target<Bitmap> target, boolean isFromMemoryCache, boolean isFirstResource) {
                            holder.mPhotoImageView.setBackgroundResource(R.drawable.image_view_bg);
                            return false;
                        }
                    })
                    .skipMemoryCache(true)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(imageView);
        }

        @Override
        public int getItemCount() {
            return (mGalleryImages.length);
        }

        public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            ImageView mPhotoImageView;

            MyViewHolder(View itemView) {

                super(itemView);
                mPhotoImageView = itemView.findViewById(R.id.iv_photo);
                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {

                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    GalleryImage galleryImage = mGalleryImages[position];
                    Intent intent = new Intent(mContext, PhotoViewActivity.class);
                    intent.putExtra(PhotoViewActivity.EXTRA_GALLERY_IMAGE, galleryImage);
                    startActivity(intent);
                }
            }
        }
    }
}