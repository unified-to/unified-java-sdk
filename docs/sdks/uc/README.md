# Uc
(*uc()*)

## Overview

### Available Operations

* [createUcComment](#createuccomment) - Create a comment
* [createUcContact](#createuccontact) - Create a contact
* [createUcRecording](#createucrecording) - Create a recording
* [getUcCall](#getuccall) - Retrieve a call
* [getUcComment](#getuccomment) - Retrieve a comment
* [getUcContact](#getuccontact) - Retrieve a contact
* [getUcRecording](#getucrecording) - Retrieve a recording
* [listUcCalls](#listuccalls) - List all calls
* [listUcComments](#listuccomments) - List all comments
* [listUcContacts](#listuccontacts) - List all contacts
* [listUcRecordings](#listucrecordings) - List all recordings
* [patchUcComment](#patchuccomment) - Update a comment
* [patchUcContact](#patchuccontact) - Update a contact
* [patchUcRecording](#patchucrecording) - Update a recording
* [removeUcComment](#removeuccomment) - Remove a comment
* [removeUcContact](#removeuccontact) - Remove a contact
* [removeUcRecording](#removeucrecording) - Remove a recording
* [updateUcComment](#updateuccomment) - Update a comment
* [updateUcContact](#updateuccontact) - Update a contact
* [updateUcRecording](#updateucrecording) - Update a recording

## createUcComment

Create a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcComment" method="post" path="/uc/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcCommentRequest req = CreateUcCommentRequest.builder()
                .ucComment(UcComment.builder()
                    .content("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcCommentResponse res = sdk.uc().createUcComment()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateUcCommentRequest](../../models/operations/CreateUcCommentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateUcCommentResponse](../../models/operations/CreateUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createUcContact

Create a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcContact" method="post" path="/uc/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcContactRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcContact;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcContactRequest req = CreateUcContactRequest.builder()
                .ucContact(UcContact.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcContactResponse res = sdk.uc().createUcContact()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateUcContactRequest](../../models/operations/CreateUcContactRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateUcContactResponse](../../models/operations/CreateUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createUcRecording

Create a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcRecording" method="post" path="/uc/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcRecordingRequest req = CreateUcRecordingRequest.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcRecordingResponse res = sdk.uc().createUcRecording()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateUcRecordingRequest](../../models/operations/CreateUcRecordingRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateUcRecordingResponse](../../models/operations/CreateUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcCall

Retrieve a call

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcCall" method="get" path="/uc/{connection_id}/call/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcCallRequest;
import to.unified.unified_java_sdk.models.operations.GetUcCallResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcCallRequest req = GetUcCallRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcCallResponse res = sdk.uc().getUcCall()
                .request(req)
                .call();

        if (res.ucCall().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetUcCallRequest](../../models/operations/GetUcCallRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetUcCallResponse](../../models/operations/GetUcCallResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcComment

Retrieve a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcComment" method="get" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.GetUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcCommentRequest req = GetUcCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcCommentResponse res = sdk.uc().getUcComment()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetUcCommentRequest](../../models/operations/GetUcCommentRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetUcCommentResponse](../../models/operations/GetUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcContact

Retrieve a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcContact" method="get" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcContactRequest;
import to.unified.unified_java_sdk.models.operations.GetUcContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcContactRequest req = GetUcContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcContactResponse res = sdk.uc().getUcContact()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetUcContactRequest](../../models/operations/GetUcContactRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetUcContactResponse](../../models/operations/GetUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcRecording

Retrieve a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcRecording" method="get" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.GetUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcRecordingRequest req = GetUcRecordingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcRecordingResponse res = sdk.uc().getUcRecording()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetUcRecordingRequest](../../models/operations/GetUcRecordingRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetUcRecordingResponse](../../models/operations/GetUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcCalls

List all calls

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcCalls" method="get" path="/uc/{connection_id}/call" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcCallsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcCallsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcCallsRequest req = ListUcCallsRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcCallsResponse res = sdk.uc().listUcCalls()
                .request(req)
                .call();

        if (res.ucCalls().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListUcCallsRequest](../../models/operations/ListUcCallsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListUcCallsResponse](../../models/operations/ListUcCallsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcComments

List all comments

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcComments" method="get" path="/uc/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcCommentsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcCommentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcCommentsRequest req = ListUcCommentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcCommentsResponse res = sdk.uc().listUcComments()
                .request(req)
                .call();

        if (res.ucComments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListUcCommentsRequest](../../models/operations/ListUcCommentsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListUcCommentsResponse](../../models/operations/ListUcCommentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcContacts

List all contacts

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcContacts" method="get" path="/uc/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcContactsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcContactsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcContactsRequest req = ListUcContactsRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcContactsResponse res = sdk.uc().listUcContacts()
                .request(req)
                .call();

        if (res.ucContacts().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListUcContactsRequest](../../models/operations/ListUcContactsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListUcContactsResponse](../../models/operations/ListUcContactsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcRecordings

List all recordings

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcRecordings" method="get" path="/uc/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcRecordingsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcRecordingsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcRecordingsRequest req = ListUcRecordingsRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcRecordingsResponse res = sdk.uc().listUcRecordings()
                .request(req)
                .call();

        if (res.ucRecordings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListUcRecordingsRequest](../../models/operations/ListUcRecordingsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListUcRecordingsResponse](../../models/operations/ListUcRecordingsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUcComment

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcComment" method="patch" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcCommentRequest req = PatchUcCommentRequest.builder()
                .ucComment(UcComment.builder()
                    .content("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcCommentResponse res = sdk.uc().patchUcComment()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchUcCommentRequest](../../models/operations/PatchUcCommentRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchUcCommentResponse](../../models/operations/PatchUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUcContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcContact" method="patch" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcContactRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcContact;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcContactRequest req = PatchUcContactRequest.builder()
                .ucContact(UcContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcContactResponse res = sdk.uc().patchUcContact()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchUcContactRequest](../../models/operations/PatchUcContactRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchUcContactResponse](../../models/operations/PatchUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUcRecording

Update a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcRecording" method="patch" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcRecordingRequest req = PatchUcRecordingRequest.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcRecordingResponse res = sdk.uc().patchUcRecording()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchUcRecordingRequest](../../models/operations/PatchUcRecordingRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchUcRecordingResponse](../../models/operations/PatchUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUcComment

Remove a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcComment" method="delete" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcCommentRequest req = RemoveUcCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcCommentResponse res = sdk.uc().removeUcComment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveUcCommentRequest](../../models/operations/RemoveUcCommentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveUcCommentResponse](../../models/operations/RemoveUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUcContact

Remove a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcContact" method="delete" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcContactRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcContactRequest req = RemoveUcContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcContactResponse res = sdk.uc().removeUcContact()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveUcContactRequest](../../models/operations/RemoveUcContactRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveUcContactResponse](../../models/operations/RemoveUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUcRecording

Remove a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcRecording" method="delete" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcRecordingRequest req = RemoveUcRecordingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcRecordingResponse res = sdk.uc().removeUcRecording()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveUcRecordingRequest](../../models/operations/RemoveUcRecordingRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveUcRecordingResponse](../../models/operations/RemoveUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUcComment

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcComment" method="put" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcCommentRequest req = UpdateUcCommentRequest.builder()
                .ucComment(UcComment.builder()
                    .content("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcCommentResponse res = sdk.uc().updateUcComment()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateUcCommentRequest](../../models/operations/UpdateUcCommentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateUcCommentResponse](../../models/operations/UpdateUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUcContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcContact" method="put" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcContactRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcContact;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcContactRequest req = UpdateUcContactRequest.builder()
                .ucContact(UcContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcContactResponse res = sdk.uc().updateUcContact()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateUcContactRequest](../../models/operations/UpdateUcContactRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateUcContactResponse](../../models/operations/UpdateUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUcRecording

Update a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcRecording" method="put" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcRecordingRequest req = UpdateUcRecordingRequest.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcRecordingResponse res = sdk.uc().updateUcRecording()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateUcRecordingRequest](../../models/operations/UpdateUcRecordingRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateUcRecordingResponse](../../models/operations/UpdateUcRecordingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |