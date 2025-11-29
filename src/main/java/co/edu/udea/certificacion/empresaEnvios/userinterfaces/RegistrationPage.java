package co.edu.udea.certificacion.empresaEnvios.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPage extends PageObject {

    public static final Target INPUT_NAME = Target.the("Input name").locatedBy("//*[@id=\"name\"]");
    public static final Target INPUT_EMAIL = Target.the("Input email").locatedBy("//*[@id=\"email\"]");
    public static final Target INPUT_PHONE_NUMBER = Target.the("Input phone number").locatedBy("//*[@id=\"phone\"]");
    public static final Target INPUT_ROL = Target.the("Input rol").locatedBy("//*[@id=\"root\"]/div[2]/main/div/div/div[2]/form/div[3]/button");
    public static final Target OPTION_ROL = Target.the("Opción de rol").locatedBy("//div[normalize-space()='{0}']");
    public static final Target INPUT_PASSWORD = Target.the("Input password").locatedBy("//*[@id=\"password\"]");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input confirm password").locatedBy("//*[@id=\"confirmPassword\"]");
    public static final Target PRESS_REGISTRAR_USUARIO2 = Target.the("Press Registrar Usuario Button").locatedBy("//*[@id=\"root\"]/div[2]/main/div/div/div[2]/form/div[5]/button[2]");

}
