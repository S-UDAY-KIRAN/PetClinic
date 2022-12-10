package com.example.PetClinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetClinicController {
    @RequestMapping("/")
    public String mainPage(){

        return "index";
    }
    @RequestMapping("/ourservices")
    public String services(){

        return "ourservices";
    }
    @RequestMapping("/contactus")
    public String contactUs(){

        return "contactus";
    }

    @RequestMapping("/booknow")
    public String bookNow(){

        return "booknow";
    }
}
