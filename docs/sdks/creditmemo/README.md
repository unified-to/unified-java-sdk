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

Create a creditmemo

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
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://enlightened-chairperson.com/")
                            .id("b6973779-c8a8-4f1a-9b1a-3f847c624aa4")
                            .mimeType("complectus")
                            .name("thesis")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .creditmemoNumber("ulterius")
                    .currency("MKD")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2023-10-18T04:35:00.543Z"))
                    .id("7fc36458-5758-4a49-9b68-4665d4871b26")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Dedecor amo adfero torqueo quas.")
                    .paymentCollectionMethod(AccountingCreditmemoPaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .postedAt(OffsetDateTime.parse("2025-11-15T11:03:17.426Z"))
                    .refundAmount(0d)
                    .refundReason("Virgo inflammatio quibusdam aestivus magnam.")
                    .refundedAt(OffsetDateTime.parse("2023-10-23T00:35:36.814Z"))
                    .send(false)
                    .status(AccountingCreditmemoStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2024-11-15T13:32:51.006Z"))
                    .url("https://lighthearted-bandwidth.net/")
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

Retrieve a creditmemo

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

List all creditmemoes

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

Update a creditmemo

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
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://enlightened-chairperson.com/")
                            .id("1caeb4ce-3f7e-48a4-afb3-469839f68cca")
                            .mimeType("complectus")
                            .name("thesis")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .creditmemoNumber("ulterius")
                    .currency("MKD")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2023-10-18T04:35:00.543Z"))
                    .id("c0f30724-dec9-4210-8706-4c3a535e2f65")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Dedecor amo adfero torqueo quas.")
                    .paymentCollectionMethod(AccountingCreditmemoPaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .postedAt(OffsetDateTime.parse("2025-11-15T11:03:17.458Z"))
                    .refundAmount(0d)
                    .refundReason("Virgo inflammatio quibusdam aestivus magnam.")
                    .refundedAt(OffsetDateTime.parse("2023-10-23T00:35:36.814Z"))
                    .send(false)
                    .status(AccountingCreditmemoStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2024-11-15T13:32:51.023Z"))
                    .url("https://lighthearted-bandwidth.net/")
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

Remove a creditmemo

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

Update a creditmemo

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
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://enlightened-chairperson.com/")
                            .id("1caeb4ce-3f7e-48a4-afb3-469839f68cca")
                            .mimeType("complectus")
                            .name("thesis")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .creditmemoNumber("ulterius")
                    .currency("MKD")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2023-10-18T04:35:00.543Z"))
                    .id("c0f30724-dec9-4210-8706-4c3a535e2f65")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Dedecor amo adfero torqueo quas.")
                    .paymentCollectionMethod(AccountingCreditmemoPaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .postedAt(OffsetDateTime.parse("2025-11-15T11:03:17.458Z"))
                    .refundAmount(0d)
                    .refundReason("Virgo inflammatio quibusdam aestivus magnam.")
                    .refundedAt(OffsetDateTime.parse("2023-10-23T00:35:36.814Z"))
                    .send(false)
                    .status(AccountingCreditmemoStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2024-11-15T13:32:51.023Z"))
                    .url("https://lighthearted-bandwidth.net/")
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