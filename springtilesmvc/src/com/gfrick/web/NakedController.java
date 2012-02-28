package com.gfrick.web;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


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

  /*
   * Example: url:8080/springmvc/tilesecho?input=echothis
   */  
  @RequestMapping(value = "/tilesecho", method = RequestMethod.GET)
  public String tilesEcho(@RequestParam("input") String input1, Model model ) {
    model.addAttribute("echo", input1);
    return "tilesecho";
  }

  /*
   * Alternative implementation found online, included as an example
   */
  @RequestMapping(value = "/tilesechoalt", method = RequestMethod.GET)
  public ModelAndView tilesEchoAlt(@RequestParam("input") String input1) {
    return new ModelAndView("tilesecho", "echo", input1);
  }

}
