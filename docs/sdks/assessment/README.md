# Assessment

## Overview

### Available Operations

* [createAssessmentPackage](#createassessmentpackage) - Create an assessment package
* [getAssessmentPackage](#getassessmentpackage) - Get an assessment package
* [listAssessmentPackages](#listassessmentpackages) - List assessment packages
* [patchAssessmentOrder](#patchassessmentorder) - Update an order
* [patchAssessmentPackage](#patchassessmentpackage) - Update an assessment package
* [removeAssessmentPackage](#removeassessmentpackage) - Delete an assessment package
* [updateAssessmentOrder](#updateassessmentorder) - Update an order
* [updateAssessmentPackage](#updateassessmentpackage) - Update an assessment package

## createAssessmentPackage

Create an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="createAssessmentPackage" method="post" path="/assessment/{connection_id}/package" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAssessmentPackageRequest req = CreateAssessmentPackageRequest.builder()
                .assessmentPackage(AssessmentPackage.builder()
                    .id("<id>")
                    .name("<value>")
                    .type(AssessmentPackageType.REFERENCE_CHECK)
                    .build())
                .connectionId("<id>")
                .build();

        CreateAssessmentPackageResponse res = sdk.assessment().createAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAssessmentPackageRequest](../../models/operations/CreateAssessmentPackageRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAssessmentPackageResponse](../../models/operations/CreateAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAssessmentPackage

Get an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="getAssessmentPackage" method="get" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.GetAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAssessmentPackageRequest req = GetAssessmentPackageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAssessmentPackageResponse res = sdk.assessment().getAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAssessmentPackageRequest](../../models/operations/GetAssessmentPackageRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAssessmentPackageResponse](../../models/operations/GetAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAssessmentPackages

List assessment packages

### Example Usage

<!-- UsageSnippet language="java" operationID="listAssessmentPackages" method="get" path="/assessment/{connection_id}/package" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAssessmentPackagesRequest;
import to.unified.unified_java_sdk.models.operations.ListAssessmentPackagesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAssessmentPackagesRequest req = ListAssessmentPackagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAssessmentPackagesResponse res = sdk.assessment().listAssessmentPackages()
                .request(req)
                .call();

        if (res.assessmentPackages().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAssessmentPackagesRequest](../../models/operations/ListAssessmentPackagesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAssessmentPackagesResponse](../../models/operations/ListAssessmentPackagesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAssessmentOrder

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAssessmentOrder" method="patch" path="/assessment/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.AssessmentOrder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAssessmentOrderRequest req = PatchAssessmentOrderRequest.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAssessmentOrderResponse res = sdk.assessment().patchAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAssessmentOrderRequest](../../models/operations/PatchAssessmentOrderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAssessmentOrderResponse](../../models/operations/PatchAssessmentOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAssessmentPackage

Update an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAssessmentPackage" method="patch" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAssessmentPackageRequest req = PatchAssessmentPackageRequest.builder()
                .assessmentPackage(AssessmentPackage.builder()
                    .id("<id>")
                    .name("<value>")
                    .type(AssessmentPackageType.BACKGROUND_CHECK)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAssessmentPackageResponse res = sdk.assessment().patchAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAssessmentPackageRequest](../../models/operations/PatchAssessmentPackageRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAssessmentPackageResponse](../../models/operations/PatchAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAssessmentPackage

Delete an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAssessmentPackage" method="delete" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAssessmentPackageRequest req = RemoveAssessmentPackageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAssessmentPackageResponse res = sdk.assessment().removeAssessmentPackage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAssessmentPackageRequest](../../models/operations/RemoveAssessmentPackageRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAssessmentPackageResponse](../../models/operations/RemoveAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAssessmentOrder

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAssessmentOrder" method="put" path="/assessment/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.AssessmentOrder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAssessmentOrderRequest req = UpdateAssessmentOrderRequest.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAssessmentOrderResponse res = sdk.assessment().updateAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAssessmentOrderRequest](../../models/operations/UpdateAssessmentOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAssessmentOrderResponse](../../models/operations/UpdateAssessmentOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAssessmentPackage

Update an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAssessmentPackage" method="put" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAssessmentPackageRequest req = UpdateAssessmentPackageRequest.builder()
                .assessmentPackage(AssessmentPackage.builder()
                    .id("<id>")
                    .name("<value>")
                    .type(AssessmentPackageType.OTHER)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAssessmentPackageResponse res = sdk.assessment().updateAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAssessmentPackageRequest](../../models/operations/UpdateAssessmentPackageRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAssessmentPackageResponse](../../models/operations/UpdateAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |