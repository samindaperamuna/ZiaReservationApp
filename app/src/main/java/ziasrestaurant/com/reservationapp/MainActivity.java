package ziasrestaurant.com.reservationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton humbergerButton = findViewById(R.id.humbergerButton);
        humbergerButton.setOnClickListener(this);

        ImageButton aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(this);

        ImageButton reserveButton = findViewById(R.id.reserveButton);
        reserveButton.setOnClickListener(this);

        ImageButton menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(this);

        ImageButton offersButton = findViewById(R.id.offersButton);
        offersButton.setOnClickListener(this);

        ImageButton photoButton = findViewById(R.id.photoButton);
        photoButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.humbergerButton:
                showPopup(view);
                break;
            case R.id.aboutButton:
                startActivity(new Intent(this, AboutActivity.class));
                break;
            case R.id.reserveButton:
                startActivity(new Intent(this, ReserveActivity.class));
                break;
            case R.id.menuButton:
                startActivity(new Intent(this, MenuActivity.class));
                break;
            case R.id.offersButton:
                startActivity(new Intent(this, OffersActivity.class));
                break;
            case R.id.photoButton:
                startActivity(new Intent(this, PhotoActivity.class));
                break;
        }
    }

    private void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.app_menu, popup.getMenu());
        popup.show();
    }
}
