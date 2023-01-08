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

        import org.launchcode.trackmyeats.models.data.RestaurantRepository;
        import org.launchcode.trackmyeats.models.data.UserRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping
    public String index(){
        return "index";
    }

}


