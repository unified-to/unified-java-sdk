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

Create a file

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
                    .data("data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZlcnNpb249IjEuMSIgYmFzZVByb2ZpbGU9ImZ1bGwiIHdpZHRoPSI4MzIiIGhlaWdodD0iMTg2MSI+PHJlY3Qgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgZmlsbD0iIzFmYzM1NSIvPjx0ZXh0IHg9IjQxNiIgeT0iOTMwLjUiIGZvbnQtc2l6ZT0iMjAiIGFsaWdubWVudC1iYXNlbGluZT0ibWlkZGxlIiB0ZXh0LWFuY2hvcj0ibWlkZGxlIiBmaWxsPSJ3aGl0ZSI+ODMyeDE4NjE8L3RleHQ+PC9zdmc+")
                    .description("Crastinus cupiditate debilito cimentarius virgo.")
                    .downloadUrl("https://stingy-casement.name/")
                    .hash("fe6a659e-75cd-4079-9b76-351f9af2205a")
                    .id("53dc27e2-0030-4501-8b1b-6e9e4b170adb")
                    .mimeType("FOLDER")
                    .name("softly.tiff")
                    .references(List.of(
                        StorageReference.builder()
                            .id("ab705f3b-e368-4a94-8b22-d5f693c14a76")
                            .name("tamisium viduo odio cauda")
                            .type("accounting_bill")
                            .build(),
                        StorageReference.builder()
                            .id("9f0f694e-b6f4-4c12-b5f6-ab08d4e81140")
                            .name("quia")
                            .type("accounting_expense")
                            .build()))
                    .size(10276d)
                    .tags(List.of(
                        "spoliatio"))
                    .type(StorageFileType.FILE)
                    .updatedAt(OffsetDateTime.parse("2023-01-27T11:58:12.326Z"))
                    .version("1")
                    .webUrl("https://sandy-distinction.info/")
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

Update a file

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
                    .data("data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZlcnNpb249IjEuMSIgYmFzZVByb2ZpbGU9ImZ1bGwiIHdpZHRoPSI4MzIiIGhlaWdodD0iMTg2MSI+PHJlY3Qgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgZmlsbD0iIzFmYzM1NSIvPjx0ZXh0IHg9IjQxNiIgeT0iOTMwLjUiIGZvbnQtc2l6ZT0iMjAiIGFsaWdubWVudC1iYXNlbGluZT0ibWlkZGxlIiB0ZXh0LWFuY2hvcj0ibWlkZGxlIiBmaWxsPSJ3aGl0ZSI+ODMyeDE4NjE8L3RleHQ+PC9zdmc+")
                    .description("Crastinus cupiditate debilito cimentarius virgo.")
                    .downloadUrl("https://stingy-casement.name/")
                    .hash("fe6a659e-75cd-4079-9b76-351f9af2205a")
                    .id("d475f153-100a-4257-a6ad-70f276ab57ff")
                    .mimeType("FOLDER")
                    .name("softly.tiff")
                    .references(List.of(
                        StorageReference.builder()
                            .id("ab705f3b-e368-4a94-8b22-d5f693c14a76")
                            .name("tamisium viduo odio cauda")
                            .type("accounting_bill")
                            .build(),
                        StorageReference.builder()
                            .id("9f0f694e-b6f4-4c12-b5f6-ab08d4e81140")
                            .name("quia")
                            .type("accounting_expense")
                            .build()))
                    .size(10276d)
                    .tags(List.of(
                        "spoliatio"))
                    .type(StorageFileType.FILE)
                    .updatedAt(OffsetDateTime.parse("2023-01-27T11:58:12.331Z"))
                    .version("1")
                    .webUrl("https://sandy-distinction.info/")
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
                    .data("data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZlcnNpb249IjEuMSIgYmFzZVByb2ZpbGU9ImZ1bGwiIHdpZHRoPSI4MzIiIGhlaWdodD0iMTg2MSI+PHJlY3Qgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgZmlsbD0iIzFmYzM1NSIvPjx0ZXh0IHg9IjQxNiIgeT0iOTMwLjUiIGZvbnQtc2l6ZT0iMjAiIGFsaWdubWVudC1iYXNlbGluZT0ibWlkZGxlIiB0ZXh0LWFuY2hvcj0ibWlkZGxlIiBmaWxsPSJ3aGl0ZSI+ODMyeDE4NjE8L3RleHQ+PC9zdmc+")
                    .description("Crastinus cupiditate debilito cimentarius virgo.")
                    .downloadUrl("https://stingy-casement.name/")
                    .hash("fe6a659e-75cd-4079-9b76-351f9af2205a")
                    .id("d475f153-100a-4257-a6ad-70f276ab57ff")
                    .mimeType("FOLDER")
                    .name("softly.tiff")
                    .references(List.of(
                        StorageReference.builder()
                            .id("ab705f3b-e368-4a94-8b22-d5f693c14a76")
                            .name("tamisium viduo odio cauda")
                            .type("accounting_bill")
                            .build(),
                        StorageReference.builder()
                            .id("9f0f694e-b6f4-4c12-b5f6-ab08d4e81140")
                            .name("quia")
                            .type("accounting_expense")
                            .build()))
                    .size(10276d)
                    .tags(List.of(
                        "spoliatio"))
                    .type(StorageFileType.FILE)
                    .updatedAt(OffsetDateTime.parse("2023-01-27T11:58:12.331Z"))
                    .version("1")
                    .webUrl("https://sandy-distinction.info/")
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