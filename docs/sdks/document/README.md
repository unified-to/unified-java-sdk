# Document
(*document()*)

## Overview

### Available Operations

* [createAtsDocument](#createatsdocument) - Create a document
* [getAtsDocument](#getatsdocument) - Retrieve a document
* [listAtsDocuments](#listatsdocuments) - List all documents
* [patchAtsDocument](#patchatsdocument) - Update a document
* [removeAtsDocument](#removeatsdocument) - Remove a document
* [updateAtsDocument](#updateatsdocument) - Update a document

## createAtsDocument

Create a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateAtsDocumentRequest req = CreateAtsDocumentRequest.builder()
                .connectionId("<id>")
                .build();

        CreateAtsDocumentResponse res = sdk.document().createAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            // handle response
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

## getAtsDocument

Retrieve a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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
            // handle response
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

## listAtsDocuments

List all documents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListAtsDocumentsRequest req = ListAtsDocumentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsDocumentsResponse res = sdk.document().listAtsDocuments()
                .request(req)
                .call();

        if (res.atsDocuments().isPresent()) {
            // handle response
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

## patchAtsDocument

Update a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchAtsDocumentRequest req = PatchAtsDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsDocumentResponse res = sdk.document().patchAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            // handle response
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

## removeAtsDocument

Remove a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

## updateAtsDocument

Update a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateAtsDocumentRequest req = UpdateAtsDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsDocumentResponse res = sdk.document().updateAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            // handle response
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