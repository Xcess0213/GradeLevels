package StepDefinitions;

import POM.Grade_Levels_Elements;
import POM._01_Base_POM;
import Utils.BaseDriver_Grade_Levels;
import io.cucumber.java.en.And;

public class Grade_Levels_steps {
    Grade_Levels_Elements gl = new Grade_Levels_Elements();

    @And("User create Grade Levels {string} and {string} and {string}")
    public void userCreateGradeLevelsAndAnd(String arg0, String arg1, String arg2) {
        gl.clickFunction(gl.getClickSetup());

        gl.getClickSetup().click();
        gl.getClickParameters().click();
        gl.getGradeLevels().click();
        gl.getPlusIcon().click();
        gl.getAddName().sendKeys("Native1");
        gl.getAddShortName().sendKeys("N1");
        gl.getAddOrder().sendKeys("101");
        gl.getClickSave().click();
    }

    @And("User create same Grade Levels {string} and {string} and {string}")
    public void userCreateSameGradeLevelsAndAnd(String arg0, String arg1, String arg2) {
        gl.getClickSetup().click();
        gl.getClickParameters().click();
        gl.getGradeLevels().click();
        gl.getPlusIcon().click();
        gl.getAddName().sendKeys("Native1");
        gl.getAddOrder().sendKeys("N1");
        gl.getAddOrder().sendKeys("101");
        gl.getClickSave().click();
    }

    @And("User edit Grade Levels {string} and change it to {string}")
    public void userEditGradeLevelsAndChangeItTo(String arg0, String arg1) {
    }

    @And("User delete Grade Levels createdName")
    public void userDeleteGradeLevelsCreatedName() {
    }
}




