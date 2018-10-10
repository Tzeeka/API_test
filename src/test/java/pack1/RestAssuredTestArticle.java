package pack1;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import source_pack.ResponseClass;
import source_pack.Translations;

import java.util.Arrays;
import java.util.List;


public class RestAssuredTestArticle {

    public static String ENDPOINT = "http://restcountries.eu/rest/v1/name/russia";

    @Before
    public void setup() {
        RestAssured.baseURI = "http://restcountries.eu/rest/v1";

    }

    @Test
    public void getRequestExampleTest() throws JSONException {
        Response response = get(ENDPOINT);
        /*List<ResponseClass> message = Arrays.asList(response.getBody().as(ResponseClass[].class));*/

        JsonPath jsonPath = RestAssured.given().
                when().
                get(ENDPOINT).
                then().
                assertThat().
                extract().body().jsonPath();

       /* List<ResponseClass> message = Arrays.asList(response.getBody().as(ResponseClass[].class));*/

        List<ResponseClass> message2 = jsonPath.getList("", ResponseClass.class);


        Assert.assertThat(message2.get(0).translations.de, is("Russland"));
        Assert.assertThat(response.getStatusCode(), is(200));
    }
}