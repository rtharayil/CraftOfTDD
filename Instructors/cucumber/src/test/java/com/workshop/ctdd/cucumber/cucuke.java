package com.workshop.ctdd.cucumber;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},monochrome = true)
public class cucuke {
	
	
}
