package com.actitime_automation.dec_28_2024;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class ReadStringEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet("OnlyStringTypes");
            Row r = s.getRow(1);
            Cell c1 = r.getCell(0);
            String value1 = c1.getStringCellValue();
            System.out.println(value1);
            System.out.println("**************");

            int lastCellNum = r.getLastCellNum();
            for (int i=0; i<lastCellNum; i++){
                Cell c = r.getCell(i);
                String value = c.getStringCellValue();
                System.out.println(value);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
