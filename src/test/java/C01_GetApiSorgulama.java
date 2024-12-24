import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C01_GetApiSorgulama {



    /*

    https://restful-booker.herokuapp.com/booking/10url’ine bir GET request
    gonderdigimizde donen Response’un,
    status code’unun 200,
    ve content type’inin application/json; charset=utf-8,
    ve Server isimli Header’in degerinin Cowboy,
    ve status Line’in HTTP/1.1 200 OK
    ve response suresinin 5 sn’den kisa oldugunu
    manuel olarak test ediniz.


     */


    // 1. Göndereceğimiz Request için gerekli olan URL ve ihtiyc varsa Request Body hazırla
    // 2. Eğer soruda bize verilmişse Expected Data hazırla
    // 3. Bize dönen Response 'i Actual Data olarak kaydet
    // 4. Expected Data ile Actual Datayı karsılasttırmamız yani Assertion yapmamız gerek

    @Test
    public void get01(){

        // 1. Göndereceğimiz Request için gerekli olan URL ve ihtiyc varsa Request Body hazırla

        String url = "https://restful-booker.herokuapp.com/booking/10url";

        // 2. Eğer soruda bize acıkca verilmişse Expected Data hazırla

        // 3. Bize dönen Response 'i Actual Data olarak kaydet

        Response response = given().when().get(url);

        response.prettyPrint();

        // 4. Expected Data ile Actual Datayı karsılasttırmamız yani Assertion yapmamız gerek

        System.out.println("status code:" + response.getStatusCode());
        System.out.println("content type:" + response.getContentType());
        System.out.println("server header değeri:" + response.getHeader("Server"));
        System.out.println("status line:" + response.statusLine());
        System.out.println("response suresi:" + response.getTime());

    }

}
