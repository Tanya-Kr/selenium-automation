package com.automation;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class UserTest {

    private User user;

    @BeforeClass
    public void beforClass() {
        System.out.println("beforeClass");
        System.out.println("setup env...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
        System.out.println("stop env...");
    }

    @BeforeMethod
    public void beforeMethod(){
        user = new User("Mark", 35);
        System.out.println(user);
    }

    @AfterMethod
    public void afterMethod(){
        user = null;
    }

    @Test
    public void userNameTest(){

        assertEquals(user.getName(), "Mark");
    }

    @Test
    public void userAgeTest(){

        assertEquals(user.getAge(), 35);
    }

}
