package class01_get_http_request_method;

import base_url.HerOkuAppBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;
 import static org.testng.Assert.*;

public class Get02 extends HerOkuAppBaseUrl {

    /*
   Given
       https://restful-booker.herokuapp.com/booking/10012
   When
       Kullanici GET Request'i Url'e (APi) gonderir
   Then
       HTTP Status code 404 olmali
   And
       Status Line 'HTTP/1.1 404 Not Found' olmali
   And
       Response body "Not Found" icerir
   And
       Response body "ArcaneData" icermez
   And
       Server "Cowboy" olmali

       //1.adım : set the url  (burada manuel olarak yapıyoruz)
       //2. adım: beklenen datayı (expected data) set et
       //3. adım: Get request gonderilir ve Get Respanse alınır
       //4.adım: assertion yap (doğrulama demek)


*/
    @Test
    public void get02() {
        //1.set the url
        //  String url = " https://restful-booker.herokuapp.com/booking/10012"; // önerilmez
        spec.pathParams("first", "booking", "second", 10012);

        //2.adım : beklenen detayı set et

        //3.adım Get request gonder ve get response al
           Response response = given().spec(spec).when().get("/{first}/{second}");
           response.prettyPrint();

        //4. adım: Assertion

       response.then().assertThat().statusCode(404).contentType(ContentType.TEXT).
               statusLine("HTTP/1.1 404 Not Found");

    //    assertTrue(true) ==> yesil tik   assertTrue(false) ==> carpi (hata) verecek

      assertTrue(response.asString().contains("Not Found"));

       assertFalse(response.asString().contains("ArcaneData"));
        //beklenen data test case den gelir, actual (gercekte olan) data API den gelir
       assertEquals("Cowboy",response.getHeader("Server"));



    }
}
