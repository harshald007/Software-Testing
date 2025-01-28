package com.actitime_automation.dec_28_2024;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class ReadStringEx2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet("OnlyStringTypes");
            int lastRowNum = s.getLastRowNum();
            for (int i=1; i<lastRowNum; i++) {  //Starting with Row 1
                Row r = s.getRow(i);
                System.out.println(r.getCell(i).getStringCellValue());
                if (r!= null) {
                    for (int k = 0; k < r.getLastCellNum(); i++) {//Traverse all Rows
                        System.out.println(r.getCell(i).getStringCellValue());
                    }
                }
                System.out.println("row number :"+ r);
                }

            //Row r = s.getRow(1);      //only for Row 1
            ////Prints data for Row number 1
//            for(int i=0; i<r.getLastCellNum(); i++) {
//                System.out.println(r.getCell(i).getStringCellValue());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
