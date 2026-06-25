# Page

## Overview

### Available Operations

* [createKmsPage2](#createkmspage2) - Create a page
* [getKmsPage2](#getkmspage2) - Retrieve a page
* [listKmsPages2](#listkmspages2) - List all pages
* [patchKmsPage2](#patchkmspage2) - Update a page
* [removeKmsPage2](#removekmspage2) - Remove a page
* [updateKmsPage2](#updatekmspage2) - Update a page

## createKmsPage2

Create a page

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsPage2" method="post" path="/kms/{connection_id}/page" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsPage2Request;
import to.unified.unified_java_sdk.models.operations.CreateKmsPage2Response;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsPage2Request req = CreateKmsPage2Request.builder()
                .kmsPage(KmsPage.builder()
                    .type(KmsPageType.OTHER)
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsPage2Response res = sdk.page().createKmsPage2()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            System.out.println(res.kmsPage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateKmsPage2Request](../../models/operations/CreateKmsPage2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateKmsPage2Response](../../models/operations/CreateKmsPage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsPage2

Retrieve a page

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsPage2" method="get" path="/kms/{connection_id}/page/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsPage2Request;
import to.unified.unified_java_sdk.models.operations.GetKmsPage2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsPage2Request req = GetKmsPage2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsPage2Response res = sdk.page().getKmsPage2()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            System.out.println(res.kmsPage().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetKmsPage2Request](../../models/operations/GetKmsPage2Request.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetKmsPage2Response](../../models/operations/GetKmsPage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsPages2

List all pages

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsPages2" method="get" path="/kms/{connection_id}/page" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsPages2Request;
import to.unified.unified_java_sdk.models.operations.ListKmsPages2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsPages2Request req = ListKmsPages2Request.builder()
                .connectionId("<id>")
                .build();

        ListKmsPages2Response res = sdk.page().listKmsPages2()
                .request(req)
                .call();

        if (res.kmsPages().isPresent()) {
            System.out.println(res.kmsPages().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListKmsPages2Request](../../models/operations/ListKmsPages2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListKmsPages2Response](../../models/operations/ListKmsPages2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsPage2

Update a page

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsPage2" method="patch" path="/kms/{connection_id}/page/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsPage2Request;
import to.unified.unified_java_sdk.models.operations.PatchKmsPage2Response;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsPage2Request req = PatchKmsPage2Request.builder()
                .kmsPage(KmsPage.builder()
                    .type(KmsPageType.OTHER)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsPage2Response res = sdk.page().patchKmsPage2()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            System.out.println(res.kmsPage().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchKmsPage2Request](../../models/operations/PatchKmsPage2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchKmsPage2Response](../../models/operations/PatchKmsPage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsPage2

Remove a page

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsPage2" method="delete" path="/kms/{connection_id}/page/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsPage2Request;
import to.unified.unified_java_sdk.models.operations.RemoveKmsPage2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsPage2Request req = RemoveKmsPage2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsPage2Response res = sdk.page().removeKmsPage2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveKmsPage2Request](../../models/operations/RemoveKmsPage2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveKmsPage2Response](../../models/operations/RemoveKmsPage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsPage2

Update a page

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsPage2" method="put" path="/kms/{connection_id}/page/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsPage2Request;
import to.unified.unified_java_sdk.models.operations.UpdateKmsPage2Response;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsPage2Request req = UpdateKmsPage2Request.builder()
                .kmsPage(KmsPage.builder()
                    .type(KmsPageType.MARKDOWN)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsPage2Response res = sdk.page().updateKmsPage2()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            System.out.println(res.kmsPage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateKmsPage2Request](../../models/operations/UpdateKmsPage2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateKmsPage2Response](../../models/operations/UpdateKmsPage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |