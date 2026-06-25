# Content

## Overview

### Available Operations

* [createLmsContent2](#createlmscontent2) - Create a content
* [getLmsContent2](#getlmscontent2) - Retrieve a content
* [listLmsContents2](#listlmscontents2) - List all contents
* [patchLmsContent2](#patchlmscontent2) - Update a content
* [removeLmsContent2](#removelmscontent2) - Remove a content
* [updateLmsContent2](#updatelmscontent2) - Update a content

## createLmsContent2

Create a content

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsContent2" method="post" path="/lms/{connection_id}/content" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.LmsContent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsContent2Request req = CreateLmsContent2Request.builder()
                .lmsContent(LmsContent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsContent2Response res = sdk.content().createLmsContent2()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateLmsContent2Request](../../models/operations/CreateLmsContent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateLmsContent2Response](../../models/operations/CreateLmsContent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsContent2

Retrieve a content

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsContent2" method="get" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsContent2Request req = GetLmsContent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsContent2Response res = sdk.content().getLmsContent2()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLmsContent2Request](../../models/operations/GetLmsContent2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLmsContent2Response](../../models/operations/GetLmsContent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsContents2

List all contents

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsContents2" method="get" path="/lms/{connection_id}/content" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsContents2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsContents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsContents2Request req = ListLmsContents2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsContents2Response res = sdk.content().listLmsContents2()
                .request(req)
                .call();

        if (res.lmsContents().isPresent()) {
            System.out.println(res.lmsContents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListLmsContents2Request](../../models/operations/ListLmsContents2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListLmsContents2Response](../../models/operations/ListLmsContents2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsContent2

Update a content

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsContent2" method="patch" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.LmsContent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsContent2Request req = PatchLmsContent2Request.builder()
                .lmsContent(LmsContent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsContent2Response res = sdk.content().patchLmsContent2()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchLmsContent2Request](../../models/operations/PatchLmsContent2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchLmsContent2Response](../../models/operations/PatchLmsContent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsContent2

Remove a content

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsContent2" method="delete" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsContent2Request req = RemoveLmsContent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsContent2Response res = sdk.content().removeLmsContent2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveLmsContent2Request](../../models/operations/RemoveLmsContent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveLmsContent2Response](../../models/operations/RemoveLmsContent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsContent2

Update a content

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsContent2" method="put" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.LmsContent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsContent2Request req = UpdateLmsContent2Request.builder()
                .lmsContent(LmsContent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsContent2Response res = sdk.content().updateLmsContent2()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateLmsContent2Request](../../models/operations/UpdateLmsContent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateLmsContent2Response](../../models/operations/UpdateLmsContent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |