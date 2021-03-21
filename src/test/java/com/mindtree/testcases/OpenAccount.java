package com.mindtree.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.base.TestBase;
import com.mindtree.reusable.Reusable;
import com.mindtree.utilities.TestUtil;

public class OpenAccount extends TestBase{

    Reusable reuse = new Reusable();

   

   /* @Test(dataProviderClass=TestUtil.class,dataProvider="dataProvider")

    public void openAccount(Hashtable<String,String> data) throws InterruptedException, IOException{

*/
    @Test()

    public void openAccount() throws InterruptedException, IOException{


    /*          if(!data.get("runmode").equals("Y")){

                                

                                 throw new SkipException("Skipping the test case as the Run mode for data set is NO");

                   }*/

                   reuse.click("homePageBtn_XPATH");

                   reuse.click("bmlBtn_CSS");

                   reuse.click("openaccount_XPATH");

                  /* reuse.select("customer_CSS", data.get("customer"));

                   reuse.select("currency_CSS", data.get("currency"));*/
                   
                   reuse.select("customer_CSS", "Nagarjun Muruganantham");

                   reuse.select("currency_CSS", "Pound");

                   reuse.click("process_XPATH");

                   Thread.sleep(5000);

                  

                  Assert.assertTrue(driver.switchTo().alert().getText().contains("Account created successfully"));

                   driver.switchTo().alert().accept();

                  

                   Thread.sleep(2000);

                  

   

    }

}

