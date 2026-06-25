# Kms

## Overview

### Available Operations

* [createKmsComment2](#createkmscomment2) - Create a comment
* [createKmsPage2](#createkmspage2) - Create a page
* [createKmsSpace2](#createkmsspace2) - Create a space
* [getKmsComment2](#getkmscomment2) - Retrieve a comment
* [getKmsPage2](#getkmspage2) - Retrieve a page
* [getKmsSpace2](#getkmsspace2) - Retrieve a space
* [listKmsComments2](#listkmscomments2) - List all comments
* [listKmsPages2](#listkmspages2) - List all pages
* [listKmsSpaces2](#listkmsspaces2) - List all spaces
* [patchKmsComment2](#patchkmscomment2) - Update a comment
* [patchKmsPage2](#patchkmspage2) - Update a page
* [patchKmsSpace2](#patchkmsspace2) - Update a space
* [removeKmsComment2](#removekmscomment2) - Remove a comment
* [removeKmsPage2](#removekmspage2) - Remove a page
* [removeKmsSpace2](#removekmsspace2) - Remove a space
* [updateKmsComment2](#updatekmscomment2) - Update a comment
* [updateKmsPage2](#updatekmspage2) - Update a page
* [updateKmsSpace2](#updatekmsspace2) - Update a space

## createKmsComment2

Create a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsComment2" method="post" path="/kms/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.CreateKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.KmsComment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsComment2Request req = CreateKmsComment2Request.builder()
                .kmsComment(KmsComment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsComment2Response res = sdk.kms().createKmsComment2()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateKmsComment2Request](../../models/operations/CreateKmsComment2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateKmsComment2Response](../../models/operations/CreateKmsComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateKmsPage2Response res = sdk.kms().createKmsPage2()
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

## createKmsSpace2

Create a space

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsSpace2" method="post" path="/kms/{connection_id}/space" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsSpace2Request req = CreateKmsSpace2Request.builder()
                .kmsSpace(KmsSpace.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsSpace2Response res = sdk.kms().createKmsSpace2()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateKmsSpace2Request](../../models/operations/CreateKmsSpace2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateKmsSpace2Response](../../models/operations/CreateKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsComment2

Retrieve a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsComment2" method="get" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.GetKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsComment2Request req = GetKmsComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsComment2Response res = sdk.kms().getKmsComment2()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetKmsComment2Request](../../models/operations/GetKmsComment2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetKmsComment2Response](../../models/operations/GetKmsComment2Response.md)**

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

        GetKmsPage2Response res = sdk.kms().getKmsPage2()
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

## getKmsSpace2

Retrieve a space

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsSpace2" method="get" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.GetKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsSpace2Request req = GetKmsSpace2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsSpace2Response res = sdk.kms().getKmsSpace2()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetKmsSpace2Request](../../models/operations/GetKmsSpace2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetKmsSpace2Response](../../models/operations/GetKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsComments2

List all comments

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsComments2" method="get" path="/kms/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsComments2Request;
import to.unified.unified_java_sdk.models.operations.ListKmsComments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsComments2Request req = ListKmsComments2Request.builder()
                .connectionId("<id>")
                .build();

        ListKmsComments2Response res = sdk.kms().listKmsComments2()
                .request(req)
                .call();

        if (res.kmsComments().isPresent()) {
            System.out.println(res.kmsComments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListKmsComments2Request](../../models/operations/ListKmsComments2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListKmsComments2Response](../../models/operations/ListKmsComments2Response.md)**

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

        ListKmsPages2Response res = sdk.kms().listKmsPages2()
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

## listKmsSpaces2

List all spaces

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsSpaces2" method="get" path="/kms/{connection_id}/space" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsSpaces2Request;
import to.unified.unified_java_sdk.models.operations.ListKmsSpaces2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsSpaces2Request req = ListKmsSpaces2Request.builder()
                .connectionId("<id>")
                .build();

        ListKmsSpaces2Response res = sdk.kms().listKmsSpaces2()
                .request(req)
                .call();

        if (res.kmsSpaces().isPresent()) {
            System.out.println(res.kmsSpaces().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListKmsSpaces2Request](../../models/operations/ListKmsSpaces2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListKmsSpaces2Response](../../models/operations/ListKmsSpaces2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsComment2" method="patch" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.PatchKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.KmsComment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsComment2Request req = PatchKmsComment2Request.builder()
                .kmsComment(KmsComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsComment2Response res = sdk.kms().patchKmsComment2()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchKmsComment2Request](../../models/operations/PatchKmsComment2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchKmsComment2Response](../../models/operations/PatchKmsComment2Response.md)**

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

        PatchKmsPage2Response res = sdk.kms().patchKmsPage2()
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

## patchKmsSpace2

Update a space

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsSpace2" method="patch" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsSpace2Request req = PatchKmsSpace2Request.builder()
                .kmsSpace(KmsSpace.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsSpace2Response res = sdk.kms().patchKmsSpace2()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchKmsSpace2Request](../../models/operations/PatchKmsSpace2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchKmsSpace2Response](../../models/operations/PatchKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsComment2

Remove a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsComment2" method="delete" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.RemoveKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsComment2Request req = RemoveKmsComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsComment2Response res = sdk.kms().removeKmsComment2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveKmsComment2Request](../../models/operations/RemoveKmsComment2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveKmsComment2Response](../../models/operations/RemoveKmsComment2Response.md)**

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

        RemoveKmsPage2Response res = sdk.kms().removeKmsPage2()
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

## removeKmsSpace2

Remove a space

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsSpace2" method="delete" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsSpace2Request req = RemoveKmsSpace2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsSpace2Response res = sdk.kms().removeKmsSpace2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveKmsSpace2Request](../../models/operations/RemoveKmsSpace2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveKmsSpace2Response](../../models/operations/RemoveKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsComment2" method="put" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.UpdateKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.KmsComment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsComment2Request req = UpdateKmsComment2Request.builder()
                .kmsComment(KmsComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsComment2Response res = sdk.kms().updateKmsComment2()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateKmsComment2Request](../../models/operations/UpdateKmsComment2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateKmsComment2Response](../../models/operations/UpdateKmsComment2Response.md)**

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

        UpdateKmsPage2Response res = sdk.kms().updateKmsPage2()
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

## updateKmsSpace2

Update a space

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsSpace2" method="put" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsSpace2Request req = UpdateKmsSpace2Request.builder()
                .kmsSpace(KmsSpace.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsSpace2Response res = sdk.kms().updateKmsSpace2()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateKmsSpace2Request](../../models/operations/UpdateKmsSpace2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateKmsSpace2Response](../../models/operations/UpdateKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |