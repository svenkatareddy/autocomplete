package com.datasearch.autocomplete.service;

import com.datasearch.autocomplete.repo.SkuServiceRepo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
@Slf4j
public class SkuServiceImpl {

    final SkuServiceRepo skuServiceRepo;

    public SkuServiceImpl(SkuServiceRepo skuServiceRepo) {
        this.skuServiceRepo = skuServiceRepo;
    }

    public List<String> skuAutoComplete(String text) {

        List<String> skus = skuServiceRepo.findAllBySku(text);
        if(skus.size() != 0){
            log.debug("No Records found");
            return skus;
        }
        else {
            log.debug("More than one record found");
            return Arrays.asList("No sku found");
        }
    }
}
