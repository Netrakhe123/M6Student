package genericLibOrUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import com.ecomerce.predator.IconstantUtility;

public class ExcelUtility {
	/**
	 * this method is to fetch individual test data from an excel sheet
	 * @param sheeName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Exception
	 */

	public String readDataFromExcel(String sheetName,int rowNum,int cellNum) throws Exception 
	{
		FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
		}
	
/* public void readMultipleDataFromExcel(String sheetName,int startingRow,int startingCell) throws Exception
{
	FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetName);
	DataFormatter format=new DataFormatter();
    int lastRowNum=sh.getLastRowNum();
    for(int i=startingRow;i<=lastRowNum;i++)
    {
    Row r=sh.getRow(i);
    for(int j=startingCell;j<=r.getLastCellNum()-1;j++)
    {
    	String data=format.formatCellValue(r.getCell(j));
    	System.out.println(data);
    }
    }
} */
}