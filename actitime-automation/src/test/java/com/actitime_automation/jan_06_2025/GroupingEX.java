package com.actitime_automation.jan_06_2025;

 
import org.testng.annotations.Test;

public class GroupingEX {
    @Test(groups={"smoke", "regression", "integration"})
    public void UpdateCustomer() {
        System.out.println("Capital Update customer TC");
    }
    @Test(groups={"smoke", "regression"})
    public void CreateCustomer() {
        System.out.println("Capital Create customer TC");
    }
    @Test(groups={"regression", "integration"})
    public void DeleteCustomer() {
        System.out.println("Capital Delete customer TC");
    }
    @Test(groups={"smoke", "integration"})
    public void updateCustomer() {
        System.out.println("small update customer TC");
    }
    @Test(groups={"smoke"})
    public void createCustomer() {
        System.out.println("small create customer TC");
    }
    @Test(groups={"regression"})
    public void deleteCustomer() {
        System.out.println("small delete customer TC");
    }
    @Test(groups={"integration"})
    public void login() {
        System.out.println("Login");
    }
    @Test
    public void logout() {
        System.out.println("Logout");
    }
}
