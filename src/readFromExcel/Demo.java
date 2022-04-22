package readFromExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {
public static void main(String[] args) throws Exception {
	File src = new File("excel file location");
	FileInputStream fis= new FileInputStream(src);
	XSSFWorkbook xsf = new XSSFWorkbook (fis);
	// for .xls files.
	//HSSFWorkbook xsf = new HSSFWorkbook (fis);
	XSSFSheet sheet= xsf.getSheetAt(0);
	String entry1=sheet.getRow (1).getCell (1).getStringCellValue();
	System.out.println("The data in the box is " + entry1);
	xsf.close();
}
}
