# Signing

## Overview

### Available Operations

* [createSigningDocument2](#createsigningdocument2) - Create a document
* [createSigningSignatory2](#createsigningsignatory2) - Create a signatory
* [getSigningDocument2](#getsigningdocument2) - Retrieve a document
* [getSigningSignatory2](#getsigningsignatory2) - Retrieve a signatory
* [getSigningTemplate2](#getsigningtemplate2) - Retrieve a template
* [listSigningDocuments2](#listsigningdocuments2) - List all documents
* [listSigningSignatories2](#listsigningsignatories2) - List all signatories
* [listSigningTemplates2](#listsigningtemplates2) - List all templates
* [patchSigningDocument2](#patchsigningdocument2) - Update a document
* [patchSigningSignatory2](#patchsigningsignatory2) - Update a signatory
* [removeSigningDocument2](#removesigningdocument2) - Remove a document
* [removeSigningSignatory2](#removesigningsignatory2) - Remove a signatory
* [updateSigningDocument2](#updatesigningdocument2) - Update a document
* [updateSigningSignatory2](#updatesigningsignatory2) - Update a signatory

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

        CreateSigningDocument2Response res = sdk.signing().createSigningDocument2()
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

## createSigningSignatory2

Create a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="createSigningSignatory2" method="post" path="/signing/{connection_id}/signatory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.CreateSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningSignatory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateSigningSignatory2Request req = CreateSigningSignatory2Request.builder()
                .signingSignatory(SigningSignatory.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateSigningSignatory2Response res = sdk.signing().createSigningSignatory2()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateSigningSignatory2Request](../../models/operations/CreateSigningSignatory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateSigningSignatory2Response](../../models/operations/CreateSigningSignatory2Response.md)**

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

        GetSigningDocument2Response res = sdk.signing().getSigningDocument2()
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

## getSigningSignatory2

Retrieve a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningSignatory2" method="get" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.GetSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningSignatory2Request req = GetSigningSignatory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningSignatory2Response res = sdk.signing().getSigningSignatory2()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetSigningSignatory2Request](../../models/operations/GetSigningSignatory2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetSigningSignatory2Response](../../models/operations/GetSigningSignatory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSigningTemplate2

Retrieve a template

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningTemplate2" method="get" path="/signing/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplate2Request;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplate2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningTemplate2Request req = GetSigningTemplate2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningTemplate2Response res = sdk.signing().getSigningTemplate2()
                .request(req)
                .call();

        if (res.signingTemplate().isPresent()) {
            System.out.println(res.signingTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetSigningTemplate2Request](../../models/operations/GetSigningTemplate2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetSigningTemplate2Response](../../models/operations/GetSigningTemplate2Response.md)**

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

        ListSigningDocuments2Response res = sdk.signing().listSigningDocuments2()
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

## listSigningSignatories2

List all signatories

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningSignatories2" method="get" path="/signing/{connection_id}/signatory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningSignatories2Request;
import to.unified.unified_java_sdk.models.operations.ListSigningSignatories2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningSignatories2Request req = ListSigningSignatories2Request.builder()
                .connectionId("<id>")
                .build();

        ListSigningSignatories2Response res = sdk.signing().listSigningSignatories2()
                .request(req)
                .call();

        if (res.signingSignatories().isPresent()) {
            System.out.println(res.signingSignatories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListSigningSignatories2Request](../../models/operations/ListSigningSignatories2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListSigningSignatories2Response](../../models/operations/ListSigningSignatories2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningTemplates2

List all templates

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningTemplates2" method="get" path="/signing/{connection_id}/template" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplates2Request;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplates2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningTemplates2Request req = ListSigningTemplates2Request.builder()
                .connectionId("<id>")
                .build();

        ListSigningTemplates2Response res = sdk.signing().listSigningTemplates2()
                .request(req)
                .call();

        if (res.signingTemplates().isPresent()) {
            System.out.println(res.signingTemplates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListSigningTemplates2Request](../../models/operations/ListSigningTemplates2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListSigningTemplates2Response](../../models/operations/ListSigningTemplates2Response.md)**

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

        PatchSigningDocument2Response res = sdk.signing().patchSigningDocument2()
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

## patchSigningSignatory2

Update a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSigningSignatory2" method="patch" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.PatchSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningSignatory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSigningSignatory2Request req = PatchSigningSignatory2Request.builder()
                .signingSignatory(SigningSignatory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSigningSignatory2Response res = sdk.signing().patchSigningSignatory2()
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
| `request`                                                                                 | [PatchSigningSignatory2Request](../../models/operations/PatchSigningSignatory2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchSigningSignatory2Response](../../models/operations/PatchSigningSignatory2Response.md)**

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

        RemoveSigningDocument2Response res = sdk.signing().removeSigningDocument2()
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

## removeSigningSignatory2

Remove a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="removeSigningSignatory2" method="delete" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.RemoveSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveSigningSignatory2Request req = RemoveSigningSignatory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveSigningSignatory2Response res = sdk.signing().removeSigningSignatory2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveSigningSignatory2Request](../../models/operations/RemoveSigningSignatory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveSigningSignatory2Response](../../models/operations/RemoveSigningSignatory2Response.md)**

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

        UpdateSigningDocument2Response res = sdk.signing().updateSigningDocument2()
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

## updateSigningSignatory2

Update a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSigningSignatory2" method="put" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.UpdateSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningSignatory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSigningSignatory2Request req = UpdateSigningSignatory2Request.builder()
                .signingSignatory(SigningSignatory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSigningSignatory2Response res = sdk.signing().updateSigningSignatory2()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateSigningSignatory2Request](../../models/operations/UpdateSigningSignatory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateSigningSignatory2Response](../../models/operations/UpdateSigningSignatory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |