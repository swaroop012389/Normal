package commonClasses;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelOperation 
{
	static File f1;

	public static String readData(String sheetName,int romNum,int cellNum) throws Exception
	{
		try 
		{
		f1 = new File("C://Users//hp//Desktop//New folder//practice.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook w1 = new XSSFWorkbook(fis);
		
		String data = w1.getSheet(sheetName).getRow(romNum).getCell(cellNum).getStringCellValue();
		return data;
		}
		catch(Exception rv)
		{
			return "Invalid data";
		}
	}
	
	public void writeData(String sheetName,int romNum,int cellNum,String data) throws Exception
	{
		try
		{
		f1 = new File("C://Users//hp//Desktop//New folder//practice.xlsx");
		FileOutputStream fos = new FileOutputStream(f1);
		XSSFWorkbook w1 = new XSSFWorkbook();
		w1.getSheet(sheetName).createRow(romNum).createCell(cellNum).setCellValue(data);
		w1.write(fos);
		}
		catch(Exception rv)
		{
			
		}
	}
}
