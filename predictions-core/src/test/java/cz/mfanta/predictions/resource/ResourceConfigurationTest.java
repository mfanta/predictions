package cz.mfanta.predictions.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ResourceConfiguration.class)
@ActiveProfiles("test")
public class ResourceConfigurationTest {

    @Autowired
    private UserNameResource userNameResource;

    @Test
    public void providesUserNameResource() throws Exception {
        assertThat(userNameResource, not(nullValue()));
    }
}
