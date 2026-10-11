# Scorecardtemplate

## Overview

### Available Operations

* [getUcScorecardtemplate](#getucscorecardtemplate) - Retrieve a scorecardtemplate
* [listUcScorecardtemplates](#listucscorecardtemplates) - List all scorecardtemplates

## getUcScorecardtemplate

Retrieve a scorecardtemplate

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcScorecardtemplate" method="get" path="/uc/{connection_id}/scorecardtemplate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcScorecardtemplateRequest;
import to.unified.unified_java_sdk.models.operations.GetUcScorecardtemplateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcScorecardtemplateRequest req = GetUcScorecardtemplateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcScorecardtemplateResponse res = sdk.scorecardtemplate().getUcScorecardtemplate()
                .request(req)
                .call();

        if (res.ucScorecardtemplate().isPresent()) {
            System.out.println(res.ucScorecardtemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetUcScorecardtemplateRequest](../../models/operations/GetUcScorecardtemplateRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetUcScorecardtemplateResponse](../../models/operations/GetUcScorecardtemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcScorecardtemplates

List all scorecardtemplates

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcScorecardtemplates" method="get" path="/uc/{connection_id}/scorecardtemplate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcScorecardtemplatesRequest;
import to.unified.unified_java_sdk.models.operations.ListUcScorecardtemplatesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcScorecardtemplatesRequest req = ListUcScorecardtemplatesRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcScorecardtemplatesResponse res = sdk.scorecardtemplate().listUcScorecardtemplates()
                .request(req)
                .call();

        if (res.ucScorecardtemplates().isPresent()) {
            System.out.println(res.ucScorecardtemplates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListUcScorecardtemplatesRequest](../../models/operations/ListUcScorecardtemplatesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListUcScorecardtemplatesResponse](../../models/operations/ListUcScorecardtemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |