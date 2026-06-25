# Recording

## Overview

### Available Operations

* [createUcRecording2](#createucrecording2) - Create a recording
* [getCalendarRecording2](#getcalendarrecording2) - Retrieve a recording
* [getUcRecording2](#getucrecording2) - Retrieve a recording
* [listCalendarRecordings2](#listcalendarrecordings2) - List all recordings
* [listUcRecordings2](#listucrecordings2) - List all recordings
* [patchUcRecording2](#patchucrecording2) - Update a recording
* [removeUcRecording2](#removeucrecording2) - Remove a recording
* [updateUcRecording2](#updateucrecording2) - Update a recording

## createUcRecording2

Create a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcRecording2" method="post" path="/uc/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.CreateUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcRecording2Request req = CreateUcRecording2Request.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcRecording2Response res = sdk.recording().createUcRecording2()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            System.out.println(res.ucRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateUcRecording2Request](../../models/operations/CreateUcRecording2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateUcRecording2Response](../../models/operations/CreateUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarRecording2

Retrieve a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarRecording2" method="get" path="/calendar/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarRecording2Request;
import to.unified.unified_java_sdk.models.operations.GetCalendarRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarRecording2Request req = GetCalendarRecording2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarRecording2Response res = sdk.recording().getCalendarRecording2()
                .request(req)
                .call();

        if (res.calendarRecording().isPresent()) {
            System.out.println(res.calendarRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetCalendarRecording2Request](../../models/operations/GetCalendarRecording2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetCalendarRecording2Response](../../models/operations/GetCalendarRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcRecording2

Retrieve a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcRecording2" method="get" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.GetUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcRecording2Request req = GetUcRecording2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcRecording2Response res = sdk.recording().getUcRecording2()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            System.out.println(res.ucRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetUcRecording2Request](../../models/operations/GetUcRecording2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetUcRecording2Response](../../models/operations/GetUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarRecordings2

List all recordings

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarRecordings2" method="get" path="/calendar/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarRecordings2Request;
import to.unified.unified_java_sdk.models.operations.ListCalendarRecordings2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarRecordings2Request req = ListCalendarRecordings2Request.builder()
                .connectionId("<id>")
                .build();

        ListCalendarRecordings2Response res = sdk.recording().listCalendarRecordings2()
                .request(req)
                .call();

        if (res.calendarRecordings().isPresent()) {
            System.out.println(res.calendarRecordings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListCalendarRecordings2Request](../../models/operations/ListCalendarRecordings2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListCalendarRecordings2Response](../../models/operations/ListCalendarRecordings2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcRecordings2

List all recordings

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcRecordings2" method="get" path="/uc/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcRecordings2Request;
import to.unified.unified_java_sdk.models.operations.ListUcRecordings2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcRecordings2Request req = ListUcRecordings2Request.builder()
                .connectionId("<id>")
                .build();

        ListUcRecordings2Response res = sdk.recording().listUcRecordings2()
                .request(req)
                .call();

        if (res.ucRecordings().isPresent()) {
            System.out.println(res.ucRecordings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListUcRecordings2Request](../../models/operations/ListUcRecordings2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListUcRecordings2Response](../../models/operations/ListUcRecordings2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUcRecording2

Update a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcRecording2" method="patch" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.PatchUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcRecording2Request req = PatchUcRecording2Request.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcRecording2Response res = sdk.recording().patchUcRecording2()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            System.out.println(res.ucRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchUcRecording2Request](../../models/operations/PatchUcRecording2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchUcRecording2Response](../../models/operations/PatchUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUcRecording2

Remove a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcRecording2" method="delete" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcRecording2Request req = RemoveUcRecording2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcRecording2Response res = sdk.recording().removeUcRecording2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveUcRecording2Request](../../models/operations/RemoveUcRecording2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveUcRecording2Response](../../models/operations/RemoveUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUcRecording2

Update a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcRecording2" method="put" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcRecording2Request req = UpdateUcRecording2Request.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcRecording2Response res = sdk.recording().updateUcRecording2()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            System.out.println(res.ucRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateUcRecording2Request](../../models/operations/UpdateUcRecording2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateUcRecording2Response](../../models/operations/UpdateUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |