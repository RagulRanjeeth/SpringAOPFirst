package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Shopping {


    public void ShopCheck(String status)
    {
        System.out.println("This is ShopCheck");
    }

    public String check()
    {
        return "9999999";
    }
}
