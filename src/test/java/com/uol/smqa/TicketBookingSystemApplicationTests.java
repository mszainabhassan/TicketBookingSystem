package com.uol.smqa;

import com.uol.smqa.config.WebConfig;
import jakarta.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
@ActiveProfiles("test")
@TestPropertySource(locations="classpath:application-test.properties")
public class TicketBookingSystemApplicationTests {

    @Test
    public void contextLoads() {
    }
}
