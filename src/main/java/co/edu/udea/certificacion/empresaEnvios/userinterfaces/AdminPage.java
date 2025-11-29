package co.edu.udea.certificacion.empresaEnvios.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AdminPage extends PageObject {

    public static final Target PRESS_USUARIOS = Target.the("Press Usuarios Button").locatedBy("//*[@id=\"root\"]/div[2]/header/div/div/div[1]/nav/button[3]");
    public static final Target PRESS_REGISTRAR_USUARIO = Target.the("Press Registrar Usuario Button").locatedBy("//*[@id=\"root\"]/div[2]/main/div/div[1]/button");
    public static final Target USER_CREATED = Target.the("Msg Usuario creado").locatedBy("//*[@id=\"root\"]/div[2]/main/div/div[2]/div/div/table/tbody/tr[5]/td[1]");

}
