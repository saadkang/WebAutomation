package utility.ExtentReport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;

/**
 * Created by mrahman on 2/27/17.
 */
public class ExtentTestUpdate extends ExtentTest {

    private LogStatus runStatus;
    private Test test;
    public ExtentReports extentReports = new ExtentReports("");

    public ExtentTestUpdate(String testName, String description) {
        super(testName,description);
    }

    /*
    public ExtentTestUpdate(String className, String testName, String description) {
        this.runStatus = LogStatus.UNKNOWN;
        this.test = new Test();
        this.test.setName(testName == null?"":testName.trim());
        this.test.setDescription(description.trim());
    } */



    public void startTest(String className, String testName, String description) {
        extentReports.startTest(testName);
    }

}
