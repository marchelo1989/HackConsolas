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
    static String Version = "1.2";
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
    
    //Configuracion de PS4
    static String PS4Update = "PS4/UPDATE";                 //Actualizaciones
    static String PS4Backup = "PS4/EXPORT/BACKUP";          //Copias de Seguridad
    static String PS4PartidasPS4 = "PS4/SAVEDATA";          //Partidas de PS4
    static String PS4Imagene = "IMAGES";                    //Imagenes
    static String PS4SCREENSHOTS = "PS4/SHARE/Screenshots"; //Capturas de pantalla de Imagenes
    static String PS4VideoClips = "PS4/SHARE/Video Clips";  //Capturas de pantalla de Video
    
    //carpetas del RetroArch
    static String PS3ROMS = "ROMS";                         //juegos de arcade (Emulacion)
    static String PS4retroarchps4 = "retroarchps4";                         //juegos de arcade PS4 (Emulacion)
    static String RetroATARI2600 = "ROMS/ATARI 2600";
    static String RetroATARI7800 = "ROMS/ATARI 7800";
    static String RetroATARILynx = "ROMS/ATARI Lynx";
    static String RetroBandaiWonderSwan = "ROMS/Bandai - WonderSwan";
    static String RetroBandaiWonderSwanColor = "ROMS/Bandai - WonderSwan Color";
    static String RetroFBAlphaArcadeGames = "ROMS/FB Alpha - Arcade Games";
    static String RetroGCEVectrex ="ROMS/GCE - Vectrex";
    static String RetroHandheldElectronicGame ="ROMS/Handheld Electronic Game";
    static String RetroMAME2003 = "ROMS/MAME - 2003";
    
    static String RetroNECPCEngine = "ROMS/NEC - PC Engine";
    static String RetroNECPCEngineCD = "ROMS/NEC - PC Engine CD";
    static String RetroNECPCEngineSuperGrafx = "ROMS/NEC - PC Engine SuperGrafx";
    static String RetroNECTurboGrafx16 = "ROMS/NEC - TurboGrafx 16";
    static String RetroNECTurboGrafxCD = "ROMS/NEC - TurboGrafx CD";
    
    static String RetroNintendoFamicom = "ROMS/Nintendo - Famicom";
    static String RetroNintendoFamilyComputerDiskSystem = "ROMS/Nintendo - Family Computer Disk System";
    static String RetroNintendoGameBoy = "ROMS/Nintendo - Game Boy";
    static String RetroNintendoGameBoyAdvance = "ROMS/Nintendo - Game Boy Advance";
    static String RetroNintendoGameBoyColor = "ROMS/Nintendo - Game Boy Color";
    static String RetroNintendoNintendoEntertainmentSystem = "ROMS/Nintendo - Nintendo Entertainment System";
    static String RetroNintendoSufamiTurbo = "ROMS/Nintendo - Sufami Turbo";
    static String RetroNintendoSuperFamicom = "ROMS/Nintendo - Super Famicom";
    static String RetroNintendoSuperNintendoEntertainmentSystem = "ROMS/Nintendo - Super Nintendo Entertainment System";
    static String RetroNintendoVirtualBoy = "ROMS/NintendoVirtualBoy";
    
    static String RetroSegaGameGear  = "ROMS/Sega - Game Gear ";
    static String RetroSegaMasterSystemMarkIII = "ROMS/Sega - Master System - Mark III";
    static String RetroSegaMegaDriveGenesis = "ROMS/Sega - Mega Drive - Genesis";
    static String RetroSegaMegaCDSegaCD = "ROMS/Sega - Mega-CD - Sega CD";
    static String RetroSegaSG1000 = "ROMS/Sega - SG-1000";
    
    static String RetroSNKNeoGeoPocket = "ROMS/SNK - Neo Geo Pocket";
    static String RetroSNKNeoGeoPocketColor = "ROMS/SNK - Neo Geo Pocket Color";
    
    static String InfoImgPs3= ".//Hack/CarpetasUSBPS3.jpg";
    static String InfoImgPs4= ".//Hack/CarpetasUSBPS4.jpg";
        
}
