/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.mycompany.crudmahasiswasederhana.interfc;

import com.mycompany.crudmahasiswasederhana.models.Mahasiswa;
import java.util.List;
import java.sql.SQLException;

/**
 * @author Syamsa Shahira Julyinda
 * NIM : 21103078
 * KELAS : S1SI05C
 */

public interface MahasiswaInterface {
    
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    void update (Mahasiswa o) throws SQLException;
    void delete (String nim) throws SQLException;
    List<Mahasiswa> getAll() throws SQLException;
    
}
