package Password.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/main")
public class Test {

  @RequestMapping(method = RequestMethod.GET)
  public String welcome(@RequestParam("modulus") String modulus,
                        @RequestParam("exponent") String exponent,
                        @RequestParam("password") String password,
                        Model model){
    model.addAttribute("modulus",modulus);
    model.addAttribute("exponent",exponent);
    model.addAttribute("password",password);
    return "Encrypt";
  }
}

