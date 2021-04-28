import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SuccessfulTest {
    String MAIN_URL = "https://api.github.com";
    String ENDPOINT_USERS = "/users";

    @Test
    @DisplayName("Test For Status Code 200 OK")
    public void repositorySearchUrlReturns200() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(MAIN_URL + ENDPOINT_USERS);
        HttpResponse response = client.execute(get);
        int actualStatus = response.getStatusLine().getStatusCode();

        Assert.assertEquals(actualStatus, 200);
    }
}