package com.mytutos.springboottestsuite.space.crew;

import com.mytutos.springboottestsuite.CrewService;
import com.mytutos.springboottestsuite.space.Crew;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tags({
        @Tag("crew"),
        @Tag("service")
})
public class CrewServiceNameTest {

    @Autowired
    private CrewService crewService;

    @Test
    @DisplayName("Make sure that name is Marcus")
    void createDefault() {
        Crew aCrew = crewService.createDefault();
        Assertions.assertEquals("Marcus", aCrew.getName());
    }
}
