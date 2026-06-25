# Scorecard

## Overview

### Available Operations

* [createAtsScorecard2](#createatsscorecard2) - Create a scorecard
* [getAtsScorecard2](#getatsscorecard2) - Retrieve a scorecard
* [listAtsScorecards2](#listatsscorecards2) - List all scorecards
* [patchAtsScorecard2](#patchatsscorecard2) - Update a scorecard
* [removeAtsScorecard2](#removeatsscorecard2) - Remove a scorecard
* [updateAtsScorecard2](#updateatsscorecard2) - Update a scorecard

## createAtsScorecard2

Create a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsScorecard2" method="post" path="/ats/{connection_id}/scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsScorecard2Request req = CreateAtsScorecard2Request.builder()
                .atsScorecard(AtsScorecard.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsScorecard2Response res = sdk.scorecard().createAtsScorecard2()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateAtsScorecard2Request](../../models/operations/CreateAtsScorecard2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateAtsScorecard2Response](../../models/operations/CreateAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsScorecard2

Retrieve a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsScorecard2" method="get" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsScorecard2Request req = GetAtsScorecard2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsScorecard2Response res = sdk.scorecard().getAtsScorecard2()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetAtsScorecard2Request](../../models/operations/GetAtsScorecard2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetAtsScorecard2Response](../../models/operations/GetAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsScorecards2

List all scorecards

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsScorecards2" method="get" path="/ats/{connection_id}/scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsScorecards2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsScorecards2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsScorecards2Request req = ListAtsScorecards2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsScorecards2Response res = sdk.scorecard().listAtsScorecards2()
                .request(req)
                .call();

        if (res.atsScorecards().isPresent()) {
            System.out.println(res.atsScorecards().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListAtsScorecards2Request](../../models/operations/ListAtsScorecards2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListAtsScorecards2Response](../../models/operations/ListAtsScorecards2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsScorecard2

Update a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsScorecard2" method="patch" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsScorecard2Request req = PatchAtsScorecard2Request.builder()
                .atsScorecard(AtsScorecard.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsScorecard2Response res = sdk.scorecard().patchAtsScorecard2()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchAtsScorecard2Request](../../models/operations/PatchAtsScorecard2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchAtsScorecard2Response](../../models/operations/PatchAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsScorecard2

Remove a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsScorecard2" method="delete" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsScorecard2Request req = RemoveAtsScorecard2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsScorecard2Response res = sdk.scorecard().removeAtsScorecard2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveAtsScorecard2Request](../../models/operations/RemoveAtsScorecard2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveAtsScorecard2Response](../../models/operations/RemoveAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsScorecard2

Update a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsScorecard2" method="put" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsScorecard2Request req = UpdateAtsScorecard2Request.builder()
                .atsScorecard(AtsScorecard.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsScorecard2Response res = sdk.scorecard().updateAtsScorecard2()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateAtsScorecard2Request](../../models/operations/UpdateAtsScorecard2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateAtsScorecard2Response](../../models/operations/UpdateAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |