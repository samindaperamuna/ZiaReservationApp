package ziasrestaurant.com.reservationapp.data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ziasrestaurant.com.reservationapp.R;
import ziasrestaurant.com.reservationapp.model.MenuListHeader;
import ziasrestaurant.com.reservationapp.model.MenuListItem;

public class DataDefinition {

    public static Map<MenuListHeader, List<MenuListItem>> getData() {

        Map<MenuListHeader, List<MenuListItem>> expandableListDetails = new LinkedHashMap<>();

        List<MenuListItem> starters = new ArrayList<>();
        starters.add(new MenuListItem("King Prawn Butterfly",
                "Marinated with exotic spices & fried in butter with bread crumbs",
                "£3.45"));
        starters.add(new MenuListItem("King Prawn Puri",
                "King prawn served on a fluffy bread with medium spicy sauce",
                "£4.25"));
        starters.add(new MenuListItem("Prawn Puri",
                "Prawn served on a fluffy bread with medium spicy sauce",
                "£3.25"));
        starters.add(new MenuListItem("Samosa",
                "Meat or vegetables",
                "£1.95"));
        starters.add(new MenuListItem("Chicken Chat",
                "Small pieces of potato with medium hot & sour sauce",
                "£3.25"));
        starters.add(new MenuListItem("Onion Bhajee",
                "Served with fresh salad & mint sauce",
                "£1.95"));
        starters.add(new MenuListItem("Tandoori Chicken Wings",
                "Marinated with hot spicy sauce & served in delicious sauce",
                "£2.95"));

        List<MenuListItem> tandoori = new ArrayList<>();
        tandoori.add(new MenuListItem("Tandoori Chicken",
                "Chicken marinated with chef's delicious special spices, served with green salad",
                "£8.95"));
        tandoori.add(new MenuListItem("Chicken Shashlick",
                "Marinated chicken, capsicum,onion & tomatoes grilled in the tandoori",
                "£6.35"));
        tandoori.add(new MenuListItem("Lamb Shashlick",
                "Marinated lamb, capsicum,onion & tomatoes grilled in the tandoori",
                "£6.85"));
        tandoori.add(new MenuListItem("Tandoori King Prawns",
                "King prawns marinated in herbs & spices",
                "£9.25"));
        tandoori.add(new MenuListItem("Tandoori Mixed Grill",
                "Selection of meat, chicken & prawns marinated in herbs & freshly ground spices (served with plain naan)",
                "£8.75"));
        tandoori.add(new MenuListItem("Lamb Tikka",
                "Tender fillets of lamb marinated mildly & cooked in the tandoori",
                "£5.85"));
        tandoori.add(new MenuListItem("Chicken Tikka",
                "Diced chicken breast marinated with herbs & spices, barbecued in the tandoori",
                "£5.35"));
        tandoori.add(new MenuListItem("Salmon Tikka",
                "Diced salmon marinated with freshly grounded spices & herbs",
                "£6.35"));
        tandoori.add(new MenuListItem("Lamb Chops",
                "Tender lamb chops served with fresh herbs & spices",
                "£5.85"));

        List<MenuListItem> lamb = new ArrayList<>();
        lamb.add(new MenuListItem("Ghost Katar Masala",
                "Sliced lamb prepared with tomatoes, onions, smashed garlic & mustard sauce",
                "£6.65"));
        lamb.add(new MenuListItem("Lamb Chops Masala",
                "Tender lamb chops in our own garam masala with denghai mirch, ginger & fresh lime",
                "£7.85"));
        lamb.add(new MenuListItem("Lamb Tikka Masala",
                "Lamb pieces cooked with mild masala sauce",
                "£6.65"));
        lamb.add(new MenuListItem("Lamb Pasanda",
                "Lamb pieces cooked with yoghurt & mild sauce prepared with almond",
                "£6.65"));
        lamb.add(new MenuListItem("Karahi Dhal Ghost",
                "Yellow lentils & lamb mixed together with onions, green pepper cooked with medium spice",
                "£5.95"));
        lamb.add(new MenuListItem("Karahi Keema",
                "Lamb mince prepared in a wok style karahi, cooked with onions, green peppers & tomatoes",
                "£5.95"));
        lamb.add(new MenuListItem("Karahi Lamb",
                "Lamb tikka cooked with special karahi spices onions, capsicum, green peppers & tomatoes",
                "£5.95"));

        List<MenuListItem> chicken = new ArrayList<>();
        chicken.add(new MenuListItem("Chicken Tikka Masala",
                "Tender chicken breast cooked in the tandoori served mild masala sauce",
                "£6.35"));
        chicken.add(new MenuListItem("Chicken Pasanda",
                "Chicken pieces cooked with yogurt & mild sauce",
                "£6.45"));
        chicken.add(new MenuListItem("Chicken Tikka Bhuna",
                "Tikka marinated & grilled in tandoori clay oven, cooked with onions, tomatoes & garlic",
                "£6.25"));
        chicken.add(new MenuListItem("Khali Mirch Chicken",
                "Mixture of diced chicken with roasted peppercorn-spicy dish",
                "£6.45"));
        chicken.add(new MenuListItem("Chicken Satkura",
                "Chicken cooked in a tangy lemon sauce with mild spice",
                "£6.45"));
        chicken.add(new MenuListItem("Garlic Chilli Chicken",
                "Fresh garlic & chillies cooked with medium spices",
                "£5.95"));
        chicken.add(new MenuListItem("Karahi Chicken",
                "Chicken tikka cooked with special karahi spices onions, capsicum, green peppers, & tomatoes",
                "£5.95"));
        chicken.add(new MenuListItem("Butter Chicken",
                "Succulent pieces of cooked in mild sauce with butter & almonds",
                "£6.75"));

        List<MenuListItem> seaFood = new ArrayList<>();
        seaFood.add(new MenuListItem("Nowabi King Prawn",
                "King prawn cooked with garlic, spring onion & fresh herbs",
                "£8.95"));
        seaFood.add(new MenuListItem("Tandoori King Prawn Masala",
                "King prawns cooked in chef's special sauce",
                "£7.95"));
        seaFood.add(new MenuListItem("Salmon Masala",
                "Salmon fish cooked wit special spices",
                "£8.95"));
        seaFood.add(new MenuListItem("Bengal Fish Masala",
                "Medium spiced, garlic, red pepper with touch of lemon & green c",
                "£7.95"));

        List<MenuListItem> signature = new ArrayList<>();
        signature.add(new MenuListItem("Jafarani Duck",
                "Tender duck breast grilled on charcoal in a clay oven served with onions,peppers & our own garam masala",
                "£8.95"));
        signature.add(new MenuListItem("Bombay Duck",
                "Charcoal grilled duck cooked in a clay spicy sauce with fresh herbs, fried onions garnished with coriander",
                "£8.95"));
        signature.add(new MenuListItem("Paneer Tikka Masala",
                "Cottage cheese with tikka masala sauce",
                "£5.25"));
        signature.add(new MenuListItem("Special Fried Chicken",
                "Stir fried onion, mushrooms & peas",
                "£6.45"));
        signature.add(new MenuListItem("Lamb Shank",
                "Tender calf of lamb roasted in the oven slow cooked with blend of fresh peppers & dried spices finished with fresh cream",
                "£11.95"));
        signature.add(new MenuListItem("Sea Bass Peri Peri Sizzler",
                "Sea fresh sea bass fillets marinated with peri peri spices & served in a hot sizzling masala sauce",
                "£9.95"));

        List<MenuListItem> special = new ArrayList<>();
        special.add(new MenuListItem("Lamb Biryani",
                "Tender lamb with rice",
                "£6.65"));
        special.add(new MenuListItem("Chicken Biryani",
                "Tender chicken breast with rice",
                "£5.95"));
        special.add(new MenuListItem("Zia's Special Biryani",
                "Special biryani prepared with a mix of carrots, mushrooms, pilau rice, chicken tikka & lamb tikka",
                "£7.95"));
        special.add(new MenuListItem("King Prawn Biryani",
                "Marinated king prawns cooked with rice",
                "£8.95"));
        special.add(new MenuListItem("Vegetable Biryani",
                "Mixed vegetable prepared with rice",
                "£5.85"));

        expandableListDetails.put(new MenuListHeader(R.drawable.starters, "Starters"), starters);
        expandableListDetails.put(new MenuListHeader(R.drawable.tandoori, "Tandoori Dishes"), tandoori);
        expandableListDetails.put(new MenuListHeader(R.drawable.lamb, "Lamb Dishes"), lamb);
        expandableListDetails.put(new MenuListHeader(R.drawable.chicken, "Chicken Dishes"), chicken);
        expandableListDetails.put(new MenuListHeader(R.drawable.seafood, "Seafood"), seaFood);
        expandableListDetails.put(new MenuListHeader(R.drawable.signature, "Zia's Signature Dishes"), signature);
        expandableListDetails.put(new MenuListHeader(R.drawable.special, "Special Main Courses"), special);

        return expandableListDetails;
    }
}
