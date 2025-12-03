package co.edu.udea.certificacion.empresaEnvios.questions;

import co.edu.udea.certificacion.empresaEnvios.userinterfaces.AdminPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Validation implements Question<String> {

    private final String expectedName;

    public Validation(String expectedName) {
        this.expectedName = expectedName;
    }

    @Override
    public String answeredBy(Actor actor) {
        // Espera hasta que aparezca alguna celda que contenga el nombre esperado
        WebElementFacade cell = BrowseTheWeb.as(actor)
                .find(AdminPage.USER_CELL_CONTAINING_NAME.of(expectedName))
                .waitUntilVisible();
        return cell.getText();
    }

    public static Validation Register(String expectedName){
        return new Validation(expectedName);
    }

}