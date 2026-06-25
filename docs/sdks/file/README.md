# File

## Overview

### Available Operations

* [createStorageFile2](#createstoragefile2) - Create a file
* [getStorageFile2](#getstoragefile2) - Retrieve a file
* [listStorageFiles2](#liststoragefiles2) - List all files
* [patchStorageFile2](#patchstoragefile2) - Update a file
* [removeStorageFile2](#removestoragefile2) - Remove a file
* [updateStorageFile2](#updatestoragefile2) - Update a file

## createStorageFile2

Create a file

### Example Usage

<!-- UsageSnippet language="java" operationID="createStorageFile2" method="post" path="/storage/{connection_id}/file" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateStorageFile2Request;
import to.unified.unified_java_sdk.models.operations.CreateStorageFile2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.StorageFile;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateStorageFile2Request req = CreateStorageFile2Request.builder()
                .storageFile(StorageFile.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateStorageFile2Response res = sdk.file().createStorageFile2()
                .request(req)
                .call();

        if (res.storageFile().isPresent()) {
            System.out.println(res.storageFile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateStorageFile2Request](../../models/operations/CreateStorageFile2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateStorageFile2Response](../../models/operations/CreateStorageFile2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getStorageFile2

Retrieve a file

### Example Usage

<!-- UsageSnippet language="java" operationID="getStorageFile2" method="get" path="/storage/{connection_id}/file/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetStorageFile2Request;
import to.unified.unified_java_sdk.models.operations.GetStorageFile2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetStorageFile2Request req = GetStorageFile2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetStorageFile2Response res = sdk.file().getStorageFile2()
                .request(req)
                .call();

        if (res.storageFile().isPresent()) {
            System.out.println(res.storageFile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetStorageFile2Request](../../models/operations/GetStorageFile2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetStorageFile2Response](../../models/operations/GetStorageFile2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listStorageFiles2

List all files

### Example Usage

<!-- UsageSnippet language="java" operationID="listStorageFiles2" method="get" path="/storage/{connection_id}/file" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListStorageFiles2Request;
import to.unified.unified_java_sdk.models.operations.ListStorageFiles2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListStorageFiles2Request req = ListStorageFiles2Request.builder()
                .connectionId("<id>")
                .build();

        ListStorageFiles2Response res = sdk.file().listStorageFiles2()
                .request(req)
                .call();

        if (res.storageFiles().isPresent()) {
            System.out.println(res.storageFiles().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListStorageFiles2Request](../../models/operations/ListStorageFiles2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListStorageFiles2Response](../../models/operations/ListStorageFiles2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchStorageFile2

Update a file

### Example Usage

<!-- UsageSnippet language="java" operationID="patchStorageFile2" method="patch" path="/storage/{connection_id}/file/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchStorageFile2Request;
import to.unified.unified_java_sdk.models.operations.PatchStorageFile2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.StorageFile;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchStorageFile2Request req = PatchStorageFile2Request.builder()
                .storageFile(StorageFile.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchStorageFile2Response res = sdk.file().patchStorageFile2()
                .request(req)
                .call();

        if (res.storageFile().isPresent()) {
            System.out.println(res.storageFile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchStorageFile2Request](../../models/operations/PatchStorageFile2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchStorageFile2Response](../../models/operations/PatchStorageFile2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeStorageFile2

Remove a file

### Example Usage

<!-- UsageSnippet language="java" operationID="removeStorageFile2" method="delete" path="/storage/{connection_id}/file/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveStorageFile2Request;
import to.unified.unified_java_sdk.models.operations.RemoveStorageFile2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveStorageFile2Request req = RemoveStorageFile2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveStorageFile2Response res = sdk.file().removeStorageFile2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveStorageFile2Request](../../models/operations/RemoveStorageFile2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveStorageFile2Response](../../models/operations/RemoveStorageFile2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateStorageFile2

Update a file

### Example Usage

<!-- UsageSnippet language="java" operationID="updateStorageFile2" method="put" path="/storage/{connection_id}/file/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateStorageFile2Request;
import to.unified.unified_java_sdk.models.operations.UpdateStorageFile2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.StorageFile;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateStorageFile2Request req = UpdateStorageFile2Request.builder()
                .storageFile(StorageFile.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateStorageFile2Response res = sdk.file().updateStorageFile2()
                .request(req)
                .call();

        if (res.storageFile().isPresent()) {
            System.out.println(res.storageFile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateStorageFile2Request](../../models/operations/UpdateStorageFile2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateStorageFile2Response](../../models/operations/UpdateStorageFile2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |