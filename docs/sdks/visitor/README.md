# Visitor

## Overview

### Available Operations

* [createAnalyticsVisitor2](#createanalyticsvisitor2) - Create a visitor
* [getAnalyticsVisitor2](#getanalyticsvisitor2) - Retrieve a visitor
* [listAnalyticsVisitors2](#listanalyticsvisitors2) - List all visitors
* [patchAnalyticsVisitor2](#patchanalyticsvisitor2) - Update a visitor
* [removeAnalyticsVisitor2](#removeanalyticsvisitor2) - Remove a visitor
* [updateAnalyticsVisitor2](#updateanalyticsvisitor2) - Update a visitor

## createAnalyticsVisitor2

Create a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsVisitor2" method="post" path="/analytics/{connection_id}/visitor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsVisitor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsVisitor2Request req = CreateAnalyticsVisitor2Request.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsVisitor2Response res = sdk.visitor().createAnalyticsVisitor2()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAnalyticsVisitor2Request](../../models/operations/CreateAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAnalyticsVisitor2Response](../../models/operations/CreateAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsVisitor2

Retrieve a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsVisitor2" method="get" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsVisitor2Request req = GetAnalyticsVisitor2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsVisitor2Response res = sdk.visitor().getAnalyticsVisitor2()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAnalyticsVisitor2Request](../../models/operations/GetAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAnalyticsVisitor2Response](../../models/operations/GetAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsVisitors2

List all visitors

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsVisitors2" method="get" path="/analytics/{connection_id}/visitor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsVisitors2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsVisitors2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsVisitors2Request req = ListAnalyticsVisitors2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsVisitors2Response res = sdk.visitor().listAnalyticsVisitors2()
                .request(req)
                .call();

        if (res.analyticsVisitors().isPresent()) {
            System.out.println(res.analyticsVisitors().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAnalyticsVisitors2Request](../../models/operations/ListAnalyticsVisitors2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAnalyticsVisitors2Response](../../models/operations/ListAnalyticsVisitors2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAnalyticsVisitor2

Update a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAnalyticsVisitor2" method="patch" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsVisitor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAnalyticsVisitor2Request req = PatchAnalyticsVisitor2Request.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAnalyticsVisitor2Response res = sdk.visitor().patchAnalyticsVisitor2()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAnalyticsVisitor2Request](../../models/operations/PatchAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAnalyticsVisitor2Response](../../models/operations/PatchAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAnalyticsVisitor2

Remove a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAnalyticsVisitor2" method="delete" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAnalyticsVisitor2Request req = RemoveAnalyticsVisitor2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAnalyticsVisitor2Response res = sdk.visitor().removeAnalyticsVisitor2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAnalyticsVisitor2Request](../../models/operations/RemoveAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAnalyticsVisitor2Response](../../models/operations/RemoveAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAnalyticsVisitor2

Update a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAnalyticsVisitor2" method="put" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsVisitor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAnalyticsVisitor2Request req = UpdateAnalyticsVisitor2Request.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAnalyticsVisitor2Response res = sdk.visitor().updateAnalyticsVisitor2()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAnalyticsVisitor2Request](../../models/operations/UpdateAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAnalyticsVisitor2Response](../../models/operations/UpdateAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |