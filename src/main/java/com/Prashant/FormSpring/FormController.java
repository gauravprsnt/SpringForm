package com.Prashant.FormSpring;

import com.Prashant.FormSpring.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping(value = "/form")
    public String helloForm(Model model){
        model.addAttribute("form",new Form());
        return "form";
    }


    @PostMapping(value = "/form")
    public String helloSubmit(@ModelAttribute Form form){
        if(form.getUserName().equals("Prashant") && form.getPassWord().equals("abcd")){
            return "display";
        }else{
            return "Error";
        }


    }
}
