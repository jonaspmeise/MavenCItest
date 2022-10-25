package com.mycompany.app.my_app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        CalculatorTest.class,
        ParameterizedTestFields.class,
        RuleExceptionTesterExample.class})

public class AllTests {

}