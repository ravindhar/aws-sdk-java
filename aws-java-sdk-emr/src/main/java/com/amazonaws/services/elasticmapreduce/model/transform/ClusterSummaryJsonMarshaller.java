/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ClusterSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterSummaryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ClusterSummary clusterSummary, StructuredJsonGenerator jsonGenerator) {

        if (clusterSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (clusterSummary.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(clusterSummary.getId());
            }
            if (clusterSummary.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(clusterSummary.getName());
            }
            if (clusterSummary.getStatus() != null) {
                jsonGenerator.writeFieldName("Status");
                ClusterStatusJsonMarshaller.getInstance().marshall(clusterSummary.getStatus(), jsonGenerator);
            }
            if (clusterSummary.getNormalizedInstanceHours() != null) {
                jsonGenerator.writeFieldName("NormalizedInstanceHours").writeValue(clusterSummary.getNormalizedInstanceHours());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ClusterSummaryJsonMarshaller instance;

    public static ClusterSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterSummaryJsonMarshaller();
        return instance;
    }

}
