package com.templateJavaAppium.tests.Nested;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.NestedScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class NestedTests extends TestBase {

    HomeScreen homeScreen;
    NestedScreen nestedScreen;

    @Test
    public void validaTituloNested()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        nestedScreen = new NestedScreen();
        String Titulo = "Nested Views";
        homeScreen.ClicarMenu();
        nestedScreen.ClicarMenuNested();
        Assert.assertEquals(Titulo,(nestedScreen.validaTituloMenuNested()));
    }

    @Test
    public void validaUPNavigation()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        nestedScreen = new NestedScreen();
        String PressLevel = "Press to go to the next level";
        homeScreen.ClicarMenu();
        nestedScreen.ClicarMenuNested();
        nestedScreen.ClicarUPNavigation();
        Assert.assertEquals(PressLevel,(nestedScreen.validaPressLevel()));
    }

    @Test
    public void validaBackNavigation()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        nestedScreen = new NestedScreen();
        String PressLevel2 = "2";
        homeScreen.ClicarMenu();
        nestedScreen.ClicarMenuNested();
        nestedScreen.ClicarBackNavigation();
        nestedScreen.ClicarNextLevel();
        Assert.assertEquals(PressLevel2,(nestedScreen.validaDisplayNested()));
    }

}
