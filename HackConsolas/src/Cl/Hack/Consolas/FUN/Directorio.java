/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cl.Hack.Consolas.FUN;

import static Cl.Hack.Consolas.Conf.Confi.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;

/**
 *
 * @author march
 */
public class Directorio {
    static File[] oldListRoot = File.listRoots();
    
    public void CopiarArchivos(String sourceFile, String destinationFile) {

            try {

                File inFile = new File(sourceFile);
                File outFile = new File(destinationFile);

                FileInputStream in = new FileInputStream(inFile);
                FileOutputStream out = new FileOutputStream(outFile);

                byte[] buffer = new byte[1024];
                int c;

                while ((c = in.read(buffer)) != -1) {
                    out.write(buffer, 0, c);
                }

                out.flush();
                in.close();
                out.close();

            } catch (IOException e) {
                System.out.println("Hubo un error de entrada/salida!!!");
//            Log.e(TAG, "Hubo un error de entrada/salida!!!");
            }
        }
    
    public static String buscarDirectrorio(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.showOpenDialog(null);
//        System.out.println(fileChooser.getSelectedFile());
        //String url = "c:/Users/march/Desktop/";
        String url = fileChooser.getSelectedFile().toString();
        //url=url.replace('\\', '/');
        return url;
    }
    
    public static String crearDirec(String url,String carpeta){
        String resp="";
        File directorio = new File(url +"/"+ carpeta );
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                resp=directorio.toString();
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
        return resp;
    }
    
    public static void waitForNotifying() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (File.listRoots().length > oldListRoot.length) {
                        System.out.println("new drive detected");
                        oldListRoot = File.listRoots();
                        System.out.println("drive "+oldListRoot[oldListRoot.length-1]+" detected");
                    } else if (File.listRoots().length < oldListRoot.length) {
                        System.out.println(oldListRoot[oldListRoot.length-1]+" drive removed");
                        oldListRoot = File.listRoots();
                    }
                }
            }
        });
        t.start();
    }
}
