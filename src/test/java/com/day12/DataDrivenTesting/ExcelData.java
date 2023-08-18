package com.day12.DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	// Step 1: Create an Excel sheet(.xlsx) which has the data.
	// Step 2: Copy that Excel sheet into the package of your Eclipse
	// Step 3: if you want to edit something, edit outside and then paste the updated Excel sheet
	// Step 4: Create a method and pass a String sheetname parameter
	// Step 5: Create the Object of FileInputStream class and pass the path of the Excel sheet in the Constructor
public static FileInputStream ip;
public static XSSFWorkbook workbook;
public static XSSFSheet sheet;

@DataProvider(name = "RediffData")
public static Object[][] getRediffExcelData() throws Exception {
	Object[][] data = ExcelData.readFromExcelSheetRediffData("LoginRediff");
	return data;
	
}

@DataProvider(name = "TNData")
public static Object[][] getTNExcelData() throws Exception {
	Object[][] data = ExcelData.readFromExcelSheetTNData("LoginTN");
	return data;
	
}

	public static Object[][] readFromExcelSheetRediffData(String sheetName) throws Exception {
		// Step 5: Create the Object of FileInputStream class and pass the path of the Excel sheet in the Constructor
    ip = new FileInputStream("C:\\Users\\sarth\\eclipse-workspace\\CanadaJune2023Batch\\src\\test\\java\\com\\day12\\DataDrivenTesting\\ExcelDataCode.xlsx");
	    //Step 6: Create the Object of XSSFWorkbook class
    workbook = new XSSFWorkbook(ip);
        //Step 7: Use the reference workbook to call the getSheet(overloaded method) which will return XSSFSheet
    sheet = workbook.getSheet(sheetName);
        //Step 8: Once sheet is created, we need rows and cols
    int rows = sheet.getLastRowNum();
    int cols = sheet.getRow(0).getLastCellNum();
        //Step 9: Create a 2-Dimensional Object Array
    Object[][] data = new Object[rows][cols];
    for(int i=0 ; i<rows ; i++) {
    	XSSFRow row = sheet.getRow(i+1);
    	
    	for(int j=0 ; j<cols ; j++) {
    		XSSFCell cell = row.getCell(j);
    		
    	//Step 10: we have to determine the dataType saved/stored inside each cell
    		
    		CellType cellType = cell.getCellType();
    		
    		switch(cellType) {
    		case STRING: 
    			data[i][j] = cell.getStringCellValue();
    		    break;
    		case NUMERIC:
    			data[i][j] = Integer.toString((int)cell.getNumericCellValue());
    			break;
    		case BOOLEAN:
    			data[i][j] = cell.getBooleanCellValue();
    			break;
    		}
    		
    	}
    }
    
    return data;
	
	}

	public static Object[][] readFromExcelSheetTNData(String sheetName) throws Exception {
		ip = new FileInputStream("C:\\Users\\sarth\\eclipse-workspace\\CanadaJune2023Batch\\src\\test\\java\\com\\day12\\DataDrivenTesting\\ExcelDataCode.xlsx");
		 workbook = new XSSFWorkbook(ip);
		 sheet = workbook.getSheet(sheetName);
		 int rows = sheet.getLastRowNum();
		    int cols = sheet.getRow(0).getLastCellNum();
		    Object[][] data = new Object[rows][cols];
		    for(int i=0 ; i<rows ; i++) {
		    	XSSFRow row = sheet.getRow(i+1);
		    	
		    	for(int j=0 ; j<cols ; j++) {
		    		XSSFCell cell = row.getCell(j);
		    		
		    	//Step 10: we have to determine the dataType saved/stored inside each cell
		    		
		    		CellType cellType = cell.getCellType();
		    		
		    		switch(cellType) {
		    		case STRING: 
		    			data[i][j] = cell.getStringCellValue();
		    		    break;
		    		case NUMERIC:
		    			data[i][j] = Integer.toString((int)cell.getNumericCellValue());
		    			break;
		    		case BOOLEAN:
		    			data[i][j] = cell.getBooleanCellValue();
		    			break;
		    		}
		    		
		    	}
		    }
		    
		    return data;
	}

}
