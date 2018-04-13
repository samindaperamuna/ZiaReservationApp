package ziasrestaurant.com.reservationapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ziasrestaurant.com.reservationapp.adapter.MenuExpandableListAdapter;
import ziasrestaurant.com.reservationapp.data.DataDefinition;
import ziasrestaurant.com.reservationapp.model.MenuListHeader;
import ziasrestaurant.com.reservationapp.model.MenuListItem;

public class MenuActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<MenuListHeader> expandableListTitles;
    Map<MenuListHeader, List<MenuListItem>> expandableListDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        expandableListView = findViewById(R.id.expandableListView);
        expandableListDetails = DataDefinition.getData();
        expandableListTitles = new ArrayList<>(expandableListDetails.keySet());
        expandableListAdapter = new MenuExpandableListAdapter(this, expandableListTitles, expandableListDetails);
        expandableListView.setAdapter(expandableListAdapter);
    }
}