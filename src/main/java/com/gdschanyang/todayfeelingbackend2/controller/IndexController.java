package com.gdschanyang.todayfeelingbackend2.controller;

import com.gdschanyang.todayfeelingbackend2.service.FeelingPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@RequiredArgsConstructor
@Controller
public class IndexController {

    private final FeelingPostService feelingPostService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
