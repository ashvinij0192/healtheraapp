package com.healthera.healtheraapp;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/", glue="com.healthera.healtheraapp.steps")
public class TestRunner{

}