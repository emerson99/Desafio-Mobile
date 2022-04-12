package com.templateJavaAppium.tests.Suplemental;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.SuplementalScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuplementalTests extends TestBase {
    HomeScreen homeScreen;
    SuplementalScreen suplementalScreen;


    @Test
    public void validaTitulo() {
        homeScreen = new HomeScreen();
        suplementalScreen = new SuplementalScreen();
        String Titulo = "Supplemental Uploads";
        homeScreen.ClicarMenu();
        suplementalScreen.DeslizaMenu();
        suplementalScreen.ClicarMenuSuplemental();
        Assert.assertEquals(Titulo,(suplementalScreen.validaTituloMenuSuplemental()));
    }

    @Test
    public void validaExtraDataAdditional() {
        homeScreen = new HomeScreen();
        suplementalScreen = new SuplementalScreen();
        String music = "Music";
        homeScreen.ClicarMenu();
        suplementalScreen.DeslizaMenu();
        suplementalScreen.ClicarMenuSuplemental();
        Assert.assertEquals(music,(suplementalScreen.validaExtradaTaMenuSuplemental()));
    }


}
