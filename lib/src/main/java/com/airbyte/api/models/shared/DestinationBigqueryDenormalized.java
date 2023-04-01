/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationBigqueryDenormalized - The values required to configure the destination.
 */
public class DestinationBigqueryDenormalized {
    @JsonProperty("airbyte-destination-name")
    public DestinationBigqueryDenormalizedBigqueryDenormalizedEnum airbyteDestinationName;
    public DestinationBigqueryDenormalized withAirbyteDestinationName(DestinationBigqueryDenormalizedBigqueryDenormalizedEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * Google BigQuery client's chunk (buffer) size (MIN=1, MAX = 15) for each table. The size that will be written by a single RPC. Written data will be buffered and only flushed upon reaching this size or closing the channel. The default 15MB value is used if not set explicitly. Read more &lt;a href="https://googleapis.dev/python/bigquery/latest/generated/google.cloud.bigquery.client.Client.html"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("big_query_client_buffer_size_mb")
    public Long bigQueryClientBufferSizeMb;
    public DestinationBigqueryDenormalized withBigQueryClientBufferSizeMb(Long bigQueryClientBufferSizeMb) {
        this.bigQueryClientBufferSizeMb = bigQueryClientBufferSizeMb;
        return this;
    }
    
    /**
     * The contents of the JSON service account key. Check out the &lt;a href="https://docs.airbyte.com/integrations/destinations/bigquery#service-account-key"&gt;docs&lt;/a&gt; if you need help generating this key. Default credentials will be used if this field is left empty.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials_json")
    public String credentialsJson;
    public DestinationBigqueryDenormalized withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    /**
     * The default BigQuery Dataset ID that tables are replicated to if the source does not specify a namespace. Read more &lt;a href="https://cloud.google.com/bigquery/docs/datasets#create-dataset"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("dataset_id")
    public String datasetId;
    public DestinationBigqueryDenormalized withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    /**
     * The location of the dataset. Warning: Changes made after creation will not be applied. The default "US" value is used if not set explicitly. Read more &lt;a href="https://cloud.google.com/bigquery/docs/locations"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataset_location")
    public DestinationBigqueryDenormalizedDatasetLocationEnum datasetLocation;
    public DestinationBigqueryDenormalized withDatasetLocation(DestinationBigqueryDenormalizedDatasetLocationEnum datasetLocation) {
        this.datasetLocation = datasetLocation;
        return this;
    }
    
    /**
     * Loading method used to send select the way data will be uploaded to BigQuery. &lt;br/&gt;&lt;b&gt;Standard Inserts&lt;/b&gt; - Direct uploading using SQL INSERT statements. This method is extremely inefficient and provided only for quick testing. In almost all cases, you should use staging. &lt;br/&gt;&lt;b&gt;GCS Staging&lt;/b&gt; - Writes large batches of records to a file, uploads the file to GCS, then uses &lt;b&gt;COPY INTO table&lt;/b&gt; to upload the file. Recommended for most workloads for better speed and scalability. Read more about GCS Staging &lt;a href="https://docs.airbyte.com/integrations/destinations/bigquery#gcs-staging"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("loading_method")
    public Object loadingMethod;
    public DestinationBigqueryDenormalized withLoadingMethod(Object loadingMethod) {
        this.loadingMethod = loadingMethod;
        return this;
    }
    
    /**
     * The GCP project ID for the project containing the target BigQuery dataset. Read more &lt;a href="https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("project_id")
    public String projectId;
    public DestinationBigqueryDenormalized withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
