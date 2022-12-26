/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crudmahasiswasederhana;

import com.mycompany.crudmahasiswasederhana.views.MahasiswaFrame;
import javax.swing.SwingUtilities;

/**
 * @author Syamsa Shahira Julyinda
 * NIM : 21103078
 * KELAS : S1SI05C
 */

public class CRUDMahasiswaSederhana {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){
            
            public void run(){
                MahasiswaFrame form = new MahasiswaFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
            
        });
        
    }
    
}
