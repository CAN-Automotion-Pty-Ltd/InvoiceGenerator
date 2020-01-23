/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canautomotion.invoicegenerator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author User
 */
public class DataLoader extends JPanel {
    public static JTable tblCSVContent;
    
    public DataLoader(File[] files){
        super(new BorderLayout(3, 3));
        DataLoader.tblCSVContent = new JTable(new MyModel());
        DataLoader.tblCSVContent.setPreferredScrollableViewportSize(new Dimension(700, 70));
        DataLoader.tblCSVContent.setFillsViewportHeight(true);

        JPanel ButtonOpen = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(ButtonOpen, BorderLayout.SOUTH);

        // Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(tblCSVContent);

        // Add the scroll pane to this panel.
        add(scrollPane, BorderLayout.CENTER);

        // add a nice border
        setBorder(new EmptyBorder(5, 5, 5, 5));
        
        CSVFile Rd = new CSVFile();
        MyModel NewModel = null;
        
        for (File file : files) {
            ArrayList<String[]> Rs2 = Rd.ReadCSVfile(file);
            String[] cols = Rd.ReadColumns(file);
            
            String[] updatedCols = Arrays.stream(cols)
                .filter(value ->
                        value != null && value.length() > 0
                )
                .toArray(size -> new String[size]);
            
            NewModel = new MyModel(updatedCols);
            NewModel.AddCSVData(Rs2);
            
            System.out.println("Rows: " + NewModel.getRowCount());
            System.out.println("Cols: " + NewModel.getColumnCount());   
        } 
        DataLoader.tblCSVContent.setModel(NewModel);
    }
}
