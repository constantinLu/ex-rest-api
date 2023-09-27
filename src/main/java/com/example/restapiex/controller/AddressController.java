package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddressController {

    @GetMapping("/addresses")
    //@ResponseBody
    //without @ResponseBody we will get 404 not found
    //{
        //    "timestamp": "2023-06-12T12:07:12.587+00:00",
        //    "status": 404,
        //    "error": "Not Found",
        //    "path": "/addresses"
        //}
    String getAdresses() {
        return "Stefan cel Mare";
    }
}
