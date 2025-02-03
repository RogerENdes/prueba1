package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {


    public static final Target BTNLOGIN1 = Target.the("Campo login")
            .locatedBy("//*[@id=\"login2\"]") ;
    public static final Target TXT_USER = Target.the("campo para nombre de usuario")
            .locatedBy("#loginusername") ;
    public static final Target TXT_PASS = Target.the("campo para contraseña")
            .locatedBy("//input[@id='loginpassword']") ;
    public static final Target BTN_LOGIN2 = Target.the("boton para login")
            .locatedBy("//button[text()='Log in']") ;

    public static final Target TXTMESSAJE = Target.the("mensaje para login")
            .locatedBy("#nameofuser") ;



}
