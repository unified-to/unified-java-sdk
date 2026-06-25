# Uc

## Overview

### Available Operations

* [createUcComment2](#createuccomment2) - Create a comment
* [createUcContact2](#createuccontact2) - Create a contact
* [createUcRecording2](#createucrecording2) - Create a recording
* [getUcCall2](#getuccall2) - Retrieve a call
* [getUcComment2](#getuccomment2) - Retrieve a comment
* [getUcContact2](#getuccontact2) - Retrieve a contact
* [getUcRecording2](#getucrecording2) - Retrieve a recording
* [listUcCalls2](#listuccalls2) - List all calls
* [listUcComments2](#listuccomments2) - List all comments
* [listUcContacts2](#listuccontacts2) - List all contacts
* [listUcRecordings2](#listucrecordings2) - List all recordings
* [patchUcComment2](#patchuccomment2) - Update a comment
* [patchUcContact2](#patchuccontact2) - Update a contact
* [patchUcRecording2](#patchucrecording2) - Update a recording
* [removeUcComment2](#removeuccomment2) - Remove a comment
* [removeUcContact2](#removeuccontact2) - Remove a contact
* [removeUcRecording2](#removeucrecording2) - Remove a recording
* [updateUcComment2](#updateuccomment2) - Update a comment
* [updateUcContact2](#updateuccontact2) - Update a contact
* [updateUcRecording2](#updateucrecording2) - Update a recording

## createUcComment2

Create a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcComment2" method="post" path="/uc/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcComment2Request;
import to.unified.unified_java_sdk.models.operations.CreateUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcComment2Request req = CreateUcComment2Request.builder()
                .ucComment(UcComment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcComment2Response res = sdk.uc().createUcComment2()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateUcComment2Request](../../models/operations/CreateUcComment2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateUcComment2Response](../../models/operations/CreateUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createUcContact2

Create a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcContact2" method="post" path="/uc/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcContact2Request;
import to.unified.unified_java_sdk.models.operations.CreateUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcContact;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcContact2Request req = CreateUcContact2Request.builder()
                .ucContact(UcContact.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcContact2Response res = sdk.uc().createUcContact2()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateUcContact2Request](../../models/operations/CreateUcContact2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateUcContact2Response](../../models/operations/CreateUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createUcRecording2

Create a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcRecording2" method="post" path="/uc/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.CreateUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcRecording2Request req = CreateUcRecording2Request.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcRecording2Response res = sdk.uc().createUcRecording2()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            System.out.println(res.ucRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateUcRecording2Request](../../models/operations/CreateUcRecording2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateUcRecording2Response](../../models/operations/CreateUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcCall2

Retrieve a call

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcCall2" method="get" path="/uc/{connection_id}/call/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcCall2Request;
import to.unified.unified_java_sdk.models.operations.GetUcCall2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcCall2Request req = GetUcCall2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcCall2Response res = sdk.uc().getUcCall2()
                .request(req)
                .call();

        if (res.ucCall().isPresent()) {
            System.out.println(res.ucCall().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetUcCall2Request](../../models/operations/GetUcCall2Request.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetUcCall2Response](../../models/operations/GetUcCall2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcComment2

Retrieve a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcComment2" method="get" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcComment2Request;
import to.unified.unified_java_sdk.models.operations.GetUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcComment2Request req = GetUcComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcComment2Response res = sdk.uc().getUcComment2()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetUcComment2Request](../../models/operations/GetUcComment2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetUcComment2Response](../../models/operations/GetUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcContact2

Retrieve a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcContact2" method="get" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcContact2Request;
import to.unified.unified_java_sdk.models.operations.GetUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcContact2Request req = GetUcContact2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcContact2Response res = sdk.uc().getUcContact2()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetUcContact2Request](../../models/operations/GetUcContact2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetUcContact2Response](../../models/operations/GetUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcRecording2

Retrieve a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcRecording2" method="get" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.GetUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcRecording2Request req = GetUcRecording2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcRecording2Response res = sdk.uc().getUcRecording2()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            System.out.println(res.ucRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetUcRecording2Request](../../models/operations/GetUcRecording2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetUcRecording2Response](../../models/operations/GetUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcCalls2

List all calls

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcCalls2" method="get" path="/uc/{connection_id}/call" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcCalls2Request;
import to.unified.unified_java_sdk.models.operations.ListUcCalls2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcCalls2Request req = ListUcCalls2Request.builder()
                .connectionId("<id>")
                .build();

        ListUcCalls2Response res = sdk.uc().listUcCalls2()
                .request(req)
                .call();

        if (res.ucCalls().isPresent()) {
            System.out.println(res.ucCalls().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListUcCalls2Request](../../models/operations/ListUcCalls2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListUcCalls2Response](../../models/operations/ListUcCalls2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcComments2

List all comments

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcComments2" method="get" path="/uc/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcComments2Request;
import to.unified.unified_java_sdk.models.operations.ListUcComments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcComments2Request req = ListUcComments2Request.builder()
                .connectionId("<id>")
                .build();

        ListUcComments2Response res = sdk.uc().listUcComments2()
                .request(req)
                .call();

        if (res.ucComments().isPresent()) {
            System.out.println(res.ucComments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListUcComments2Request](../../models/operations/ListUcComments2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListUcComments2Response](../../models/operations/ListUcComments2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcContacts2

List all contacts

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcContacts2" method="get" path="/uc/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcContacts2Request;
import to.unified.unified_java_sdk.models.operations.ListUcContacts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcContacts2Request req = ListUcContacts2Request.builder()
                .connectionId("<id>")
                .build();

        ListUcContacts2Response res = sdk.uc().listUcContacts2()
                .request(req)
                .call();

        if (res.ucContacts().isPresent()) {
            System.out.println(res.ucContacts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListUcContacts2Request](../../models/operations/ListUcContacts2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListUcContacts2Response](../../models/operations/ListUcContacts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcRecordings2

List all recordings

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcRecordings2" method="get" path="/uc/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcRecordings2Request;
import to.unified.unified_java_sdk.models.operations.ListUcRecordings2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcRecordings2Request req = ListUcRecordings2Request.builder()
                .connectionId("<id>")
                .build();

        ListUcRecordings2Response res = sdk.uc().listUcRecordings2()
                .request(req)
                .call();

        if (res.ucRecordings().isPresent()) {
            System.out.println(res.ucRecordings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListUcRecordings2Request](../../models/operations/ListUcRecordings2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListUcRecordings2Response](../../models/operations/ListUcRecordings2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUcComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcComment2" method="patch" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcComment2Request;
import to.unified.unified_java_sdk.models.operations.PatchUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcComment2Request req = PatchUcComment2Request.builder()
                .ucComment(UcComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcComment2Response res = sdk.uc().patchUcComment2()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchUcComment2Request](../../models/operations/PatchUcComment2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchUcComment2Response](../../models/operations/PatchUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUcContact2

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcContact2" method="patch" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcContact2Request;
import to.unified.unified_java_sdk.models.operations.PatchUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcContact;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcContact2Request req = PatchUcContact2Request.builder()
                .ucContact(UcContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcContact2Response res = sdk.uc().patchUcContact2()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchUcContact2Request](../../models/operations/PatchUcContact2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchUcContact2Response](../../models/operations/PatchUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUcRecording2

Update a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcRecording2" method="patch" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.PatchUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcRecording2Request req = PatchUcRecording2Request.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcRecording2Response res = sdk.uc().patchUcRecording2()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            System.out.println(res.ucRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchUcRecording2Request](../../models/operations/PatchUcRecording2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchUcRecording2Response](../../models/operations/PatchUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUcComment2

Remove a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcComment2" method="delete" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcComment2Request;
import to.unified.unified_java_sdk.models.operations.RemoveUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcComment2Request req = RemoveUcComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcComment2Response res = sdk.uc().removeUcComment2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveUcComment2Request](../../models/operations/RemoveUcComment2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveUcComment2Response](../../models/operations/RemoveUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUcContact2

Remove a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcContact2" method="delete" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcContact2Request;
import to.unified.unified_java_sdk.models.operations.RemoveUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcContact2Request req = RemoveUcContact2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcContact2Response res = sdk.uc().removeUcContact2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveUcContact2Request](../../models/operations/RemoveUcContact2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveUcContact2Response](../../models/operations/RemoveUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUcRecording2

Remove a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcRecording2" method="delete" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcRecording2Request req = RemoveUcRecording2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcRecording2Response res = sdk.uc().removeUcRecording2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveUcRecording2Request](../../models/operations/RemoveUcRecording2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveUcRecording2Response](../../models/operations/RemoveUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUcComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcComment2" method="put" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcComment2Request;
import to.unified.unified_java_sdk.models.operations.UpdateUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcComment2Request req = UpdateUcComment2Request.builder()
                .ucComment(UcComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcComment2Response res = sdk.uc().updateUcComment2()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateUcComment2Request](../../models/operations/UpdateUcComment2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateUcComment2Response](../../models/operations/UpdateUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUcContact2

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcContact2" method="put" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcContact2Request;
import to.unified.unified_java_sdk.models.operations.UpdateUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcContact;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcContact2Request req = UpdateUcContact2Request.builder()
                .ucContact(UcContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcContact2Response res = sdk.uc().updateUcContact2()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateUcContact2Request](../../models/operations/UpdateUcContact2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateUcContact2Response](../../models/operations/UpdateUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUcRecording2

Update a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcRecording2" method="put" path="/uc/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecording2Request;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcRecording;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcRecording2Request req = UpdateUcRecording2Request.builder()
                .ucRecording(UcRecording.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcRecording2Response res = sdk.uc().updateUcRecording2()
                .request(req)
                .call();

        if (res.ucRecording().isPresent()) {
            System.out.println(res.ucRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateUcRecording2Request](../../models/operations/UpdateUcRecording2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateUcRecording2Response](../../models/operations/UpdateUcRecording2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |