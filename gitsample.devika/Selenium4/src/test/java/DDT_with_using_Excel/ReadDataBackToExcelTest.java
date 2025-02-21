package DDT_with_using_Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;

public class ReadDataBackToExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/DDT_data/testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("org");
		Row row = sh.getRow(1);
		Cell cell = row.createCell(3);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("PASS");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/DDT_data/testscriptdata.xlsx");
		wb.write(fos);
		wb.close();
        System.err.println("-----Executed-----");

	}

}
