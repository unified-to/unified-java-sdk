# Benefit
(*benefit()*)

## Overview

### Available Operations

* [createHrisBenefit](#createhrisbenefit) - Create a benefit
* [getHrisBenefit](#gethrisbenefit) - Retrieve a benefit
* [listHrisBenefits](#listhrisbenefits) - List all benefits
* [patchHrisBenefit](#patchhrisbenefit) - Update a benefit
* [removeHrisBenefit](#removehrisbenefit) - Remove a benefit
* [updateHrisBenefit](#updatehrisbenefit) - Update a benefit

## createHrisBenefit

Create a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisBenefit" method="post" path="/hris/{connection_id}/benefit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.HrisBenefit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisBenefitRequest req = CreateHrisBenefitRequest.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisBenefitResponse res = sdk.benefit().createHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateHrisBenefitRequest](../../models/operations/CreateHrisBenefitRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisBenefitResponse](../../models/operations/CreateHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisBenefit

Retrieve a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisBenefit" method="get" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisBenefitRequest req = GetHrisBenefitRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisBenefitResponse res = sdk.benefit().getHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisBenefitRequest](../../models/operations/GetHrisBenefitRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisBenefitResponse](../../models/operations/GetHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisBenefits

List all benefits

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisBenefits" method="get" path="/hris/{connection_id}/benefit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefitsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefitsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisBenefitsRequest req = ListHrisBenefitsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisBenefitsResponse res = sdk.benefit().listHrisBenefits()
                .request(req)
                .call();

        if (res.hrisBenefits().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisBenefitsRequest](../../models/operations/ListHrisBenefitsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisBenefitsResponse](../../models/operations/ListHrisBenefitsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisBenefit

Update a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisBenefit" method="patch" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.HrisBenefit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisBenefitRequest req = PatchHrisBenefitRequest.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisBenefitResponse res = sdk.benefit().patchHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisBenefitRequest](../../models/operations/PatchHrisBenefitRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisBenefitResponse](../../models/operations/PatchHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisBenefit

Remove a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisBenefit" method="delete" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisBenefitRequest req = RemoveHrisBenefitRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisBenefitResponse res = sdk.benefit().removeHrisBenefit()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisBenefitRequest](../../models/operations/RemoveHrisBenefitRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisBenefitResponse](../../models/operations/RemoveHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisBenefit

Update a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisBenefit" method="put" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.HrisBenefit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisBenefitRequest req = UpdateHrisBenefitRequest.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisBenefitResponse res = sdk.benefit().updateHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateHrisBenefitRequest](../../models/operations/UpdateHrisBenefitRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisBenefitResponse](../../models/operations/UpdateHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |