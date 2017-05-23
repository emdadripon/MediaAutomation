package TableData;

import Base.CommonAPI;
import Table.TableData;
import Table.TablePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by smhoque on 5/21/17.
 */
public class ReadTableData extends CommonAPI {
    @Test
    public void headerVerification(){
        TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
        tablePage.table();
    }
    @Test
    public void readingTableCellData(){
        TableData tableData = PageFactory.initElements(driver, TableData.class);
        tableData.table();
    }


}
