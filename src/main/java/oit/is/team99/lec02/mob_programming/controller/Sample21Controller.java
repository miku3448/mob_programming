package oit.is.team99.lec02.mob_programming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sample21Controller {

  @GetMapping("/sample21")
  public String sample21() {
    return "sample21.html";
  }

  @GetMapping("/sample22/{param1}/{param2}")
  public String sample22(@PathVariable String param1, @PathVariable String param2, ModelMap model) {
    int tasu = Integer.parseInt(param1);
    int tasareru = Integer.parseInt(param2);
    int tasuResult = tasu + tasareru;

    // Thymeleafに値を渡す
    model.addAttribute("tasuResult1", tasuResult);
    return "sample21.html";
  }

  @GetMapping("/sample23")
  public String sample23(@RequestParam Integer tasu1, @RequestParam Integer tasu2, ModelMap model) {
  int tasuResult = tasu1 + tasu2;
  model.addAttribute("tasuResult2", tasuResult);

  return "sample21.html";
  }
}
