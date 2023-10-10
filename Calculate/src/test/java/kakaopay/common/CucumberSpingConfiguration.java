package kakaopay.common;

import io.cucumber.spring.CucumberContextConfiguration;
import kakaopay.CalculateApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CalculateApplication.class })
public class CucumberSpingConfiguration {}
