package co.edu.udea.certificacion.empresaEnvios.interactions;

import co.edu.udea.certificacion.empresaEnvios.userinterfaces.AdminPage;
import co.edu.udea.certificacion.empresaEnvios.userinterfaces.LoginPage;
import co.edu.udea.certificacion.empresaEnvios.userinterfaces.RegistrationPage;
import co.edu.udea.certificacion.empresaEnvios.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ClickTo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AdminPage.PRESS_USUARIOS));
        WaitTime.putWaitTimeOf(5000);
        actor.attemptsTo(Click.on(AdminPage.PRESS_REGISTRAR_USUARIO));
        WaitTime.putWaitTimeOf(5000);
        actor.attemptsTo(Enter.theValue("Alejandro Cano").into(RegistrationPage.INPUT_NAME));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue("AleC@gmail.com").into(RegistrationPage.INPUT_EMAIL));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue("654321").into(RegistrationPage.INPUT_PHONE_NUMBER));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue("654321").into(RegistrationPage.INPUT_PHONE_NUMBER));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Click.on(RegistrationPage.INPUT_ROL), Click.on(RegistrationPage.OPTION_ROL.of("Operador")));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue("alejo123").into(RegistrationPage.INPUT_PASSWORD));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue("alejo123").into(RegistrationPage.INPUT_CONFIRM_PASSWORD));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Click.on(RegistrationPage.PRESS_REGISTRAR_USUARIO2));
        WaitTime.putWaitTimeOf(10000);

    }

    public static ClickTo RegisterNewUser(){
        return Tasks.instrumented(ClickTo.class);
    }

}
