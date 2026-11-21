package dataDrivenTesting;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./data/TestSript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		//FileOutputStream fos= new FileOutputStream("./data/training_data.xlsx");
		System.out.println(value);
		
		
	}
}
