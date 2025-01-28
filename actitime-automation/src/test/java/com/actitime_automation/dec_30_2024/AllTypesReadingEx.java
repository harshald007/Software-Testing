package com.actitime_automation.dec_30_2024;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AllTypesReadingEx {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/ExcelFilesData/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sh = wb.getSheet("AllDataTypes");
            for (int i=1; i<=sh.getLastRowNum(); i++){
                for (int k=0; k<sh.getRow(i).getLastCellNum(); k++){
                    //System.out.println(s.getRow(k).getCell(i).getStringCellValue());
                    CellType ct = sh.getRow(i).getCell(k).getCellType();
                    //System.out.println(ct);
                    switch (ct){

                        case STRING:
                            System.out.println(sh.getRow(i).getCell(k).getStringCellValue());
                            break;
                        case NUMERIC:
                            Cell c = sh.getRow(i).getCell(k);
                            if (DateUtil.isCellDateFormatted(c)){
                                //Prints in default format
                                //System.out.println(s.getRow(k).getCell(i).getDateCellValue());
                                //Format the date in required format
                                Date d = sh.getRow(i).getCell(k).getDateCellValue();
                                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
                                System.out.println(sdf.format(d));
                            }else {
                                System.out.println((long) sh.getRow(k).getCell(i).getNumericCellValue());
                            }
                            break;
                        case FORMULA:
                            System.out.println(sh.getRow(i).getCell(k).getCellFormula());
                            break;
                        case BOOLEAN:
                            System.out.println(sh.getRow(k).getCell(i).getBooleanCellValue());
                            break;
                        case BLANK:
                            System.out.println(sh.getRow(k).getCell(i).getBooleanCellValue());
                            break;
                        case _NONE:
                            System.out.println(sh.getRow(k).getCell(i).getBooleanCellValue());
                            break;
                        case ERROR:
                            System.out.println(sh.getRow(k).getCell(i).getBooleanCellValue());
                            break;
                        default: System.out.println();
                        System.out.println("Cell is either Blank/None/Error.");
                    }
                }
                System.out.println();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
