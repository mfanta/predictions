package cz.mfanta.predictions.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserNameResource {

    @GetMapping(
            value = "/username",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String getUserName() {
        return "Martin";
    }
}
