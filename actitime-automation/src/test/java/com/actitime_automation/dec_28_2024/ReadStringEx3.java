package com.actitime_automation.dec_28_2024;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import java.io.FileInputStream;

public class ReadStringEx3 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sh = wb.getSheet("OnlyStringTypes");
            for (int i=1; i<= sh.getLastRowNum(); i++){
                for (int k=1; i<sh.getRow(i).getLastCellNum();k++){
                    System.out.println(sh.getRow(i).getCell(k).getStringCellValue());
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
