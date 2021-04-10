package com.datasearch.autocomplete.controller;

import com.datasearch.autocomplete.service.SkuServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sku")
@Slf4j
public class SkuController {

    final SkuServiceImpl skuService;
    public SkuController(SkuServiceImpl skuService) {
        this.skuService = skuService;
    }

    @GetMapping(path="/fetch",params = "text")
    public List<String> skuAutoComplete(String text){
        log.debug("controller for {}",text);
        return skuService.skuAutoComplete(text);
    }
}
