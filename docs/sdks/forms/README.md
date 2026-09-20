# Forms

## Overview

### Available Operations

* [createFormsForm](#createformsform) - Create a form
* [getFormsForm](#getformsform) - Retrieve a form
* [getFormsSubmission](#getformssubmission) - Retrieve a submission
* [listFormsForms](#listformsforms) - List all forms
* [listFormsSubmissions](#listformssubmissions) - List all submissions
* [patchFormsForm](#patchformsform) - Update a form
* [removeFormsForm](#removeformsform) - Remove a form
* [updateFormsForm](#updateformsform) - Update a form

## createFormsForm

Create a form

### Example Usage

<!-- UsageSnippet language="java" operationID="createFormsForm" method="post" path="/forms/{connection_id}/form" example="forms_form" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateFormsFormRequest;
import to.unified.unified_java_sdk.models.operations.CreateFormsFormResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateFormsFormRequest req = CreateFormsFormRequest.builder()
                .formsForm(FormsForm.builder()
                    .confirmationMessage("Cultura temeritas aptus celebrer volo pecus culpa annus aurum.")
                    .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                    .description("Sodalitas cupiditas terebro conduco.")
                    .fields(List.of(
                        FormField.builder()
                            .name("vulgivagus audio accendo")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("565f27cf-2cf7-4c30-ad97-4340d859b584")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-04-12T18:31:40.541Z"))
                            .build(),
                        FormField.builder()
                            .name("alo crebro vado")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("82b263f9-2d16-4cdf-8e99-d05ba46ce817")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-08-23T21:51:40.369Z"))
                            .build(),
                        FormField.builder()
                            .name("casso tenus nesciunt")
                            .type(FormFieldType.MULTIPLE_SELECT)
                            .choices(List.of(
                                "vallum",
                                "vae",
                                "nesciunt",
                                "commodi",
                                "appositus"))
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .defaultValue("cattus")
                            .id("d7c963e5-2d3d-4436-a57d-a6e337d9d170")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-22T08:35:05.511Z"))
                            .build(),
                        FormField.builder()
                            .name("comburo utique ipsa")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Sequi antea delectatio.")
                            .id("e45efb8f-439b-40f6-8370-99c8ec66b065")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-11-15T18:13:46.234Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("c377b659-920a-4dbc-932a-0774211b2e59")
                    .isActive(false)
                    .name("voluptatibus omnis audax Form")
                    .publishedUrl("https://impartial-institute.org/")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-15T18:42:53.121Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateFormsFormResponse res = sdk.forms().createFormsForm()
                .request(req)
                .call();

        if (res.formsForm().isPresent()) {
            System.out.println(res.formsForm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateFormsFormRequest](../../models/operations/CreateFormsFormRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateFormsFormResponse](../../models/operations/CreateFormsFormResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFormsForm

Retrieve a form

### Example Usage

<!-- UsageSnippet language="java" operationID="getFormsForm" method="get" path="/forms/{connection_id}/form/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFormsFormRequest;
import to.unified.unified_java_sdk.models.operations.GetFormsFormResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFormsFormRequest req = GetFormsFormRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFormsFormResponse res = sdk.forms().getFormsForm()
                .request(req)
                .call();

        if (res.formsForm().isPresent()) {
            System.out.println(res.formsForm().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetFormsFormRequest](../../models/operations/GetFormsFormRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetFormsFormResponse](../../models/operations/GetFormsFormResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFormsSubmission

Retrieve a submission

### Example Usage

<!-- UsageSnippet language="java" operationID="getFormsSubmission" method="get" path="/forms/{connection_id}/submission/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFormsSubmissionRequest;
import to.unified.unified_java_sdk.models.operations.GetFormsSubmissionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFormsSubmissionRequest req = GetFormsSubmissionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFormsSubmissionResponse res = sdk.forms().getFormsSubmission()
                .request(req)
                .call();

        if (res.formsSubmission().isPresent()) {
            System.out.println(res.formsSubmission().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetFormsSubmissionRequest](../../models/operations/GetFormsSubmissionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetFormsSubmissionResponse](../../models/operations/GetFormsSubmissionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFormsForms

List all forms

### Example Usage

<!-- UsageSnippet language="java" operationID="listFormsForms" method="get" path="/forms/{connection_id}/form" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFormsFormsRequest;
import to.unified.unified_java_sdk.models.operations.ListFormsFormsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFormsFormsRequest req = ListFormsFormsRequest.builder()
                .connectionId("<id>")
                .build();

        ListFormsFormsResponse res = sdk.forms().listFormsForms()
                .request(req)
                .call();

        if (res.formsForms().isPresent()) {
            System.out.println(res.formsForms().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListFormsFormsRequest](../../models/operations/ListFormsFormsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListFormsFormsResponse](../../models/operations/ListFormsFormsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFormsSubmissions

List all submissions

### Example Usage

<!-- UsageSnippet language="java" operationID="listFormsSubmissions" method="get" path="/forms/{connection_id}/submission" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFormsSubmissionsRequest;
import to.unified.unified_java_sdk.models.operations.ListFormsSubmissionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFormsSubmissionsRequest req = ListFormsSubmissionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListFormsSubmissionsResponse res = sdk.forms().listFormsSubmissions()
                .request(req)
                .call();

        if (res.formsSubmissions().isPresent()) {
            System.out.println(res.formsSubmissions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListFormsSubmissionsRequest](../../models/operations/ListFormsSubmissionsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListFormsSubmissionsResponse](../../models/operations/ListFormsSubmissionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchFormsForm

Update a form

### Example Usage

<!-- UsageSnippet language="java" operationID="patchFormsForm" method="patch" path="/forms/{connection_id}/form/{id}" example="forms_form" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchFormsFormRequest;
import to.unified.unified_java_sdk.models.operations.PatchFormsFormResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchFormsFormRequest req = PatchFormsFormRequest.builder()
                .formsForm(FormsForm.builder()
                    .confirmationMessage("Cultura temeritas aptus celebrer volo pecus culpa annus aurum.")
                    .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                    .description("Sodalitas cupiditas terebro conduco.")
                    .fields(List.of(
                        FormField.builder()
                            .name("vulgivagus audio accendo")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("565f27cf-2cf7-4c30-ad97-4340d859b584")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-04-12T18:31:40.548Z"))
                            .build(),
                        FormField.builder()
                            .name("alo crebro vado")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("82b263f9-2d16-4cdf-8e99-d05ba46ce817")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-08-23T21:51:40.373Z"))
                            .build(),
                        FormField.builder()
                            .name("casso tenus nesciunt")
                            .type(FormFieldType.MULTIPLE_SELECT)
                            .choices(List.of(
                                "vallum",
                                "vae",
                                "nesciunt",
                                "commodi",
                                "appositus"))
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .defaultValue("cattus")
                            .id("d7c963e5-2d3d-4436-a57d-a6e337d9d170")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-22T08:35:05.512Z"))
                            .build(),
                        FormField.builder()
                            .name("comburo utique ipsa")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Sequi antea delectatio.")
                            .id("e45efb8f-439b-40f6-8370-99c8ec66b065")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-11-15T18:13:46.240Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("074396ca-fbcc-4190-8714-3ba61415553f")
                    .isActive(false)
                    .name("voluptatibus omnis audax Form")
                    .publishedUrl("https://impartial-institute.org/")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-15T18:42:53.125Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchFormsFormResponse res = sdk.forms().patchFormsForm()
                .request(req)
                .call();

        if (res.formsForm().isPresent()) {
            System.out.println(res.formsForm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchFormsFormRequest](../../models/operations/PatchFormsFormRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchFormsFormResponse](../../models/operations/PatchFormsFormResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeFormsForm

Remove a form

### Example Usage

<!-- UsageSnippet language="java" operationID="removeFormsForm" method="delete" path="/forms/{connection_id}/form/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveFormsFormRequest;
import to.unified.unified_java_sdk.models.operations.RemoveFormsFormResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveFormsFormRequest req = RemoveFormsFormRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveFormsFormResponse res = sdk.forms().removeFormsForm()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveFormsFormRequest](../../models/operations/RemoveFormsFormRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveFormsFormResponse](../../models/operations/RemoveFormsFormResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateFormsForm

Update a form

### Example Usage

<!-- UsageSnippet language="java" operationID="updateFormsForm" method="put" path="/forms/{connection_id}/form/{id}" example="forms_form" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateFormsFormRequest;
import to.unified.unified_java_sdk.models.operations.UpdateFormsFormResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateFormsFormRequest req = UpdateFormsFormRequest.builder()
                .formsForm(FormsForm.builder()
                    .confirmationMessage("Cultura temeritas aptus celebrer volo pecus culpa annus aurum.")
                    .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                    .description("Sodalitas cupiditas terebro conduco.")
                    .fields(List.of(
                        FormField.builder()
                            .name("vulgivagus audio accendo")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("565f27cf-2cf7-4c30-ad97-4340d859b584")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-04-12T18:31:40.548Z"))
                            .build(),
                        FormField.builder()
                            .name("alo crebro vado")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("82b263f9-2d16-4cdf-8e99-d05ba46ce817")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-08-23T21:51:40.373Z"))
                            .build(),
                        FormField.builder()
                            .name("casso tenus nesciunt")
                            .type(FormFieldType.MULTIPLE_SELECT)
                            .choices(List.of(
                                "vallum",
                                "vae",
                                "nesciunt",
                                "commodi",
                                "appositus"))
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .defaultValue("cattus")
                            .id("d7c963e5-2d3d-4436-a57d-a6e337d9d170")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-22T08:35:05.512Z"))
                            .build(),
                        FormField.builder()
                            .name("comburo utique ipsa")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Sequi antea delectatio.")
                            .id("e45efb8f-439b-40f6-8370-99c8ec66b065")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-11-15T18:13:46.240Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("074396ca-fbcc-4190-8714-3ba61415553f")
                    .isActive(false)
                    .name("voluptatibus omnis audax Form")
                    .publishedUrl("https://impartial-institute.org/")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-15T18:42:53.125Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateFormsFormResponse res = sdk.forms().updateFormsForm()
                .request(req)
                .call();

        if (res.formsForm().isPresent()) {
            System.out.println(res.formsForm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateFormsFormRequest](../../models/operations/UpdateFormsFormRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateFormsFormResponse](../../models/operations/UpdateFormsFormResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |