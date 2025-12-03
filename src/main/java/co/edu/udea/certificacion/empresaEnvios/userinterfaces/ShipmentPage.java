package co.edu.udea.certificacion.empresaEnvios.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShipmentPage extends PageObject {

    public static final Target PRESS_ENVIOS = Target.the("Press Envíos Button").locatedBy("//*[@id=\"root\"]/div[2]/header/div/div/div[1]/nav/button[2]");
    public static final Target PRESS_CREAR_ENVIO = Target.the("Press Crear Envío Button").locatedBy("//*[@id=\"root\"]/div[2]/main/div/div[1]/div/button[2]");
    public static final Target INPUT_CLIENTE = Target.the("Opción Seleccionar cliente").locatedBy("//button[@role='combobox' and contains(.,'Seleccionar cliente')]");
    public static final Target OPTION_CLIENTE = Target.the("Opción de cliente").locatedBy("//span[normalize-space()='{0}']");
    public static final Target INPUT_VEHICULO = Target.the("Opción Seleccionar VEHICULO").locatedBy("//*[@id=\"radix-:r0:\"]/div[2]/div[2]/button");
    public static final Target OPTION_VEHICULO = Target.the("Opción de vehiculo").locatedBy("//div[contains(normalize-space(),'ABC123')]");
    public static final Target INPUT_ORIGEN = Target.the("Opción Seleccionar origen").locatedBy("//*[@id=\"radix-:r0:\"]/div[2]/div[3]/button");
    public static final Target INPUT_BUSCADOR_ORIGEN = Target.the("Input buscador ciudad").locatedBy("//input[@placeholder='Buscar ciudad...']");
    public static final Target INPUT_DESTINO = Target.the("Opción Seleccionar destino").locatedBy("//*[@id=\"radix-:r0:\"]/div[2]/div[4]/button");
    public static final Target INPUT_BUSCADOR_DESTINO = Target.the("Input buscador ciudad").locatedBy("//*[@placeholder='Buscar ciudad...']");
    public static final Target INPUT_PRIORIDAD = Target.the("Opción Seleccionar prioridad").locatedBy("//*[@id=\"radix-:r0:\"]/div[2]/div[5]/button");
    public static final Target OPTION_PRIORIDAD = Target.the("Opción de prioridad").locatedBy("//div[@role='option' and normalize-space()='{0}']");
    public static final Target INPUT_PESO = Target.the("Inpunt peso").locatedBy("//*[@id=\"radix-:r0:\"]/div[2]/div[7]/input");
    public static final Target INPUT_VOLUMEN = Target.the("Input volumen").locatedBy("//*[@id=\"radix-:r0:\"]/div[2]/div[8]/input");
    public static final Target PRESS_GUARDAR = Target.the("Press Guardar button").locatedBy("//*[@id=\"radix-:r0:\"]/div[3]/button[2]");
    public static final Target PRESS_DELETE_BUTTON = Target.the("Press delete button").locatedBy("//*[@id=\"root\"]/div[2]/main/div/div[2]/div/div/table/tbody/tr[1]/td[7]/div/button[3]");
    public static final Target PRESS_CONFIRM_DELETE = Target.the("Press delete CONFIRM button").locatedBy("//button[contains(.,'Confirm') or contains(.,'Eliminar') or contains(.,'Delete')]");

}