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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesRequest;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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