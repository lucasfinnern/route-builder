package com.launchcode.routebuilder.Controller;

import com.launchcode.routebuilder.Model.locationData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "")
public class routeBuilder {

    //controls path to add
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String index(Model model) {
        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
        public String addAddressName(@RequestParam String addressName) {
        locationData.add(addressName);
        return "add";
    }

    //controls path to stops
    @RequestMapping(value = "stops")
    public String routeList(Model model){
        model.addAttribute("addressList", locationData.getAll());
        return"stops";
    }

    //controls path to map
    @RequestMapping(value = "map")
        public String displayMap(Model model) {
        return "map";
    }

}
