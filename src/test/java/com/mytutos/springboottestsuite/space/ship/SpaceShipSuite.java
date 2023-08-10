package com.mytutos.springboottestsuite.space.ship;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags("spaceship")
@SelectPackages({"com.mytutos.springboottestsuite.space.ship"})
public class SpaceShipSuite {
}
