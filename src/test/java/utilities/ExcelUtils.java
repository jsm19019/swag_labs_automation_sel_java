package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell col;

	public String getcellData(int rownum, int cellnum) throws IOException {
		
		System.out.println("Before opening Excel");
		fi = new FileInputStream(System.getProperty("user.dir") + "/testData/test_data.xlsx");

		wb = new XSSFWorkbook(fi);
		
		System.out.println("Excel opened successfully");

		XSSFSheet sheet = wb.getSheet("LoginData");
		System.out.println("Sheet opened successfully");
		String celldata = sheet.getRow(rownum).getCell(cellnum).toString();
		System.out.println("Got cell data");

		return celldata;

	}

	public int gettotalcolCount(String filepath, String sheet, int rownum) throws IOException {
		fi = new FileInputStream(filepath);
		wb = new XSSFWorkbook(fi);
		int numofcol = wb.getSheet(sheet).getRow(rownum).getLastCellNum();
		return numofcol;

	}

	public int gettotalrowCount(String filepath, String sheet) throws IOException {
		fi = new FileInputStream(filepath);
		wb = new XSSFWorkbook(fi);
		int numofrow = wb.getSheet(sheet).getLastRowNum();
		return numofrow;

	}

	public XSSFRow getRowData(String filepath, String sheet, int r) throws IOException {
		fi = new FileInputStream(filepath);
		wb = new XSSFWorkbook(fi);
		XSSFRow numofrow = wb.getSheet(sheet).getRow(r);
		return numofrow;

	}

}
