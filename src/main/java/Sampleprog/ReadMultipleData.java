package Sampleprog;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws Exception 
	{
//		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\Selenium\\OrangeHrmTestData.xlsx");
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Documents\\Selenium\\M5TestCaseData.xlsx");
	     Workbook book=WorkbookFactory.create(fis);
	     Sheet sh=book.getSheet("Sheet2");
	     DataFormatter format=new DataFormatter();
	     int lastRowNum=sh.getLastRowNum();
	     for(int i=1;i<=lastRowNum;i++)
	     {
	    	 Row r = sh.getRow(i);
	     for(int j=1;j<=r.getLastCellNum()-1;j++)
	     {
	    	String data=format.formatCellValue(r.getCell(j));
	    	System.out.println(data);
	     }
	     }
}
}
