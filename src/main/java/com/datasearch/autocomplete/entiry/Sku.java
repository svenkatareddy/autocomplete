package com.datasearch.autocomplete.entiry;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sku {

    @Id
    private String skuId;
    private String description;
    private String skuGroup;
    private Integer weight;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkuGroup() {
        return skuGroup;
    }

    public void setSkuGroup(String skuGroup) {
        this.skuGroup = skuGroup;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
