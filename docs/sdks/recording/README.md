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

Create a recording

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
                    .conversationIdentifier("7e9726a2-df84-4d8f-984f-eb0f11d8e803")
                    .createdAt(OffsetDateTime.parse("2022-09-17T19:41:46.956Z"))
                    .endAt(OffsetDateTime.parse("2024-05-01T08:47:19.739Z"))
                    .expiresAt(OffsetDateTime.parse("2026-04-18T17:39:49.332Z"))
                    .id("7e9726a2-df84-4d8f-984f-eb0f11d8e803")
                    .media(List.of(
                        UcRecordingMedia.builder()
                            .endAt(OffsetDateTime.parse("2024-03-29T09:18:54.441Z"))
                            .language("en")
                            .recordingDownloadUrl("https://parched-wasabi.com/")
                            .startAt(OffsetDateTime.parse("2026-05-07T06:59:43.283Z"))
                            .transcriptDownloadUrl("https://colossal-cuckoo.name")
                            .transcripts(List.of(
                                UcRecordingTranscript.builder()
                                    .text("Turpis maiores ducimus tero speculum.")
                                    .endAt(OffsetDateTime.parse("2026-02-16T20:27:17.377Z"))
                                    .startAt(OffsetDateTime.parse("2024-05-29T10:47:39.765Z"))
                                    .build(),
                                UcRecordingTranscript.builder()
                                    .text("Magnam consuasor uxor tergiversatio subseco.")
                                    .endAt(OffsetDateTime.parse("2024-10-07T22:33:41.781Z"))
                                    .startAt(OffsetDateTime.parse("2026-07-25T05:56:36.515Z"))
                                    .build()))
                            .build()))
                    .startAt(OffsetDateTime.parse("2023-04-26T09:34:41.507Z"))
                    .type(UcRecordingType.OUTBOUND)
                    .updatedAt(OffsetDateTime.parse("2025-03-10T21:48:35.205Z"))
                    .userName("Melyna Larson")
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

Update a recording

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
                    .conversationIdentifier("343e3654-1061-4ebd-a745-6b4b1315502d")
                    .createdAt(OffsetDateTime.parse("2022-09-17T19:41:46.956Z"))
                    .endAt(OffsetDateTime.parse("2024-05-01T08:47:19.750Z"))
                    .expiresAt(OffsetDateTime.parse("2026-04-18T17:39:49.356Z"))
                    .id("343e3654-1061-4ebd-a745-6b4b1315502d")
                    .media(List.of(
                        UcRecordingMedia.builder()
                            .endAt(OffsetDateTime.parse("2024-03-29T09:18:54.451Z"))
                            .language("en")
                            .recordingDownloadUrl("https://parched-wasabi.com/")
                            .startAt(OffsetDateTime.parse("2026-05-07T06:59:43.308Z"))
                            .transcriptDownloadUrl("https://colossal-cuckoo.name")
                            .transcripts(List.of(
                                UcRecordingTranscript.builder()
                                    .text("Turpis maiores ducimus tero speculum.")
                                    .endAt(OffsetDateTime.parse("2026-02-16T20:27:17.400Z"))
                                    .startAt(OffsetDateTime.parse("2024-05-29T10:47:39.776Z"))
                                    .build(),
                                UcRecordingTranscript.builder()
                                    .text("Magnam consuasor uxor tergiversatio subseco.")
                                    .endAt(OffsetDateTime.parse("2024-10-07T22:33:41.794Z"))
                                    .startAt(OffsetDateTime.parse("2026-07-25T05:56:36.541Z"))
                                    .build()))
                            .build()))
                    .startAt(OffsetDateTime.parse("2023-04-26T09:34:41.511Z"))
                    .type(UcRecordingType.OUTBOUND)
                    .updatedAt(OffsetDateTime.parse("2025-03-10T21:48:35.221Z"))
                    .userName("Melyna Larson")
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
                    .conversationIdentifier("343e3654-1061-4ebd-a745-6b4b1315502d")
                    .createdAt(OffsetDateTime.parse("2022-09-17T19:41:46.956Z"))
                    .endAt(OffsetDateTime.parse("2024-05-01T08:47:19.750Z"))
                    .expiresAt(OffsetDateTime.parse("2026-04-18T17:39:49.356Z"))
                    .id("343e3654-1061-4ebd-a745-6b4b1315502d")
                    .media(List.of(
                        UcRecordingMedia.builder()
                            .endAt(OffsetDateTime.parse("2024-03-29T09:18:54.451Z"))
                            .language("en")
                            .recordingDownloadUrl("https://parched-wasabi.com/")
                            .startAt(OffsetDateTime.parse("2026-05-07T06:59:43.308Z"))
                            .transcriptDownloadUrl("https://colossal-cuckoo.name")
                            .transcripts(List.of(
                                UcRecordingTranscript.builder()
                                    .text("Turpis maiores ducimus tero speculum.")
                                    .endAt(OffsetDateTime.parse("2026-02-16T20:27:17.400Z"))
                                    .startAt(OffsetDateTime.parse("2024-05-29T10:47:39.776Z"))
                                    .build(),
                                UcRecordingTranscript.builder()
                                    .text("Magnam consuasor uxor tergiversatio subseco.")
                                    .endAt(OffsetDateTime.parse("2024-10-07T22:33:41.794Z"))
                                    .startAt(OffsetDateTime.parse("2026-07-25T05:56:36.541Z"))
                                    .build()))
                            .build()))
                    .startAt(OffsetDateTime.parse("2023-04-26T09:34:41.511Z"))
                    .type(UcRecordingType.OUTBOUND)
                    .updatedAt(OffsetDateTime.parse("2025-03-10T21:48:35.221Z"))
                    .userName("Melyna Larson")
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