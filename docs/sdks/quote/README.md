# Quote

## Overview

### Available Operations

* [createAccountingQuote](#createaccountingquote) - Create a quote
* [getAccountingQuote](#getaccountingquote) - Retrieve a quote
* [listAccountingQuotes](#listaccountingquotes) - List all quotes
* [patchAccountingQuote](#patchaccountingquote) - Update a quote
* [removeAccountingQuote](#removeaccountingquote) - Remove a quote
* [updateAccountingQuote](#updateaccountingquote) - Update a quote

## createAccountingQuote

Creates a AccountingQuote. Provide the unified AccountingQuote fields in the request body; they are mapped to the provider's API. Returns the created AccountingQuote.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingQuote" method="post" path="/accounting/{connection_id}/quote" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.AccountingQuote;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingQuoteRequest req = CreateAccountingQuoteRequest.builder()
                .accountingQuote(AccountingQuote.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingQuoteResponse res = sdk.quote().createAccountingQuote()
                .request(req)
                .call();

        if (res.accountingQuote().isPresent()) {
            System.out.println(res.accountingQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAccountingQuoteRequest](../../models/operations/CreateAccountingQuoteRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAccountingQuoteResponse](../../models/operations/CreateAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingQuote

Retrieves a single AccountingQuote by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingQuote" method="get" path="/accounting/{connection_id}/quote/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingQuoteRequest req = GetAccountingQuoteRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingQuoteResponse res = sdk.quote().getAccountingQuote()
                .request(req)
                .call();

        if (res.accountingQuote().isPresent()) {
            System.out.println(res.accountingQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAccountingQuoteRequest](../../models/operations/GetAccountingQuoteRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAccountingQuoteResponse](../../models/operations/GetAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingQuotes

Returns a list of AccountingQuotes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingQuotes" method="get" path="/accounting/{connection_id}/quote" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingQuotesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingQuotesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingQuotesRequest req = ListAccountingQuotesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingQuotesResponse res = sdk.quote().listAccountingQuotes()
                .request(req)
                .call();

        if (res.accountingQuotes().isPresent()) {
            System.out.println(res.accountingQuotes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAccountingQuotesRequest](../../models/operations/ListAccountingQuotesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAccountingQuotesResponse](../../models/operations/ListAccountingQuotesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingQuote

Updates the AccountingQuote identified by `id`. Provide the unified AccountingQuote fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingQuote" method="patch" path="/accounting/{connection_id}/quote/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.AccountingQuote;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingQuoteRequest req = PatchAccountingQuoteRequest.builder()
                .accountingQuote(AccountingQuote.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingQuoteResponse res = sdk.quote().patchAccountingQuote()
                .request(req)
                .call();

        if (res.accountingQuote().isPresent()) {
            System.out.println(res.accountingQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAccountingQuoteRequest](../../models/operations/PatchAccountingQuoteRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAccountingQuoteResponse](../../models/operations/PatchAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingQuote

Deletes the AccountingQuote identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingQuote" method="delete" path="/accounting/{connection_id}/quote/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingQuoteRequest req = RemoveAccountingQuoteRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingQuoteResponse res = sdk.quote().removeAccountingQuote()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAccountingQuoteRequest](../../models/operations/RemoveAccountingQuoteRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAccountingQuoteResponse](../../models/operations/RemoveAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingQuote

Updates the AccountingQuote identified by `id`. Provide the unified AccountingQuote fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingQuote" method="put" path="/accounting/{connection_id}/quote/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.AccountingQuote;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingQuoteRequest req = UpdateAccountingQuoteRequest.builder()
                .accountingQuote(AccountingQuote.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingQuoteResponse res = sdk.quote().updateAccountingQuote()
                .request(req)
                .call();

        if (res.accountingQuote().isPresent()) {
            System.out.println(res.accountingQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAccountingQuoteRequest](../../models/operations/UpdateAccountingQuoteRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAccountingQuoteResponse](../../models/operations/UpdateAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |