package com.example.piece;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {
	//HttpSession userSession;
	@RequestMapping("/state")
        public String state(){
            return "newjsf";
        }
}
