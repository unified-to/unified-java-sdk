# Signing

## Overview

### Available Operations

* [createSigningDocument](#createsigningdocument) - Create a document
* [createSigningSignatory](#createsigningsignatory) - Create a signatory
* [getSigningDocument](#getsigningdocument) - Retrieve a document
* [getSigningSignatory](#getsigningsignatory) - Retrieve a signatory
* [getSigningTemplate](#getsigningtemplate) - Retrieve a template
* [listSigningDocuments](#listsigningdocuments) - List all documents
* [listSigningSignatories](#listsigningsignatories) - List all signatories
* [listSigningTemplates](#listsigningtemplates) - List all templates
* [patchSigningDocument](#patchsigningdocument) - Update a document
* [patchSigningSignatory](#patchsigningsignatory) - Update a signatory
* [removeSigningDocument](#removesigningdocument) - Remove a document
* [removeSigningSignatory](#removesigningsignatory) - Remove a signatory
* [updateSigningDocument](#updatesigningdocument) - Update a document
* [updateSigningSignatory](#updatesigningsignatory) - Update a signatory

## createSigningDocument

Creates a SigningDocument. Provide the unified SigningDocument fields in the request body; they are mapped to the provider's API. Returns the created SigningDocument.

### Example Usage

<!-- UsageSnippet language="java" operationID="createSigningDocument" method="post" path="/signing/{connection_id}/document" example="signing_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateSigningDocumentRequest;
import to.unified.unified_java_sdk.models.operations.CreateSigningDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateSigningDocumentRequest req = CreateSigningDocumentRequest.builder()
                .signingDocument(SigningDocument.builder()
                    .createdAt(OffsetDateTime.parse("2021-05-02T09:35:23.679Z"))
                    .description("Aer asporto caste umbra coerceo anser color allatus aestas perspiciatis.")
                    .expiresAt(OffsetDateTime.parse("2021-06-04T01:21:34.949Z"))
                    .id("29d37d3b-149f-4b21-8acc-b8808f5a5fce")
                    .metadata(List.of())
                    .name("Denesik Group NDA")
                    .sentAt(OffsetDateTime.parse("2022-07-01T03:02:34.545Z"))
                    .status(SigningDocumentStatus.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2025-09-09T00:19:25.946Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateSigningDocumentResponse res = sdk.signing().createSigningDocument()
                .request(req)
                .call();

        if (res.signingDocument().isPresent()) {
            System.out.println(res.signingDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateSigningDocumentRequest](../../models/operations/CreateSigningDocumentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateSigningDocumentResponse](../../models/operations/CreateSigningDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createSigningSignatory

Creates a SigningSignatory. Provide the unified SigningSignatory fields in the request body; they are mapped to the provider's API. Returns the created SigningSignatory.

### Example Usage

<!-- UsageSnippet language="java" operationID="createSigningSignatory" method="post" path="/signing/{connection_id}/signatory" example="signing_signatory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.CreateSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateSigningSignatoryRequest req = CreateSigningSignatoryRequest.builder()
                .signingSignatory(SigningSignatory.builder()
                    .createdAt(OffsetDateTime.parse("2022-04-16T19:25:01.966Z"))
                    .email("anais.lakin@icloud.com")
                    .id("053def36-1a47-4433-b103-9c12ff18b93d")
                    .metadata(List.of())
                    .name("Anais Lakin")
                    .role(SigningSignatoryRole.SIGNER)
                    .status(SigningSignatoryStatus.ERROR)
                    .updatedAt(OffsetDateTime.parse("2024-05-21T08:58:14.666Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateSigningSignatoryResponse res = sdk.signing().createSigningSignatory()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateSigningSignatoryRequest](../../models/operations/CreateSigningSignatoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateSigningSignatoryResponse](../../models/operations/CreateSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSigningDocument

Retrieves a single SigningDocument by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningDocument" method="get" path="/signing/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningDocumentRequest;
import to.unified.unified_java_sdk.models.operations.GetSigningDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningDocumentRequest req = GetSigningDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningDocumentResponse res = sdk.signing().getSigningDocument()
                .request(req)
                .call();

        if (res.signingDocument().isPresent()) {
            System.out.println(res.signingDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetSigningDocumentRequest](../../models/operations/GetSigningDocumentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetSigningDocumentResponse](../../models/operations/GetSigningDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSigningSignatory

Retrieves a single SigningSignatory by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningSignatory" method="get" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.GetSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningSignatoryRequest req = GetSigningSignatoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningSignatoryResponse res = sdk.signing().getSigningSignatory()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetSigningSignatoryRequest](../../models/operations/GetSigningSignatoryRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetSigningSignatoryResponse](../../models/operations/GetSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSigningTemplate

Retrieves a single SigningTemplate by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningTemplate" method="get" path="/signing/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplateRequest;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningTemplateRequest req = GetSigningTemplateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningTemplateResponse res = sdk.signing().getSigningTemplate()
                .request(req)
                .call();

        if (res.signingTemplate().isPresent()) {
            System.out.println(res.signingTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetSigningTemplateRequest](../../models/operations/GetSigningTemplateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetSigningTemplateResponse](../../models/operations/GetSigningTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningDocuments

Returns a list of SigningDocuments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningDocuments" method="get" path="/signing/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningDocumentsRequest;
import to.unified.unified_java_sdk.models.operations.ListSigningDocumentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningDocumentsRequest req = ListSigningDocumentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListSigningDocumentsResponse res = sdk.signing().listSigningDocuments()
                .request(req)
                .call();

        if (res.signingDocuments().isPresent()) {
            System.out.println(res.signingDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListSigningDocumentsRequest](../../models/operations/ListSigningDocumentsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListSigningDocumentsResponse](../../models/operations/ListSigningDocumentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningSignatories

Returns a list of SigningSignatories. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningSignatories" method="get" path="/signing/{connection_id}/signatory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningSignatoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListSigningSignatoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningSignatoriesRequest req = ListSigningSignatoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListSigningSignatoriesResponse res = sdk.signing().listSigningSignatories()
                .request(req)
                .call();

        if (res.signingSignatories().isPresent()) {
            System.out.println(res.signingSignatories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListSigningSignatoriesRequest](../../models/operations/ListSigningSignatoriesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListSigningSignatoriesResponse](../../models/operations/ListSigningSignatoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningTemplates

Returns a list of SigningTemplates. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningTemplates" method="get" path="/signing/{connection_id}/template" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplatesRequest;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplatesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningTemplatesRequest req = ListSigningTemplatesRequest.builder()
                .connectionId("<id>")
                .build();

        ListSigningTemplatesResponse res = sdk.signing().listSigningTemplates()
                .request(req)
                .call();

        if (res.signingTemplates().isPresent()) {
            System.out.println(res.signingTemplates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListSigningTemplatesRequest](../../models/operations/ListSigningTemplatesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListSigningTemplatesResponse](../../models/operations/ListSigningTemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchSigningDocument

Updates the SigningDocument identified by `id`. Provide the unified SigningDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSigningDocument" method="patch" path="/signing/{connection_id}/document/{id}" example="signing_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSigningDocumentRequest;
import to.unified.unified_java_sdk.models.operations.PatchSigningDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSigningDocumentRequest req = PatchSigningDocumentRequest.builder()
                .signingDocument(SigningDocument.builder()
                    .createdAt(OffsetDateTime.parse("2021-05-02T09:35:23.679Z"))
                    .description("Aer asporto caste umbra coerceo anser color allatus aestas perspiciatis.")
                    .expiresAt(OffsetDateTime.parse("2021-06-04T01:21:34.949Z"))
                    .id("6c35daa0-980b-425a-b273-bb48488e72b6")
                    .metadata(List.of())
                    .name("Denesik Group NDA")
                    .sentAt(OffsetDateTime.parse("2022-07-01T03:02:34.548Z"))
                    .status(SigningDocumentStatus.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2025-09-09T00:19:25.958Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSigningDocumentResponse res = sdk.signing().patchSigningDocument()
                .request(req)
                .call();

        if (res.signingDocument().isPresent()) {
            System.out.println(res.signingDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchSigningDocumentRequest](../../models/operations/PatchSigningDocumentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchSigningDocumentResponse](../../models/operations/PatchSigningDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchSigningSignatory

Updates the SigningSignatory identified by `id`. Provide the unified SigningSignatory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSigningSignatory" method="patch" path="/signing/{connection_id}/signatory/{id}" example="signing_signatory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.PatchSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSigningSignatoryRequest req = PatchSigningSignatoryRequest.builder()
                .signingSignatory(SigningSignatory.builder()
                    .createdAt(OffsetDateTime.parse("2022-04-16T19:25:01.966Z"))
                    .email("anais.lakin@icloud.com")
                    .id("e91c3a9c-31e0-4736-8489-d6588d2db715")
                    .metadata(List.of())
                    .name("Anais Lakin")
                    .role(SigningSignatoryRole.SIGNER)
                    .status(SigningSignatoryStatus.ERROR)
                    .updatedAt(OffsetDateTime.parse("2024-05-21T08:58:14.671Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSigningSignatoryResponse res = sdk.signing().patchSigningSignatory()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchSigningSignatoryRequest](../../models/operations/PatchSigningSignatoryRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchSigningSignatoryResponse](../../models/operations/PatchSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeSigningDocument

Deletes the SigningDocument identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeSigningDocument" method="delete" path="/signing/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveSigningDocumentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveSigningDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveSigningDocumentRequest req = RemoveSigningDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveSigningDocumentResponse res = sdk.signing().removeSigningDocument()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveSigningDocumentRequest](../../models/operations/RemoveSigningDocumentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveSigningDocumentResponse](../../models/operations/RemoveSigningDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeSigningSignatory

Deletes the SigningSignatory identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeSigningSignatory" method="delete" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveSigningSignatoryRequest req = RemoveSigningSignatoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveSigningSignatoryResponse res = sdk.signing().removeSigningSignatory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveSigningSignatoryRequest](../../models/operations/RemoveSigningSignatoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveSigningSignatoryResponse](../../models/operations/RemoveSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateSigningDocument

Updates the SigningDocument identified by `id`. Provide the unified SigningDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSigningDocument" method="put" path="/signing/{connection_id}/document/{id}" example="signing_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSigningDocumentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateSigningDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSigningDocumentRequest req = UpdateSigningDocumentRequest.builder()
                .signingDocument(SigningDocument.builder()
                    .createdAt(OffsetDateTime.parse("2021-05-02T09:35:23.679Z"))
                    .description("Aer asporto caste umbra coerceo anser color allatus aestas perspiciatis.")
                    .expiresAt(OffsetDateTime.parse("2021-06-04T01:21:34.949Z"))
                    .id("6c35daa0-980b-425a-b273-bb48488e72b6")
                    .metadata(List.of())
                    .name("Denesik Group NDA")
                    .sentAt(OffsetDateTime.parse("2022-07-01T03:02:34.548Z"))
                    .status(SigningDocumentStatus.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2025-09-09T00:19:25.958Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSigningDocumentResponse res = sdk.signing().updateSigningDocument()
                .request(req)
                .call();

        if (res.signingDocument().isPresent()) {
            System.out.println(res.signingDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateSigningDocumentRequest](../../models/operations/UpdateSigningDocumentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateSigningDocumentResponse](../../models/operations/UpdateSigningDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateSigningSignatory

Updates the SigningSignatory identified by `id`. Provide the unified SigningSignatory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSigningSignatory" method="put" path="/signing/{connection_id}/signatory/{id}" example="signing_signatory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSigningSignatoryRequest req = UpdateSigningSignatoryRequest.builder()
                .signingSignatory(SigningSignatory.builder()
                    .createdAt(OffsetDateTime.parse("2022-04-16T19:25:01.966Z"))
                    .email("anais.lakin@icloud.com")
                    .id("e91c3a9c-31e0-4736-8489-d6588d2db715")
                    .metadata(List.of())
                    .name("Anais Lakin")
                    .role(SigningSignatoryRole.SIGNER)
                    .status(SigningSignatoryStatus.ERROR)
                    .updatedAt(OffsetDateTime.parse("2024-05-21T08:58:14.671Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSigningSignatoryResponse res = sdk.signing().updateSigningSignatory()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateSigningSignatoryRequest](../../models/operations/UpdateSigningSignatoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateSigningSignatoryResponse](../../models/operations/UpdateSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |