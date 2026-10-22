# Skill

## Overview

### Available Operations

* [getGenaiSkill](#getgenaiskill) - Retrieve a skill
* [listGenaiSkills](#listgenaiskills) - List all skills
* [removeGenaiSkill](#removegenaiskill) - Remove a skill

## getGenaiSkill

Retrieves a single GenaiSkill by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiSkill" method="get" path="/genai/{connection_id}/skill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiSkillRequest;
import to.unified.unified_java_sdk.models.operations.GetGenaiSkillResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiSkillRequest req = GetGenaiSkillRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiSkillResponse res = sdk.skill().getGenaiSkill()
                .request(req)
                .call();

        if (res.genaiSkill().isPresent()) {
            System.out.println(res.genaiSkill().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetGenaiSkillRequest](../../models/operations/GetGenaiSkillRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetGenaiSkillResponse](../../models/operations/GetGenaiSkillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiSkills

Returns a list of GenaiSkills. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiSkills" method="get" path="/genai/{connection_id}/skill" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiSkillsRequest;
import to.unified.unified_java_sdk.models.operations.ListGenaiSkillsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiSkillsRequest req = ListGenaiSkillsRequest.builder()
                .connectionId("<id>")
                .build();

        ListGenaiSkillsResponse res = sdk.skill().listGenaiSkills()
                .request(req)
                .call();

        if (res.genaiSkills().isPresent()) {
            System.out.println(res.genaiSkills().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListGenaiSkillsRequest](../../models/operations/ListGenaiSkillsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListGenaiSkillsResponse](../../models/operations/ListGenaiSkillsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeGenaiSkill

Deletes the GenaiSkill identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeGenaiSkill" method="delete" path="/genai/{connection_id}/skill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiSkillRequest;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiSkillResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveGenaiSkillRequest req = RemoveGenaiSkillRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveGenaiSkillResponse res = sdk.skill().removeGenaiSkill()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveGenaiSkillRequest](../../models/operations/RemoveGenaiSkillRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveGenaiSkillResponse](../../models/operations/RemoveGenaiSkillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |