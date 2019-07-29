/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.nequi.subscriptions.client;

import com.google.gson.JsonObject;


@com.amazonaws.mobileconnectors.apigateway.annotation.Service(endpoint = "https://api.nequi.com/subscriptions/v1")
public interface NequiSubscriptionsGatewayClient {
    
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/-services-subscriptionpaymentservice-automaticpayment", method = "POST")
    JsonObject servicesSubscriptionpaymentserviceAutomaticpaymentPost(JsonObject body);    
  
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/-services-subscriptionpaymentservice-getsubscription", method = "POST")
    JsonObject servicesSubscriptionpaymentserviceGetsubscriptionPost(JsonObject body);
    
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/-services-subscriptionpaymentservice-newsubscription", method = "POST")
    JsonObject servicesSubscriptionpaymentserviceNewsubscriptionPost(JsonObject body);
    
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/-services-subscriptionpaymentservice-getstatuspayment", method = "POST")
    JsonObject servicesSubscriptionpaymentserviceGetstatuspaymentPost(JsonObject body);

    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/-services-reverseservices-reversetransaction", method = "POST")
    JsonObject servicesReverseservicesReversetransactionPost(JsonObject body);
    
}
