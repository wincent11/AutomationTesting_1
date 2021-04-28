import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UnsuccessfulTest {
    String MAIN_URL = "https://api.github.com";
    String ENDPOINT_USER = "/user";
    String ENDPOINT_NON_EXISTING_NAME = "/nonExistingName";

    @DisplayName("Test For status Code 401 Unauthorized")
    @Test
    void repositorySearchUrlReturns401() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(MAIN_URL + ENDPOINT_USER);
        HttpResponse response = client.execute(get);
        int actualStatus = response.getStatusLine().getStatusCode();

        Assert.assertEquals(actualStatus, 401);
    }

    @Test
    @DisplayName("Test For status Code 404 Not Found")
    void nonExistingName() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(MAIN_URL + ENDPOINT_NON_EXISTING_NAME);
        HttpResponse response = client.execute(get);
        int actualStatus = response.getStatusLine().getStatusCode();

        Assert.assertEquals(actualStatus, 404);
    }
}