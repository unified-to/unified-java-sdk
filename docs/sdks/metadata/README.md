# Metadata
(*metadata()*)

## Overview

### Available Operations

* [createCommerceMetadata](#createcommercemetadata) - Create a metadata
* [getCommerceMetadata](#getcommercemetadata) - Retrieve a metadata
* [listCommerceMetadatas](#listcommercemetadatas) - List all metadatas
* [patchCommerceMetadata](#patchcommercemetadata) - Update a metadata
* [removeCommerceMetadata](#removecommercemetadata) - Remove a metadata
* [updateCommerceMetadata](#updatecommercemetadata) - Update a metadata

## createCommerceMetadata

Create a metadata

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceMetadataRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceMetadataResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateCommerceMetadataRequest req = CreateCommerceMetadataRequest.builder()
                .connectionId("<id>")
                .build();

        CreateCommerceMetadataResponse res = sdk.metadata().createCommerceMetadata()
                .request(req)
                .call();

        if (res.commerceMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateCommerceMetadataRequest](../../models/operations/CreateCommerceMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateCommerceMetadataResponse](../../models/operations/CreateCommerceMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceMetadata

Retrieve a metadata

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCommerceMetadataRequest;
import com.unifiedapi.unifiedto.models.operations.GetCommerceMetadataResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetCommerceMetadataRequest req = GetCommerceMetadataRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceMetadataResponse res = sdk.metadata().getCommerceMetadata()
                .request(req)
                .call();

        if (res.commerceMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetCommerceMetadataRequest](../../models/operations/GetCommerceMetadataRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetCommerceMetadataResponse](../../models/operations/GetCommerceMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceMetadatas

List all metadatas

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCommerceMetadatasRequest;
import com.unifiedapi.unifiedto.models.operations.ListCommerceMetadatasResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListCommerceMetadatasRequest req = ListCommerceMetadatasRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceMetadatasResponse res = sdk.metadata().listCommerceMetadatas()
                .request(req)
                .call();

        if (res.commerceMetadatas().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListCommerceMetadatasRequest](../../models/operations/ListCommerceMetadatasRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListCommerceMetadatasResponse](../../models/operations/ListCommerceMetadatasResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceMetadata

Update a metadata

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceMetadataRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceMetadataResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchCommerceMetadataRequest req = PatchCommerceMetadataRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceMetadataResponse res = sdk.metadata().patchCommerceMetadata()
                .request(req)
                .call();

        if (res.commerceMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchCommerceMetadataRequest](../../models/operations/PatchCommerceMetadataRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchCommerceMetadataResponse](../../models/operations/PatchCommerceMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceMetadata

Remove a metadata

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceMetadataRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceMetadataResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveCommerceMetadataRequest req = RemoveCommerceMetadataRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceMetadataResponse res = sdk.metadata().removeCommerceMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveCommerceMetadataRequest](../../models/operations/RemoveCommerceMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveCommerceMetadataResponse](../../models/operations/RemoveCommerceMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceMetadata

Update a metadata

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceMetadataRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceMetadataResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateCommerceMetadataRequest req = UpdateCommerceMetadataRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceMetadataResponse res = sdk.metadata().updateCommerceMetadata()
                .request(req)
                .call();

        if (res.commerceMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateCommerceMetadataRequest](../../models/operations/UpdateCommerceMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateCommerceMetadataResponse](../../models/operations/UpdateCommerceMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |