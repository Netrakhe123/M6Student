package Sampleprog;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws Exception 
	{
 //    FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\Selenium\\OrangeHrmTestData.xlsx");
FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Documents\\Selenium\\M5TestCaseData.xlsx");
     Workbook book=WorkbookFactory.create(fis);
     Sheet sh=book.getSheet("Sheet1");
     sh.createRow(0).createCell(0).setCellValue("Friday");
 //FileOutputStream fos=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Selenium\\OrangeHrmTestData.xlsx");
 FileInputStream fos=new FileInputStream("C:\\Users\\Dell\\Documents\\Selenium\\M5TestCaseData.xlsx");
     book.write(fos);
}
}
