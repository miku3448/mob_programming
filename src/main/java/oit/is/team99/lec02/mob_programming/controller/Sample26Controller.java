package oit.is.team99.lec02.mob_programming.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import oit.is.inudaisuki.springboot_samples.model.Score;

@Controller
@RequestMapping("/sample26")
public class Sample26Controller {

  @GetMapping
  public String sample26() {
    return "sample26.html";
  }

  @PostMapping
  public String sample27(@RequestParam Integer min, @RequestParam Integer max, ModelMap model) {
    int sum = 0;
    ArrayList<Integer> sumRange = new ArrayList<>();
    // minからmaxまでの数値を加算し，sumに代入する
    // 同時にminからmaxまでの数値を順にArrayListに格納する
    for (int i = min; i <= max; i++) {
      sum = sum + i;
      sumRange.add(i);
    }
    model.addAttribute("sumRange", sumRange);
    model.addAttribute("sum", sum);
    return "sample26.html";
  }

  // sample26/ave
  @PostMapping("ave")
  public String sample28(@RequestParam Double num1, @RequestParam Double num2, @RequestParam Double num3,
      ModelMap model) {
    ArrayList<Double> numList = new ArrayList<>();
    numList.add(num1);
    numList.add(num2);
    numList.add(num3);
    // Score score = new Score(numList);
    // model.addAttribute("score", score);
    return "sample26.html";
  }
}
