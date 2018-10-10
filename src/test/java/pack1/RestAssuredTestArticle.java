package pack1;

import static io.restassured.RestAssured.get;
import static org.hamcrest.core.Is.is;


import io.restassured.response.Response;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;
import source_pack.*;

import java.util.Arrays;
import java.util.List;


public class RestAssuredTestArticle {

    @Test
    public void getRequestExampleTest() throws JSONException {
        Response response = get("http://restcountries.eu/rest/v1/name/russia");
        List<ResponseClass> message = Arrays.asList(response.getBody().as(ResponseClass[].class));
        Assert.assertThat(message.get(0).translations.de, is("Russland"));
        Assert.assertThat(response.getStatusCode(), is(200));
    }
}