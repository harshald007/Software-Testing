package com.actitime_automation.jan_03_2025;

import org.testng.annotations.Test;

public class SequenceEx1 {
    @Test(priority = 5)
    public void UpdateCustomer() {
        System.out.println("Capital Update Customer TC1");
    }

    @Test(priority = 5)
    public void CreateCustomer() {
        System.out.println("Capital Cpdate Customer TC2");
    }

    @Test(priority = 0)
    public void DeleteCustomer() {
        System.out.println("Capital Update Customer TC3");
    }

    @Test(priority = -10)
    public void updatecustomer() {
        System.out.println("small update customer TC1");
    }

    @Test(priority = -75)
    public void createcustomer() {
        System.out.println("small update customer TC2");
    }

    @Test
    public void deletecustomer() {
        System.out.println("small update customer TC3");
    }

}
