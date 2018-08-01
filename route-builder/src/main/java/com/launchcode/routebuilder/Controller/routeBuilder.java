package com.launchcode.routebuilder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "")
public class routeBuilder {

    //controls path to add
    @RequestMapping(value = "add")
    public String index(Model model) {
        return "add";
    }

    //controls path to stops
    @RequestMapping(value = "stops")
    public String routeList(Model model){
        return"stops";
    }

    //controls path to map
    @RequestMapping(value = "map")
        public String displayMap(Model model) {
        return "map";
    }

}
