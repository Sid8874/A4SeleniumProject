package generic_Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public void WriteDataInExcel(String sheetName,int rowNum,int cellNum,String value)throws Exception{
		FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		sh.createRow(9).createCell(1).setCellValue("Angry Bird");
		FileOutputStream fos=new FileOutputStream(IconstantUtility.excelPath);
		book.write(fos);
	}

}
