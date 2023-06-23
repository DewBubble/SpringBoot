package com.ltp.hellpspring;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BootController {
    @GetMapping("/grades")
    public String getGrades(Model m){
        Grade g = new Grade("Harry", "potions", "c-");
        m.addAttribute("grade", g);
        return "grades";
    }


     @GetMapping("/shows")
    public String getShows(Model m){
        ArrayList<Show> showList = new ArrayList<>();
        showList.add(new Show("Breaking Bad", "Ozymandias", 10.0));
        showList.add(new Show("Attack on Titan", "Hero", 9.9));
        showList.add(new Show("Attack on Titan", "Perfect Game", 9.9));
        showList.add(new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
        showList.add(new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));
        m.addAttribute("showList", showList);
        return "shows";
    }

    @GetMapping("/sign")
    public String getSpeed(Model m){
        m.addAttribute("speed", 77);
        return "sign";
    }

    @GetMapping("/image")
    public String getImage(Model m){
        m.addAttribute("imageName", "mona-lisa");
        return "imageSwitch";
    }

    @GetMapping("/dealership")
    public String getDealer(Model m){
         m.addAttribute("budget", 9000);
         m.addAttribute("make", "Subaru");
        return "dealership";
    }
}
