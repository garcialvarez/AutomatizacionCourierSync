package co.edu.udea.certificacion.empresaEnvios.interactions;

import co.edu.udea.certificacion.empresaEnvios.userinterfaces.LoginPage;
import co.edu.udea.certificacion.empresaEnvios.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PutThe implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(Enter.theValue("admin@couriersync.com").into(LoginPage.LOGIN_EMAIL));
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(Enter.theValue("admin123").into(LoginPage.LOGIN_PASSWORD));
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(Click.on(LoginPage.PRESS_ACCEDER));
        WaitTime.putWaitTimeOf(3000);

    }

    public static PutThe Credentials(){
        return Tasks.instrumented(PutThe.class);
    }

}