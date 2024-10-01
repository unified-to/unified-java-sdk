# Kms
(*kms()*)

## Overview

### Available Operations

* [createKmsPage](#createkmspage) - Create a page
* [createKmsSpace](#createkmsspace) - Create a space
* [getKmsPage](#getkmspage) - Retrieve a page
* [getKmsSpace](#getkmsspace) - Retrieve a space
* [listKmsPages](#listkmspages) - List all pages
* [listKmsSpaces](#listkmsspaces) - List all spaces
* [patchKmsPage](#patchkmspage) - Update a page
* [patchKmsSpace](#patchkmsspace) - Update a space
* [removeKmsPage](#removekmspage) - Remove a page
* [removeKmsSpace](#removekmsspace) - Remove a space
* [updateKmsPage](#updatekmspage) - Update a page
* [updateKmsSpace](#updatekmsspace) - Update a space

## createKmsPage

Create a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.CreateKmsPageResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateKmsPageRequest req = CreateKmsPageRequest.builder()
                .connectionId("<id>")
                .build();

        CreateKmsPageResponse res = sdk.kms().createKmsPage()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateKmsPageRequest](../../models/operations/CreateKmsPageRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateKmsPageResponse](../../models/operations/CreateKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createKmsSpace

Create a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.CreateKmsSpaceResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateKmsSpaceRequest req = CreateKmsSpaceRequest.builder()
                .connectionId("<id>")
                .build();

        CreateKmsSpaceResponse res = sdk.kms().createKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateKmsSpaceRequest](../../models/operations/CreateKmsSpaceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateKmsSpaceResponse](../../models/operations/CreateKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsPage

Retrieve a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.GetKmsPageResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetKmsPageRequest req = GetKmsPageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsPageResponse res = sdk.kms().getKmsPage()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetKmsPageRequest](../../models/operations/GetKmsPageRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetKmsPageResponse](../../models/operations/GetKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsSpace

Retrieve a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.GetKmsSpaceResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetKmsSpaceRequest req = GetKmsSpaceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsSpaceResponse res = sdk.kms().getKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetKmsSpaceRequest](../../models/operations/GetKmsSpaceRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetKmsSpaceResponse](../../models/operations/GetKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsPages

List all pages

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListKmsPagesRequest;
import com.unifiedapi.unifiedto.models.operations.ListKmsPagesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListKmsPagesRequest req = ListKmsPagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsPagesResponse res = sdk.kms().listKmsPages()
                .request(req)
                .call();

        if (res.kmsPages().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListKmsPagesRequest](../../models/operations/ListKmsPagesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListKmsPagesResponse](../../models/operations/ListKmsPagesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsSpaces

List all spaces

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListKmsSpacesRequest;
import com.unifiedapi.unifiedto.models.operations.ListKmsSpacesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListKmsSpacesRequest req = ListKmsSpacesRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsSpacesResponse res = sdk.kms().listKmsSpaces()
                .request(req)
                .call();

        if (res.kmsSpaces().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListKmsSpacesRequest](../../models/operations/ListKmsSpacesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListKmsSpacesResponse](../../models/operations/ListKmsSpacesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsPage

Update a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.PatchKmsPageResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchKmsPageRequest req = PatchKmsPageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsPageResponse res = sdk.kms().patchKmsPage()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchKmsPageRequest](../../models/operations/PatchKmsPageRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchKmsPageResponse](../../models/operations/PatchKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsSpace

Update a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchKmsSpaceRequest req = PatchKmsSpaceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsSpaceResponse res = sdk.kms().patchKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchKmsSpaceRequest](../../models/operations/PatchKmsSpaceRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchKmsSpaceResponse](../../models/operations/PatchKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsPage

Remove a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveKmsPageResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveKmsPageRequest req = RemoveKmsPageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsPageResponse res = sdk.kms().removeKmsPage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveKmsPageRequest](../../models/operations/RemoveKmsPageRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveKmsPageResponse](../../models/operations/RemoveKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsSpace

Remove a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveKmsSpaceRequest req = RemoveKmsSpaceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsSpaceResponse res = sdk.kms().removeKmsSpace()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveKmsSpaceRequest](../../models/operations/RemoveKmsSpaceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveKmsSpaceResponse](../../models/operations/RemoveKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsPage

Update a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateKmsPageResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateKmsPageRequest req = UpdateKmsPageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsPageResponse res = sdk.kms().updateKmsPage()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateKmsPageRequest](../../models/operations/UpdateKmsPageRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateKmsPageResponse](../../models/operations/UpdateKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsSpace

Update a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateKmsSpaceResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateKmsSpaceRequest req = UpdateKmsSpaceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsSpaceResponse res = sdk.kms().updateKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateKmsSpaceRequest](../../models/operations/UpdateKmsSpaceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateKmsSpaceResponse](../../models/operations/UpdateKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |