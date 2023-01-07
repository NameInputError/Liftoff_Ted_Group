//package org.launchcode.trackmyeats.controllers;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;


//@Controller
//public class HomeController {

    //@GetMapping
    //public String index() {
    //    return "index";
  //  }
//}
package org.launchcode.trackmyeats.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/")
public class HomeController {
    public String index(){
        return "index";
    }

    @RequestMapping(value="goodbye")
    public String goodbye(){
        return "Goodbye";
    }
}


