# Class

## Overview

### Available Operations

* [createLmsClass2](#createlmsclass2) - Create a class
* [getLmsClass2](#getlmsclass2) - Retrieve a class
* [listLmsClasses2](#listlmsclasses2) - List all classes
* [patchLmsClass2](#patchlmsclass2) - Update a class
* [removeLmsClass2](#removelmsclass2) - Remove a class
* [updateLmsClass2](#updatelmsclass2) - Update a class

## createLmsClass2

Create a class

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsClass2" method="post" path="/lms/{connection_id}/class" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.LmsClass;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsClass2Request req = CreateLmsClass2Request.builder()
                .lmsClass(LmsClass.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsClass2Response res = sdk.class_().createLmsClass2()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateLmsClass2Request](../../models/operations/CreateLmsClass2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateLmsClass2Response](../../models/operations/CreateLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsClass2

Retrieve a class

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsClass2" method="get" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsClass2Request req = GetLmsClass2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsClass2Response res = sdk.class_().getLmsClass2()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetLmsClass2Request](../../models/operations/GetLmsClass2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetLmsClass2Response](../../models/operations/GetLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsClasses2

List all classes

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsClasses2" method="get" path="/lms/{connection_id}/class" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsClasses2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsClasses2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsClasses2Request req = ListLmsClasses2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsClasses2Response res = sdk.class_().listLmsClasses2()
                .request(req)
                .call();

        if (res.lmsClasses().isPresent()) {
            System.out.println(res.lmsClasses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsClasses2Request](../../models/operations/ListLmsClasses2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsClasses2Response](../../models/operations/ListLmsClasses2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsClass2

Update a class

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsClass2" method="patch" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.LmsClass;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsClass2Request req = PatchLmsClass2Request.builder()
                .lmsClass(LmsClass.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsClass2Response res = sdk.class_().patchLmsClass2()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchLmsClass2Request](../../models/operations/PatchLmsClass2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchLmsClass2Response](../../models/operations/PatchLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsClass2

Remove a class

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsClass2" method="delete" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsClass2Request req = RemoveLmsClass2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsClass2Response res = sdk.class_().removeLmsClass2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveLmsClass2Request](../../models/operations/RemoveLmsClass2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveLmsClass2Response](../../models/operations/RemoveLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsClass2

Update a class

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsClass2" method="put" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.LmsClass;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsClass2Request req = UpdateLmsClass2Request.builder()
                .lmsClass(LmsClass.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsClass2Response res = sdk.class_().updateLmsClass2()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateLmsClass2Request](../../models/operations/UpdateLmsClass2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateLmsClass2Response](../../models/operations/UpdateLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |