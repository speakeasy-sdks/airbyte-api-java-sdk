/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceWikipediaPageviews - The values required to configure the source.
 */
public class SourceWikipediaPageviews {
    /**
     * If you want to filter by access method, use one of desktop, mobile-app or mobile-web. If you are interested in pageviews regardless of access method, use all-access.
     */
    @JsonProperty("access")
    public String access;
    public SourceWikipediaPageviews withAccess(String access) {
        this.access = access;
        return this;
    }
    
    /**
     * If you want to filter by agent type, use one of user, automated or spider. If you are interested in pageviews regardless of agent type, use all-agents.
     */
    @JsonProperty("agent")
    public String agent;
    public SourceWikipediaPageviews withAgent(String agent) {
        this.agent = agent;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceWikipediaPageviewsWikipediaPageviewsEnum airbyteSourceName;
    public SourceWikipediaPageviews withAirbyteSourceName(SourceWikipediaPageviewsWikipediaPageviewsEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * The title of any article in the specified project. Any spaces should be replaced with underscores. It also should be URI-encoded, so that non-URI-safe characters like %, / or ? are accepted.
     */
    @JsonProperty("article")
    public String article;
    public SourceWikipediaPageviews withArticle(String article) {
        this.article = article;
        return this;
    }
    
    /**
     * The ISO 3166-1 alpha-2 code of a country for which to retrieve top articles.
     */
    @JsonProperty("country")
    public String country;
    public SourceWikipediaPageviews withCountry(String country) {
        this.country = country;
        return this;
    }
    
    /**
     * The date of the last day to include, in YYYYMMDD or YYYYMMDDHH format.
     */
    @JsonProperty("end")
    public String end;
    public SourceWikipediaPageviews withEnd(String end) {
        this.end = end;
        return this;
    }
    
    /**
     * If you want to filter by project, use the domain of any Wikimedia project.
     */
    @JsonProperty("project")
    public String project;
    public SourceWikipediaPageviews withProject(String project) {
        this.project = project;
        return this;
    }
    
    /**
     * The date of the first day to include, in YYYYMMDD or YYYYMMDDHH format.
     */
    @JsonProperty("start")
    public String start;
    public SourceWikipediaPageviews withStart(String start) {
        this.start = start;
        return this;
    }
    
}
