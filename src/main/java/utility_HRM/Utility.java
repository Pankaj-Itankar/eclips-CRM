package utility_HRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Utility {
	public static String Filepath ="C:\\Users\\USER\\eclipse-workspace\\Practice_HRM\\src\\test\\resources\\TestData.xlsx";
	public static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public static Sheet testData(int SheetNumber) {
		File file = new File(Filepath);
		FileInputStream input = null ;
		Workbook workbook = null;
		try {
			 input = new FileInputStream(file);
			 System.out.println(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
		} 
		  
		 try {
			  workbook = new XSSFWorkbook(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sheet = workbook.getSheetAt(SheetNumber);
		 return sheet;
	}

}
