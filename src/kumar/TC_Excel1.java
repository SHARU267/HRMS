 package kumar;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class TC_Excel1 {

	public static void main(String[] args) throws BiffException, IOException  {
		FileInputStream fis=new FileInputStream("E:\\hrms\\Sharuk.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet st=wb.getSheet(0);
		int row=st.getRows();
		System.out.println("row count is"+row);
		int col=st.getColumns();
		System.out.println("col count is"+col);
		for(int i=1;i<row;i++)
		{
		 String id=st.getCell(1,i).getContents();
		 System.out.print(id+" ");
		 String name=st.getCell(2,i).getContents();
		 System.out.print(name+" ");
		 String dept=st.getCell(3,i).getContents();
		 System.out.print(dept+" ");
		 String sal=st.getCell(4,i).getContents();
		 System.out.println(sal+" ");
	}
		FileOutputStream fos=new FileOutputStream("E:\\hrms\\Sharuk.xls");
		WritableWorkbook workbook=Workbook.createWorkbook(fos);
		WritableSheet ws=workbook.createSheet("ashok", 1);
		System.out.println();
	}
}
