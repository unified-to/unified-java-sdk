# Benefit

## Overview

### Available Operations

* [createHrisBenefit2](#createhrisbenefit2) - Create a benefit
* [getHrisBenefit2](#gethrisbenefit2) - Retrieve a benefit
* [listHrisBenefits2](#listhrisbenefits2) - List all benefits
* [patchHrisBenefit2](#patchhrisbenefit2) - Update a benefit
* [removeHrisBenefit2](#removehrisbenefit2) - Remove a benefit
* [updateHrisBenefit2](#updatehrisbenefit2) - Update a benefit

## createHrisBenefit2

Create a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisBenefit2" method="post" path="/hris/{connection_id}/benefit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.HrisBenefit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisBenefit2Request req = CreateHrisBenefit2Request.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisBenefit2Response res = sdk.benefit().createHrisBenefit2()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisBenefit2Request](../../models/operations/CreateHrisBenefit2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisBenefit2Response](../../models/operations/CreateHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisBenefit2

Retrieve a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisBenefit2" method="get" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisBenefit2Request req = GetHrisBenefit2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisBenefit2Response res = sdk.benefit().getHrisBenefit2()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisBenefit2Request](../../models/operations/GetHrisBenefit2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisBenefit2Response](../../models/operations/GetHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisBenefits2

List all benefits

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisBenefits2" method="get" path="/hris/{connection_id}/benefit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefits2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefits2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisBenefits2Request req = ListHrisBenefits2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisBenefits2Response res = sdk.benefit().listHrisBenefits2()
                .request(req)
                .call();

        if (res.hrisBenefits().isPresent()) {
            System.out.println(res.hrisBenefits().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisBenefits2Request](../../models/operations/ListHrisBenefits2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisBenefits2Response](../../models/operations/ListHrisBenefits2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisBenefit2

Update a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisBenefit2" method="patch" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.HrisBenefit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisBenefit2Request req = PatchHrisBenefit2Request.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisBenefit2Response res = sdk.benefit().patchHrisBenefit2()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisBenefit2Request](../../models/operations/PatchHrisBenefit2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisBenefit2Response](../../models/operations/PatchHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisBenefit2

Remove a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisBenefit2" method="delete" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisBenefit2Request req = RemoveHrisBenefit2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisBenefit2Response res = sdk.benefit().removeHrisBenefit2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisBenefit2Request](../../models/operations/RemoveHrisBenefit2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisBenefit2Response](../../models/operations/RemoveHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisBenefit2

Update a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisBenefit2" method="put" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.HrisBenefit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisBenefit2Request req = UpdateHrisBenefit2Request.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisBenefit2Response res = sdk.benefit().updateHrisBenefit2()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisBenefit2Request](../../models/operations/UpdateHrisBenefit2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisBenefit2Response](../../models/operations/UpdateHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |