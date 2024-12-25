import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C07_Get_BodyTekrarlardanKurtulma {


    /*

    https://restful-booker.herokuapp.com/booking/10 url’ine
    bir GET request gonderdigimizde donen Response’un,
    status code’unun 200,
    ve content type’inin application-json,
    ve response body’sindeki "firstname“in, "Mary",
    ve "lastname“in, "Wilson",
    ve "totalprice“in, 924,
    ve "depositpaid“in, true,
    ve "additionalneeds“in, "Breakfast" oldugunu test edin

     */

    @Test
    public void get01(){

        // 1 - Url hazırla

        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2 - Expected data hazırla

        // 3 - Response'i kaydet

        Response response = given().when().get(url);
        response.prettyPrint();

        // 4 - Assertion

        response
                .then()
                    .assertThat()
                    .statusCode(200)
                    .contentType(ContentType.JSON)
                    .body("firstname", Matchers.equalTo("Mary"),
                        "lastname",Matchers.equalTo("Brown"),
                        "totalprice",Matchers.equalTo(513),
                        "depositpaid",Matchers.equalTo(true),
                            "additionalneeds",Matchers.equalTo("Breakfast"));


    }

}
