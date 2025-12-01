package co.edu.udea.certificacion.empresaEnvios.questions;

import co.edu.udea.certificacion.empresaEnvios.userinterfaces.AdminPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Validation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(AdminPage.LAST_USER_IN_TABLE).getText();
        return msg;
    }

    public static Validation Register(){
        return new Validation();
    }

}