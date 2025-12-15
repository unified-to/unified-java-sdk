# Journal

## Overview

### Available Operations

* [createAccountingJournal](#createaccountingjournal) - Create a journal
* [getAccountingJournal](#getaccountingjournal) - Retrieve a journal
* [listAccountingJournals](#listaccountingjournals) - List all journals
* [patchAccountingJournal](#patchaccountingjournal) - Update a journal
* [removeAccountingJournal](#removeaccountingjournal) - Remove a journal
* [updateAccountingJournal](#updateaccountingjournal) - Update a journal

## createAccountingJournal

Create a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingJournal" method="post" path="/accounting/{connection_id}/journal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.AccountingJournal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingJournalRequest req = CreateAccountingJournalRequest.builder()
                .accountingJournal(AccountingJournal.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingJournalResponse res = sdk.journal().createAccountingJournal()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingJournalRequest](../../models/operations/CreateAccountingJournalRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingJournalResponse](../../models/operations/CreateAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingJournal

Retrieve a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingJournal" method="get" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingJournalRequest req = GetAccountingJournalRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingJournalResponse res = sdk.journal().getAccountingJournal()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingJournalRequest](../../models/operations/GetAccountingJournalRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingJournalResponse](../../models/operations/GetAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingJournals

List all journals

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingJournals" method="get" path="/accounting/{connection_id}/journal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingJournalsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingJournalsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingJournalsRequest req = ListAccountingJournalsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingJournalsResponse res = sdk.journal().listAccountingJournals()
                .request(req)
                .call();

        if (res.accountingJournals().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingJournalsRequest](../../models/operations/ListAccountingJournalsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingJournalsResponse](../../models/operations/ListAccountingJournalsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingJournal

Update a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingJournal" method="patch" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.AccountingJournal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingJournalRequest req = PatchAccountingJournalRequest.builder()
                .accountingJournal(AccountingJournal.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingJournalResponse res = sdk.journal().patchAccountingJournal()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingJournalRequest](../../models/operations/PatchAccountingJournalRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingJournalResponse](../../models/operations/PatchAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingJournal

Remove a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingJournal" method="delete" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingJournalRequest req = RemoveAccountingJournalRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingJournalResponse res = sdk.journal().removeAccountingJournal()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingJournalRequest](../../models/operations/RemoveAccountingJournalRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingJournalResponse](../../models/operations/RemoveAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingJournal

Update a journal

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingJournal" method="put" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.AccountingJournal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingJournalRequest req = UpdateAccountingJournalRequest.builder()
                .accountingJournal(AccountingJournal.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingJournalResponse res = sdk.journal().updateAccountingJournal()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingJournalRequest](../../models/operations/UpdateAccountingJournalRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingJournalResponse](../../models/operations/UpdateAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |