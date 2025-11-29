package co.edu.udea.certificacion.empresaEnvios.tasks;

import co.edu.udea.certificacion.empresaEnvios.interactions.PutThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DoThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(PutThe.Credentials());

    }

    public static DoThe login(){
        return Tasks.instrumented(DoThe.class);
    }

}
