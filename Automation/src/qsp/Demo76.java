package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo76 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("Sheet1").getRow(1).getCell(5).setCellValue("pass");
FileOutputStream fos=new FileOutputStream("./data//Book1.xlsx");
wb.write(fos);


	}

}
