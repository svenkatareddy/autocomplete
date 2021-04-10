package com.datasearch.autocomplete;

import com.datasearch.autocomplete.repo.SkuServiceRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;


import java.util.Arrays;
import java.util.List;

@SpringBootTest
class AutocompleteApplicationTests {

    @Autowired
    SkuServiceRepo skuServiceRepo;

    @Mock
    SkuServiceRepo mockSkuServiceRepo ;

    @Test
    void iPhonesWithOutCase(){
        String queryText = "IPHONE";
        List<String> listOfPhones = Arrays.asList("iPhone6","iPhone7","iPhone10");
        Assertions.assertTrue(skuServiceRepo.findAllBySku(queryText).containsAll(listOfPhones));
    }

    @Test
    void iPhonesWithCase(){

        String queryText = "iphone";
        List<String> listOfPhones = Arrays.asList("iPhone6","iPhone7","iPhone10");
        Assertions.assertTrue(skuServiceRepo.findAllBySku(queryText).containsAll(listOfPhones));
    }

    @Test
    void iPhonesWithDescription(){

        String queryText = "Apple";
        List<String> listOfPhones = Arrays.asList("iPhone6","iPhone7","iPhone10");
        Assertions.assertTrue(skuServiceRepo.findAllBySku(queryText).containsAll(listOfPhones));
    }

    @Test
    void mockDataTest(){
        List<String> listOfPhones = Arrays.asList("iPhone6","iPhone7","iPhone10");

        SkuServiceRepo skuServiceRepo = mock(SkuServiceRepo.class);
        when(skuServiceRepo.findAllBySku("iphone")).thenReturn(listOfPhones);

        Assertions.assertTrue(skuServiceRepo.findAllBySku("iphone").containsAll(listOfPhones));
    }

}
