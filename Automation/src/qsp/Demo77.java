package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo77 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
Workbook wb = WorkbookFactory.create(fis);
int rowcount = wb.getSheet("Sheet1").getLastRowNum();
for(int i=1;i<=rowcount;i++) {
	String un = wb.getSheet("Sheet1").getRow(i).getCell(3).getStringCellValue();
	String pw = wb.getSheet("Sheet1").getRow(i).getCell(4).getStringCellValue();
	System.out.println(un+"   "+pw);
	}

	}

}
