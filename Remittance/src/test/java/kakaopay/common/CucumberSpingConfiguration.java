package kakaopay.common;

import io.cucumber.spring.CucumberContextConfiguration;
import kakaopay.RemittanceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RemittanceApplication.class })
public class CucumberSpingConfiguration {}
