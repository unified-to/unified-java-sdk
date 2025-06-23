# Instructor
(*instructor()*)

## Overview

### Available Operations

* [createLmsInstructor](#createlmsinstructor) - Create an instructor
* [getLmsInstructor](#getlmsinstructor) - Retrieve an instructor
* [listLmsInstructors](#listlmsinstructors) - List all instructors
* [patchLmsInstructor](#patchlmsinstructor) - Update an instructor
* [removeLmsInstructor](#removelmsinstructor) - Remove an instructor
* [updateLmsInstructor](#updatelmsinstructor) - Update an instructor

## createLmsInstructor

Create an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateLmsInstructorRequest;
import to.unified.unifiedto.models.operations.CreateLmsInstructorResponse;
import to.unified.unifiedto.models.shared.LmsInstructor;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateLmsInstructorRequest req = CreateLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsInstructorResponse res = sdk.instructor().createLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateLmsInstructorRequest](../../models/operations/CreateLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateLmsInstructorResponse](../../models/operations/CreateLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsInstructor

Retrieve an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetLmsInstructorRequest;
import to.unified.unifiedto.models.operations.GetLmsInstructorResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetLmsInstructorRequest req = GetLmsInstructorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsInstructorResponse res = sdk.instructor().getLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetLmsInstructorRequest](../../models/operations/GetLmsInstructorRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetLmsInstructorResponse](../../models/operations/GetLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsInstructors

List all instructors

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListLmsInstructorsRequest;
import to.unified.unifiedto.models.operations.ListLmsInstructorsResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListLmsInstructorsRequest req = ListLmsInstructorsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsInstructorsResponse res = sdk.instructor().listLmsInstructors()
                .request(req)
                .call();

        if (res.lmsInstructors().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListLmsInstructorsRequest](../../models/operations/ListLmsInstructorsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListLmsInstructorsResponse](../../models/operations/ListLmsInstructorsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsInstructor

Update an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchLmsInstructorRequest;
import to.unified.unifiedto.models.operations.PatchLmsInstructorResponse;
import to.unified.unifiedto.models.shared.LmsInstructor;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchLmsInstructorRequest req = PatchLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsInstructorResponse res = sdk.instructor().patchLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchLmsInstructorRequest](../../models/operations/PatchLmsInstructorRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchLmsInstructorResponse](../../models/operations/PatchLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsInstructor

Remove an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveLmsInstructorRequest;
import to.unified.unifiedto.models.operations.RemoveLmsInstructorResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveLmsInstructorRequest req = RemoveLmsInstructorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsInstructorResponse res = sdk.instructor().removeLmsInstructor()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveLmsInstructorRequest](../../models/operations/RemoveLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveLmsInstructorResponse](../../models/operations/RemoveLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsInstructor

Update an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateLmsInstructorRequest;
import to.unified.unifiedto.models.operations.UpdateLmsInstructorResponse;
import to.unified.unifiedto.models.shared.LmsInstructor;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateLmsInstructorRequest req = UpdateLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsInstructorResponse res = sdk.instructor().updateLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateLmsInstructorRequest](../../models/operations/UpdateLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateLmsInstructorResponse](../../models/operations/UpdateLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |