# Allergy

## Overview

### Available Operations

* [getHealthcareAllergy](#gethealthcareallergy) - Retrieve an allergy
* [listHealthcareAllergies](#listhealthcareallergies) - List all allergies

## getHealthcareAllergy

Retrieves a single HealthcareAllergy by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareAllergy" method="get" path="/healthcare/{connection_id}/allergy/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareAllergyRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareAllergyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareAllergyRequest req = GetHealthcareAllergyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareAllergyResponse res = sdk.allergy().getHealthcareAllergy()
                .request(req)
                .call();

        if (res.healthcareAllergy().isPresent()) {
            System.out.println(res.healthcareAllergy().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetHealthcareAllergyRequest](../../models/operations/GetHealthcareAllergyRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetHealthcareAllergyResponse](../../models/operations/GetHealthcareAllergyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareAllergies

Returns a list of HealthcareAllergies. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareAllergies" method="get" path="/healthcare/{connection_id}/allergy" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareAllergiesRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareAllergiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareAllergiesRequest req = ListHealthcareAllergiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareAllergiesResponse res = sdk.allergy().listHealthcareAllergies()
                .request(req)
                .call();

        if (res.healthcareAllergies().isPresent()) {
            System.out.println(res.healthcareAllergies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHealthcareAllergiesRequest](../../models/operations/ListHealthcareAllergiesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHealthcareAllergiesResponse](../../models/operations/ListHealthcareAllergiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |