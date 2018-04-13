package ziasrestaurant.com.reservationapp.model;

public class MenuListHeader {

    private int headerBackgroundResource;
    private String headerTitle;

    public MenuListHeader(int headerBackgroundResource, String headerTitle) {
        this.headerBackgroundResource = headerBackgroundResource;
        this.headerTitle = headerTitle;
    }

    public int getHeaderBackgroundResource() {
        return headerBackgroundResource;
    }

    public void setHeaderBackgroundResource(int headerBackgroundResource) {
        this.headerBackgroundResource = headerBackgroundResource;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }
}
