package co.edu.udea.certificacion.empresaEnvios.interactions;

import co.edu.udea.certificacion.empresaEnvios.userinterfaces.ShipmentPage;
import co.edu.udea.certificacion.empresaEnvios.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class PressThe implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ShipmentPage.PRESS_ENVIOS));
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(Click.on(ShipmentPage.PRESS_DELETE_BUTTON));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Click.on(ShipmentPage.PRESS_CONFIRM_DELETE));
        WaitTime.putWaitTimeOf(5000);
    }

    public static PressThe DeleteButton(){
        return Tasks.instrumented(PressThe.class);
    }
}
