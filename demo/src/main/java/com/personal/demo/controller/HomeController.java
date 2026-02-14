package com.personal.demo.controller;

import com.personal.demo.dtos.BannerReadDto;
import com.personal.demo.service.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final BannerService bannerService;

    @GetMapping("/")
    public String home(Model model) {
        BannerReadDto bannerReadDto = bannerService.getBanner();
        model.addAttribute("banner", bannerReadDto);
        return "index";
    }
    @GetMapping("/resume")
    public String resume() {
        return "resume";
    }

}
