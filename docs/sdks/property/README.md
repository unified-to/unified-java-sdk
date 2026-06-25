# Property

## Overview

### Available Operations

* [createAnalyticsProperty2](#createanalyticsproperty2) - Create a property
* [getAnalyticsProperty2](#getanalyticsproperty2) - Retrieve a property
* [listAnalyticsProperties2](#listanalyticsproperties2) - List all properties
* [patchAnalyticsProperty2](#patchanalyticsproperty2) - Update a property
* [removeAnalyticsProperty2](#removeanalyticsproperty2) - Remove a property
* [updateAnalyticsProperty2](#updateanalyticsproperty2) - Update a property

## createAnalyticsProperty2

Create a property

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsProperty2" method="post" path="/analytics/{connection_id}/property" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsProperty2Request req = CreateAnalyticsProperty2Request.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsProperty2Response res = sdk.property().createAnalyticsProperty2()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAnalyticsProperty2Request](../../models/operations/CreateAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAnalyticsProperty2Response](../../models/operations/CreateAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsProperty2

Retrieve a property

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsProperty2" method="get" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsProperty2Request req = GetAnalyticsProperty2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsProperty2Response res = sdk.property().getAnalyticsProperty2()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAnalyticsProperty2Request](../../models/operations/GetAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAnalyticsProperty2Response](../../models/operations/GetAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsProperties2

List all properties

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsProperties2" method="get" path="/analytics/{connection_id}/property" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsProperties2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsProperties2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsProperties2Request req = ListAnalyticsProperties2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsProperties2Response res = sdk.property().listAnalyticsProperties2()
                .request(req)
                .call();

        if (res.analyticsProperties().isPresent()) {
            System.out.println(res.analyticsProperties().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListAnalyticsProperties2Request](../../models/operations/ListAnalyticsProperties2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListAnalyticsProperties2Response](../../models/operations/ListAnalyticsProperties2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAnalyticsProperty2

Update a property

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAnalyticsProperty2" method="patch" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAnalyticsProperty2Request req = PatchAnalyticsProperty2Request.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAnalyticsProperty2Response res = sdk.property().patchAnalyticsProperty2()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAnalyticsProperty2Request](../../models/operations/PatchAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAnalyticsProperty2Response](../../models/operations/PatchAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAnalyticsProperty2

Remove a property

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAnalyticsProperty2" method="delete" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAnalyticsProperty2Request req = RemoveAnalyticsProperty2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAnalyticsProperty2Response res = sdk.property().removeAnalyticsProperty2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAnalyticsProperty2Request](../../models/operations/RemoveAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAnalyticsProperty2Response](../../models/operations/RemoveAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAnalyticsProperty2

Update a property

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAnalyticsProperty2" method="put" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAnalyticsProperty2Request req = UpdateAnalyticsProperty2Request.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAnalyticsProperty2Response res = sdk.property().updateAnalyticsProperty2()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAnalyticsProperty2Request](../../models/operations/UpdateAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAnalyticsProperty2Response](../../models/operations/UpdateAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |