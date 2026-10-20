# Form

## Overview

### Available Operations

* [createFormsForm](#createformsform) - Create a form
* [getFormsForm](#getformsform) - Retrieve a form
* [listFormsForms](#listformsforms) - List all forms
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
                    .confirmationMessage("Alo crebro vado utique.")
                    .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                    .description("Qui pauper triumphus adipisci comitatus tamen stabilis clementia culpo tolero.")
                    .fields(List.of(
                        FormField.builder()
                            .name("cornu creta confugo")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("d90d8092-a058-40fa-8c38-c0d0c0f1bfde")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-04-28T01:16:19.073Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("5b3ac817-6b3d-4e44-a7eb-c8776a4f2f46")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-01T19:21:22.886Z"))
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
                            .id("351d47cd-55d8-40d6-ad69-cb796fec78c7")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-26T04:45:37.090Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("d49dc7b9-5fc1-4f28-8adf-ac66d8ac3fcf")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-11-26T23:08:40.354Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("7b8c87dc-73ab-4bed-9d21-1cb9f00012b2")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-24T10:50:08.295Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateFormsFormResponse res = sdk.form().createFormsForm()
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

        GetFormsFormResponse res = sdk.form().getFormsForm()
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

        ListFormsFormsResponse res = sdk.form().listFormsForms()
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
                    .confirmationMessage("Alo crebro vado utique.")
                    .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                    .description("Qui pauper triumphus adipisci comitatus tamen stabilis clementia culpo tolero.")
                    .fields(List.of(
                        FormField.builder()
                            .name("cornu creta confugo")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("884e99ef-25f1-4b9f-b4ae-b41d81a12f0b")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-04-28T01:16:19.082Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("2628ae7d-1fef-4b07-8540-6825583b3f34")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-01T19:21:22.891Z"))
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
                            .id("67495728-61b6-4d14-ae22-1ae684cd22f3")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-26T04:45:37.092Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("f8d376cc-fcaf-4cae-a3d1-448dd2e54e17")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-11-26T23:08:40.360Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("e49c3839-b7f9-467b-8570-3f70ee3b1754")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-24T10:50:08.299Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchFormsFormResponse res = sdk.form().patchFormsForm()
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

        RemoveFormsFormResponse res = sdk.form().removeFormsForm()
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
                    .confirmationMessage("Alo crebro vado utique.")
                    .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                    .description("Qui pauper triumphus adipisci comitatus tamen stabilis clementia culpo tolero.")
                    .fields(List.of(
                        FormField.builder()
                            .name("cornu creta confugo")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("884e99ef-25f1-4b9f-b4ae-b41d81a12f0b")
                            .isActive(true)
                            .isRequired(true)
                            .maxLength(146d)
                            .order(0d)
                            .updatedAt(OffsetDateTime.parse("2025-04-28T01:16:19.082Z"))
                            .build(),
                        FormField.builder()
                            .name("tracto nostrum desidero")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .id("2628ae7d-1fef-4b07-8540-6825583b3f34")
                            .isActive(true)
                            .isRequired(false)
                            .order(1d)
                            .updatedAt(OffsetDateTime.parse("2024-09-01T19:21:22.891Z"))
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
                            .id("67495728-61b6-4d14-ae22-1ae684cd22f3")
                            .isActive(true)
                            .isRequired(false)
                            .order(2d)
                            .updatedAt(OffsetDateTime.parse("2024-02-26T04:45:37.092Z"))
                            .build(),
                        FormField.builder()
                            .name("curtus fugiat audentia")
                            .type(FormFieldType.TEXTAREA)
                            .createdAt(OffsetDateTime.parse("2023-10-05T21:34:29.094Z"))
                            .description("Antepono cursim aurum voluptatum placeat audax tripudio amo.")
                            .id("f8d376cc-fcaf-4cae-a3d1-448dd2e54e17")
                            .isActive(true)
                            .isRequired(false)
                            .order(3d)
                            .updatedAt(OffsetDateTime.parse("2024-11-26T23:08:40.360Z"))
                            .build()))
                    .hasMultipleSubmissions(false)
                    .hasProgressBar(false)
                    .hasShuffleQuestions(true)
                    .id("e49c3839-b7f9-467b-8570-3f70ee3b1754")
                    .isActive(false)
                    .metadata(List.of())
                    .name("tandem tracto vivo Form")
                    .publishedUrl("https://massive-blowgun.info")
                    .responseCount(423d)
                    .updatedAt(OffsetDateTime.parse("2024-08-24T10:50:08.299Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateFormsFormResponse res = sdk.form().updateFormsForm()
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