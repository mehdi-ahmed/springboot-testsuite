package com.mytutos.springboottestsuite.space;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags("service")
@SelectPackages({"com.mytutos.springboottestsuite.space.crew", "com.mytutos.springboottestsuite.space.ship"})
public class ServiceSuite {
}
