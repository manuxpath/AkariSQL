/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.manuxpath.akarisql.services;

import java.io.File;

/**
 *
 * @author manue
 */
public interface GenerateConfigService {
    public boolean generateFileConfig(String url,String name,String data);
    public boolean checkExistFile(String url,String name);
    public boolean updateFileConfig(String url,String name,String newData);
}
