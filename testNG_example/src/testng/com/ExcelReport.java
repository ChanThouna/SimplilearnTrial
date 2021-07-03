package testng.com;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.common.excelreport.ExcelReportGenerator;

public class ExcelReport {

	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		// TODO Auto-generated method stub

		ExcelReportGenerator.generateExcelReport("ExcelReport.xlsx","/home/chanchanbinagma/eclipse-workspace/testNG_example/");
	}

}

//testNG_example/test-output/testng-results.xml