package kumar;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_POI
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("E:\\Ashok1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating cell data"+sheet.getRow(3).getCell(1));
		XSSFCell cell=sheet.getRow(3).getCell(1);
		cell.setCellValue("ashok");
		fis.close();
		
		FileOutputStream fos=new FileOutputStream("E:\\\\Ashok1.xlsx");
	workbook.write(fos);
	System.out.println("updated data after write is"+cell.getStringCellValue());
	fos.close();
		
	}

}
