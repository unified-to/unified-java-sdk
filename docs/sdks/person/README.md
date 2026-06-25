# Person

## Overview

### Available Operations

* [listEnrichPeople2](#listenrichpeople2) - Retrieve enrichment information for a person

## listEnrichPeople2

Retrieve enrichment information for a person

### Example Usage

<!-- UsageSnippet language="java" operationID="listEnrichPeople2" method="get" path="/enrich/{connection_id}/person" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListEnrichPeople2Request;
import to.unified.unified_java_sdk.models.operations.ListEnrichPeople2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListEnrichPeople2Request req = ListEnrichPeople2Request.builder()
                .connectionId("<id>")
                .build();

        ListEnrichPeople2Response res = sdk.person().listEnrichPeople2()
                .request(req)
                .call();

        if (res.enrichPerson().isPresent()) {
            System.out.println(res.enrichPerson().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListEnrichPeople2Request](../../models/operations/ListEnrichPeople2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListEnrichPeople2Response](../../models/operations/ListEnrichPeople2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |