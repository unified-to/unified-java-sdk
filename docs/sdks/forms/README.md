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

Creates a FormsForm. Provide the unified FormsForm fields in the request body; they are mapped to the provider's API. Returns the created FormsForm.

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
                    .confirmationMessage("Alo crebro vado utique.")
                    .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                    .description("Qui pauper triumphus adipisci comitatus tamen stabilis clementia culpo tolero.")
                    .fields(List.of(
                        FormField.builder()
                            .name("cornu creta confugo")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("4d1f120b-d3d8-4cbc-b224-8d43e8ad9076")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-05-02T06:53:17.806Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("b0d95d01-6e7e-4fad-bb87-ded17d4d60f3")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-04T06:30:39.377Z"))
                            .build(),
                        FormField.builder()
                            .name("officia supra consequatur")
                            .type(FormFieldType.MULTIPLE_SELECT)
                            .choices(List.of(
                                "conor",
                                "patior",
                                "crur",
                                "vinculum",
                                "tredecim"))
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .defaultValue("somniculosus")
                            .id("e0b2c958-3efe-48ca-8a15-1afba5fe0f48")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-27T06:17:59.968Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("08d6a3fd-7549-4c49-a556-3268864922d0")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-11-30T01:39:16.908Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("e4e5e7a3-6563-4f06-9046-25e758cbafc3")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-26T20:30:04.082Z"))
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

Retrieves a single FormsForm by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single FormsSubmission by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of FormsForms. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of FormsSubmissions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Updates the FormsForm identified by `id`. Provide the unified FormsForm fields to change in the request body.

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
                    .confirmationMessage("Alo crebro vado utique.")
                    .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                    .description("Qui pauper triumphus adipisci comitatus tamen stabilis clementia culpo tolero.")
                    .fields(List.of(
                        FormField.builder()
                            .name("cornu creta confugo")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("1fc62035-680a-4d00-b107-f1e53ec575d6")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-05-02T06:53:17.820Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("a299a531-da51-4c5a-82b3-ff57e0d958fa")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-04T06:30:39.384Z"))
                            .build(),
                        FormField.builder()
                            .name("officia supra consequatur")
                            .type(FormFieldType.MULTIPLE_SELECT)
                            .choices(List.of(
                                "conor",
                                "patior",
                                "crur",
                                "vinculum",
                                "tredecim"))
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .defaultValue("somniculosus")
                            .id("176819b0-d4cd-4ad6-8980-23414eb2353d")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-27T06:17:59.971Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("7fc9a339-0423-4921-ae81-641a80f406ab")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-11-30T01:39:16.917Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("23652ea4-1853-411d-8177-cf2bef4d2ee0")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-26T20:30:04.089Z"))
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

Deletes the FormsForm identified by `id`.

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

Updates the FormsForm identified by `id`. Provide the unified FormsForm fields to change in the request body.

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
                    .confirmationMessage("Alo crebro vado utique.")
                    .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                    .description("Qui pauper triumphus adipisci comitatus tamen stabilis clementia culpo tolero.")
                    .fields(List.of(
                        FormField.builder()
                            .name("cornu creta confugo")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("1fc62035-680a-4d00-b107-f1e53ec575d6")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-05-02T06:53:17.820Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("a299a531-da51-4c5a-82b3-ff57e0d958fa")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-04T06:30:39.384Z"))
                            .build(),
                        FormField.builder()
                            .name("officia supra consequatur")
                            .type(FormFieldType.MULTIPLE_SELECT)
                            .choices(List.of(
                                "conor",
                                "patior",
                                "crur",
                                "vinculum",
                                "tredecim"))
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .defaultValue("somniculosus")
                            .id("176819b0-d4cd-4ad6-8980-23414eb2353d")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-27T06:17:59.971Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("7fc9a339-0423-4921-ae81-641a80f406ab")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-11-30T01:39:16.917Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("23652ea4-1853-411d-8177-cf2bef4d2ee0")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-26T20:30:04.089Z"))
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