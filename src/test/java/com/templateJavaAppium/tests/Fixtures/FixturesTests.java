package com.templateJavaAppium.tests.Fixtures;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.FixturesScreen;
import com.templateJavaAppium.pages.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FixturesTests extends TestBase {
    HomeScreen homeScreen;
    FixturesScreen fixturesScreen;

    @Test
    public void validaTituloFixtures() {
        homeScreen = new HomeScreen();
        fixturesScreen = new FixturesScreen();
        String Titulo = "Fixtures";
        homeScreen.ClicarMenu();
        fixturesScreen.ClicarMenuFixtures();
        Assert.assertEquals(Titulo,(fixturesScreen.validaTituloMenuFixtures()));
    }

    @Test
    public void validaFixtures() {
        homeScreen = new HomeScreen();
        fixturesScreen = new FixturesScreen();
        String Texto1 = "Long:";
        String Texto2 = "Not Available";
        String Texto3 = "Lat:";
        homeScreen.ClicarMenu();
        fixturesScreen.ClicarMenuFixtures();
        Assert.assertEquals(Texto1,(fixturesScreen.validaTextoMenuFixtures1()));
        Assert.assertEquals(Texto2,(fixturesScreen.validaTextoMenuFixtures2()));
        Assert.assertEquals(Texto3,(fixturesScreen.validaTextoMenuFixtures3()));
    }


}
