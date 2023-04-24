package com.tcx.controller;

import com.tcx.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
//@RestController包括Controller和ResponseBody  简化开发
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/save")
    public String save(@RequestParam("name") String s){
        System.out.println("book save ..."+s);
        return "/page.jsp";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(User user, @DateTimeFormat(pattern = "yyyy-mm-dd") Date date){
        System.out.println("book test ...");
        return "{‘book:test'}";
    }
}
