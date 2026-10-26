# Creditmemo

## Overview

### Available Operations

* [createAccountingCreditmemo](#createaccountingcreditmemo) - Create a creditmemo
* [getAccountingCreditmemo](#getaccountingcreditmemo) - Retrieve a creditmemo
* [listAccountingCreditmemoes](#listaccountingcreditmemoes) - List all creditmemoes
* [patchAccountingCreditmemo](#patchaccountingcreditmemo) - Update a creditmemo
* [removeAccountingCreditmemo](#removeaccountingcreditmemo) - Remove a creditmemo
* [updateAccountingCreditmemo](#updateaccountingcreditmemo) - Update a creditmemo

## createAccountingCreditmemo

Creates a AccountingCreditmemo. Provide the unified AccountingCreditmemo fields in the request body; they are mapped to the provider's API. Returns the created AccountingCreditmemo.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingCreditmemo" method="post" path="/accounting/{connection_id}/creditmemo" example="accounting_creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingCreditmemoRequest req = CreateAccountingCreditmemoRequest.builder()
                .accountingCreditmemo(AccountingCreditmemo.builder()
                    .applications(List.of())
                    .attachments(List.of())
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .creditmemoNumber("CM-99537")
                    .currency("AUD")
                    .discountAmount(0d)
                    .id("31c6af2e-a910-43e6-97eb-84de304b25f8")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Hic vorax dedecor amo adfero torqueo quas victoria.")
                    .postedAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .send(true)
                    .status(AccountingCreditmemoStatus.AUTHORIZED)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2025-09-14T11:33:37.930Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingCreditmemoResponse res = sdk.creditmemo().createAccountingCreditmemo()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateAccountingCreditmemoRequest](../../models/operations/CreateAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateAccountingCreditmemoResponse](../../models/operations/CreateAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingCreditmemo

Retrieves a single AccountingCreditmemo by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingCreditmemo" method="get" path="/accounting/{connection_id}/creditmemo/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingCreditmemoRequest req = GetAccountingCreditmemoRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingCreditmemoResponse res = sdk.creditmemo().getAccountingCreditmemo()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAccountingCreditmemoRequest](../../models/operations/GetAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAccountingCreditmemoResponse](../../models/operations/GetAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingCreditmemoes

Returns a list of AccountingCreditmemoes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingCreditmemoes" method="get" path="/accounting/{connection_id}/creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingCreditmemoesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingCreditmemoesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingCreditmemoesRequest req = ListAccountingCreditmemoesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingCreditmemoesResponse res = sdk.creditmemo().listAccountingCreditmemoes()
                .request(req)
                .call();

        if (res.accountingCreditmemoes().isPresent()) {
            System.out.println(res.accountingCreditmemoes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingCreditmemoesRequest](../../models/operations/ListAccountingCreditmemoesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingCreditmemoesResponse](../../models/operations/ListAccountingCreditmemoesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingCreditmemo

Updates the AccountingCreditmemo identified by `id`. Provide the unified AccountingCreditmemo fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingCreditmemo" method="patch" path="/accounting/{connection_id}/creditmemo/{id}" example="accounting_creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingCreditmemoRequest req = PatchAccountingCreditmemoRequest.builder()
                .accountingCreditmemo(AccountingCreditmemo.builder()
                    .applications(List.of())
                    .attachments(List.of())
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .creditmemoNumber("CM-99537")
                    .currency("AUD")
                    .discountAmount(0d)
                    .id("9d99a3df-987a-4c43-98a3-4cede6b4a00b")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Hic vorax dedecor amo adfero torqueo quas victoria.")
                    .postedAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .send(true)
                    .status(AccountingCreditmemoStatus.AUTHORIZED)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2025-09-14T11:33:37.961Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingCreditmemoResponse res = sdk.creditmemo().patchAccountingCreditmemo()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PatchAccountingCreditmemoRequest](../../models/operations/PatchAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchAccountingCreditmemoResponse](../../models/operations/PatchAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingCreditmemo

Deletes the AccountingCreditmemo identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingCreditmemo" method="delete" path="/accounting/{connection_id}/creditmemo/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingCreditmemoRequest req = RemoveAccountingCreditmemoRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingCreditmemoResponse res = sdk.creditmemo().removeAccountingCreditmemo()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveAccountingCreditmemoRequest](../../models/operations/RemoveAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveAccountingCreditmemoResponse](../../models/operations/RemoveAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingCreditmemo

Updates the AccountingCreditmemo identified by `id`. Provide the unified AccountingCreditmemo fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingCreditmemo" method="put" path="/accounting/{connection_id}/creditmemo/{id}" example="accounting_creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingCreditmemoRequest req = UpdateAccountingCreditmemoRequest.builder()
                .accountingCreditmemo(AccountingCreditmemo.builder()
                    .applications(List.of())
                    .attachments(List.of())
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .creditmemoNumber("CM-99537")
                    .currency("AUD")
                    .discountAmount(0d)
                    .id("9d99a3df-987a-4c43-98a3-4cede6b4a00b")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Hic vorax dedecor amo adfero torqueo quas victoria.")
                    .postedAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .send(true)
                    .status(AccountingCreditmemoStatus.AUTHORIZED)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2025-09-14T11:33:37.961Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingCreditmemoResponse res = sdk.creditmemo().updateAccountingCreditmemo()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateAccountingCreditmemoRequest](../../models/operations/UpdateAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateAccountingCreditmemoResponse](../../models/operations/UpdateAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |