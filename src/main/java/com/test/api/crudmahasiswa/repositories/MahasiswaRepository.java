/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.api.crudmahasiswa.repositories;

import com.test.api.crudmahasiswa.models.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alghifaris.bagaskara
 */
public interface MahasiswaRepository extends JpaRepository<Mahasiswa,Long>{
    
}
