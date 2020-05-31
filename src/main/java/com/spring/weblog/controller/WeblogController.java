package com.spring.weblog.controller;

import com.spring.weblog.model.Post;
import com.spring.weblog.repository.WeblogRepository;
import com.spring.weblog.service.WeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WeblogController {

    @Autowired
    WeblogService weblogService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = weblogService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

}
