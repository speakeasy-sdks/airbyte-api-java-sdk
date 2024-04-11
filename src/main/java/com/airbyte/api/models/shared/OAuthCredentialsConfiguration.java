/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.airbyte.api.utils.TypedObject;
import com.airbyte.api.utils.Utils.JsonShape;

/**
 * OAuthCredentialsConfiguration - The values required to configure the source.
 */

@JsonDeserialize(using = OAuthCredentialsConfiguration._Deserializer.class)
public class OAuthCredentialsConfiguration {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private OAuthCredentialsConfiguration(TypedObject value) {
        this.value = value;
    }

    public static OAuthCredentialsConfiguration of(Airtable value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Airtable>(){}));
    }

    public static OAuthCredentialsConfiguration of(AmazonAds value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AmazonAds>(){}));
    }

    public static OAuthCredentialsConfiguration of(AmazonSellerPartner value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AmazonSellerPartner>(){}));
    }

    public static OAuthCredentialsConfiguration of(Asana value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Asana>(){}));
    }

    public static OAuthCredentialsConfiguration of(BingAds value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<BingAds>(){}));
    }

    public static OAuthCredentialsConfiguration of(FacebookMarketing value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<FacebookMarketing>(){}));
    }

    public static OAuthCredentialsConfiguration of(Github value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Github>(){}));
    }

    public static OAuthCredentialsConfiguration of(Gitlab value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Gitlab>(){}));
    }

    public static OAuthCredentialsConfiguration of(GoogleAds value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<GoogleAds>(){}));
    }

    public static OAuthCredentialsConfiguration of(GoogleAnalyticsDataApi value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<GoogleAnalyticsDataApi>(){}));
    }

    public static OAuthCredentialsConfiguration of(GoogleDrive value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<GoogleDrive>(){}));
    }

    public static OAuthCredentialsConfiguration of(GoogleSearchConsole value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<GoogleSearchConsole>(){}));
    }

    public static OAuthCredentialsConfiguration of(GoogleSheets value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<GoogleSheets>(){}));
    }

    public static OAuthCredentialsConfiguration of(Harvest value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Harvest>(){}));
    }

    public static OAuthCredentialsConfiguration of(Hubspot value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Hubspot>(){}));
    }

    public static OAuthCredentialsConfiguration of(Instagram value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Instagram>(){}));
    }

    public static OAuthCredentialsConfiguration of(Intercom value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Intercom>(){}));
    }

    public static OAuthCredentialsConfiguration of(LeverHiring value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<LeverHiring>(){}));
    }

    public static OAuthCredentialsConfiguration of(LinkedinAds value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<LinkedinAds>(){}));
    }

    public static OAuthCredentialsConfiguration of(Mailchimp value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Mailchimp>(){}));
    }

    public static OAuthCredentialsConfiguration of(MicrosoftOnedrive value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MicrosoftOnedrive>(){}));
    }

    public static OAuthCredentialsConfiguration of(MicrosoftSharepoint value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MicrosoftSharepoint>(){}));
    }

    public static OAuthCredentialsConfiguration of(MicrosoftTeams value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MicrosoftTeams>(){}));
    }

    public static OAuthCredentialsConfiguration of(Monday value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Monday>(){}));
    }

    public static OAuthCredentialsConfiguration of(Notion value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Notion>(){}));
    }

    public static OAuthCredentialsConfiguration of(Pinterest value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Pinterest>(){}));
    }

    public static OAuthCredentialsConfiguration of(Retently value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Retently>(){}));
    }

    public static OAuthCredentialsConfiguration of(Salesforce value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Salesforce>(){}));
    }

    public static OAuthCredentialsConfiguration of(Shopify value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Shopify>(){}));
    }

    public static OAuthCredentialsConfiguration of(Slack value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Slack>(){}));
    }

    public static OAuthCredentialsConfiguration of(Smartsheets value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Smartsheets>(){}));
    }

    public static OAuthCredentialsConfiguration of(SnapchatMarketing value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SnapchatMarketing>(){}));
    }

    public static OAuthCredentialsConfiguration of(Snowflake value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Snowflake>(){}));
    }

    public static OAuthCredentialsConfiguration of(Square value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Square>(){}));
    }

    public static OAuthCredentialsConfiguration of(Strava value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Strava>(){}));
    }

    public static OAuthCredentialsConfiguration of(Surveymonkey value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Surveymonkey>(){}));
    }

    public static OAuthCredentialsConfiguration of(TiktokMarketing value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TiktokMarketing>(){}));
    }

    public static OAuthCredentialsConfiguration of(java.lang.Object value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Object>(){}));
    }

    public static OAuthCredentialsConfiguration of(Typeform value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Typeform>(){}));
    }

    public static OAuthCredentialsConfiguration of(YoutubeAnalytics value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<YoutubeAnalytics>(){}));
    }

    public static OAuthCredentialsConfiguration of(ZendeskChat value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ZendeskChat>(){}));
    }

    public static OAuthCredentialsConfiguration of(ZendeskSunshine value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ZendeskSunshine>(){}));
    }

    public static OAuthCredentialsConfiguration of(ZendeskSupport value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ZendeskSupport>(){}));
    }

    public static OAuthCredentialsConfiguration of(ZendeskTalk value) {
        Utils.checkNotNull(value, "value");
        return new OAuthCredentialsConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ZendeskTalk>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code Airtable}</li>
     * <li>{@code AmazonAds}</li>
     * <li>{@code AmazonSellerPartner}</li>
     * <li>{@code Asana}</li>
     * <li>{@code BingAds}</li>
     * <li>{@code FacebookMarketing}</li>
     * <li>{@code Github}</li>
     * <li>{@code Gitlab}</li>
     * <li>{@code GoogleAds}</li>
     * <li>{@code GoogleAnalyticsDataApi}</li>
     * <li>{@code GoogleDrive}</li>
     * <li>{@code GoogleSearchConsole}</li>
     * <li>{@code GoogleSheets}</li>
     * <li>{@code Harvest}</li>
     * <li>{@code Hubspot}</li>
     * <li>{@code Instagram}</li>
     * <li>{@code Intercom}</li>
     * <li>{@code LeverHiring}</li>
     * <li>{@code LinkedinAds}</li>
     * <li>{@code Mailchimp}</li>
     * <li>{@code MicrosoftOnedrive}</li>
     * <li>{@code MicrosoftSharepoint}</li>
     * <li>{@code MicrosoftTeams}</li>
     * <li>{@code Monday}</li>
     * <li>{@code Notion}</li>
     * <li>{@code Pinterest}</li>
     * <li>{@code Retently}</li>
     * <li>{@code Salesforce}</li>
     * <li>{@code Shopify}</li>
     * <li>{@code Slack}</li>
     * <li>{@code Smartsheets}</li>
     * <li>{@code SnapchatMarketing}</li>
     * <li>{@code Snowflake}</li>
     * <li>{@code Square}</li>
     * <li>{@code Strava}</li>
     * <li>{@code Surveymonkey}</li>
     * <li>{@code TiktokMarketing}</li>
     * <li>{@code java.lang.Object}</li>
     * <li>{@code Typeform}</li>
     * <li>{@code YoutubeAnalytics}</li>
     * <li>{@code ZendeskChat}</li>
     * <li>{@code ZendeskSunshine}</li>
     * <li>{@code ZendeskSupport}</li>
     * <li>{@code ZendeskTalk}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OAuthCredentialsConfiguration other = (OAuthCredentialsConfiguration) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<OAuthCredentialsConfiguration> {

        public _Deserializer() {
            super(OAuthCredentialsConfiguration.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<Airtable>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<AmazonAds>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<AmazonSellerPartner>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Asana>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<BingAds>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<FacebookMarketing>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Github>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Gitlab>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<GoogleAds>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<GoogleAnalyticsDataApi>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<GoogleDrive>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<GoogleSearchConsole>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<GoogleSheets>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Harvest>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Hubspot>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Instagram>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Intercom>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<LeverHiring>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<LinkedinAds>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Mailchimp>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<MicrosoftOnedrive>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<MicrosoftSharepoint>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<MicrosoftTeams>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Monday>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Notion>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Pinterest>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Retently>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Salesforce>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Shopify>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Slack>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Smartsheets>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SnapchatMarketing>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Snowflake>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Square>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Strava>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Surveymonkey>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<TiktokMarketing>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<java.lang.Object>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Typeform>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<YoutubeAnalytics>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<ZendeskChat>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<ZendeskSunshine>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<ZendeskSupport>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<ZendeskTalk>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(OAuthCredentialsConfiguration.class,
                "value", value);
    }
 
}