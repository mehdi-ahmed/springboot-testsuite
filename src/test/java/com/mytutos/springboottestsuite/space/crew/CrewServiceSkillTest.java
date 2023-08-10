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
class CrewServiceSkillTest {

    @Autowired
    private CrewService crewService;

    @Test
    @DisplayName("Make sure that skill level is 1 to begin with")
    void createDefault() {

        Crew aCrew = crewService.createDefault();
        Assertions.assertEquals(1L, aCrew.getSkillLevel());

    }
}