# Property

## Overview

### Available Operations

* [createAnalyticsProperty](#createanalyticsproperty) - Create a property
* [getAnalyticsProperty](#getanalyticsproperty) - Retrieve a property
* [listAnalyticsProperties](#listanalyticsproperties) - List all properties
* [patchAnalyticsProperty](#patchanalyticsproperty) - Update a property
* [removeAnalyticsProperty](#removeanalyticsproperty) - Remove a property
* [updateAnalyticsProperty](#updateanalyticsproperty) - Update a property

## createAnalyticsProperty

Create a property

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsProperty" method="post" path="/analytics/{connection_id}/property" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsPropertyRequest req = CreateAnalyticsPropertyRequest.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsPropertyResponse res = sdk.property().createAnalyticsProperty()
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
| `request`                                                                                   | [CreateAnalyticsPropertyRequest](../../models/operations/CreateAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAnalyticsPropertyResponse](../../models/operations/CreateAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsProperty

Retrieve a property

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsProperty" method="get" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsPropertyRequest req = GetAnalyticsPropertyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsPropertyResponse res = sdk.property().getAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAnalyticsPropertyRequest](../../models/operations/GetAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAnalyticsPropertyResponse](../../models/operations/GetAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsProperties

List all properties

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsProperties" method="get" path="/analytics/{connection_id}/property" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsPropertiesRequest;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsPropertiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsPropertiesRequest req = ListAnalyticsPropertiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsPropertiesResponse res = sdk.property().listAnalyticsProperties()
                .request(req)
                .call();

        if (res.analyticsProperties().isPresent()) {
            System.out.println(res.analyticsProperties().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAnalyticsPropertiesRequest](../../models/operations/ListAnalyticsPropertiesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAnalyticsPropertiesResponse](../../models/operations/ListAnalyticsPropertiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAnalyticsProperty

Update a property

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAnalyticsProperty" method="patch" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAnalyticsPropertyRequest req = PatchAnalyticsPropertyRequest.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAnalyticsPropertyResponse res = sdk.property().patchAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAnalyticsPropertyRequest](../../models/operations/PatchAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAnalyticsPropertyResponse](../../models/operations/PatchAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAnalyticsProperty

Remove a property

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAnalyticsProperty" method="delete" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAnalyticsPropertyRequest req = RemoveAnalyticsPropertyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAnalyticsPropertyResponse res = sdk.property().removeAnalyticsProperty()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAnalyticsPropertyRequest](../../models/operations/RemoveAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAnalyticsPropertyResponse](../../models/operations/RemoveAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAnalyticsProperty

Update a property

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAnalyticsProperty" method="put" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAnalyticsPropertyRequest req = UpdateAnalyticsPropertyRequest.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAnalyticsPropertyResponse res = sdk.property().updateAnalyticsProperty()
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
| `request`                                                                                   | [UpdateAnalyticsPropertyRequest](../../models/operations/UpdateAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAnalyticsPropertyResponse](../../models/operations/UpdateAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |