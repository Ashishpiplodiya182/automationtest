package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filelib extends baseclass
{
	
		 public void writeExcel(String sheetName, String cellvalue, int row, int col) throws Exception {
		  
		  String excelPath="./data/book.xlsx";
		  
		  File file= new File(excelPath);
		  
		  FileInputStream fis= new FileInputStream(file);
		  
		  XSSFWorkbook wb= new XSSFWorkbook(fis);
		  
		  XSSFSheet sheet= wb.getSheet(sheetName);
		  
		  sheet.createRow(row).createCell(col).setCellValue(cellvalue);
		  
		  FileOutputStream fos= new FileOutputStream(new File(excelPath));
		  
		  wb.write(fos);
		  
		  wb.close();
		  
		  fos.close();
}
		 
		 public void windowswitch()
		 {
			 
			 Set<String> wh = driver.getWindowHandles();
			 
			 Iterator<String> itr = wh.iterator();
			 
			 String parentid = itr.next();
			
			if(itr.hasNext())
			{
				String childid = itr.next();
				if(!parentid.equals(childid))
				{
					driver.switchTo().window(childid);
					driver.close();
				}
				
				
			}
			driver.switchTo().window(parentid);
			
			
			 
		 }
		 
		 public String propertydata(String key) throws IOException
		 {
			 Properties p = new Properties();
			 FileInputStream fis = new FileInputStream("./data/data.property.txt");
			
			 p.load(fis);
			 String k = p.getProperty(key);
			 
			 return k ;
		 }
		 
		 public void mouseHover(WebElement element)
		 {
			 
			 Actions a = new Actions(driver);
			 
			 WebDriverWait wait = new WebDriverWait(driver, 20);
			 wait.until(ExpectedConditions.elementToBeClickable(element));
			 a.moveToElement(element).build().perform();;
			 
		 }
		 
		 public void selectbytext(WebElement ele, String value)
		 {
			 Select sc = new Select(ele);
			 
			 sc.selectByVisibleText(value);
			 
			 
		 }
		 
		 
		 public String getExceldata(String sheetName,int row, int col) throws Exception {
			  
			  String excelPath="./data/book.xlsx";
			  
			 
			  FileInputStream fis= new FileInputStream(excelPath);
			  
			 Workbook wb = WorkbookFactory.create(fis);
			  
			String value = wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
			
			return value;
				 
			 }
			 
	}
		 
