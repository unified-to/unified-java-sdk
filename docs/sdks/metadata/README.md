# Metadata
(*metadata()*)

## Overview

### Available Operations

* [createMetadataMetadata](#createmetadatametadata) - Create a metadata
* [getMetadataMetadata](#getmetadatametadata) - Retrieve a metadata
* [listMetadataMetadatas](#listmetadatametadatas) - List all metadatas
* [patchMetadataMetadata](#patchmetadatametadata) - Update a metadata
* [removeMetadataMetadata](#removemetadatametadata) - Remove a metadata
* [updateMetadataMetadata](#updatemetadatametadata) - Update a metadata

## createMetadataMetadata

Create a metadata

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateMetadataMetadataRequest;
import to.unified.unifiedto.models.operations.CreateMetadataMetadataResponse;
import to.unified.unifiedto.models.shared.MetadataMetadata;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateMetadataMetadataRequest req = CreateMetadataMetadataRequest.builder()
                .metadataMetadata(MetadataMetadata.builder()
                    .name("<value>")
                    .objectType("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateMetadataMetadataResponse res = sdk.metadata().createMetadataMetadata()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateMetadataMetadataRequest](../../models/operations/CreateMetadataMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateMetadataMetadataResponse](../../models/operations/CreateMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMetadataMetadata

Retrieve a metadata

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetMetadataMetadataRequest;
import to.unified.unifiedto.models.operations.GetMetadataMetadataResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetMetadataMetadataRequest req = GetMetadataMetadataRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMetadataMetadataResponse res = sdk.metadata().getMetadataMetadata()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetMetadataMetadataRequest](../../models/operations/GetMetadataMetadataRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetMetadataMetadataResponse](../../models/operations/GetMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMetadataMetadatas

List all metadatas

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListMetadataMetadatasRequest;
import to.unified.unifiedto.models.operations.ListMetadataMetadatasResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListMetadataMetadatasRequest req = ListMetadataMetadatasRequest.builder()
                .connectionId("<id>")
                .build();

        ListMetadataMetadatasResponse res = sdk.metadata().listMetadataMetadatas()
                .request(req)
                .call();

        if (res.metadataMetadatas().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListMetadataMetadatasRequest](../../models/operations/ListMetadataMetadatasRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListMetadataMetadatasResponse](../../models/operations/ListMetadataMetadatasResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMetadataMetadata

Update a metadata

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchMetadataMetadataRequest;
import to.unified.unifiedto.models.operations.PatchMetadataMetadataResponse;
import to.unified.unifiedto.models.shared.MetadataMetadata;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchMetadataMetadataRequest req = PatchMetadataMetadataRequest.builder()
                .metadataMetadata(MetadataMetadata.builder()
                    .name("<value>")
                    .objectType("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMetadataMetadataResponse res = sdk.metadata().patchMetadataMetadata()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchMetadataMetadataRequest](../../models/operations/PatchMetadataMetadataRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchMetadataMetadataResponse](../../models/operations/PatchMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMetadataMetadata

Remove a metadata

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveMetadataMetadataRequest;
import to.unified.unifiedto.models.operations.RemoveMetadataMetadataResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveMetadataMetadataRequest req = RemoveMetadataMetadataRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMetadataMetadataResponse res = sdk.metadata().removeMetadataMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveMetadataMetadataRequest](../../models/operations/RemoveMetadataMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveMetadataMetadataResponse](../../models/operations/RemoveMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMetadataMetadata

Update a metadata

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateMetadataMetadataRequest;
import to.unified.unifiedto.models.operations.UpdateMetadataMetadataResponse;
import to.unified.unifiedto.models.shared.MetadataMetadata;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateMetadataMetadataRequest req = UpdateMetadataMetadataRequest.builder()
                .metadataMetadata(MetadataMetadata.builder()
                    .name("<value>")
                    .objectType("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMetadataMetadataResponse res = sdk.metadata().updateMetadataMetadata()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateMetadataMetadataRequest](../../models/operations/UpdateMetadataMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateMetadataMetadataResponse](../../models/operations/UpdateMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |