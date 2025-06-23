# Enrich
(*enrich()*)

## Overview

### Available Operations

* [listEnrichCompanies](#listenrichcompanies) - Retrieve enrichment information for a company
* [listEnrichPeople](#listenrichpeople) - Retrieve enrichment information for a person

## listEnrichCompanies

Retrieve enrichment information for a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListEnrichCompaniesRequest;
import to.unified.unifiedto.models.operations.ListEnrichCompaniesResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListEnrichCompaniesRequest req = ListEnrichCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListEnrichCompaniesResponse res = sdk.enrich().listEnrichCompanies()
                .request(req)
                .call();

        if (res.enrichCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListEnrichCompaniesRequest](../../models/operations/ListEnrichCompaniesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListEnrichCompaniesResponse](../../models/operations/ListEnrichCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEnrichPeople

Retrieve enrichment information for a person

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListEnrichPeopleRequest;
import to.unified.unifiedto.models.operations.ListEnrichPeopleResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListEnrichPeopleRequest req = ListEnrichPeopleRequest.builder()
                .connectionId("<id>")
                .build();

        ListEnrichPeopleResponse res = sdk.enrich().listEnrichPeople()
                .request(req)
                .call();

        if (res.enrichPerson().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListEnrichPeopleRequest](../../models/operations/ListEnrichPeopleRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListEnrichPeopleResponse](../../models/operations/ListEnrichPeopleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |