package com.actitime_automation.dec_28_2024;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args)  {
        System.out.println("Program Start");
        try {
            //Excel file need to read
            FileInputStream fis = new FileInputStream("src/test/resources/ExcelFilesData/TestData.xlsx");

            //Excel file is considered as Workbook
            //Need to create reference of workbook,
            //create is static method in WorkbookFactory class which returns Workbook reference
            Workbook wb = WorkbookFactory.create(fis);

            //methods in Workbook interface:

            int totalSheets = wb.getNumberOfSheets();  //returns count for number of sheets
            System.out.println("Number of sheet present :" + totalSheets);

            String sheetName0 = wb.getSheetName(0);
            System.out.println("0th sheet name :"+sheetName0);

            System.out.println("*****************************" );

            for (int i=0; i<totalSheets; i++ ){
                String sheetName = wb.getSheetName(i);
                System.out.println("sheet name : "+i+" : " + sheetName);

            }

            int index = wb.getSheetIndex("OnlyStringTypes");
            System.out.println("Index : "+index);


        }catch (Exception e){
            e.printStackTrace();

        }

        System.out.println("Program Stop");
    }
}
