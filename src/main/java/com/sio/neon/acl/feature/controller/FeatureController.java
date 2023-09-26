package com.sio.neon.acl.feature.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sio.neon.acl.feature.data.entity.Feature;
import com.sio.neon.acl.feature.service.FeatureService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FeatureController {

    private final FeatureService featureService;

    @GetMapping("/features/list")
    public String list(
            @RequestParam("code") final Optional<String> code,
            @RequestParam("name") final Optional<String> name,
            @RequestParam("pageSize") final Optional<String> pageSize,
            @RequestParam("pageNo") final Optional<String> pageNo,
            @RequestParam("sortBy") final Optional<String> sortBy,
            Model model) {

        List<Feature> featureList = featureService.list(
                name.orElse(""),
                code.orElse("null"),
                pageSize.orElse(""),
                pageNo.orElse("null"),
                sortBy.orElse(""));

        model.addAttribute("features", featureList);
        return "feature/feature-list";
    }
}
