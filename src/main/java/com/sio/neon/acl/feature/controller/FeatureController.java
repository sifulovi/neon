package com.sio.neon.acl.feature.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FeatureController {

    @GetMapping("/features/list")
    public String list(
            @RequestParam("code") final Optional<String> code,
            @RequestParam("name") final Optional<String> name,
            Model model) {

            


        return "feature/feature-list";
    }
}
