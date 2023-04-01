/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOpenweather - The values required to configure the source.
 */
public class SourceOpenweather {
    @JsonProperty("airbyte-source-name")
    public SourceOpenweatherOpenweatherEnum airbyteSourceName;
    public SourceOpenweather withAirbyteSourceName(SourceOpenweatherOpenweatherEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Your OpenWeather API Key. See &lt;a href="https://openweathermap.org/api"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonProperty("appid")
    public String appid;
    public SourceOpenweather withAppid(String appid) {
        this.appid = appid;
        return this;
    }
    
    /**
     * You can use lang parameter to get the output in your language. The contents of the description field will be translated. See &lt;a href="https://openweathermap.org/api/one-call-api#multi"&gt;here&lt;/a&gt; for the list of supported languages.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lang")
    public SourceOpenweatherLanguageEnum lang;
    public SourceOpenweather withLang(SourceOpenweatherLanguageEnum lang) {
        this.lang = lang;
        return this;
    }
    
    /**
     * Latitude for which you want to get weather condition from. (min -90, max 90)
     */
    @JsonProperty("lat")
    public String lat;
    public SourceOpenweather withLat(String lat) {
        this.lat = lat;
        return this;
    }
    
    /**
     * Longitude for which you want to get weather condition from. (min -180, max 180)
     */
    @JsonProperty("lon")
    public String lon;
    public SourceOpenweather withLon(String lon) {
        this.lon = lon;
        return this;
    }
    
    /**
     * Units of measurement. standard, metric and imperial units are available. If you do not use the units parameter, standard units will be applied by default.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("units")
    public SourceOpenweatherUnitsEnum units;
    public SourceOpenweather withUnits(SourceOpenweatherUnitsEnum units) {
        this.units = units;
        return this;
    }
    
}
