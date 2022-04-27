package readFromExcel;

//reading value of a particular cell  
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;


public class ReadCellExample {
	public static String readExcel(String path, String sheet, int r, int c) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		return sh.getRow(r).getCell(c).toString();

	}
}