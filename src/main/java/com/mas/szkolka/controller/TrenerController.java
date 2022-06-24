package com.mas.szkolka.controller;

import com.mas.szkolka.model.Trener;
import com.mas.szkolka.service.SzkolkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/trener")
@RequiredArgsConstructor
public class TrenerController {

    private final SzkolkaService szkolkaService;

    @GetMapping("/aktywny")
    public String getTrener(Model model){
        model.addAttribute("aktywni", szkolkaService.listAllTrenerzy());
        return "aktywny";
    }
    @GetMapping(value="/add")
    public String trenerForm(Model model, @ModelAttribute("trener")Trener trener) {
        model.addAttribute("trener", new Trener());
        szkolkaService.saveTrener(trener);
        return "add";
    }
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("tytulglowny", "Szkółka piłkarska");
    }

}
