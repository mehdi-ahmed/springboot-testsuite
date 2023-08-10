package com.mytutos.springboottestsuite.space.crew;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags("crew")
@SelectPackages({"com.mytutos.springboottestsuite.space.crew"})
public class CrewSuite {
}
