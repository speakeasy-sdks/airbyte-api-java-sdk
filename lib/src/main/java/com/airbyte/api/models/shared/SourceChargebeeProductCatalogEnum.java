/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceChargebeeProductCatalogEnum - Product Catalog version of your Chargebee site. Instructions on how to find your version you may find &lt;a href="https://apidocs.chargebee.com/docs/api?prod_cat_ver=2"&gt;here&lt;/a&gt; under `API Version` section.
 */
public enum SourceChargebeeProductCatalogEnum {
    ONE0("1.0"),
    TWO0("2.0");

    @JsonValue
    public final String value;

    private SourceChargebeeProductCatalogEnum(String value) {
        this.value = value;
    }
}