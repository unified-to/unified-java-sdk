# Page
(*page()*)

## Overview

### Available Operations

* [createKmsPage](#createkmspage) - Create a page
* [getKmsPage](#getkmspage) - Retrieve a page
* [listKmsPages](#listkmspages) - List all pages
* [patchKmsPage](#patchkmspage) - Update a page
* [removeKmsPage](#removekmspage) - Remove a page
* [updateKmsPage](#updatekmspage) - Update a page

## createKmsPage

Create a page

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.CreateKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsPageRequest req = CreateKmsPageRequest.builder()
                .kmsPage(KmsPage.builder()
                    .title("<value>")
                    .type(KmsPageType.TEXT)
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsPageResponse res = sdk.page().createKmsPage()
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

## getKmsPage

Retrieve a page

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.GetKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsPageRequest req = GetKmsPageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsPageResponse res = sdk.page().getKmsPage()
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

## listKmsPages

List all pages

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsPagesRequest;
import to.unified.unified_java_sdk.models.operations.ListKmsPagesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsPagesRequest req = ListKmsPagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsPagesResponse res = sdk.page().listKmsPages()
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

## patchKmsPage

Update a page

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.PatchKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsPageRequest req = PatchKmsPageRequest.builder()
                .kmsPage(KmsPage.builder()
                    .title("<value>")
                    .type(KmsPageType.OTHER)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsPageResponse res = sdk.page().patchKmsPage()
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

## removeKmsPage

Remove a page

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.RemoveKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsPageRequest req = RemoveKmsPageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsPageResponse res = sdk.page().removeKmsPage()
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

## updateKmsPage

Update a page

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.UpdateKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsPageRequest req = UpdateKmsPageRequest.builder()
                .kmsPage(KmsPage.builder()
                    .title("<value>")
                    .type(KmsPageType.OTHER)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsPageResponse res = sdk.page().updateKmsPage()
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