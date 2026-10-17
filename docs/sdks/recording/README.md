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
                    .conversationIdentifier("d7eb6805-b3be-4766-8cc1-f4da8a2d5351")
                    .createdAt(OffsetDateTime.parse("2022-09-17T19:41:46.956Z"))
                    .endAt(OffsetDateTime.parse("2024-05-03T09:41:21.453Z"))
                    .expiresAt(OffsetDateTime.parse("2026-04-23T05:51:57.586Z"))
                    .id("d7eb6805-b3be-4766-8cc1-f4da8a2d5351")
                    .media(List.of(
                        UcRecordingMedia.builder()
                            .endAt(OffsetDateTime.parse("2024-03-31T07:29:22.005Z"))
                            .language("en")
                            .recordingDownloadUrl("https://parched-wasabi.com/")
                            .startAt(OffsetDateTime.parse("2026-05-11T20:43:53.580Z"))
                            .transcriptDownloadUrl("https://colossal-cuckoo.name")
                            .transcripts(List.of(
                                UcRecordingTranscript.builder()
                                    .text("Turpis maiores ducimus tero speculum.")
                                    .endAt(OffsetDateTime.parse("2026-02-21T03:37:26.871Z"))
                                    .startAt(OffsetDateTime.parse("2024-05-31T14:00:59.041Z"))
                                    .build(),
                                UcRecordingTranscript.builder()
                                    .text("Magnam consuasor uxor tergiversatio subseco.")
                                    .endAt(OffsetDateTime.parse("2024-10-10T12:39:12.074Z"))
                                    .startAt(OffsetDateTime.parse("2026-07-30T02:12:23.871Z"))
                                    .build()))
                            .build()))
                    .startAt(OffsetDateTime.parse("2023-04-27T03:48:44.809Z"))
                    .type(UcRecordingType.OUTBOUND)
                    .updatedAt(OffsetDateTime.parse("2025-03-14T00:37:45.995Z"))
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
                    .conversationIdentifier("4069de86-d629-440a-bce4-7040cffa2a7b")
                    .createdAt(OffsetDateTime.parse("2022-09-17T19:41:46.956Z"))
                    .endAt(OffsetDateTime.parse("2024-05-03T09:41:21.458Z"))
                    .expiresAt(OffsetDateTime.parse("2026-04-23T05:51:57.598Z"))
                    .id("4069de86-d629-440a-bce4-7040cffa2a7b")
                    .media(List.of(
                        UcRecordingMedia.builder()
                            .endAt(OffsetDateTime.parse("2024-03-31T07:29:22.010Z"))
                            .language("en")
                            .recordingDownloadUrl("https://parched-wasabi.com/")
                            .startAt(OffsetDateTime.parse("2026-05-11T20:43:53.593Z"))
                            .transcriptDownloadUrl("https://colossal-cuckoo.name")
                            .transcripts(List.of(
                                UcRecordingTranscript.builder()
                                    .text("Turpis maiores ducimus tero speculum.")
                                    .endAt(OffsetDateTime.parse("2026-02-21T03:37:26.882Z"))
                                    .startAt(OffsetDateTime.parse("2024-05-31T14:00:59.047Z"))
                                    .build(),
                                UcRecordingTranscript.builder()
                                    .text("Magnam consuasor uxor tergiversatio subseco.")
                                    .endAt(OffsetDateTime.parse("2024-10-10T12:39:12.081Z"))
                                    .startAt(OffsetDateTime.parse("2026-07-30T02:12:23.884Z"))
                                    .build()))
                            .build()))
                    .startAt(OffsetDateTime.parse("2023-04-27T03:48:44.811Z"))
                    .type(UcRecordingType.OUTBOUND)
                    .updatedAt(OffsetDateTime.parse("2025-03-14T00:37:46.003Z"))
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
                    .conversationIdentifier("4069de86-d629-440a-bce4-7040cffa2a7b")
                    .createdAt(OffsetDateTime.parse("2022-09-17T19:41:46.956Z"))
                    .endAt(OffsetDateTime.parse("2024-05-03T09:41:21.458Z"))
                    .expiresAt(OffsetDateTime.parse("2026-04-23T05:51:57.598Z"))
                    .id("4069de86-d629-440a-bce4-7040cffa2a7b")
                    .media(List.of(
                        UcRecordingMedia.builder()
                            .endAt(OffsetDateTime.parse("2024-03-31T07:29:22.010Z"))
                            .language("en")
                            .recordingDownloadUrl("https://parched-wasabi.com/")
                            .startAt(OffsetDateTime.parse("2026-05-11T20:43:53.593Z"))
                            .transcriptDownloadUrl("https://colossal-cuckoo.name")
                            .transcripts(List.of(
                                UcRecordingTranscript.builder()
                                    .text("Turpis maiores ducimus tero speculum.")
                                    .endAt(OffsetDateTime.parse("2026-02-21T03:37:26.882Z"))
                                    .startAt(OffsetDateTime.parse("2024-05-31T14:00:59.047Z"))
                                    .build(),
                                UcRecordingTranscript.builder()
                                    .text("Magnam consuasor uxor tergiversatio subseco.")
                                    .endAt(OffsetDateTime.parse("2024-10-10T12:39:12.081Z"))
                                    .startAt(OffsetDateTime.parse("2026-07-30T02:12:23.884Z"))
                                    .build()))
                            .build()))
                    .startAt(OffsetDateTime.parse("2023-04-27T03:48:44.811Z"))
                    .type(UcRecordingType.OUTBOUND)
                    .updatedAt(OffsetDateTime.parse("2025-03-14T00:37:46.003Z"))
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