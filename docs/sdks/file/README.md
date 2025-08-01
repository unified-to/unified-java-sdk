# File
(*file()*)

## Overview

### Available Operations

* [createStorageFile](#createstoragefile) - Create a file
* [getStorageFile](#getstoragefile) - Retrieve a file
* [listStorageFiles](#liststoragefiles) - List all files
* [patchStorageFile](#patchstoragefile) - Update a file
* [removeStorageFile](#removestoragefile) - Remove a file
* [updateStorageFile](#updatestoragefile) - Update a file

## createStorageFile

Create a file

### Example Usage

<!-- UsageSnippet language="java" operationID="createStorageFile" method="post" path="/storage/{connection_id}/file" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateStorageFileRequest;
import to.unified.unified_java_sdk.models.operations.CreateStorageFileResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.StorageFile;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateStorageFileRequest req = CreateStorageFileRequest.builder()
                .storageFile(StorageFile.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateStorageFileResponse res = sdk.file().createStorageFile()
                .request(req)
                .call();

        if (res.storageFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateStorageFileRequest](../../models/operations/CreateStorageFileRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateStorageFileResponse](../../models/operations/CreateStorageFileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getStorageFile

Retrieve a file

### Example Usage

<!-- UsageSnippet language="java" operationID="getStorageFile" method="get" path="/storage/{connection_id}/file/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetStorageFileRequest;
import to.unified.unified_java_sdk.models.operations.GetStorageFileResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetStorageFileRequest req = GetStorageFileRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetStorageFileResponse res = sdk.file().getStorageFile()
                .request(req)
                .call();

        if (res.storageFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetStorageFileRequest](../../models/operations/GetStorageFileRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetStorageFileResponse](../../models/operations/GetStorageFileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listStorageFiles

List all files

### Example Usage

<!-- UsageSnippet language="java" operationID="listStorageFiles" method="get" path="/storage/{connection_id}/file" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListStorageFilesRequest;
import to.unified.unified_java_sdk.models.operations.ListStorageFilesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListStorageFilesRequest req = ListStorageFilesRequest.builder()
                .connectionId("<id>")
                .build();

        ListStorageFilesResponse res = sdk.file().listStorageFiles()
                .request(req)
                .call();

        if (res.storageFiles().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListStorageFilesRequest](../../models/operations/ListStorageFilesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListStorageFilesResponse](../../models/operations/ListStorageFilesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchStorageFile

Update a file

### Example Usage

<!-- UsageSnippet language="java" operationID="patchStorageFile" method="patch" path="/storage/{connection_id}/file/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchStorageFileRequest;
import to.unified.unified_java_sdk.models.operations.PatchStorageFileResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.StorageFile;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchStorageFileRequest req = PatchStorageFileRequest.builder()
                .storageFile(StorageFile.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchStorageFileResponse res = sdk.file().patchStorageFile()
                .request(req)
                .call();

        if (res.storageFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchStorageFileRequest](../../models/operations/PatchStorageFileRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchStorageFileResponse](../../models/operations/PatchStorageFileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeStorageFile

Remove a file

### Example Usage

<!-- UsageSnippet language="java" operationID="removeStorageFile" method="delete" path="/storage/{connection_id}/file/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveStorageFileRequest;
import to.unified.unified_java_sdk.models.operations.RemoveStorageFileResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveStorageFileRequest req = RemoveStorageFileRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveStorageFileResponse res = sdk.file().removeStorageFile()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveStorageFileRequest](../../models/operations/RemoveStorageFileRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveStorageFileResponse](../../models/operations/RemoveStorageFileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateStorageFile

Update a file

### Example Usage

<!-- UsageSnippet language="java" operationID="updateStorageFile" method="put" path="/storage/{connection_id}/file/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateStorageFileRequest;
import to.unified.unified_java_sdk.models.operations.UpdateStorageFileResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.StorageFile;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateStorageFileRequest req = UpdateStorageFileRequest.builder()
                .storageFile(StorageFile.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateStorageFileResponse res = sdk.file().updateStorageFile()
                .request(req)
                .call();

        if (res.storageFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateStorageFileRequest](../../models/operations/UpdateStorageFileRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateStorageFileResponse](../../models/operations/UpdateStorageFileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |