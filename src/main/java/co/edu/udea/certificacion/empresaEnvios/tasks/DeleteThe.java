package co.edu.udea.certificacion.empresaEnvios.tasks;

import co.edu.udea.certificacion.empresaEnvios.interactions.FillThe;
import co.edu.udea.certificacion.empresaEnvios.interactions.PressThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DeleteThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(PressThe.DeleteButton());

    }

    public static DeleteThe Shipmentexisting(){
        return Tasks.instrumented(DeleteThe.class);
    }

}
