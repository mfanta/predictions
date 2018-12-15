package cz.mfanta.predictions.config;

import cz.mfanta.predictions.resource.UserNameResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ResourceConfig.class)
@ActiveProfiles("test")
public class ResourceConfigTest {

    @Autowired
    private UserNameResource userNameResource;

    @Test
    public void providesUserNameResource() {
        assertThat(userNameResource).isNotNull();
    }
}
