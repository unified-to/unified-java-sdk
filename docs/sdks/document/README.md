# Document

## Overview

### Available Operations

* [createAtsDocument2](#createatsdocument2) - Create a document
* [createSigningDocument2](#createsigningdocument2) - Create a document
* [getAtsDocument2](#getatsdocument2) - Retrieve a document
* [getSigningDocument2](#getsigningdocument2) - Retrieve a document
* [listAtsDocuments2](#listatsdocuments2) - List all documents
* [listSigningDocuments2](#listsigningdocuments2) - List all documents
* [patchAtsDocument2](#patchatsdocument2) - Update a document
* [patchSigningDocument2](#patchsigningdocument2) - Update a document
* [removeAtsDocument2](#removeatsdocument2) - Remove a document
* [removeSigningDocument2](#removesigningdocument2) - Remove a document
* [updateAtsDocument2](#updateatsdocument2) - Update a document
* [updateSigningDocument2](#updatesigningdocument2) - Update a document

## createAtsDocument2

Create a document

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsDocument2" method="post" path="/ats/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsDocument2Request req = CreateAtsDocument2Request.builder()
                .atsDocument(AtsDocument.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsDocument2Response res = sdk.document().createAtsDocument2()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAtsDocument2Request](../../models/operations/CreateAtsDocument2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAtsDocument2Response](../../models/operations/CreateAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createSigningDocument2

Create a document

### Example Usage

<!-- UsageSnippet language="java" operationID="createSigningDocument2" method="post" path="/signing/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateSigningDocument2Request;
import to.unified.unified_java_sdk.models.operations.CreateSigningDocument2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningDocument;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateSigningDocument2Request req = CreateSigningDocument2Request.builder()
                .signingDocument(SigningDocument.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateSigningDocument2Response res = sdk.document().createSigningDocument2()
                .request(req)
                .call();

        if (res.signingDocument().isPresent()) {
            System.out.println(res.signingDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateSigningDocument2Request](../../models/operations/CreateSigningDocument2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateSigningDocument2Response](../../models/operations/CreateSigningDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsDocument2

Retrieve a document

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsDocument2" method="get" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsDocument2Request req = GetAtsDocument2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsDocument2Response res = sdk.document().getAtsDocument2()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAtsDocument2Request](../../models/operations/GetAtsDocument2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAtsDocument2Response](../../models/operations/GetAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSigningDocument2

Retrieve a document

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningDocument2" method="get" path="/signing/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningDocument2Request;
import to.unified.unified_java_sdk.models.operations.GetSigningDocument2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningDocument2Request req = GetSigningDocument2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningDocument2Response res = sdk.document().getSigningDocument2()
                .request(req)
                .call();

        if (res.signingDocument().isPresent()) {
            System.out.println(res.signingDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetSigningDocument2Request](../../models/operations/GetSigningDocument2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetSigningDocument2Response](../../models/operations/GetSigningDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsDocuments2

List all documents

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsDocuments2" method="get" path="/ats/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsDocuments2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsDocuments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsDocuments2Request req = ListAtsDocuments2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsDocuments2Response res = sdk.document().listAtsDocuments2()
                .request(req)
                .call();

        if (res.atsDocuments().isPresent()) {
            System.out.println(res.atsDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsDocuments2Request](../../models/operations/ListAtsDocuments2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsDocuments2Response](../../models/operations/ListAtsDocuments2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningDocuments2

List all documents

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningDocuments2" method="get" path="/signing/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningDocuments2Request;
import to.unified.unified_java_sdk.models.operations.ListSigningDocuments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningDocuments2Request req = ListSigningDocuments2Request.builder()
                .connectionId("<id>")
                .build();

        ListSigningDocuments2Response res = sdk.document().listSigningDocuments2()
                .request(req)
                .call();

        if (res.signingDocuments().isPresent()) {
            System.out.println(res.signingDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListSigningDocuments2Request](../../models/operations/ListSigningDocuments2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListSigningDocuments2Response](../../models/operations/ListSigningDocuments2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsDocument2

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsDocument2" method="patch" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsDocument2Request req = PatchAtsDocument2Request.builder()
                .atsDocument(AtsDocument.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsDocument2Response res = sdk.document().patchAtsDocument2()
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
| `request`                                                                       | [PatchAtsDocument2Request](../../models/operations/PatchAtsDocument2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAtsDocument2Response](../../models/operations/PatchAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchSigningDocument2

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSigningDocument2" method="patch" path="/signing/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSigningDocument2Request;
import to.unified.unified_java_sdk.models.operations.PatchSigningDocument2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningDocument;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSigningDocument2Request req = PatchSigningDocument2Request.builder()
                .signingDocument(SigningDocument.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSigningDocument2Response res = sdk.document().patchSigningDocument2()
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
| `request`                                                                               | [PatchSigningDocument2Request](../../models/operations/PatchSigningDocument2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchSigningDocument2Response](../../models/operations/PatchSigningDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsDocument2

Remove a document

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsDocument2" method="delete" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsDocument2Request req = RemoveAtsDocument2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsDocument2Response res = sdk.document().removeAtsDocument2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAtsDocument2Request](../../models/operations/RemoveAtsDocument2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAtsDocument2Response](../../models/operations/RemoveAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeSigningDocument2

Remove a document

### Example Usage

<!-- UsageSnippet language="java" operationID="removeSigningDocument2" method="delete" path="/signing/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveSigningDocument2Request;
import to.unified.unified_java_sdk.models.operations.RemoveSigningDocument2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveSigningDocument2Request req = RemoveSigningDocument2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveSigningDocument2Response res = sdk.document().removeSigningDocument2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveSigningDocument2Request](../../models/operations/RemoveSigningDocument2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveSigningDocument2Response](../../models/operations/RemoveSigningDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsDocument2

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsDocument2" method="put" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsDocument2Request req = UpdateAtsDocument2Request.builder()
                .atsDocument(AtsDocument.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsDocument2Response res = sdk.document().updateAtsDocument2()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAtsDocument2Request](../../models/operations/UpdateAtsDocument2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAtsDocument2Response](../../models/operations/UpdateAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateSigningDocument2

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSigningDocument2" method="put" path="/signing/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSigningDocument2Request;
import to.unified.unified_java_sdk.models.operations.UpdateSigningDocument2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningDocument;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSigningDocument2Request req = UpdateSigningDocument2Request.builder()
                .signingDocument(SigningDocument.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSigningDocument2Response res = sdk.document().updateSigningDocument2()
                .request(req)
                .call();

        if (res.signingDocument().isPresent()) {
            System.out.println(res.signingDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateSigningDocument2Request](../../models/operations/UpdateSigningDocument2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateSigningDocument2Response](../../models/operations/UpdateSigningDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |