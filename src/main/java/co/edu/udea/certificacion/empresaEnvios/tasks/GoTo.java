package co.edu.udea.certificacion.empresaEnvios.tasks;

import co.edu.udea.certificacion.empresaEnvios.interactions.FillThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(FillThe.NewShipmentData());

    }

    public static GoTo CreateNewShipmentPage(){
        return Tasks.instrumented(GoTo.class);
    }

}
