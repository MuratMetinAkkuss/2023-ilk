package Day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C03_NestedMaps {
    public static void main(String[] args) {
        /*
        Asagidaki body'yi map olarak olusturun
        {
            "firstname" : "Ahmet",
            "lastname" : “Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi" }
            key : String
            value : String, Integer, Boolean, Map<String,String>
         */

        Map<String, Object> reservationMap = new HashMap<>();

        reservationMap.put("First name", "Ahmet");
        reservationMap.put("Last name", "Bulut");
        reservationMap.put("Total price", 500);
        reservationMap.put("Deposit paid", false);

        Map<String, String> bookingDatesMap = new HashMap<>();
        bookingDatesMap.put("Checkin", "2023-07-21");
        bookingDatesMap.put("Checkout", "2023-08-10");

        reservationMap.put("Booking dates", bookingDatesMap);
        reservationMap.put("Additional needs ", "Wi - Fi");

        System.out.println(reservationMap);

        /*
            bu map'te isim bilgisini yazdirin
         */

        System.out.println(reservationMap.get("First name"));

        System.out.println(reservationMap.get("Additional needs "));

        //rezervasyon map'te soy isim bilgisinin ilk harfini yazdirin

        System.out.println(((String) reservationMap.get("Last name")).charAt(0));

        System.out.println(reservationMap.get("Yas"));

        System.out.println(((Map) reservationMap.get("Booking dates")).get("Checkin"));


    }
}
