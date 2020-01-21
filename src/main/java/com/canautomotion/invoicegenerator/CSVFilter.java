/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canautomotion.invoicegenerator;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author User
 */
public class CSVFilter extends FileFilter {
     
    @Override
    public boolean accept(File f) {
        return f.isDirectory() || (f.isFile() && f.getName().toLowerCase().endsWith(".csv"));
    }

    @Override
    public String getDescription() {
      return "*.csv";
    }
}
