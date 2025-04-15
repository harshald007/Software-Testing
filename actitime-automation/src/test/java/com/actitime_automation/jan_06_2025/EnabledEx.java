package com.actitime_automation.jan_06_2025;


import org.testng.annotations.Test;

import java.util.Properties;

public class EnabledEx {

    @Test(enabled = false)
    public void createCustomerTC() {
        System.out.println("Create Customer");
    }

    @Test		// by default true
    public void updateCustomerTC() {
        System.out.println("Update Customer");
    }

    @Test(priority = 2, enabled = true)
    public void deleteCustomerTC() {
        System.out.println("Delete Customer");
    }
}
