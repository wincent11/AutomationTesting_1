import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.io.IOException;

public class GitRepo {
    String MAIN_URL = "https://api.github.com";
    String ENDPOINT_USERS = "/orgs/{org}/repos";

    @Test
    @DisplayName("Create GitHub Repo")
    void createGitHubRepo() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost get = new HttpPost(MAIN_URL + ENDPOINT_USERS);
        HttpResponse response = client.execute(get);
        ResponseHandler<String> handler = new BasicResponseHandler();

        String body = client.execute(get, handler);
    }
}