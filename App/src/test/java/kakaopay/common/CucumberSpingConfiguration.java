package kakaopay.common;

import io.cucumber.spring.CucumberContextConfiguration;
import kakaopay.AppApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { AppApplication.class })
public class CucumberSpingConfiguration {}
