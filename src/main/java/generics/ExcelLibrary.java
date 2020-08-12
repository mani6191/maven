package generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getCellValue(String Path,String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(exelPath);
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
		String cellValue=wbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
}
