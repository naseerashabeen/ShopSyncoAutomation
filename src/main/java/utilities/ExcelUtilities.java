package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	public static String getStringData(int a,int b,String getsheetname) throws IOException 
	{
		f=new FileInputStream("C:\\Users\\S\\eclipse-workspace\\ShopSyncoApplication\\src\\test\\resources\\TestDataShopSynco.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(getsheetname);
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
		
	}
	public static String getIntegerData(int a,int b,String getsheetname) throws IOException
	{
		f=new FileInputStream("C:\\Users\\S\\eclipse-workspace\\ShopSyncoApplication\\src\\test\\resources\\TestDataShopSynco.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(getsheetname);
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
	}
}
