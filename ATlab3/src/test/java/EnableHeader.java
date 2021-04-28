import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class EnableHeader {
    String MAIN_URL = "https://api.github.com";
    String ENDPOINT_USERS = "/users";

    @Test
    @DisplayName("Response header presence")
    void validationExistingHeader() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(MAIN_URL + ENDPOINT_USERS);
        HttpResponse response = client.execute(get);

        Assert.assertTrue(response.containsHeader("Accept-Ranges"));
    }

    @Test
    @DisplayName("Response header value")
    void validationExistingHeaderValue() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(MAIN_URL + ENDPOINT_USERS);
        HttpResponse response = client.execute(get);
        Assert.assertEquals(response.getHeaders("Accept-Ranges")[0].getValue(),"bytes");
    }
}