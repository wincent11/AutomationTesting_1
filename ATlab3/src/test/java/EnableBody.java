import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class EnableBody {
    String MAIN_URL = "https://api.github.com";
    String ENDPOINT_USERS = "/users";

    @Test
    @DisplayName("Test response body contains Body")
    void containsBody() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(MAIN_URL + ENDPOINT_USERS);
        ResponseHandler<String> handler = new BasicResponseHandler();

        Assertions.assertNotNull(client.execute(get, handler));
    }
}