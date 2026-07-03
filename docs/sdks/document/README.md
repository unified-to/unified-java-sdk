# Document

## Overview

### Available Operations

* [createAtsDocument](#createatsdocument) - Create a document
* [createSigningDocument](#createsigningdocument) - Create a document
* [getAtsDocument](#getatsdocument) - Retrieve a document
* [getSigningDocument](#getsigningdocument) - Retrieve a document
* [listAtsDocuments](#listatsdocuments) - List all documents
* [listSigningDocuments](#listsigningdocuments) - List all documents
* [patchAtsDocument](#patchatsdocument) - Update a document
* [patchSigningDocument](#patchsigningdocument) - Update a document
* [removeAtsDocument](#removeatsdocument) - Remove a document
* [removeSigningDocument](#removesigningdocument) - Remove a document
* [updateAtsDocument](#updateatsdocument) - Update a document
* [updateSigningDocument](#updatesigningdocument) - Update a document

## createAtsDocument

Create a document

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsDocument" method="post" path="/ats/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsDocumentRequest req = CreateAtsDocumentRequest.builder()
                .atsDocument(AtsDocument.builder()
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

## createSigningDocument

Create a document

### Example Usage

<!-- UsageSnippet language="java" operationID="createSigningDocument" method="post" path="/signing/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateSigningDocumentRequest;
import to.unified.unified_java_sdk.models.operations.CreateSigningDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningDocument;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateSigningDocumentRequest req = CreateSigningDocumentRequest.builder()
                .signingDocument(SigningDocument.builder()
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

Retrieve a document

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

## getSigningDocument

Retrieve a document

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

List all documents

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

## listSigningDocuments

List all documents

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

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsDocument" method="patch" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsDocumentRequest req = PatchAtsDocumentRequest.builder()
                .atsDocument(AtsDocument.builder()
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

## patchSigningDocument

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSigningDocument" method="patch" path="/signing/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSigningDocumentRequest;
import to.unified.unified_java_sdk.models.operations.PatchSigningDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningDocument;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSigningDocumentRequest req = PatchSigningDocumentRequest.builder()
                .signingDocument(SigningDocument.builder()
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

Remove a document

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

## removeSigningDocument

Remove a document

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

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsDocument" method="put" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsDocumentRequest req = UpdateAtsDocumentRequest.builder()
                .atsDocument(AtsDocument.builder()
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

## updateSigningDocument

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSigningDocument" method="put" path="/signing/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSigningDocumentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateSigningDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningDocument;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSigningDocumentRequest req = UpdateSigningDocumentRequest.builder()
                .signingDocument(SigningDocument.builder()
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