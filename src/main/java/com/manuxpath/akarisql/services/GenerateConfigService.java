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
    public File generateFileConfig(File file);
    public boolean checkExistFile(File file);
    public boolean updateFileConfig(File file);
}
