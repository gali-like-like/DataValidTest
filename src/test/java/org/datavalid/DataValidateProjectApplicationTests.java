package org.datavalid;

import lombok.extern.slf4j.Slf4j;
import org.datavalid.controller.TextController;
import org.datavalid.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@Slf4j
class DataValidateProjectApplicationTests {

    @Autowired
    private TextController controller;

    @Test
    void contextLoads() {
    }

    @Test
    void testApi() {
    }

}
