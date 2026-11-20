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
                            .id("9b372819-1b90-4f70-91b6-0f22d6a9e868")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-05-14T02:14:38.579Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("24fbb6d0-e4ea-439d-ad55-731e1ba26f0c")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-11T03:27:45.777Z"))
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
                            .id("638f8212-7ba2-49c4-8d28-869b8930d503")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-03-01T05:31:01.485Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("fc4eefa3-f78a-475a-a0a3-99d14c3fc472")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-12-08T17:25:31.045Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("071db219-f7e7-430e-8877-021dc088c0c8")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-09-02T13:18:02.232Z"))
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
                            .id("b593b487-3521-4650-98d7-ff81237be7ef")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-05-14T02:14:38.590Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("339316e6-7d5a-4afa-b632-2f3d84771c22")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-11T03:27:45.783Z"))
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
                            .id("72c61b5f-2561-4f44-a0ad-03dc0e677cb4")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-03-01T05:31:01.488Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("59bb72b9-1bb5-40e4-9007-935de8eb7b20")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-12-08T17:25:31.054Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("8f277339-62c7-42a4-b8d0-75655e8c8c3c")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-09-02T13:18:02.238Z"))
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
                            .id("b593b487-3521-4650-98d7-ff81237be7ef")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-05-14T02:14:38.590Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("339316e6-7d5a-4afa-b632-2f3d84771c22")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-11T03:27:45.783Z"))
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
                            .id("72c61b5f-2561-4f44-a0ad-03dc0e677cb4")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-03-01T05:31:01.488Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("59bb72b9-1bb5-40e4-9007-935de8eb7b20")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-12-08T17:25:31.054Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("8f277339-62c7-42a4-b8d0-75655e8c8c3c")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-09-02T13:18:02.238Z"))
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