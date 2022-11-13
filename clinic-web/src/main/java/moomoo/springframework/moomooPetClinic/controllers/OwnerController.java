package moomoo.springframework.moomooPetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Owner")
@Controller
public class OwnerController {

    @RequestMapping({"","/index","/index.html"})
    public String ownerIndexPage(){
        return  "/owners/index";
    }
}
