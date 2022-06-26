package com.mas.szkolka.controller;

import com.mas.szkolka.model.Trener;
import com.mas.szkolka.service.SzkolkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TrenerController {

    @Autowired
    private SzkolkaService szkolkaService;

    @GetMapping("/aktywny")
    public String getTrener(Model model){
        model.addAttribute("aktywni", szkolkaService.listAllTrenerzy());
        return "aktywny";
    }
    @GetMapping("/historia")
    public String getHistoria(Model model){
        model.addAttribute("aktywni", szkolkaService.listAllTrenerzy());
        return "historia";
    }
    @GetMapping("/add")
    public String trenerForm(Model model) {
        Trener trener = new Trener();
        model.addAttribute("trener", trener);
        return "add";
    }
    @PostMapping("/addTrener")
    public String addTrener(@ModelAttribute("trener")Trener trener){
        szkolkaService.saveTrener(trener);
        return "redirect:/aktywny";
    }


    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("tytulglowny", "Szkółka piłkarska");
    }

}
