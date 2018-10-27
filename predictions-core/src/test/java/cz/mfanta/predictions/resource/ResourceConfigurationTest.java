package cz.mfanta.predictions.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ResourceConfiguration.class)
@ActiveProfiles("test")
public class ResourceConfigurationTest {

    @Autowired
    private UserNameResource userNameResource;

    @Test
    public void providesUserNameResource() {
        assertThat(userNameResource).isNotNull();
    }
}
