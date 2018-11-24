package io.ricetea.cflocal.cucumber.stepdefs;

import io.ricetea.cflocal.JhipsterForCfLocalApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterForCfLocalApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
