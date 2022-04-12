package com.templateJavaAppium.tests.InputControls;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class InputControlsTests extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;

    @Test
    public void validaCheckbox()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String txtCheckedDisplay2 = "Checked";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarNoCheckBox();
        Assert.assertEquals(txtCheckedDisplay2,(inputControlsScreen.validaCheckedDisplay()));
    }
    @Test
    public void validaDatePicker()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String DatePickerDisplay = "7/6/1994";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarMenuPullToRefresh();
        inputControlsScreen.ClicarMenuTimePicker();
        inputControlsScreen.ClicarMenuDatePicker();
        inputControlsScreen.ClicarDataPicker();
        Assert.assertEquals(DatePickerDisplay,(inputControlsScreen.validaDatePickerDisplay()));
    }

    @Test
    public void validaPullToRefresh()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String RefreshTime = "Pull to refresh time";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarMenuPullToRefresh();
        Assert.assertEquals(RefreshTime,(inputControlsScreen.validaRefreshDisplayTime()));
    }


    @Test
    public void validaRadioButtonAmazonEWeb()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String radio = "Amazon";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarRadioWeb();
        inputControlsScreen.ClicarRadioAmazon();
        Assert.assertEquals(radio,(inputControlsScreen.validaRadioDisplay()));
    }
    @Test
    public void validaRadioButtonServices()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String radio3 = "Services";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarRadioServices();
        Assert.assertEquals(radio3,(inputControlsScreen.validaRadioDisplay()));
    }
    @Test
    public void validaSpinner()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String Option1 = "Selected: option 1";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarEmSpinnerControl();
        inputControlsScreen.ClicarEmOption1();
        Assert.assertEquals(Option1,(inputControlsScreen.validaSpinnerDisplay()));

    }
    @Test
    public void validaTextField()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String TextField = "Desafio";
        String Tiutlo = "Input Controls";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.DigitarTextField(TextField);
        Assert.assertEquals(TextField,(inputControlsScreen.validaTextoDigitadoTextField()));
    }

    @Test
    public void validaTimePicker()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String TimepickerDisplay = "Select a time";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarMenuPullToRefresh();
        inputControlsScreen.ClicarMenuTimePicker();
        Assert.assertEquals(TimepickerDisplay,(inputControlsScreen.validaTimepickerDisplay()));
    }
    @Test
    public void validaToggleButtonOFF()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String ToggleOFF = "OFF";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        Assert.assertEquals(ToggleOFF,(inputControlsScreen.validaSwitchDisplay()));
    }
    @Test
    public void validaToggleButtonON()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String ToggleON = "ON";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarEmToggleButton();
        Assert.assertEquals(ToggleON,(inputControlsScreen.validaSwitchDisplay()));
    }
}
