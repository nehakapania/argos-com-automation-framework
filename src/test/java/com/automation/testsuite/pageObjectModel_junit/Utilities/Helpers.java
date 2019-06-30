package com.automation.testsuite.pageObjectModel_junit.Utilities;

import com.automation.testsuite.pageObjectModel_junit.Hooks;

import java.util.Random;

public class Helpers extends Hooks {
    public void sleep() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int randomNumberGenerator(int size) // to get the size of products
    {
        Random random = new Random();
        return random.nextInt(size - 1);
    }
}


