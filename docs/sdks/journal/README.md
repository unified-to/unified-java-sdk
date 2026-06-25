# Journal

## Overview

### Available Operations

* [createAccountingJournal2](#createaccountingjournal2) - Create a journal
* [getAccountingJournal2](#getaccountingjournal2) - Retrieve a journal
* [listAccountingJournals2](#listaccountingjournals2) - List all journals
* [patchAccountingJournal2](#patchaccountingjournal2) - Update a journal
* [removeAccountingJournal2](#removeaccountingjournal2) - Remove a journal
* [updateAccountingJournal2](#updateaccountingjournal2) - Update a journal

## createAccountingJournal2

Create a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingJournal2" method="post" path="/accounting/{connection_id}/journal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingJournal2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingJournal2Response;
import to.unified.unified_java_sdk.models.shared.AccountingJournal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingJournal2Request req = CreateAccountingJournal2Request.builder()
                .accountingJournal(AccountingJournal.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingJournal2Response res = sdk.journal().createAccountingJournal2()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            System.out.println(res.accountingJournal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAccountingJournal2Request](../../models/operations/CreateAccountingJournal2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAccountingJournal2Response](../../models/operations/CreateAccountingJournal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingJournal2

Retrieve a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingJournal2" method="get" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingJournal2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingJournal2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingJournal2Request req = GetAccountingJournal2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingJournal2Response res = sdk.journal().getAccountingJournal2()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            System.out.println(res.accountingJournal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingJournal2Request](../../models/operations/GetAccountingJournal2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingJournal2Response](../../models/operations/GetAccountingJournal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingJournals2

List all journals

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingJournals2" method="get" path="/accounting/{connection_id}/journal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingJournals2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingJournals2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingJournals2Request req = ListAccountingJournals2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingJournals2Response res = sdk.journal().listAccountingJournals2()
                .request(req)
                .call();

        if (res.accountingJournals().isPresent()) {
            System.out.println(res.accountingJournals().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAccountingJournals2Request](../../models/operations/ListAccountingJournals2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAccountingJournals2Response](../../models/operations/ListAccountingJournals2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingJournal2

Update a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingJournal2" method="patch" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingJournal2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingJournal2Response;
import to.unified.unified_java_sdk.models.shared.AccountingJournal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingJournal2Request req = PatchAccountingJournal2Request.builder()
                .accountingJournal(AccountingJournal.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingJournal2Response res = sdk.journal().patchAccountingJournal2()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            System.out.println(res.accountingJournal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAccountingJournal2Request](../../models/operations/PatchAccountingJournal2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAccountingJournal2Response](../../models/operations/PatchAccountingJournal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingJournal2

Remove a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingJournal2" method="delete" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingJournal2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingJournal2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingJournal2Request req = RemoveAccountingJournal2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingJournal2Response res = sdk.journal().removeAccountingJournal2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAccountingJournal2Request](../../models/operations/RemoveAccountingJournal2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAccountingJournal2Response](../../models/operations/RemoveAccountingJournal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingJournal2

Update a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingJournal2" method="put" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingJournal2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingJournal2Response;
import to.unified.unified_java_sdk.models.shared.AccountingJournal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingJournal2Request req = UpdateAccountingJournal2Request.builder()
                .accountingJournal(AccountingJournal.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingJournal2Response res = sdk.journal().updateAccountingJournal2()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            System.out.println(res.accountingJournal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAccountingJournal2Request](../../models/operations/UpdateAccountingJournal2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAccountingJournal2Response](../../models/operations/UpdateAccountingJournal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |