/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canautomotion.invoicegenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
// Method for reading CSV file
public class CSVFile {
    private final ArrayList<String[]> Rs = new ArrayList<>();
    private String[] OneRow;

    public String[] ReadColumns(File DataFile){
        String[] cols = null;
        try {
            BufferedReader brd = new BufferedReader(new FileReader(DataFile));
            
            String st = brd.readLine();
            if(st!= null){
              cols = st.split(",");  
            }
            
        } // end of try
        catch (IOException e) {
            String errmsg = e.getMessage();
            System.out.println("File not found:" + errmsg);
        } // end of Catch
        return cols; 
    }
    
    public ArrayList<String[]> ReadCSVfile(File DataFile) {
        try {
            BufferedReader brd = new BufferedReader(new FileReader(DataFile));

            while (brd.ready()) {
                String st = brd.readLine();
                if(st!= null){
                  OneRow = st.split(",|\\s|;");  
                } else{
                  OneRow = null;
                }
                
                Rs.add(OneRow);
                System.out.println(Arrays.toString(OneRow));
            } // end of while
        } // end of try
        catch (IOException e) {
            String errmsg = e.getMessage();
            System.out.println("File not found:" + errmsg);
        } // end of Catch
        return Rs;
    }// end of ReadFile method
}// end of CSVFile class

