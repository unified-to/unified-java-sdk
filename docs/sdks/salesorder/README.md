# Salesorder

## Overview

### Available Operations

* [createAccountingSalesorder](#createaccountingsalesorder) - Create a salesorder
* [getAccountingSalesorder](#getaccountingsalesorder) - Retrieve a salesorder
* [listAccountingSalesorders](#listaccountingsalesorders) - List all salesorders
* [patchAccountingSalesorder](#patchaccountingsalesorder) - Update a salesorder
* [removeAccountingSalesorder](#removeaccountingsalesorder) - Remove a salesorder
* [updateAccountingSalesorder](#updateaccountingsalesorder) - Update a salesorder

## createAccountingSalesorder

Create a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingSalesorder" method="post" path="/accounting/{connection_id}/salesorder" example="accounting_salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingSalesorderRequest req = CreateAccountingSalesorderRequest.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .billingAddress(PropertyAccountingSalesorderBillingAddress.builder()
                        .address1("26530 Stroman Rest")
                        .address2("Suite 801")
                        .city("Pocatello")
                        .countryCode("US")
                        .postalCode("05015-8546")
                        .region("Louisiana")
                        .regionCode("MO")
                        .build())
                    .categoryIds(List.of())
                    .closedAt(OffsetDateTime.parse("2023-08-17T22:23:55.028Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .currency("ANG")
                    .discountAmount(99d)
                    .employeeUserId("4a6b8990-c85a-499f-82d0-5011c3c95a0b")
                    .fees(List.of(
                        AccountingFee.builder()
                            .amount(519d)
                            .type(AccountingFeeType.PROMOTION)
                            .currency("XCD")
                            .build()))
                    .fulfillmentType(FulfillmentType.TAKEOUT)
                    .guestCount(8d)
                    .id("d4941a2a-7d44-42b9-90df-3e4a65d79d41")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .orderNumber("988187")
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2026-01-13T16:17:32.520Z"))
                    .refundedAmount(0d)
                    .salesChannel("Harvey, Collier and Weimann")
                    .serviceChargeAmount(63d)
                    .shippingAddress(PropertyAccountingSalesorderShippingAddress.builder()
                        .address1("9878 Bradley Mill")
                        .address2("Apt. 215")
                        .city("Port Matildestad")
                        .countryCode("US")
                        .postalCode("07989-2148")
                        .region("Arkansas")
                        .regionCode("AK")
                        .build())
                    .status(AccountingSalesorderStatus.REFUNDED)
                    .subtotalAmount(0d)
                    .taxAmount(63d)
                    .tipAmount(34d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2022-02-10T19:50:55.205Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingSalesorderResponse res = sdk.salesorder().createAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateAccountingSalesorderRequest](../../models/operations/CreateAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateAccountingSalesorderResponse](../../models/operations/CreateAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingSalesorder

Retrieve a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingSalesorder" method="get" path="/accounting/{connection_id}/salesorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingSalesorderRequest req = GetAccountingSalesorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingSalesorderResponse res = sdk.salesorder().getAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAccountingSalesorderRequest](../../models/operations/GetAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAccountingSalesorderResponse](../../models/operations/GetAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingSalesorders

List all salesorders

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingSalesorders" method="get" path="/accounting/{connection_id}/salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesordersRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingSalesordersRequest req = ListAccountingSalesordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingSalesordersResponse res = sdk.salesorder().listAccountingSalesorders()
                .request(req)
                .call();

        if (res.accountingSalesorders().isPresent()) {
            System.out.println(res.accountingSalesorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListAccountingSalesordersRequest](../../models/operations/ListAccountingSalesordersRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListAccountingSalesordersResponse](../../models/operations/ListAccountingSalesordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingSalesorder

Update a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingSalesorder" method="patch" path="/accounting/{connection_id}/salesorder/{id}" example="accounting_salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingSalesorderRequest req = PatchAccountingSalesorderRequest.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .billingAddress(PropertyAccountingSalesorderBillingAddress.builder()
                        .address1("26530 Stroman Rest")
                        .address2("Suite 801")
                        .city("Pocatello")
                        .countryCode("US")
                        .postalCode("05015-8546")
                        .region("Louisiana")
                        .regionCode("MO")
                        .build())
                    .categoryIds(List.of())
                    .closedAt(OffsetDateTime.parse("2023-08-17T22:23:55.042Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .currency("ANG")
                    .discountAmount(99d)
                    .employeeUserId("4a6b8990-c85a-499f-82d0-5011c3c95a0b")
                    .fees(List.of(
                        AccountingFee.builder()
                            .amount(519d)
                            .type(AccountingFeeType.PROMOTION)
                            .currency("XCD")
                            .build()))
                    .fulfillmentType(FulfillmentType.TAKEOUT)
                    .guestCount(8d)
                    .id("82afdd80-8627-4a82-80bb-72e1655b3593")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .orderNumber("988187")
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2026-01-13T16:17:32.555Z"))
                    .refundedAmount(0d)
                    .salesChannel("Harvey, Collier and Weimann")
                    .serviceChargeAmount(63d)
                    .shippingAddress(PropertyAccountingSalesorderShippingAddress.builder()
                        .address1("9878 Bradley Mill")
                        .address2("Apt. 215")
                        .city("Port Matildestad")
                        .countryCode("US")
                        .postalCode("07989-2148")
                        .region("Arkansas")
                        .regionCode("AK")
                        .build())
                    .status(AccountingSalesorderStatus.REFUNDED)
                    .subtotalAmount(0d)
                    .taxAmount(63d)
                    .tipAmount(34d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2022-02-10T19:50:55.206Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingSalesorderResponse res = sdk.salesorder().patchAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PatchAccountingSalesorderRequest](../../models/operations/PatchAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchAccountingSalesorderResponse](../../models/operations/PatchAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingSalesorder

Remove a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingSalesorder" method="delete" path="/accounting/{connection_id}/salesorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingSalesorderRequest req = RemoveAccountingSalesorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingSalesorderResponse res = sdk.salesorder().removeAccountingSalesorder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveAccountingSalesorderRequest](../../models/operations/RemoveAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveAccountingSalesorderResponse](../../models/operations/RemoveAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingSalesorder

Update a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingSalesorder" method="put" path="/accounting/{connection_id}/salesorder/{id}" example="accounting_salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingSalesorderRequest req = UpdateAccountingSalesorderRequest.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .billingAddress(PropertyAccountingSalesorderBillingAddress.builder()
                        .address1("26530 Stroman Rest")
                        .address2("Suite 801")
                        .city("Pocatello")
                        .countryCode("US")
                        .postalCode("05015-8546")
                        .region("Louisiana")
                        .regionCode("MO")
                        .build())
                    .categoryIds(List.of())
                    .closedAt(OffsetDateTime.parse("2023-08-17T22:23:55.042Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .currency("ANG")
                    .discountAmount(99d)
                    .employeeUserId("4a6b8990-c85a-499f-82d0-5011c3c95a0b")
                    .fees(List.of(
                        AccountingFee.builder()
                            .amount(519d)
                            .type(AccountingFeeType.PROMOTION)
                            .currency("XCD")
                            .build()))
                    .fulfillmentType(FulfillmentType.TAKEOUT)
                    .guestCount(8d)
                    .id("82afdd80-8627-4a82-80bb-72e1655b3593")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .orderNumber("988187")
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2026-01-13T16:17:32.555Z"))
                    .refundedAmount(0d)
                    .salesChannel("Harvey, Collier and Weimann")
                    .serviceChargeAmount(63d)
                    .shippingAddress(PropertyAccountingSalesorderShippingAddress.builder()
                        .address1("9878 Bradley Mill")
                        .address2("Apt. 215")
                        .city("Port Matildestad")
                        .countryCode("US")
                        .postalCode("07989-2148")
                        .region("Arkansas")
                        .regionCode("AK")
                        .build())
                    .status(AccountingSalesorderStatus.REFUNDED)
                    .subtotalAmount(0d)
                    .taxAmount(63d)
                    .tipAmount(34d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2022-02-10T19:50:55.206Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingSalesorderResponse res = sdk.salesorder().updateAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateAccountingSalesorderRequest](../../models/operations/UpdateAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateAccountingSalesorderResponse](../../models/operations/UpdateAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |