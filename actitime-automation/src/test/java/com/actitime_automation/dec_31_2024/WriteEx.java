package com.actitime_automation.dec_31_2024;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteEx {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sh = wb.getSheet("TC_ExecutionReport");

            //write data in particular cell
            sh.getRow(1).createCell(3).setCellValue("Pass");
            sh.getRow(2).createCell(3).setCellValue("Fail");
            sh.getRow(3).createCell(3).setCellValue("Pass");

            FileOutputStream fos = new FileOutputStream("src/test/resources/ExcelFilesData/TestData.xlsx");
            wb.write(fos);
            wb.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
