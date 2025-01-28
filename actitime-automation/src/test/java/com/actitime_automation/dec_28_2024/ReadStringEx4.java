package com.actitime_automation.dec_28_2024;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class ReadStringEx4 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sh = wb.getSheet("TC_Execution");
//            Row r = sh.getRow(2);
//            Cell c = r.getCell(1);
//            String value = r.getStringCellValue();
//            System.out.println(r);
//            System.out.println("*************************");
//            Row r1 = sh.getRow(2);
//            Cell c2 = r1.getCell(2);
//            String value2 = c2.getStringCellValue();
//            System.out.println(value2);
//            System.out.println("*************************");
//            Row r3 = sh.getRow(2);
//            Cell c3 = r3.getCell(3);
//            String value3 = c3.getStringCellValue();
//            System.out.println(value3);
//            System.out.println("*************************");
//            Row r4 = sh.getRow(2);
//            Cell c4 = r4.getCell(4);
//            String value4 = c4.getStringCellValue();
//            System.out.println(value4);
//            System.out.println("*************************");
//            Row r5 = sh.getRow(2);
//            Cell c5 = r5.getCell(5);
//            String value5 = c5.getStringCellValue();
//            System.out.println(value5);
//            System.out.println("*************************");

            for (int i=0; i<9; i++){
                for (int j=1;j<=i; j++){
                Row row = sh.getRow(i);
                Cell col  = row.getCell(j);
                String Table = col.getStringCellValue();
                    System.out.println(Table);
                }
            }



        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
