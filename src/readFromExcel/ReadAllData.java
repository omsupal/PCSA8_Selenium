package readFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllData {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./documents/SeleniumActitime.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("omkar");
		int rowcount=sh.getPhysicalNumberOfRows();
		int colcount=sh.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				Cell cl = sh.getRow(i).getCell(j);
				System.out.println(cl.toString()+"  ");
			}
			System.out.println();
		}

	}

}
