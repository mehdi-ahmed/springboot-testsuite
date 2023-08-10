package com.mytutos.springboottestsuite.space.ship;

import com.mytutos.springboottestsuite.SpaceShipService;
import com.mytutos.springboottestsuite.space.SpaceShip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tags({
        @Tag("spaceship"),
        @Tag("service")
})
class SpaceShipServiceTest {

    @Autowired
    private SpaceShipService spaceShipService;

    @Test
    void createDefault() {
        SpaceShip aDefault = spaceShipService.createDefault();
        Assertions.assertEquals(10L, aDefault.getFuelLeft());
    }
}