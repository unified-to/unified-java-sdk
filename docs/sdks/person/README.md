# Person

## Overview

### Available Operations

* [getUnifiedPerson](#getunifiedperson) - Retrieve a person by ID
* [listEnrichPeople](#listenrichpeople) - Retrieve enrichment information for a person
* [listUnifiedPeople](#listunifiedpeople) - Search for persons by email addresses
* [removeUnifiedPerson](#removeunifiedperson) - Erase email addresses from the unified persons

## getUnifiedPerson

Retrieve a person by ID

### Example Usage

<!-- UsageSnippet language="java" operationID="getUnifiedPerson" method="get" path="/unified/person/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedPersonRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedPersonResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedPersonRequest req = GetUnifiedPersonRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedPersonResponse res = sdk.person().getUnifiedPerson()
                .request(req)
                .call();

        if (res.person().isPresent()) {
            System.out.println(res.person().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetUnifiedPersonRequest](../../models/operations/GetUnifiedPersonRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetUnifiedPersonResponse](../../models/operations/GetUnifiedPersonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEnrichPeople

Retrieve enrichment information for a person

### Example Usage

<!-- UsageSnippet language="java" operationID="listEnrichPeople" method="get" path="/enrich/{connection_id}/person" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListEnrichPeopleRequest;
import to.unified.unified_java_sdk.models.operations.ListEnrichPeopleResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListEnrichPeopleRequest req = ListEnrichPeopleRequest.builder()
                .connectionId("<id>")
                .build();

        ListEnrichPeopleResponse res = sdk.person().listEnrichPeople()
                .request(req)
                .call();

        if (res.enrichPerson().isPresent()) {
            System.out.println(res.enrichPerson().get());
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

## listUnifiedPeople

Search for persons by email addresses

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedPeople" method="get" path="/unified/person" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedPeopleRequest;
import to.unified.unified_java_sdk.models.operations.ListUnifiedPeopleResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedPeopleRequest req = ListUnifiedPeopleRequest.builder()
                .query("<value>")
                .build();

        ListUnifiedPeopleResponse res = sdk.person().listUnifiedPeople()
                .request(req)
                .call();

        if (res.people().isPresent()) {
            System.out.println(res.people().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListUnifiedPeopleRequest](../../models/operations/ListUnifiedPeopleRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListUnifiedPeopleResponse](../../models/operations/ListUnifiedPeopleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUnifiedPerson

Erase email addresses from the unified persons

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUnifiedPerson" method="delete" path="/unified/person" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedPersonRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedPersonResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUnifiedPersonRequest req = RemoveUnifiedPersonRequest.builder()
                .query("<value>")
                .build();

        RemoveUnifiedPersonResponse res = sdk.person().removeUnifiedPerson()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveUnifiedPersonRequest](../../models/operations/RemoveUnifiedPersonRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveUnifiedPersonResponse](../../models/operations/RemoveUnifiedPersonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |