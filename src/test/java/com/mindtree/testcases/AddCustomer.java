package com.mindtree.testcases;

import java.util.Hashtable;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.base.TestBase;
import com.mindtree.reusable.Reusable;
import com.mindtree.utilities.TestUtil;


public class AddCustomer extends TestBase {

    Reusable reuse = new Reusable();

   
/*
    @Test(dataProviderClass=TestUtil.class,dataProvider="dataProvider")

    public void addCustomer(Hashtable<String,String> data) throws InterruptedException{*/

    	@Test()

        public void addCustomer() throws InterruptedException{

                   /*if(!data.get("Runmode").equals("Y")){

                                

                                 throw new SkipException("Skipping the test case as the Run mode for data set is NO");

                   }*/

                   reuse.click("bmlBtn_CSS");

                   reuse.click("addCustBtn_CSS");
                   
                   reuse.type("firstname_XPATH","Nagarjun");

                   reuse.type("lastname_XPATH","Muruganantham");

                   reuse.type("postcode_XPATH","Az4758");
/*
                   reuse.type("firstname_XPATH",data.get("firstname"));

                   reuse.type("lastname_XPATH",data.get("lastname"));

                   reuse.type("postcode_XPATH",data.get("postcode"));*/

                   reuse.click("addbtn_XPATH");

                   Thread.sleep(5000);

              Assert.assertTrue(driver.switchTo().alert().getText().contains("Customer added successfully"));

   /* Assert.assertTrue(driver.switchTo().alert().getText().contains(data.get("alerttext")));*/

                   driver.switchTo().alert().accept();

                  

                   Thread.sleep(2000);

                   reuse.click("homePageBtn_XPATH");

                  

    }

   

}