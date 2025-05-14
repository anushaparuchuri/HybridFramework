package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.utilities.CommonFunctions;

public class ReadTestDataFromExcelSheet {

	public static void main(String[] args) throws Exception {
		CommonFunctions cfn = new CommonFunctions();
		
		cfn.chromeBrowserLaunch();
		
		FileInputStream excelTestDataSheetPath = new FileInputStream(".\\src\\test\\resources\\testdata\\anusha.xlsx");
		Workbook w = new XSSFWorkbook(excelTestDataSheetPath);
		Sheet s = w.getSheet("FBlogin");
		
		Row r = s.getRow(1);
		Cell un = r.getCell(0);
		Cell pwsd = r.getCell(1);
		
		System.out.println(un);
		System.out.println(pwsd);

		

	}

}
