package com.mindtree.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.base.TestBase;
import com.mindtree.reusable.Reusable;
import com.mindtree.utilities.TestUtil;

public class CustomerLogin extends TestBase {

    Reusable reuse = new Reusable();

    /*@Test(dataProviderClass=TestUtil.class,dataProvider="dataProvider" )

    public void customerLogin(Hashtable<String,String> data) throws InterruptedException{*/
    	@Test()

        public void customerLogin() throws InterruptedException{



    /*          if(!data.get("runmode").equals("Y")){

                                

                                 throw new SkipException("Skipping the test case as the Run mode for data set is NO");

                   }*/

                   /*String custname=data.get("customername");*/
    		

                   reuse.click("homePageBtn_XPATH");

                   reuse.click("clBtn_XPATH");

                 //  reuse.select("customer_CSS",custname);
                   reuse.select("customer_CSS","Harry Potter");
                   Thread.sleep(2000);

                   reuse.click("loginBtn_CSS");

                   Thread.sleep(2000);

    /*Assert.assertTrue(driver.findElement(By.cssSelector(OR.getProperty("custName_CSS"))).getText().contains(custname));*/
    Assert.assertTrue(driver.findElement(By.cssSelector(OR.getProperty("custName_CSS"))).getText().contains("Harry Potter"));
                   Thread.sleep(2000);

                   reuse.click("logoutBtn_XPATH");            

                  

    }

   

}

