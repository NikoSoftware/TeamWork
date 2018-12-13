package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springmvc.model.User;
import springmvc.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "/test/*")
public class SuccessController {
    @Autowired
    private HttpServletRequest request;

    @Resource
    UserService userService;



    //http://localhost:8080/test/success
    @RequestMapping(value = "success",method = RequestMethod.GET)
    public ModelAndView success(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("success");

        return modelAndView;
    }

    //http://localhost:8080/test/registerPage
    @RequestMapping(value = "registerPage",method = RequestMethod.GET)
    public ModelAndView registerPage(){
        return new ModelAndView("insertUserInfo","command", new User());
    }


    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute User user){
        userService.insertUser(user);
        return new ModelAndView("insertUserInfo","command", new User());
    }

    //http://localhost:8080/test/getAllUser
    @RequestMapping(value = "getAllUser",method = RequestMethod.GET)
    public ModelAndView getAllUser(){
        ArrayList<User> users =userService.getAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("count",users.size());
        modelAndView.addObject("users",users);
        modelAndView.setViewName("allPersonInfo");

        return modelAndView;
    }



    @RequestMapping(value = "getUserById",method = RequestMethod.GET)
    public ModelAndView getUserById(@RequestParam("id") Integer id){
        User user =userService.selectByPrimaryKey(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("ShowPersonInfo");

        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "getVideoUrl", method = RequestMethod.GET)
    public String getVideoUrl(){
        return "videos/video.mp4";
    }


}
