package moomoo.springframework.moomooPetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/Vets","/vets"})
public class VetController {

    @RequestMapping({"","/index"})
    public String vetIndexPage(){
        return "vets/index";
    }
}
