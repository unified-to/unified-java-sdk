# Class
(*class_()*)

## Overview

### Available Operations

* [createLmsClass](#createlmsclass) - Create a class
* [getLmsClass](#getlmsclass) - Retrieve a class
* [listLmsClasses](#listlmsclasses) - List all classes
* [patchLmsClass](#patchlmsclass) - Update a class
* [removeLmsClass](#removelmsclass) - Remove a class
* [updateLmsClass](#updatelmsclass) - Update a class

## createLmsClass

Create a class

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateLmsClassRequest;
import com.unifiedapi.unifiedto.models.operations.CreateLmsClassResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateLmsClassRequest req = CreateLmsClassRequest.builder()
                .connectionId("<id>")
                .build();

        CreateLmsClassResponse res = sdk.class_().createLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateLmsClassRequest](../../models/operations/CreateLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateLmsClassResponse](../../models/operations/CreateLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsClass

Retrieve a class

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetLmsClassRequest;
import com.unifiedapi.unifiedto.models.operations.GetLmsClassResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetLmsClassRequest req = GetLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsClassResponse res = sdk.class_().getLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetLmsClassRequest](../../models/operations/GetLmsClassRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetLmsClassResponse](../../models/operations/GetLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsClasses

List all classes

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListLmsClassesRequest;
import com.unifiedapi.unifiedto.models.operations.ListLmsClassesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListLmsClassesRequest req = ListLmsClassesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsClassesResponse res = sdk.class_().listLmsClasses()
                .request(req)
                .call();

        if (res.lmsClasses().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListLmsClassesRequest](../../models/operations/ListLmsClassesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListLmsClassesResponse](../../models/operations/ListLmsClassesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsClass

Update a class

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchLmsClassRequest;
import com.unifiedapi.unifiedto.models.operations.PatchLmsClassResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchLmsClassRequest req = PatchLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsClassResponse res = sdk.class_().patchLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchLmsClassRequest](../../models/operations/PatchLmsClassRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchLmsClassResponse](../../models/operations/PatchLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsClass

Remove a class

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveLmsClassRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveLmsClassResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveLmsClassRequest req = RemoveLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsClassResponse res = sdk.class_().removeLmsClass()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveLmsClassRequest](../../models/operations/RemoveLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveLmsClassResponse](../../models/operations/RemoveLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsClass

Update a class

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateLmsClassRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateLmsClassResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateLmsClassRequest req = UpdateLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsClassResponse res = sdk.class_().updateLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateLmsClassRequest](../../models/operations/UpdateLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateLmsClassResponse](../../models/operations/UpdateLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |