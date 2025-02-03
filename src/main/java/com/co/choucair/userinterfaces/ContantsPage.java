package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ContantsPage {



    public static final Target BTNCONTACT = Target.the("boton a formulario contactos")
            .locatedBy("//*[@id=\"navbarExample\"]/ul/li[2]/a") ;
    public static final Target TXT_EMAIL = Target.the("campo Correo Electronico")
            .locatedBy("//input[@id='recipient-email']") ;
    public static final Target TXT_NAME = Target.the("campo Nombre del contacto")
            .locatedBy("//input[@id='recipient-name']") ;

    public static final Target TXT_MESSAJE_CONTACT = Target.the("campo Mensaje del contacto")
            .locatedBy("//*[@id=\"message-text\"]") ;
    public static final Target BTN_SEND = Target.the("boton enviar mensaje de contacto")
            .locatedBy("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]") ;


    public static final Target TXT_TITLES = Target.the("titulo del mensaje del contacto")
            .locatedBy("//*[@id=\"navbarExample\"]/ul/li[2]/a");


}
