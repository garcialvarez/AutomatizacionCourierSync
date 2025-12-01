package co.edu.udea.certificacion.empresaEnvios.interactions;

import co.edu.udea.certificacion.empresaEnvios.userinterfaces.AdminPage;
import co.edu.udea.certificacion.empresaEnvios.userinterfaces.RegistrationPage;
import co.edu.udea.certificacion.empresaEnvios.utils.DataGenerator;
import co.edu.udea.certificacion.empresaEnvios.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ClickTo implements Interaction {

    private String fullName;
    private String email;
    private String phoneNumber;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Generar datos aleatorios
        fullName = DataGenerator.generateFullName();
        email = DataGenerator.generateEmail();
        phoneNumber = DataGenerator.generatePhoneNumber();
        password = DataGenerator.generatePassword();

        // Guardar los datos en el actor para validación posterior
        actor.remember("userName", fullName);
        actor.remember("userEmail", email);
        actor.remember("userPhone", phoneNumber);

        WaitTime.putWaitTimeOf(7000);
        actor.attemptsTo(Click.on(AdminPage.PRESS_USUARIOS));
        WaitTime.putWaitTimeOf(5000);
        actor.attemptsTo(Click.on(AdminPage.PRESS_REGISTRAR_USUARIO));
        WaitTime.putWaitTimeOf(5000);
        actor.attemptsTo(Enter.theValue(fullName).into(RegistrationPage.INPUT_NAME));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue(email).into(RegistrationPage.INPUT_EMAIL));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue(phoneNumber).into(RegistrationPage.INPUT_PHONE_NUMBER));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Click.on(RegistrationPage.INPUT_ROL), Click.on(RegistrationPage.OPTION_ROL.of("Operador")));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue(password).into(RegistrationPage.INPUT_PASSWORD));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue(password).into(RegistrationPage.INPUT_CONFIRM_PASSWORD));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Click.on(RegistrationPage.PRESS_REGISTRAR_USUARIO2));
        WaitTime.putWaitTimeOf(10000);

    }

    public static ClickTo RegisterNewUser(){
        return Tasks.instrumented(ClickTo.class);
    }

}
