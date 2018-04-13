package ziasrestaurant.com.reservationapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import ziasrestaurant.com.reservationapp.R;
import ziasrestaurant.com.reservationapp.model.MenuListHeader;
import ziasrestaurant.com.reservationapp.model.MenuListItem;

public class MenuExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<MenuListHeader> expandableListTitles;
    private Map<MenuListHeader, List<MenuListItem>> expandableListDetails;

    public MenuExpandableListAdapter(Context context, List<MenuListHeader> expandableListTitles,
                                     Map<MenuListHeader, List<MenuListItem>> expandableListDetails) {
        this.context = context;
        this.expandableListTitles = expandableListTitles;
        this.expandableListDetails = expandableListDetails;
    }

    @Override
    public int getGroupCount() {
        return expandableListTitles.size();
    }

    @Override
    public int getChildrenCount(int listPosition) {
        return expandableListDetails.get(expandableListTitles.get(listPosition)).size();
    }

    @Override
    public Object getGroup(int listPosition) {
        return this.expandableListTitles.get(listPosition);
    }

    @Override
    public Object getChild(int listPosition, int expandedListPosition) {
        return expandableListDetails
                .get(expandableListTitles.get(listPosition))
                .get(expandedListPosition);
    }

    @Override
    public long getGroupId(int listPosition) {
        return listPosition;
    }

    @Override
    public long getChildId(int listPosition, int expandedListPosition) {
        return expandedListPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int listPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        MenuListHeader listHeader = (MenuListHeader) getGroup(listPosition);

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.menu_list_group, null);
        }

        // Set the group header background image.
        ImageView groupImage = convertView.findViewById(R.id.groupImage);
        groupImage.setImageResource(listHeader.getHeaderBackgroundResource());

        // Set the group title.
        TextView groupTitle = convertView.findViewById(R.id.groupTitle);
        groupTitle.setText(listHeader.getHeaderTitle());

        return convertView;
    }

    @Override
    public View getChildView(int listPosition, final int expandedListPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        final MenuListItem listItem = (MenuListItem) getChild(listPosition, expandedListPosition);

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.menu_list_item, null);
        }

        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        titleTextView.setText(listItem.getItemName());

        TextView descTextView = convertView.findViewById(R.id.descTextView);
        descTextView.setText(listItem.getDescription());

        TextView priceTextView = convertView.findViewById(R.id.priceTextView);
        priceTextView.setText(listItem.getPrice());

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int listPosition, int expandedListPosition) {
        return true;
    }
}
