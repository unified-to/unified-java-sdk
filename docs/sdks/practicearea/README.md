# Practicearea

## Overview

### Available Operations

* [createLegalPracticearea](#createlegalpracticearea) - Create a practicearea
* [getLegalPracticearea](#getlegalpracticearea) - Retrieve a practicearea
* [listLegalPracticeareas](#listlegalpracticeareas) - List all practiceareas
* [patchLegalPracticearea](#patchlegalpracticearea) - Update a practicearea
* [removeLegalPracticearea](#removelegalpracticearea) - Remove a practicearea
* [updateLegalPracticearea](#updatelegalpracticearea) - Update a practicearea

## createLegalPracticearea

Create a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="createLegalPracticearea" method="post" path="/legal/{connection_id}/practicearea" example="legal_practicearea" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.CreateLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLegalPracticeareaRequest req = CreateLegalPracticeareaRequest.builder()
                .legalPracticearea(LegalPracticearea.builder()
                    .code("QCA")
                    .createdAt(OffsetDateTime.parse("2023-01-28T21:00:26.264Z"))
                    .id("448f42c4-41fb-4034-8ec8-3e4cb73171db")
                    .metadata(List.of())
                    .name("witty Law")
                    .type(LegalPracticeareaType.EDUCATION)
                    .updatedAt(OffsetDateTime.parse("2025-08-23T14:06:31.307Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLegalPracticeareaResponse res = sdk.practicearea().createLegalPracticearea()
                .request(req)
                .call();

        if (res.legalPracticearea().isPresent()) {
            System.out.println(res.legalPracticearea().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateLegalPracticeareaRequest](../../models/operations/CreateLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateLegalPracticeareaResponse](../../models/operations/CreateLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLegalPracticearea

Retrieve a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegalPracticearea" method="get" path="/legal/{connection_id}/practicearea/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.GetLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLegalPracticeareaRequest req = GetLegalPracticeareaRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLegalPracticeareaResponse res = sdk.practicearea().getLegalPracticearea()
                .request(req)
                .call();

        if (res.legalPracticearea().isPresent()) {
            System.out.println(res.legalPracticearea().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetLegalPracticeareaRequest](../../models/operations/GetLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetLegalPracticeareaResponse](../../models/operations/GetLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLegalPracticeareas

List all practiceareas

### Example Usage

<!-- UsageSnippet language="java" operationID="listLegalPracticeareas" method="get" path="/legal/{connection_id}/practicearea" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLegalPracticeareasRequest;
import to.unified.unified_java_sdk.models.operations.ListLegalPracticeareasResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLegalPracticeareasRequest req = ListLegalPracticeareasRequest.builder()
                .connectionId("<id>")
                .build();

        ListLegalPracticeareasResponse res = sdk.practicearea().listLegalPracticeareas()
                .request(req)
                .call();

        if (res.legalPracticeareas().isPresent()) {
            System.out.println(res.legalPracticeareas().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListLegalPracticeareasRequest](../../models/operations/ListLegalPracticeareasRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListLegalPracticeareasResponse](../../models/operations/ListLegalPracticeareasResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLegalPracticearea

Update a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLegalPracticearea" method="patch" path="/legal/{connection_id}/practicearea/{id}" example="legal_practicearea" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.PatchLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLegalPracticeareaRequest req = PatchLegalPracticeareaRequest.builder()
                .legalPracticearea(LegalPracticearea.builder()
                    .code("QCA")
                    .createdAt(OffsetDateTime.parse("2023-01-28T21:00:26.264Z"))
                    .id("e2b3d1a3-7322-4cd1-9683-06bed5ff404f")
                    .metadata(List.of())
                    .name("witty Law")
                    .type(LegalPracticeareaType.EDUCATION)
                    .updatedAt(OffsetDateTime.parse("2025-08-23T14:06:31.314Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLegalPracticeareaResponse res = sdk.practicearea().patchLegalPracticearea()
                .request(req)
                .call();

        if (res.legalPracticearea().isPresent()) {
            System.out.println(res.legalPracticearea().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchLegalPracticeareaRequest](../../models/operations/PatchLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchLegalPracticeareaResponse](../../models/operations/PatchLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLegalPracticearea

Remove a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLegalPracticearea" method="delete" path="/legal/{connection_id}/practicearea/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLegalPracticeareaRequest req = RemoveLegalPracticeareaRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLegalPracticeareaResponse res = sdk.practicearea().removeLegalPracticearea()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveLegalPracticeareaRequest](../../models/operations/RemoveLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveLegalPracticeareaResponse](../../models/operations/RemoveLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLegalPracticearea

Update a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLegalPracticearea" method="put" path="/legal/{connection_id}/practicearea/{id}" example="legal_practicearea" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLegalPracticeareaRequest req = UpdateLegalPracticeareaRequest.builder()
                .legalPracticearea(LegalPracticearea.builder()
                    .code("QCA")
                    .createdAt(OffsetDateTime.parse("2023-01-28T21:00:26.264Z"))
                    .id("e2b3d1a3-7322-4cd1-9683-06bed5ff404f")
                    .metadata(List.of())
                    .name("witty Law")
                    .type(LegalPracticeareaType.EDUCATION)
                    .updatedAt(OffsetDateTime.parse("2025-08-23T14:06:31.314Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLegalPracticeareaResponse res = sdk.practicearea().updateLegalPracticearea()
                .request(req)
                .call();

        if (res.legalPracticearea().isPresent()) {
            System.out.println(res.legalPracticearea().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateLegalPracticeareaRequest](../../models/operations/UpdateLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateLegalPracticeareaResponse](../../models/operations/UpdateLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |