/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackconsolas;

import Cl.Hack.Consolas.Conf.Confi;
import Cl.Hack.Consolas.FUN.Actualizacion;
import Cl.Hack.Consolas.FUN.Directorio;
import Cl.Hack.Consolas.GUI.FrHomePS3;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author march
 */
public class HackConsolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        if(buscarUpdate()==false){
        new FrHomePS3().setVisible(true);
    }
//        Directorio d = new Directorio();
        //Buscar directorio
//        String url=d.buscarDirectrorio();
//        System.out.println(url);
    
        //Crear carpeta PS3
//        d.crearDirec(url,Confi.PS3Update);
        
        //Copiar Archivo Update
//        String url3 =Confi.UrlPS3+"/UPDATE/Oficial/"+Confi.PS3UpdateFile;
//        String url4= url+"/"+Confi.PS3Update+"/"+Confi.PS3UpdateFile;
//        d.copiarArchivo(url3, url4);
}
    public static boolean buscarUpdate(){
        boolean resp;
        if(Actualizacion.verificarConexion()){
            if(Actualizacion.obtenerVersion().equals(Confi.Version)){
                resp=false;
            }else{
                resp=true;
                int respu = JOptionPane.showConfirmDialog(null, "Version "+Actualizacion.obtenerVersion()+ " Diponible \n¿Desea Descargar?");
                if(respu==0){
                    JOptionPane.showMessageDialog(null, "Descargando Update \nEspere Mensaje");
                    Actualizacion.descargarUpdate();
                    resp=true;
                }else{
                    resp=false;
                }
            }
        }else{
            resp=false;
        }
        return resp;
    }
}
