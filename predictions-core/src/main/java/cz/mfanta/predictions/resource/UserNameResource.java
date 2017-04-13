package cz.mfanta.predictions.resource;

import cz.mfanta.predictions.dto.UserName;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserNameResource {

    @GetMapping(
            value = "/username",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public UserName getUserName() {
        return UserName.builder().userName("Martik").build();
    }
}
