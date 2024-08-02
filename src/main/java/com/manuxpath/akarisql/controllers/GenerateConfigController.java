/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuxpath.akarisql.controllers;

import com.manuxpath.akarisql.services.GenerateConfigService;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
/**
 *
 * @author manue
 */
public class GenerateConfigController implements GenerateConfigService{

    @Override
    public boolean generateFileConfig(String url,String name,String data) {
        File newFile = new File(url,name);
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(newFile),true);
            newFile.createNewFile();
            pw.println(data);
            return true;
        }catch(IOException error){
            return false;
        }
    }

    @Override
    public boolean checkExistFile(String url,String name) {
        return new File(url,name).exists();
    }

    @Override
    public boolean updateFileConfig(String url,String name,String newData) {
        File updateFile = new File(url,name);
        return false;
    }
    
}
