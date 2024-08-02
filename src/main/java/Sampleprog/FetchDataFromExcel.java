package Sampleprog;

import java.io.FileInputStream;
//import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws Exception 
	{
//	FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\Selenium\\OrangeHrmTestData.xlsx");
FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\Selenium\\M5TestCaseData.xlsxs");
		
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh      = book.getSheet("Sheet1");
	Row r         = sh.getRow(3);
	Cell c        = r.getCell(1);
	String value  = c.getStringCellValue();
	System.out.println(value);

	}

}
