# Recording

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

Creates a UcRecording. Provide the unified UcRecording fields in the request body; they are mapped to the provider's API. Returns the created UcRecording.

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcRecording" method="post" path="/uc/{connection_id}/recording" example="uc_recording" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcRecordingRequest req = CreateUcRecordingRequest.builder()
                .ucRecording(UcRecording.builder()
                    .contacts(List.of())
                    .conversationIdentifier("aa838d27-55a8-4f18-88ee-a1c2873227a1")
                    .createdAt(OffsetDateTime.parse("2022-09-17T19:41:46.956Z"))
                    .endAt(OffsetDateTime.parse("2024-05-06T22:55:05.212Z"))
                    .expiresAt(OffsetDateTime.parse("2026-05-01T02:27:07.834Z"))
                    .id("aa838d27-55a8-4f18-88ee-a1c2873227a1")
                    .media(List.of(
                        UcRecordingMedia.builder()
                            .endAt(OffsetDateTime.parse("2024-04-03T15:58:00.647Z"))
                            .language("en")
                            .recordingDownloadUrl("https://parched-wasabi.com/")
                            .startAt(OffsetDateTime.parse("2026-05-19T19:59:28.217Z"))
                            .transcriptDownloadUrl("https://colossal-cuckoo.name")
                            .transcripts(List.of(
                                UcRecordingTranscript.builder()
                                    .text("Turpis maiores ducimus tero speculum.")
                                    .endAt(OffsetDateTime.parse("2026-02-28T15:26:17.864Z"))
                                    .startAt(OffsetDateTime.parse("2024-06-04T07:17:29.228Z"))
                                    .build(),
                                UcRecordingTranscript.builder()
                                    .text("Magnam consuasor uxor tergiversatio subseco.")
                                    .endAt(OffsetDateTime.parse("2024-10-15T00:52:23.858Z"))
                                    .startAt(OffsetDateTime.parse("2026-08-07T12:50:31.619Z"))
                                    .build()))
                            .build()))
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2023-04-28T11:35:34.765Z"))
                    .type(UcRecordingType.OUTBOUND)
                    .updatedAt(OffsetDateTime.parse("2025-03-19T11:01:58.491Z"))
                    .userPhone("1-915-327-0429 x509")
                    .webUrl("https://spherical-comparison.org")
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcRecordingResponse res = sdk.recording().createUcRecording()
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
| `request`                                                                       | [CreateUcRecordingRequest](../../models/operations/CreateUcRecordingRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateUcRecordingResponse](../../models/operations/CreateUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarRecording

Retrieves a single CalendarRecording by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.calendarRecording().get());
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

Retrieves a single UcRecording by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.ucRecording().get());
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

Returns a list of CalendarRecordings. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.calendarRecordings().get());
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

Returns a list of UcRecordings. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.ucRecordings().get());
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

Updates the UcRecording identified by `id`. Provide the unified UcRecording fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcRecording" method="patch" path="/uc/{connection_id}/recording/{id}" example="uc_recording" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcRecordingRequest req = PatchUcRecordingRequest.builder()
                .ucRecording(UcRecording.builder()
                    .contacts(List.of())
                    .conversationIdentifier("d368c787-f7cc-4015-91f4-d4aea7c62f36")
                    .createdAt(OffsetDateTime.parse("2022-09-17T19:41:46.956Z"))
                    .endAt(OffsetDateTime.parse("2024-05-06T22:55:05.229Z"))
                    .expiresAt(OffsetDateTime.parse("2026-05-01T02:27:07.872Z"))
                    .id("d368c787-f7cc-4015-91f4-d4aea7c62f36")
                    .media(List.of(
                        UcRecordingMedia.builder()
                            .endAt(OffsetDateTime.parse("2024-04-03T15:58:00.663Z"))
                            .language("en")
                            .recordingDownloadUrl("https://parched-wasabi.com/")
                            .startAt(OffsetDateTime.parse("2026-05-19T19:59:28.255Z"))
                            .transcriptDownloadUrl("https://colossal-cuckoo.name")
                            .transcripts(List.of(
                                UcRecordingTranscript.builder()
                                    .text("Turpis maiores ducimus tero speculum.")
                                    .endAt(OffsetDateTime.parse("2026-02-28T15:26:17.901Z"))
                                    .startAt(OffsetDateTime.parse("2024-06-04T07:17:29.246Z"))
                                    .build(),
                                UcRecordingTranscript.builder()
                                    .text("Magnam consuasor uxor tergiversatio subseco.")
                                    .endAt(OffsetDateTime.parse("2024-10-15T00:52:23.879Z"))
                                    .startAt(OffsetDateTime.parse("2026-08-07T12:50:31.660Z"))
                                    .build()))
                            .build()))
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2023-04-28T11:35:34.771Z"))
                    .type(UcRecordingType.OUTBOUND)
                    .updatedAt(OffsetDateTime.parse("2025-03-19T11:01:58.518Z"))
                    .userPhone("1-915-327-0429 x509")
                    .webUrl("https://spherical-comparison.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcRecordingResponse res = sdk.recording().patchUcRecording()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            System.out.println(res.ucRecording().get());
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

Deletes the UcRecording identified by `id`.

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

Updates the UcRecording identified by `id`. Provide the unified UcRecording fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcRecording" method="put" path="/uc/{connection_id}/recording/{id}" example="uc_recording" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcRecordingRequest req = UpdateUcRecordingRequest.builder()
                .ucRecording(UcRecording.builder()
                    .contacts(List.of())
                    .conversationIdentifier("d368c787-f7cc-4015-91f4-d4aea7c62f36")
                    .createdAt(OffsetDateTime.parse("2022-09-17T19:41:46.956Z"))
                    .endAt(OffsetDateTime.parse("2024-05-06T22:55:05.229Z"))
                    .expiresAt(OffsetDateTime.parse("2026-05-01T02:27:07.872Z"))
                    .id("d368c787-f7cc-4015-91f4-d4aea7c62f36")
                    .media(List.of(
                        UcRecordingMedia.builder()
                            .endAt(OffsetDateTime.parse("2024-04-03T15:58:00.663Z"))
                            .language("en")
                            .recordingDownloadUrl("https://parched-wasabi.com/")
                            .startAt(OffsetDateTime.parse("2026-05-19T19:59:28.255Z"))
                            .transcriptDownloadUrl("https://colossal-cuckoo.name")
                            .transcripts(List.of(
                                UcRecordingTranscript.builder()
                                    .text("Turpis maiores ducimus tero speculum.")
                                    .endAt(OffsetDateTime.parse("2026-02-28T15:26:17.901Z"))
                                    .startAt(OffsetDateTime.parse("2024-06-04T07:17:29.246Z"))
                                    .build(),
                                UcRecordingTranscript.builder()
                                    .text("Magnam consuasor uxor tergiversatio subseco.")
                                    .endAt(OffsetDateTime.parse("2024-10-15T00:52:23.879Z"))
                                    .startAt(OffsetDateTime.parse("2026-08-07T12:50:31.660Z"))
                                    .build()))
                            .build()))
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2023-04-28T11:35:34.771Z"))
                    .type(UcRecordingType.OUTBOUND)
                    .updatedAt(OffsetDateTime.parse("2025-03-19T11:01:58.518Z"))
                    .userPhone("1-915-327-0429 x509")
                    .webUrl("https://spherical-comparison.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcRecordingResponse res = sdk.recording().updateUcRecording()
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
| `request`                                                                       | [UpdateUcRecordingRequest](../../models/operations/UpdateUcRecordingRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateUcRecordingResponse](../../models/operations/UpdateUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |