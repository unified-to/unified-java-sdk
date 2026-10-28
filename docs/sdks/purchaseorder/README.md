# Purchaseorder

## Overview

### Available Operations

* [createAccountingPurchaseorder](#createaccountingpurchaseorder) - Create a purchaseorder
* [getAccountingPurchaseorder](#getaccountingpurchaseorder) - Retrieve a purchaseorder
* [listAccountingPurchaseorders](#listaccountingpurchaseorders) - List all purchaseorders
* [patchAccountingPurchaseorder](#patchaccountingpurchaseorder) - Update a purchaseorder
* [removeAccountingPurchaseorder](#removeaccountingpurchaseorder) - Remove a purchaseorder
* [updateAccountingPurchaseorder](#updateaccountingpurchaseorder) - Update a purchaseorder

## createAccountingPurchaseorder

Creates a AccountingPurchaseorder. Provide the unified AccountingPurchaseorder fields in the request body; they are mapped to the provider's API. Returns the created AccountingPurchaseorder.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingPurchaseorder" method="post" path="/accounting/{connection_id}/purchaseorder" example="accounting_purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingPurchaseorderRequest req = CreateAccountingPurchaseorderRequest.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .attachments(List.of())
                    .billingAddress(PropertyAccountingPurchaseorderBillingAddress.builder()
                        .address1("72142 Willow Street")
                        .address2("Apt. 967")
                        .city("South Annabelleton")
                        .countryCode("US")
                        .postalCode("30337")
                        .region("Nevada")
                        .regionCode("FL")
                        .build())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .currency("EUR")
                    .id("c337e022-c6df-4241-a893-ff1e82dd6d53")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .shippingAddress(PropertyAccountingPurchaseorderShippingAddress.builder()
                        .address1("76494 Medhurst Club")
                        .city("Kshlerinfurt")
                        .countryCode("US")
                        .postalCode("92116-5474")
                        .region("Oregon")
                        .regionCode("WY")
                        .build())
                    .status(AccountingPurchaseorderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2021-08-12T01:06:05.425Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingPurchaseorderResponse res = sdk.purchaseorder().createAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [CreateAccountingPurchaseorderRequest](../../models/operations/CreateAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[CreateAccountingPurchaseorderResponse](../../models/operations/CreateAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingPurchaseorder

Retrieves a single AccountingPurchaseorder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingPurchaseorder" method="get" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingPurchaseorderRequest req = GetAccountingPurchaseorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingPurchaseorderResponse res = sdk.purchaseorder().getAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAccountingPurchaseorderRequest](../../models/operations/GetAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAccountingPurchaseorderResponse](../../models/operations/GetAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingPurchaseorders

Returns a list of AccountingPurchaseorders. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingPurchaseorders" method="get" path="/accounting/{connection_id}/purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchaseordersRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchaseordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingPurchaseordersRequest req = ListAccountingPurchaseordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingPurchaseordersResponse res = sdk.purchaseorder().listAccountingPurchaseorders()
                .request(req)
                .call();

        if (res.accountingPurchaseorders().isPresent()) {
            System.out.println(res.accountingPurchaseorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListAccountingPurchaseordersRequest](../../models/operations/ListAccountingPurchaseordersRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListAccountingPurchaseordersResponse](../../models/operations/ListAccountingPurchaseordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingPurchaseorder

Updates the AccountingPurchaseorder identified by `id`. Provide the unified AccountingPurchaseorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingPurchaseorder" method="patch" path="/accounting/{connection_id}/purchaseorder/{id}" example="accounting_purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingPurchaseorderRequest req = PatchAccountingPurchaseorderRequest.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .attachments(List.of())
                    .billingAddress(PropertyAccountingPurchaseorderBillingAddress.builder()
                        .address1("72142 Willow Street")
                        .address2("Apt. 967")
                        .city("South Annabelleton")
                        .countryCode("US")
                        .postalCode("30337")
                        .region("Nevada")
                        .regionCode("FL")
                        .build())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .currency("EUR")
                    .id("9d9e2d7b-226c-4f22-a395-c9124ab30708")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .shippingAddress(PropertyAccountingPurchaseorderShippingAddress.builder()
                        .address1("76494 Medhurst Club")
                        .city("Kshlerinfurt")
                        .countryCode("US")
                        .postalCode("92116-5474")
                        .region("Oregon")
                        .regionCode("WY")
                        .build())
                    .status(AccountingPurchaseorderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2021-08-12T01:06:05.431Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingPurchaseorderResponse res = sdk.purchaseorder().patchAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [PatchAccountingPurchaseorderRequest](../../models/operations/PatchAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[PatchAccountingPurchaseorderResponse](../../models/operations/PatchAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingPurchaseorder

Deletes the AccountingPurchaseorder identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingPurchaseorder" method="delete" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingPurchaseorderRequest req = RemoveAccountingPurchaseorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingPurchaseorderResponse res = sdk.purchaseorder().removeAccountingPurchaseorder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [RemoveAccountingPurchaseorderRequest](../../models/operations/RemoveAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[RemoveAccountingPurchaseorderResponse](../../models/operations/RemoveAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingPurchaseorder

Updates the AccountingPurchaseorder identified by `id`. Provide the unified AccountingPurchaseorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingPurchaseorder" method="put" path="/accounting/{connection_id}/purchaseorder/{id}" example="accounting_purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingPurchaseorderRequest req = UpdateAccountingPurchaseorderRequest.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .attachments(List.of())
                    .billingAddress(PropertyAccountingPurchaseorderBillingAddress.builder()
                        .address1("72142 Willow Street")
                        .address2("Apt. 967")
                        .city("South Annabelleton")
                        .countryCode("US")
                        .postalCode("30337")
                        .region("Nevada")
                        .regionCode("FL")
                        .build())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .currency("EUR")
                    .id("9d9e2d7b-226c-4f22-a395-c9124ab30708")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .shippingAddress(PropertyAccountingPurchaseorderShippingAddress.builder()
                        .address1("76494 Medhurst Club")
                        .city("Kshlerinfurt")
                        .countryCode("US")
                        .postalCode("92116-5474")
                        .region("Oregon")
                        .regionCode("WY")
                        .build())
                    .status(AccountingPurchaseorderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2021-08-12T01:06:05.431Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingPurchaseorderResponse res = sdk.purchaseorder().updateAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateAccountingPurchaseorderRequest](../../models/operations/UpdateAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateAccountingPurchaseorderResponse](../../models/operations/UpdateAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |