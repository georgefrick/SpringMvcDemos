package com.gfrick.web;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handle two basic example requests; as naked as can be.
 * @author George Frick (george.frick@gmail.com)
 */
@Controller
public class NakedController {

  @RequestMapping(value = "/")
  public String home() {
    return "HelloWorld";
  }


  /*
   * Example: url:8080/springmvc/echo?input=echothis
   */
  @RequestMapping(value = "/echo", method = RequestMethod.GET)
  public String echo(@RequestParam("input") String input1, Model model) {
    model.addAttribute("echo", input1);
    return "HelloWorld";
  }
}
