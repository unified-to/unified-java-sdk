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
                            .id("4e6b05a4-8276-4453-a2e0-58c010423ed2")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-05-08T10:48:31.076Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("f66c7f7c-dd61-456b-b6eb-70158dfbe777")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-07T20:37:14.865Z"))
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
                            .id("ad9920f1-eead-4ca9-ad3c-fbdc2288acb7")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-28T19:28:38.938Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("50c854c6-4720-4a84-99f3-60576ad966d9")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-12-04T14:07:02.216Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("7ea8f9c0-727b-4adc-98bf-7cb873443ae9")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-30T08:26:36.128Z"))
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
                            .id("fb9b4963-70ae-4a43-9f7e-8b27c89b3868")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-05-08T10:48:31.087Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("1bc6740d-3f91-4e0a-86db-21dad34d8bf0")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-07T20:37:14.872Z"))
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
                            .id("cd33c245-4eab-4484-917f-516b4028d99f")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-28T19:28:38.941Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("4868233f-3a99-44c1-977a-e2be46728e42")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-12-04T14:07:02.225Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("9f5db5b3-94e4-473c-af11-b7ee0b5cf92a")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-30T08:26:36.135Z"))
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
                            .id("fb9b4963-70ae-4a43-9f7e-8b27c89b3868")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-05-08T10:48:31.087Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("1bc6740d-3f91-4e0a-86db-21dad34d8bf0")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-07T20:37:14.872Z"))
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
                            .id("cd33c245-4eab-4484-917f-516b4028d99f")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-28T19:28:38.941Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("4868233f-3a99-44c1-977a-e2be46728e42")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-12-04T14:07:02.225Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("9f5db5b3-94e4-473c-af11-b7ee0b5cf92a")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-30T08:26:36.135Z"))
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