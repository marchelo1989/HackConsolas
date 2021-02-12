/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cl.Hack.Consolas.Conf;

/**
 *
 * @author march
 * v1.1
 */
public interface Confi {
    //Configuraciones para Update
    static String nameArchivo = "HackConsolas.zip";
    static String CarpetaUpdate = "Update/";
    static String Version = "1.1";
    static String UrlVersion = "https://raw.githubusercontent.com/marchelo1989/HackConsolas/main/Archivos/Version.txt";
    static String UrlDescarga = "https://raw.githubusercontent.com/marchelo1989/HackConsolas/main/Archivos/Descarga.txt";
    
    //Configuracion de Directorio del Sistema
    static String SO = System.getProperty("os.name");
    static String userDir = System.getProperty("user.home");
    static String userProgra = System.getProperty("user.dir");
    
    //Configuracion de PS3
    static String PS3Update = "PS3/UPDATE";                 //Actualizaciones
    static String PS3Backup = "PS3/EXPORT/BACKUP";          //Copias de Seguridad
    static String PS3PartidasPS3 = "PS3/SAVEDATA";          //Partidas de PS3
    static String PS3Temas = "PS3/THEME";                   //Temas
    static String PS3Musica = "MUSIC";                      //Musica
    static String PS3Imagene = "PICTURE";                   //Imagenes
    static String PS3Video = "VIDEO";                       //Videos
    
    //Configuracion de PS3 HEN
    static String PS3Exdata = "exdata";                     //licencia rap y edat
    static String PS3Games = "GAMES";                       //juegos en formato carpeta
    static String PS3Packages = "packages";                 //paquetes de instalacion pkg
    static String PS3PS2ISO = "PS2ISO";                     //juegos en iso de PS2
    static String PS3PS3ISO = "PS3ISO";                     //juegos en iso de PS3
    static String PS3PSPSavedata = "PSP/SAVEDATA";          //partidas de PSP
    static String PS3PSPISO = "PSPISO";                     //juegos en iso de PSP
    static String PS3PSXISO = "PSXISO";                     //juegos en iso de PSX
    static String PS3USERLIST = "USERLIST";                 //trucos de juegos en formato ncl
    static String PS3PS2SD =  "PS3/EXPORT/PS2SD";           //Partidas de PS2
    static String PS3PSV  ="PS3/EXPORT/PSV";                //Partidas de PSX
    static String PS3ROMS = "roms";                         //juegos de arcade (Emulacion)
    
    static String PS3Atari2600 = "roms/ATARI 2600";
    static String PS3GameBoy = "roms/GAME BOY";
    static String PS3GameBoyColor ="roms/GAME BOY COLOR";
    static String PS3GameBoyAdvance ="roms/GAME BOY ADVANCE";
    static String PS3NintendoNes = "roms/NINTENDO NES";
    static String PS3SuperNintendoSNES ="roms/SUPER NINTENDO SNES";
    static String PS3SegaGameGear ="roms/SEGA GAME GEAR";
    static String PS3SegaMasterSystem = "roms/SEGA MASTER SYSTEM";
    static String PS3SegaMEgaDriveGenesis = "roms/SEGA MEGA DRIVE GENESIS";
    static String PS3Mame ="roms/MAME";
    
    static String InfoImgPs3= ".//Hack/CarpetasUSBPS3.jpg";
        
}
