package cz.mfanta.predictions.resource;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import cz.mfanta.predictions.dto.UserName;
import cz.mfanta.predictions.init.PredictionsInit;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponentsBuilder;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.OK;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = RANDOM_PORT
)
@ContextConfiguration(classes = PredictionsInit.class)
@ActiveProfiles("test")
public class UserNameResourceTest {

    @LocalServerPort
    private int port;

    @Test
    public void getUserNameTest() {
        UserName expectedUserName = new UserName("Martik");
        String url = buildGetUserNameUrl();
        Response response = RestAssured
                .given()
                .port(port)
                .when()
                .get(url);
        UserName responseUserName = response.as(UserName.class);

        response
                .then()
                .statusCode(OK.value());

        assertThat(responseUserName, is(expectedUserName));
    }

    private String buildGetUserNameUrl() {
        return UriComponentsBuilder
                .fromUriString("")
                .pathSegment("username")
                .toUriString();
    }
}
