package com.mas.szkolka.controller;

import com.mas.szkolka.model.Klub;
import com.mas.szkolka.model.SponsorPrywatny;
import com.mas.szkolka.service.SponsorPrywatnyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Set;

@Controller
public class SponsorPrywatnyController {

    @Autowired
    private SponsorPrywatnyService sponsorPrywatnyService;

    @GetMapping("/sponsorzy")
    public String sponsorzy(Model model){
        List<SponsorPrywatny> sponsorzy = sponsorPrywatnyService.getAllSponsorzy();
        model.addAttribute("sponsorzy",sponsorzy);
        return "sponsorzy";
    }

    @GetMapping("klubyWSponsorze/{id}")
    public String klubyWSponsorze(@PathVariable (value="id") long id,Model model){
        SponsorPrywatny sponsor = sponsorPrywatnyService.getSponsorById(id);
        Set<Klub> klubyWSponsorze = sponsor.getKluby();
        model.addAttribute("klubyWSponsorze", klubyWSponsorze);
        return "sponsorzy_kluby";
    }

}
