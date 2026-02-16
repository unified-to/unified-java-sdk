# Content

## Overview

### Available Operations

* [createLmsContent](#createlmscontent) - Create a content
* [getLmsContent](#getlmscontent) - Retrieve a content
* [listLmsContents](#listlmscontents) - List all contents
* [patchLmsContent](#patchlmscontent) - Update a content
* [removeLmsContent](#removelmscontent) - Remove a content
* [updateLmsContent](#updatelmscontent) - Update a content

## createLmsContent

Create a content

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsContent" method="post" path="/lms/{connection_id}/content" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.LmsContent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsContentRequest req = CreateLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsContentResponse res = sdk.content().createLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateLmsContentRequest](../../models/operations/CreateLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLmsContentResponse](../../models/operations/CreateLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsContent

Retrieve a content

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsContent" method="get" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsContentRequest req = GetLmsContentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsContentResponse res = sdk.content().getLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLmsContentRequest](../../models/operations/GetLmsContentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLmsContentResponse](../../models/operations/GetLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsContents

List all contents

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsContents" method="get" path="/lms/{connection_id}/content" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsContentsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsContentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsContentsRequest req = ListLmsContentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsContentsResponse res = sdk.content().listLmsContents()
                .request(req)
                .call();

        if (res.lmsContents().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsContentsRequest](../../models/operations/ListLmsContentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsContentsResponse](../../models/operations/ListLmsContentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsContent

Update a content

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsContent" method="patch" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.LmsContent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsContentRequest req = PatchLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsContentResponse res = sdk.content().patchLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchLmsContentRequest](../../models/operations/PatchLmsContentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchLmsContentResponse](../../models/operations/PatchLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsContent

Remove a content

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsContent" method="delete" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsContentRequest req = RemoveLmsContentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsContentResponse res = sdk.content().removeLmsContent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveLmsContentRequest](../../models/operations/RemoveLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveLmsContentResponse](../../models/operations/RemoveLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsContent

Update a content

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsContent" method="put" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.LmsContent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsContentRequest req = UpdateLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsContentResponse res = sdk.content().updateLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateLmsContentRequest](../../models/operations/UpdateLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLmsContentResponse](../../models/operations/UpdateLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |