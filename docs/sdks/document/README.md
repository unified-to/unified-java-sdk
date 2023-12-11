# Document
(*document*)

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
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.models.shared.AtsDocumentType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsDocumentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest req = new CreateAtsDocumentRequest(
                "string"){{
                atsDocument = new AtsDocument(
){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2021-04-24T22:30:56.289Z");
                    documentData = "string";
                    documentUrl = "string";
                    filename = "mouse_per_missouri.mp4";
                    id = "<ID>";
                    jobId = "string";
                    raw = new PropertyAtsDocumentRaw(
);
                    type = AtsDocumentType.OFFER_PACKET;
                    updatedAt = OffsetDateTime.parse("2021-12-28T09:27:32.859Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse res = sdk.document.createAtsDocument(req);

            if (res.atsDocument != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest](../../models/operations/CreateAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse](../../models/operations/CreateAtsDocumentResponse.md)**


## getAtsDocument

Retrieve a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest req = new GetAtsDocumentRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse res = sdk.document.getAtsDocument(req);

            if (res.atsDocument != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest](../../models/operations/GetAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse](../../models/operations/GetAtsDocumentResponse.md)**


## listAtsDocuments

List all documents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest req = new ListAtsDocumentsRequest(
                "string"){{
                applicationId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 9635.37d;
                offset = 8402.77d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-08-30T11:38:20.739Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse res = sdk.document.listAtsDocuments(req);

            if (res.atsDocuments != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest](../../models/operations/ListAtsDocumentsRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse](../../models/operations/ListAtsDocumentsResponse.md)**


## patchAtsDocument

Update a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.models.shared.AtsDocumentType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsDocumentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest req = new PatchAtsDocumentRequest(
                "string",
                "string"){{
                atsDocument = new AtsDocument(
){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2021-04-01T09:34:15.248Z");
                    documentData = "string";
                    documentUrl = "string";
                    filename = "future_underpin.mp4v";
                    id = "<ID>";
                    jobId = "string";
                    raw = new PropertyAtsDocumentRaw(
);
                    type = AtsDocumentType.OFFER_LETTER;
                    updatedAt = OffsetDateTime.parse("2022-02-14T01:39:21.030Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse res = sdk.document.patchAtsDocument(req);

            if (res.atsDocument != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest](../../models/operations/PatchAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse](../../models/operations/PatchAtsDocumentResponse.md)**


## removeAtsDocument

Remove a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest req = new RemoveAtsDocumentRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse res = sdk.document.removeAtsDocument(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest](../../models/operations/RemoveAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse](../../models/operations/RemoveAtsDocumentResponse.md)**


## updateAtsDocument

Update a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.models.shared.AtsDocumentType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsDocumentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest req = new UpdateAtsDocumentRequest(
                "string",
                "string"){{
                atsDocument = new AtsDocument(
){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2021-07-05T13:01:49.006Z");
                    documentData = "string";
                    documentUrl = "string";
                    filename = "unbranded_reprehenderit.jpg";
                    id = "<ID>";
                    jobId = "string";
                    raw = new PropertyAtsDocumentRaw(
);
                    type = AtsDocumentType.OFFER_PACKET;
                    updatedAt = OffsetDateTime.parse("2021-12-02T17:00:21.700Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse res = sdk.document.updateAtsDocument(req);

            if (res.atsDocument != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest](../../models/operations/UpdateAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse](../../models/operations/UpdateAtsDocumentResponse.md)**

