package cz.mfanta.predictions.init;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = PredictionsInit.class)
@ActiveProfiles("test")
public class PredictionsInitTest {

    @Test
    public void mainDoesNotThrow() throws Exception {
         PredictionsInit.main(new String[0]);
    }
}