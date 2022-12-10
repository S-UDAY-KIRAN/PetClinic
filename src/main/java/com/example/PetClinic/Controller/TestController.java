package com.example.PetClinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/source")
    public String source() {
        return "source";
    }
    @RequestMapping("/source#slink1")
    public String sourcelink1() {
        return "redirect:source#slink1";
    }
    @RequestMapping("/source#slink2")
    public String sourcelink2() {
        return "redirect:source#slink2";
    }
    @RequestMapping("/destination")
    public String destination() {
        return "destination";
    }
    @RequestMapping("/destination#dlink1")
    public String destinationlink1() {
        return "redirect:destination#dlink1";
    }@RequestMapping("/destination#dlink2")
    public String destinationlink2() {
        return "redirect:destination#dlink2";
    }

}
