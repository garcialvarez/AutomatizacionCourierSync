package co.edu.udea.certificacion.empresaEnvios.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target LOGIN_EMAIL = Target.the("Put email in the login").locatedBy("//*[@id=\"email\"]");
    public static final Target LOGIN_PASSWORD = Target.the("Put password in the login").locatedBy("//*[@id=\"password\"]");
    public static final Target PRESS_ACCEDER = Target.the("Press the Acceder button").locatedBy("//*[@id=\"root\"]/div[2]/div/div[2]/form/button");


}