# Kms
(*kms()*)

## Overview

### Available Operations

* [createKmsComment](#createkmscomment) - Create a comment
* [createKmsPage](#createkmspage) - Create a page
* [createKmsSpace](#createkmsspace) - Create a space
* [getKmsComment](#getkmscomment) - Retrieve a comment
* [getKmsPage](#getkmspage) - Retrieve a page
* [getKmsSpace](#getkmsspace) - Retrieve a space
* [listKmsComments](#listkmscomments) - List all comments
* [listKmsPages](#listkmspages) - List all pages
* [listKmsSpaces](#listkmsspaces) - List all spaces
* [patchKmsComment](#patchkmscomment) - Update a comment
* [patchKmsPage](#patchkmspage) - Update a page
* [patchKmsSpace](#patchkmsspace) - Update a space
* [removeKmsComment](#removekmscomment) - Remove a comment
* [removeKmsPage](#removekmspage) - Remove a page
* [removeKmsSpace](#removekmsspace) - Remove a space
* [updateKmsComment](#updatekmscomment) - Update a comment
* [updateKmsPage](#updatekmspage) - Update a page
* [updateKmsSpace](#updatekmsspace) - Update a space

## createKmsComment

Create a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.CreateKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.KmsComment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsCommentRequest req = CreateKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsCommentResponse res = sdk.kms().createKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateKmsCommentRequest](../../models/operations/CreateKmsCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateKmsCommentResponse](../../models/operations/CreateKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsSpaceRequest req = CreateKmsSpaceRequest.builder()
                .kmsSpace(KmsSpace.builder()
                    .name("<value>")
                    .build())
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

## getKmsComment

Retrieve a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.GetKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsCommentRequest req = GetKmsCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsCommentResponse res = sdk.kms().getKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetKmsCommentRequest](../../models/operations/GetKmsCommentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetKmsCommentResponse](../../models/operations/GetKmsCommentResponse.md)**

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

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.GetKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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

## listKmsComments

List all comments

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsCommentsRequest;
import to.unified.unified_java_sdk.models.operations.ListKmsCommentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsCommentsRequest req = ListKmsCommentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsCommentsResponse res = sdk.kms().listKmsComments()
                .request(req)
                .call();

        if (res.kmsComments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListKmsCommentsRequest](../../models/operations/ListKmsCommentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListKmsCommentsResponse](../../models/operations/ListKmsCommentsResponse.md)**

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

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsSpacesRequest;
import to.unified.unified_java_sdk.models.operations.ListKmsSpacesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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

## patchKmsComment

Update a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.PatchKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.KmsComment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsCommentRequest req = PatchKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsCommentResponse res = sdk.kms().patchKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchKmsCommentRequest](../../models/operations/PatchKmsCommentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchKmsCommentResponse](../../models/operations/PatchKmsCommentResponse.md)**

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

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsSpaceRequest req = PatchKmsSpaceRequest.builder()
                .kmsSpace(KmsSpace.builder()
                    .name("<value>")
                    .build())
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

## removeKmsComment

Remove a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsCommentRequest req = RemoveKmsCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsCommentResponse res = sdk.kms().removeKmsComment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveKmsCommentRequest](../../models/operations/RemoveKmsCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveKmsCommentResponse](../../models/operations/RemoveKmsCommentResponse.md)**

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

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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

## updateKmsComment

Update a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.KmsComment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsCommentRequest req = UpdateKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsCommentResponse res = sdk.kms().updateKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateKmsCommentRequest](../../models/operations/UpdateKmsCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateKmsCommentResponse](../../models/operations/UpdateKmsCommentResponse.md)**

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

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsSpaceRequest req = UpdateKmsSpaceRequest.builder()
                .kmsSpace(KmsSpace.builder()
                    .name("<value>")
                    .build())
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