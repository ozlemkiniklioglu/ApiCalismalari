import org.json.JSONObject;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class C03_JsonObjesiOlusturma {

    /*

    Asagidaki JSON Objesini olusturup konsolda yazdirin.
    { "title":"Ahmet", "body":"Merhaba", "userId":1 }

     */

    @Test
    public void jsonObje01(){

        JSONObject jsonObject=new JSONObject();

        jsonObject.put("title", "Ahmet");
        jsonObject.put("body", "Merhaba");
        jsonObject.put("userId", 1);

        System.out.println(jsonObject);
    }

    @Test
    public void jsonObjee02(){

        /*

        Asagidaki JSON Objesini olusturup konsolda yazdirin.
        {
        "firstname":"Jim",
        "additionalneeds":"Breakfast",
        "bookingdates":{ "checkin":"2018-01-01", "checkout":"2019-01-01" },
        "totalprice":111,
        "depositpaid":true,
        "lastname":"Brown"
         }

         */
        JSONObject bookingDates = new JSONObject();

        bookingDates.put("checkin","2018-01-01");
        bookingDates.put("checkout","2019-01-01");

        JSONObject outerJson = new JSONObject();


        outerJson.put("firstname","Jim");
        outerJson.put("additionalneeds","Breakfast");
        outerJson.put("totalprice","111");
        outerJson.put("depositpaid","true");
        outerJson.put("lastname","Brown");

        System.out.println("Booking Json Objemis: " +outerJson);









    }
}
