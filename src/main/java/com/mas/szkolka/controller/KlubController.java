package com.mas.szkolka.controller;

import com.mas.szkolka.model.Klub;
import com.mas.szkolka.repository.KlubRepository;
import com.mas.szkolka.service.KlubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class KlubController {

    @Autowired
    private KlubService klubService;

    @GetMapping("/kluby")
    public String kluby(Model model){
        List<Klub> kluby = klubService.getAllKluby();
        model.addAttribute("kluby",kluby);
        return "kluby";
    }



}
