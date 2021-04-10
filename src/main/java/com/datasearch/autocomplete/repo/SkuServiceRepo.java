package com.datasearch.autocomplete.repo;

import com.datasearch.autocomplete.entiry.Sku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SkuServiceRepo extends JpaRepository<Sku, String> {

    @Query(value = "select sku_id from sku where lower(sku_id) like lower(concat('%', :text,'%')) " +
            "or lower(description) like lower(concat('%', :text,'%')) or " +
            " lower(sku_group) like lower(concat('%', :text,'%'))", nativeQuery = true)
    List<String> findAllBySku(String text);

//    List<String> findBySkuIdIgnoreCase(String sku);
}
