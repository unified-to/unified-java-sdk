# Scorecard

## Overview

### Available Operations

* [createAtsScorecard](#createatsscorecard) - Create a scorecard
* [getAtsScorecard](#getatsscorecard) - Retrieve a scorecard
* [listAtsScorecards](#listatsscorecards) - List all scorecards
* [patchAtsScorecard](#patchatsscorecard) - Update a scorecard
* [removeAtsScorecard](#removeatsscorecard) - Remove a scorecard
* [updateAtsScorecard](#updateatsscorecard) - Update a scorecard

## createAtsScorecard

Create a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsScorecard" method="post" path="/ats/{connection_id}/scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsScorecardRequest req = CreateAtsScorecardRequest.builder()
                .atsScorecard(AtsScorecard.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsScorecardResponse res = sdk.scorecard().createAtsScorecard()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAtsScorecardRequest](../../models/operations/CreateAtsScorecardRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAtsScorecardResponse](../../models/operations/CreateAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsScorecard

Retrieve a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsScorecard" method="get" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsScorecardRequest req = GetAtsScorecardRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsScorecardResponse res = sdk.scorecard().getAtsScorecard()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAtsScorecardRequest](../../models/operations/GetAtsScorecardRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAtsScorecardResponse](../../models/operations/GetAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsScorecards

List all scorecards

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsScorecards" method="get" path="/ats/{connection_id}/scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsScorecardsRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsScorecardsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsScorecardsRequest req = ListAtsScorecardsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsScorecardsResponse res = sdk.scorecard().listAtsScorecards()
                .request(req)
                .call();

        if (res.atsScorecards().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsScorecardsRequest](../../models/operations/ListAtsScorecardsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsScorecardsResponse](../../models/operations/ListAtsScorecardsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsScorecard

Update a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsScorecard" method="patch" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsScorecardRequest req = PatchAtsScorecardRequest.builder()
                .atsScorecard(AtsScorecard.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsScorecardResponse res = sdk.scorecard().patchAtsScorecard()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchAtsScorecardRequest](../../models/operations/PatchAtsScorecardRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAtsScorecardResponse](../../models/operations/PatchAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsScorecard

Remove a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsScorecard" method="delete" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsScorecardRequest req = RemoveAtsScorecardRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsScorecardResponse res = sdk.scorecard().removeAtsScorecard()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAtsScorecardRequest](../../models/operations/RemoveAtsScorecardRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAtsScorecardResponse](../../models/operations/RemoveAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsScorecard

Update a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsScorecard" method="put" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsScorecardRequest req = UpdateAtsScorecardRequest.builder()
                .atsScorecard(AtsScorecard.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsScorecardResponse res = sdk.scorecard().updateAtsScorecard()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAtsScorecardRequest](../../models/operations/UpdateAtsScorecardRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAtsScorecardResponse](../../models/operations/UpdateAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |