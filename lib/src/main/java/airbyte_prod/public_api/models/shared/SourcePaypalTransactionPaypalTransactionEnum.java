/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourcePaypalTransactionPaypalTransactionEnum {
    PAYPAL_TRANSACTION("paypal-transaction");

    @JsonValue
    public final String value;

    private SourcePaypalTransactionPaypalTransactionEnum(String value) {
        this.value = value;
    }
}