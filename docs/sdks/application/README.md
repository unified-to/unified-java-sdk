# Application

## Overview

### Available Operations

* [createAtsApplication2](#createatsapplication2) - Create an application
* [getAtsApplication2](#getatsapplication2) - Retrieve an application
* [listAtsApplications2](#listatsapplications2) - List all applications
* [patchAtsApplication2](#patchatsapplication2) - Update an application
* [removeAtsApplication2](#removeatsapplication2) - Remove an application
* [updateAtsApplication2](#updateatsapplication2) - Update an application

## createAtsApplication2

Create an application

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsApplication2" method="post" path="/ats/{connection_id}/application" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.AtsApplication;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsApplication2Request req = CreateAtsApplication2Request.builder()
                .atsApplication(AtsApplication.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsApplication2Response res = sdk.application().createAtsApplication2()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAtsApplication2Request](../../models/operations/CreateAtsApplication2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAtsApplication2Response](../../models/operations/CreateAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsApplication2

Retrieve an application

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsApplication2" method="get" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsApplication2Request req = GetAtsApplication2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsApplication2Response res = sdk.application().getAtsApplication2()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAtsApplication2Request](../../models/operations/GetAtsApplication2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAtsApplication2Response](../../models/operations/GetAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsApplications2

List all applications

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsApplications2" method="get" path="/ats/{connection_id}/application" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsApplications2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsApplications2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsApplications2Request req = ListAtsApplications2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsApplications2Response res = sdk.application().listAtsApplications2()
                .request(req)
                .call();

        if (res.atsApplications().isPresent()) {
            System.out.println(res.atsApplications().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAtsApplications2Request](../../models/operations/ListAtsApplications2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAtsApplications2Response](../../models/operations/ListAtsApplications2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsApplication2

Update an application

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsApplication2" method="patch" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.AtsApplication;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsApplication2Request req = PatchAtsApplication2Request.builder()
                .atsApplication(AtsApplication.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsApplication2Response res = sdk.application().patchAtsApplication2()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAtsApplication2Request](../../models/operations/PatchAtsApplication2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAtsApplication2Response](../../models/operations/PatchAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsApplication2

Remove an application

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsApplication2" method="delete" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsApplication2Request req = RemoveAtsApplication2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsApplication2Response res = sdk.application().removeAtsApplication2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAtsApplication2Request](../../models/operations/RemoveAtsApplication2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAtsApplication2Response](../../models/operations/RemoveAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsApplication2

Update an application

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsApplication2" method="put" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.AtsApplication;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsApplication2Request req = UpdateAtsApplication2Request.builder()
                .atsApplication(AtsApplication.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsApplication2Response res = sdk.application().updateAtsApplication2()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAtsApplication2Request](../../models/operations/UpdateAtsApplication2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAtsApplication2Response](../../models/operations/UpdateAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |