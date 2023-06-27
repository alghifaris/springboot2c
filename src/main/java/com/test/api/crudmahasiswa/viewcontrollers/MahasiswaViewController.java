/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.api.crudmahasiswa.viewcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alghifaris.bagaskara
 */
@Controller
public class MahasiswaViewController {
  
    @RequestMapping("/index")
    public String index(){
    return "index";
    }   
}
