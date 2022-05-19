package com.saitej.controller;
import com.saitej.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Controller
public class RegisterController {

    @ModelAttribute
    public void commonDataForModel(Model model){
        model.addAttribute("date", LocalDateTime.now());
    }

    @RequestMapping(value ="/register",method = RequestMethod.GET)
    public String register(){
        return "register";
    }


    //Reading data from form page using @RequestParam

   /* @RequestMapping(value = "/processForm",method = RequestMethod.POST)
    public ModelAndView handleForm(@RequestParam("userName") String userName,
                             @RequestParam("email") String email,
                             @RequestParam("password") String password) {

        System.out.println(userName+" "+email+" "+password);

        ModelAndView mav = new ModelAndView();
        mav.addObject("userName",userName);
        mav.addObject("email",email);
        mav.addObject("password",password);
        mav.setViewName("success");
        return mav;
    }*/


    /*// Using Model interface and creating User class (match user class fields with form fields)
    @RequestMapping(value = "/processForm",method = RequestMethod.POST)
    public String handleForm(@RequestParam("userName") String userName,
                                   @RequestParam("email") String email,
                                   @RequestParam("password") String password,
                                   Model model) {

        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);
        System.out.println(user);
        model.addAttribute("user",user);

        return "success";
*/


//Using @ModelAttribute (automatically binds form fields with user fields)
    @RequestMapping(value = "/processForm",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user,
                             Model model) {
        System.out.println(user);
      //  model.addAttribute("user",user); // no need to add user into the model

        return "success";

    }

}
