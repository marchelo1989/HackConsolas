/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cl.Hack.Consolas.Conf;

/**
 *
 * @author march
 */
public interface Confi {
    //Configuraciones para Update
    static String nameArchivo = "HackConsola.zip";
    static String CarpetaUpdate = "Update/";
    static String Version = "1.0";
    static String UrlVersion = "https://raw.githubusercontent.com/marchelo1989/HackConsolas/main/Archivos/Version.txt";
    static String UrlDescarga = "https://raw.githubusercontent.com/marchelo1989/HackConsolas/main/Archivos/Descarga.txt";
    
    //Configuracion de Directorio del Sistema
    static String UrlPS3 = ".//Hack/PS3/";
    static String SO = System.getProperty("os.name");
    static String userDir = System.getProperty("user.home");
    static String userProgra = System.getProperty("user.dir");
    
    //Configuracion de PS3
    static String UrlPS3UpdateOfi = "/UPDATE/Oficial/";
    static String UrlPS3UpdateModif = "/UPDATE/Modificado/";
    static String PS3Update = "PS3/UPDATE";
    static String PS3UpdateFile = "PS3UPDAT.PUP";
        
}
