package com.mytutos.springboottestsuite;

import com.mytutos.springboottestsuite.space.Crew;
import org.springframework.stereotype.Service;

@Service
public class CrewService {

    public Crew createDefault() {
        return new Crew(null, "Marcus", 1L);
    }
}
