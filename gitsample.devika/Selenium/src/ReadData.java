import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("./Excel/FacebookCredentials.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
		XSSFCell cell1=row.getCell(1);
		String usn=cell.getStringCellValue();
		String psw=cell1.getStringCellValue();
		System.out.println(usn+" "+psw);
		book.close();
		fis.close();
	}

}
