package co.edu.udea.certificacion.empresaEnvios.tasks;

import co.edu.udea.certificacion.empresaEnvios.interactions.ClickTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EnterTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickTo.RegisterNewUser());

    }

    public static EnterTo registrationPage(){
        return Tasks.instrumented(EnterTo.class);

    }

}
