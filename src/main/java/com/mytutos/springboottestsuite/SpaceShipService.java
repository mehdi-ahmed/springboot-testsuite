package com.mytutos.springboottestsuite;

import com.mytutos.springboottestsuite.space.SpaceShip;
import org.springframework.stereotype.Service;

@Service
public class SpaceShipService {

    public SpaceShip createDefault() {
        return new SpaceShip(null, "Falcon", 10L);
    }
}
