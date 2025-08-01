# Recording
(*recording()*)

## Overview

### Available Operations

* [createUcRecording](#createucrecording) - Create a recording
* [getCalendarRecording](#getcalendarrecording) - Retrieve a recording
* [getUcRecording](#getucrecording) - Retrieve a recording
* [listCalendarRecordings](#listcalendarrecordings) - List all recordings
* [listUcRecordings](#listucrecordings) - List all recordings
* [patchUcRecording](#patchucrecording) - Update a recording
* [removeUcRecording](#removeucrecording) - Remove a recording
* [updateUcRecording](#updateucrecording) - Update a recording

## createUcRecording

Create a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcRecording" method="post" path="/uc/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcRecordingRequest req = CreateUcRecordingRequest.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcRecordingResponse res = sdk.recording().createUcRecording()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateUcRecordingRequest](../../models/operations/CreateUcRecordingRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateUcRecordingResponse](../../models/operations/CreateUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarRecording

Retrieve a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarRecording" method="get" path="/calendar/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarRecordingRequest;
import to.unified.unified_java_sdk.models.operations.GetCalendarRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarRecordingRequest req = GetCalendarRecordingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarRecordingResponse res = sdk.recording().getCalendarRecording()
                .request(req)
                .call();

        if (res.calendarRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetCalendarRecordingRequest](../../models/operations/GetCalendarRecordingRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetCalendarRecordingResponse](../../models/operations/GetCalendarRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcRecording

Retrieve a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcRecording" method="get" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.GetUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcRecordingRequest req = GetUcRecordingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcRecordingResponse res = sdk.recording().getUcRecording()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetUcRecordingRequest](../../models/operations/GetUcRecordingRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetUcRecordingResponse](../../models/operations/GetUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarRecordings

List all recordings

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarRecordings" method="get" path="/calendar/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarRecordingsRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarRecordingsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarRecordingsRequest req = ListCalendarRecordingsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarRecordingsResponse res = sdk.recording().listCalendarRecordings()
                .request(req)
                .call();

        if (res.calendarRecordings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListCalendarRecordingsRequest](../../models/operations/ListCalendarRecordingsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListCalendarRecordingsResponse](../../models/operations/ListCalendarRecordingsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcRecordings

List all recordings

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcRecordings" method="get" path="/uc/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcRecordingsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcRecordingsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcRecordingsRequest req = ListUcRecordingsRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcRecordingsResponse res = sdk.recording().listUcRecordings()
                .request(req)
                .call();

        if (res.ucRecordings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListUcRecordingsRequest](../../models/operations/ListUcRecordingsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListUcRecordingsResponse](../../models/operations/ListUcRecordingsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUcRecording

Update a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcRecording" method="patch" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcRecordingRequest req = PatchUcRecordingRequest.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcRecordingResponse res = sdk.recording().patchUcRecording()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchUcRecordingRequest](../../models/operations/PatchUcRecordingRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchUcRecordingResponse](../../models/operations/PatchUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUcRecording

Remove a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcRecording" method="delete" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcRecordingRequest req = RemoveUcRecordingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcRecordingResponse res = sdk.recording().removeUcRecording()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveUcRecordingRequest](../../models/operations/RemoveUcRecordingRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveUcRecordingResponse](../../models/operations/RemoveUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUcRecording

Update a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcRecording" method="put" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcRecordingRequest req = UpdateUcRecordingRequest.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcRecordingResponse res = sdk.recording().updateUcRecording()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateUcRecordingRequest](../../models/operations/UpdateUcRecordingRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateUcRecordingResponse](../../models/operations/UpdateUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |