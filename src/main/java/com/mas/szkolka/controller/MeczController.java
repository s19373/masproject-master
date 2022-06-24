package com.mas.szkolka.controller;


import com.mas.szkolka.service.SzkolkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MeczController {

    private final SzkolkaService szkolkaService;

    @GetMapping("/mecze")
    public String getMecz(Model model){
        model.addAttribute("mecze", szkolkaService.listAllMecze());
        return "mecze";
    }

}
