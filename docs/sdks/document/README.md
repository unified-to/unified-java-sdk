# Document

## Overview

### Available Operations

* [createAtsDocument](#createatsdocument) - Create a document
* [createHrisDocument](#createhrisdocument) - Create a document
* [createSigningDocument](#createsigningdocument) - Create a document
* [getAtsDocument](#getatsdocument) - Retrieve a document
* [getHrisDocument](#gethrisdocument) - Retrieve a document
* [getSigningDocument](#getsigningdocument) - Retrieve a document
* [listAtsDocuments](#listatsdocuments) - List all documents
* [listHrisDocuments](#listhrisdocuments) - List all documents
* [listSigningDocuments](#listsigningdocuments) - List all documents
* [patchAtsDocument](#patchatsdocument) - Update a document
* [patchHrisDocument](#patchhrisdocument) - Update a document
* [patchSigningDocument](#patchsigningdocument) - Update a document
* [removeAtsDocument](#removeatsdocument) - Remove a document
* [removeHrisDocument](#removehrisdocument) - Remove a document
* [removeSigningDocument](#removesigningdocument) - Remove a document
* [updateAtsDocument](#updateatsdocument) - Update a document
* [updateHrisDocument](#updatehrisdocument) - Update a document
* [updateSigningDocument](#updatesigningdocument) - Update a document

## createAtsDocument

Creates a AtsDocument. Provide the unified AtsDocument fields in the request body; they are mapped to the provider's API. Returns the created AtsDocument.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsDocument" method="post" path="/ats/{connection_id}/document" example="ats_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsDocumentRequest req = CreateAtsDocumentRequest.builder()
                .atsDocument(AtsDocument.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-20T08:00:27.437Z"))
                    .documentUrl("https://vengeful-lashes.biz")
                    .filename("lonzo_schowalter_resume.pdf")
                    .id("cbc2467a-1530-41d3-9d91-f88e3a3b75fd")
                    .metadata(List.of())
                    .type(AtsDocumentType.COVER_LETTER)
                    .updatedAt(OffsetDateTime.parse("2022-12-07T16:58:30.893Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsDocumentResponse res = sdk.document().createAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateAtsDocumentRequest](../../models/operations/CreateAtsDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAtsDocumentResponse](../../models/operations/CreateAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisDocument

Creates a HrisDocument. Provide the unified HrisDocument fields in the request body; they are mapped to the provider's API. Returns the created HrisDocument.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDocument" method="post" path="/hris/{connection_id}/document" example="hris_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDocumentRequest req = CreateHrisDocumentRequest.builder()
                .hrisDocument(HrisDocument.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-27T11:47:26.086Z"))
                    .documentUrl("https://sore-decision.biz/")
                    .filename("ridge_forager.xsl")
                    .id("3b3efdac-39da-4458-b672-90a4d5514081")
                    .metadata(List.of())
                    .type(HrisDocumentType.POLICY)
                    .updatedAt(OffsetDateTime.parse("2025-10-13T01:31:44.930Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDocumentResponse res = sdk.document().createHrisDocument()
                .request(req)
                .call();

        if (res.hrisDocument().isPresent()) {
            System.out.println(res.hrisDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisDocumentRequest](../../models/operations/CreateHrisDocumentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisDocumentResponse](../../models/operations/CreateHrisDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
                    .id("6a706900-4480-4255-aa3b-bf6aae105884")
                    .metadata(List.of())
                    .name("Denesik Group NDA")
                    .sentAt(OffsetDateTime.parse("2022-06-29T22:12:16.247Z"))
                    .status(SigningDocumentStatus.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2025-09-04T12:19:23.852Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateSigningDocumentResponse res = sdk.document().createSigningDocument()
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

## getAtsDocument

Retrieves a single AtsDocument by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsDocument" method="get" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsDocumentRequest req = GetAtsDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsDocumentResponse res = sdk.document().getAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAtsDocumentRequest](../../models/operations/GetAtsDocumentRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAtsDocumentResponse](../../models/operations/GetAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisDocument

Retrieves a single HrisDocument by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDocument" method="get" path="/hris/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDocumentRequest req = GetHrisDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDocumentResponse res = sdk.document().getHrisDocument()
                .request(req)
                .call();

        if (res.hrisDocument().isPresent()) {
            System.out.println(res.hrisDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisDocumentRequest](../../models/operations/GetHrisDocumentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisDocumentResponse](../../models/operations/GetHrisDocumentResponse.md)**

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

        GetSigningDocumentResponse res = sdk.document().getSigningDocument()
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

## listAtsDocuments

Returns a list of AtsDocuments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsDocuments" method="get" path="/ats/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsDocumentsRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsDocumentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsDocumentsRequest req = ListAtsDocumentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsDocumentsResponse res = sdk.document().listAtsDocuments()
                .request(req)
                .call();

        if (res.atsDocuments().isPresent()) {
            System.out.println(res.atsDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAtsDocumentsRequest](../../models/operations/ListAtsDocumentsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAtsDocumentsResponse](../../models/operations/ListAtsDocumentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisDocuments

Returns a list of HrisDocuments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDocuments" method="get" path="/hris/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDocumentsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisDocumentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDocumentsRequest req = ListHrisDocumentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisDocumentsResponse res = sdk.document().listHrisDocuments()
                .request(req)
                .call();

        if (res.hrisDocuments().isPresent()) {
            System.out.println(res.hrisDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisDocumentsRequest](../../models/operations/ListHrisDocumentsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisDocumentsResponse](../../models/operations/ListHrisDocumentsResponse.md)**

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

        ListSigningDocumentsResponse res = sdk.document().listSigningDocuments()
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

## patchAtsDocument

Updates the AtsDocument identified by `id`. Provide the unified AtsDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsDocument" method="patch" path="/ats/{connection_id}/document/{id}" example="ats_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsDocumentRequest req = PatchAtsDocumentRequest.builder()
                .atsDocument(AtsDocument.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-20T08:00:27.437Z"))
                    .documentUrl("https://vengeful-lashes.biz")
                    .filename("lonzo_schowalter_resume.pdf")
                    .id("eded5c1f-4783-40f4-ae45-a2af56967232")
                    .metadata(List.of())
                    .type(AtsDocumentType.COVER_LETTER)
                    .updatedAt(OffsetDateTime.parse("2022-12-07T16:58:30.897Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsDocumentResponse res = sdk.document().patchAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchAtsDocumentRequest](../../models/operations/PatchAtsDocumentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchAtsDocumentResponse](../../models/operations/PatchAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisDocument

Updates the HrisDocument identified by `id`. Provide the unified HrisDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDocument" method="patch" path="/hris/{connection_id}/document/{id}" example="hris_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDocumentRequest req = PatchHrisDocumentRequest.builder()
                .hrisDocument(HrisDocument.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-27T11:47:26.086Z"))
                    .documentUrl("https://sore-decision.biz/")
                    .filename("ridge_forager.xsl")
                    .id("eee47bc3-43e3-41e2-924f-b0838a361d54")
                    .metadata(List.of())
                    .type(HrisDocumentType.POLICY)
                    .updatedAt(OffsetDateTime.parse("2025-10-13T01:31:44.943Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDocumentResponse res = sdk.document().patchHrisDocument()
                .request(req)
                .call();

        if (res.hrisDocument().isPresent()) {
            System.out.println(res.hrisDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisDocumentRequest](../../models/operations/PatchHrisDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisDocumentResponse](../../models/operations/PatchHrisDocumentResponse.md)**

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
                    .id("0bc6fa7b-b0d5-4d8f-b8d4-ade62fb6ef4c")
                    .metadata(List.of())
                    .name("Denesik Group NDA")
                    .sentAt(OffsetDateTime.parse("2022-06-29T22:12:16.251Z"))
                    .status(SigningDocumentStatus.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2025-09-04T12:19:23.866Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSigningDocumentResponse res = sdk.document().patchSigningDocument()
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

## removeAtsDocument

Deletes the AtsDocument identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsDocument" method="delete" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsDocumentRequest req = RemoveAtsDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsDocumentResponse res = sdk.document().removeAtsDocument()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveAtsDocumentRequest](../../models/operations/RemoveAtsDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveAtsDocumentResponse](../../models/operations/RemoveAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisDocument

Deletes the HrisDocument identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDocument" method="delete" path="/hris/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDocumentRequest req = RemoveHrisDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDocumentResponse res = sdk.document().removeHrisDocument()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisDocumentRequest](../../models/operations/RemoveHrisDocumentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisDocumentResponse](../../models/operations/RemoveHrisDocumentResponse.md)**

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

        RemoveSigningDocumentResponse res = sdk.document().removeSigningDocument()
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

## updateAtsDocument

Updates the AtsDocument identified by `id`. Provide the unified AtsDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsDocument" method="put" path="/ats/{connection_id}/document/{id}" example="ats_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsDocumentRequest req = UpdateAtsDocumentRequest.builder()
                .atsDocument(AtsDocument.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-20T08:00:27.437Z"))
                    .documentUrl("https://vengeful-lashes.biz")
                    .filename("lonzo_schowalter_resume.pdf")
                    .id("eded5c1f-4783-40f4-ae45-a2af56967232")
                    .metadata(List.of())
                    .type(AtsDocumentType.COVER_LETTER)
                    .updatedAt(OffsetDateTime.parse("2022-12-07T16:58:30.897Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsDocumentResponse res = sdk.document().updateAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateAtsDocumentRequest](../../models/operations/UpdateAtsDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAtsDocumentResponse](../../models/operations/UpdateAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisDocument

Updates the HrisDocument identified by `id`. Provide the unified HrisDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDocument" method="put" path="/hris/{connection_id}/document/{id}" example="hris_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDocumentRequest req = UpdateHrisDocumentRequest.builder()
                .hrisDocument(HrisDocument.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-27T11:47:26.086Z"))
                    .documentUrl("https://sore-decision.biz/")
                    .filename("ridge_forager.xsl")
                    .id("eee47bc3-43e3-41e2-924f-b0838a361d54")
                    .metadata(List.of())
                    .type(HrisDocumentType.POLICY)
                    .updatedAt(OffsetDateTime.parse("2025-10-13T01:31:44.943Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDocumentResponse res = sdk.document().updateHrisDocument()
                .request(req)
                .call();

        if (res.hrisDocument().isPresent()) {
            System.out.println(res.hrisDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisDocumentRequest](../../models/operations/UpdateHrisDocumentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisDocumentResponse](../../models/operations/UpdateHrisDocumentResponse.md)**

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
                    .id("0bc6fa7b-b0d5-4d8f-b8d4-ade62fb6ef4c")
                    .metadata(List.of())
                    .name("Denesik Group NDA")
                    .sentAt(OffsetDateTime.parse("2022-06-29T22:12:16.251Z"))
                    .status(SigningDocumentStatus.DRAFT)
                    .updatedAt(OffsetDateTime.parse("2025-09-04T12:19:23.866Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSigningDocumentResponse res = sdk.document().updateSigningDocument()
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