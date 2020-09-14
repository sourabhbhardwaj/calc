package com.code.calc_cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/calc.feature",
        format={"pretty","html:target/Reports"}
        )
public class runtest {
}