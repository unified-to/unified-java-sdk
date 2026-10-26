# File

## Overview

### Available Operations

* [createStorageFile](#createstoragefile) - Create a file
* [getStorageFile](#getstoragefile) - Retrieve a file
* [listStorageFiles](#liststoragefiles) - List all files
* [patchStorageFile](#patchstoragefile) - Update a file
* [removeStorageFile](#removestoragefile) - Remove a file
* [updateStorageFile](#updatestoragefile) - Update a file

## createStorageFile

Creates a StorageFile. Provide the unified StorageFile fields in the request body; they are mapped to the provider's API. Returns the created StorageFile.

### Example Usage

<!-- UsageSnippet language="java" operationID="createStorageFile" method="post" path="/storage/{connection_id}/file" example="storage_file" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateStorageFileRequest;
import to.unified.unified_java_sdk.models.operations.CreateStorageFileResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateStorageFileRequest req = CreateStorageFileRequest.builder()
                .storageFile(StorageFile.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-12T16:48:23.774Z"))
                    .description("Deprimo crastinus cupiditate debilito cimentarius virgo acidus.")
                    .downloadUrl("https://clueless-laughter.biz")
                    .hash("d9d88dda7bc0acaa8472fdef2307f94a1fc355ce")
                    .id("cb1572d9-7d45-425c-87ab-519bfc7b3b76")
                    .metadata(List.of())
                    .mimeType("application/pdf")
                    .name("softly.pdf")
                    .size(1134456d)
                    .tags(List.of(
                        "suasoria"))
                    .type(StorageFileType.FOLDER)
                    .updatedAt(OffsetDateTime.parse("2023-02-06T21:19:43.388Z"))
                    .version("1")
                    .webUrl("https://faraway-inspection.org")
                    .build())
                .connectionId("<id>")
                .build();

        CreateStorageFileResponse res = sdk.file().createStorageFile()
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
| `request`                                                                       | [CreateStorageFileRequest](../../models/operations/CreateStorageFileRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateStorageFileResponse](../../models/operations/CreateStorageFileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getStorageFile

Retrieves a single StorageFile by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.storageFile().get());
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

Returns a list of StorageFiles. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.storageFiles().get());
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

Updates the StorageFile identified by `id`. Provide the unified StorageFile fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchStorageFile" method="patch" path="/storage/{connection_id}/file/{id}" example="storage_file" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchStorageFileRequest;
import to.unified.unified_java_sdk.models.operations.PatchStorageFileResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchStorageFileRequest req = PatchStorageFileRequest.builder()
                .storageFile(StorageFile.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-12T16:48:23.774Z"))
                    .description("Deprimo crastinus cupiditate debilito cimentarius virgo acidus.")
                    .downloadUrl("https://clueless-laughter.biz")
                    .hash("d9d88dda7bc0acaa8472fdef2307f94a1fc355ce")
                    .id("5464212e-bb3b-4c6b-b2fd-ef1d406869fb")
                    .metadata(List.of())
                    .mimeType("application/pdf")
                    .name("softly.pdf")
                    .size(1134456d)
                    .tags(List.of(
                        "suasoria"))
                    .type(StorageFileType.FOLDER)
                    .updatedAt(OffsetDateTime.parse("2023-02-06T21:19:43.395Z"))
                    .version("1")
                    .webUrl("https://faraway-inspection.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchStorageFileResponse res = sdk.file().patchStorageFile()
                .request(req)
                .call();

        if (res.storageFile().isPresent()) {
            System.out.println(res.storageFile().get());
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

Deletes the StorageFile identified by `id`.

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

Updates the StorageFile identified by `id`. Provide the unified StorageFile fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateStorageFile" method="put" path="/storage/{connection_id}/file/{id}" example="storage_file" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateStorageFileRequest;
import to.unified.unified_java_sdk.models.operations.UpdateStorageFileResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateStorageFileRequest req = UpdateStorageFileRequest.builder()
                .storageFile(StorageFile.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-12T16:48:23.774Z"))
                    .description("Deprimo crastinus cupiditate debilito cimentarius virgo acidus.")
                    .downloadUrl("https://clueless-laughter.biz")
                    .hash("d9d88dda7bc0acaa8472fdef2307f94a1fc355ce")
                    .id("5464212e-bb3b-4c6b-b2fd-ef1d406869fb")
                    .metadata(List.of())
                    .mimeType("application/pdf")
                    .name("softly.pdf")
                    .size(1134456d)
                    .tags(List.of(
                        "suasoria"))
                    .type(StorageFileType.FOLDER)
                    .updatedAt(OffsetDateTime.parse("2023-02-06T21:19:43.395Z"))
                    .version("1")
                    .webUrl("https://faraway-inspection.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateStorageFileResponse res = sdk.file().updateStorageFile()
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
| `request`                                                                       | [UpdateStorageFileRequest](../../models/operations/UpdateStorageFileRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateStorageFileResponse](../../models/operations/UpdateStorageFileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |