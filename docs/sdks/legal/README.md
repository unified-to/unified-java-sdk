# Legal

## Overview

### Available Operations

* [createLegalExpense](#createlegalexpense) - Create an expense
* [createLegalMatter](#createlegalmatter) - Create a matter
* [createLegalPracticearea](#createlegalpracticearea) - Create a practicearea
* [createLegalTimeentry](#createlegaltimeentry) - Create a timeentry
* [getLegalExpense](#getlegalexpense) - Retrieve an expense
* [getLegalMatter](#getlegalmatter) - Retrieve a matter
* [getLegalPracticearea](#getlegalpracticearea) - Retrieve a practicearea
* [getLegalTimeentry](#getlegaltimeentry) - Retrieve a timeentry
* [listLegalExpenses](#listlegalexpenses) - List all expenses
* [listLegalMatters](#listlegalmatters) - List all matters
* [listLegalPracticeareas](#listlegalpracticeareas) - List all practiceareas
* [listLegalTimeentries](#listlegaltimeentries) - List all timeentries
* [patchLegalExpense](#patchlegalexpense) - Update an expense
* [patchLegalMatter](#patchlegalmatter) - Update a matter
* [patchLegalPracticearea](#patchlegalpracticearea) - Update a practicearea
* [patchLegalTimeentry](#patchlegaltimeentry) - Update a timeentry
* [removeLegalExpense](#removelegalexpense) - Remove an expense
* [removeLegalMatter](#removelegalmatter) - Remove a matter
* [removeLegalPracticearea](#removelegalpracticearea) - Remove a practicearea
* [removeLegalTimeentry](#removelegaltimeentry) - Remove a timeentry
* [updateLegalExpense](#updatelegalexpense) - Update an expense
* [updateLegalMatter](#updatelegalmatter) - Update a matter
* [updateLegalPracticearea](#updatelegalpracticearea) - Update a practicearea
* [updateLegalTimeentry](#updatelegaltimeentry) - Update a timeentry

## createLegalExpense

Create an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="createLegalExpense" method="post" path="/legal/{connection_id}/expense" example="legal_expense" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.CreateLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLegalExpenseRequest req = CreateLegalExpenseRequest.builder()
                .legalExpense(LegalExpense.builder()
                    .category("Kids")
                    .createdAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .currency("MVR")
                    .description("Temporibus agnitio sui.")
                    .id("b2fc6bbd-cd80-4d6e-95a9-57f4a147f0f7")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-03-28T16:36:59.993Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLegalExpenseResponse res = sdk.legal().createLegalExpense()
                .request(req)
                .call();

        if (res.legalExpense().isPresent()) {
            System.out.println(res.legalExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateLegalExpenseRequest](../../models/operations/CreateLegalExpenseRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateLegalExpenseResponse](../../models/operations/CreateLegalExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLegalMatter

Create a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="createLegalMatter" method="post" path="/legal/{connection_id}/matter" example="legal_matter" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.CreateLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLegalMatterRequest req = CreateLegalMatterRequest.builder()
                .legalMatter(LegalMatter.builder()
                    .billingMethod(BillingMethod.OTHER)
                    .clientReference("qSrjIBAD")
                    .companyIds(List.of())
                    .contactIds(List.of())
                    .createdAt(OffsetDateTime.parse("2023-05-28T04:10:42.375Z"))
                    .currency("BOB")
                    .description("Speciosus cresco aut cotidie temeritas arma.")
                    .id("04f67f40-70d9-4921-9fca-2a4f75344492")
                    .metadata(List.of())
                    .name("Walter v. Franecki - Spinka")
                    .number("2023-3062")
                    .openedAt(OffsetDateTime.parse("2023-07-05T03:22:03.145Z"))
                    .parties(List.of(
                        LegalParty.builder()
                            .description("Urban Walter")
                            .role(LegalPartyRole.EXPERT)
                            .build()))
                    .stage("currus")
                    .status(LegalMatterStatus.OPEN)
                    .statuteOfLimitationsAt(OffsetDateTime.parse("2027-06-24T21:11:59.258Z"))
                    .updatedAt(OffsetDateTime.parse("2023-07-17T06:12:20.296Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLegalMatterResponse res = sdk.legal().createLegalMatter()
                .request(req)
                .call();

        if (res.legalMatter().isPresent()) {
            System.out.println(res.legalMatter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateLegalMatterRequest](../../models/operations/CreateLegalMatterRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateLegalMatterResponse](../../models/operations/CreateLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLegalPracticearea

Create a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="createLegalPracticearea" method="post" path="/legal/{connection_id}/practicearea" example="legal_practicearea" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.CreateLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLegalPracticeareaRequest req = CreateLegalPracticeareaRequest.builder()
                .legalPracticearea(LegalPracticearea.builder()
                    .code("QCA")
                    .createdAt(OffsetDateTime.parse("2023-01-28T21:00:26.264Z"))
                    .id("9738bbb6-6bec-4b76-a70e-9fdd4ddcab2d")
                    .metadata(List.of())
                    .name("witty Law")
                    .type(LegalPracticeareaType.EDUCATION)
                    .updatedAt(OffsetDateTime.parse("2025-08-24T22:42:56.075Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLegalPracticeareaResponse res = sdk.legal().createLegalPracticearea()
                .request(req)
                .call();

        if (res.legalPracticearea().isPresent()) {
            System.out.println(res.legalPracticearea().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateLegalPracticeareaRequest](../../models/operations/CreateLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateLegalPracticeareaResponse](../../models/operations/CreateLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLegalTimeentry

Create a timeentry

### Example Usage

<!-- UsageSnippet language="java" operationID="createLegalTimeentry" method="post" path="/legal/{connection_id}/timeentry" example="legal_timeentry" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.CreateLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.LegalTimeentry;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLegalTimeentryRequest req = CreateLegalTimeentryRequest.builder()
                .legalTimeentry(LegalTimeentry.builder()
                    .billableMinutes(390d)
                    .createdAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .currency("ZAR")
                    .description("Ea derideo adulatio torrens.")
                    .id("cac8c205-94fd-4b86-ad77-f27e343a3948")
                    .isBillable(true)
                    .metadata(List.of())
                    .minutes(390d)
                    .rateAmount(637d)
                    .totalAmount(4140.5)
                    .updatedAt(OffsetDateTime.parse("2022-06-29T22:35:10.944Z"))
                    .workedAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLegalTimeentryResponse res = sdk.legal().createLegalTimeentry()
                .request(req)
                .call();

        if (res.legalTimeentry().isPresent()) {
            System.out.println(res.legalTimeentry().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateLegalTimeentryRequest](../../models/operations/CreateLegalTimeentryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateLegalTimeentryResponse](../../models/operations/CreateLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLegalExpense

Retrieve an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegalExpense" method="get" path="/legal/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.GetLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLegalExpenseRequest req = GetLegalExpenseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLegalExpenseResponse res = sdk.legal().getLegalExpense()
                .request(req)
                .call();

        if (res.legalExpense().isPresent()) {
            System.out.println(res.legalExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetLegalExpenseRequest](../../models/operations/GetLegalExpenseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetLegalExpenseResponse](../../models/operations/GetLegalExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLegalMatter

Retrieve a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegalMatter" method="get" path="/legal/{connection_id}/matter/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.GetLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLegalMatterRequest req = GetLegalMatterRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLegalMatterResponse res = sdk.legal().getLegalMatter()
                .request(req)
                .call();

        if (res.legalMatter().isPresent()) {
            System.out.println(res.legalMatter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLegalMatterRequest](../../models/operations/GetLegalMatterRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLegalMatterResponse](../../models/operations/GetLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLegalPracticearea

Retrieve a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegalPracticearea" method="get" path="/legal/{connection_id}/practicearea/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.GetLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLegalPracticeareaRequest req = GetLegalPracticeareaRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLegalPracticeareaResponse res = sdk.legal().getLegalPracticearea()
                .request(req)
                .call();

        if (res.legalPracticearea().isPresent()) {
            System.out.println(res.legalPracticearea().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetLegalPracticeareaRequest](../../models/operations/GetLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetLegalPracticeareaResponse](../../models/operations/GetLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLegalTimeentry

Retrieve a timeentry

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegalTimeentry" method="get" path="/legal/{connection_id}/timeentry/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.GetLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLegalTimeentryRequest req = GetLegalTimeentryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLegalTimeentryResponse res = sdk.legal().getLegalTimeentry()
                .request(req)
                .call();

        if (res.legalTimeentry().isPresent()) {
            System.out.println(res.legalTimeentry().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLegalTimeentryRequest](../../models/operations/GetLegalTimeentryRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLegalTimeentryResponse](../../models/operations/GetLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLegalExpenses

List all expenses

### Example Usage

<!-- UsageSnippet language="java" operationID="listLegalExpenses" method="get" path="/legal/{connection_id}/expense" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLegalExpensesRequest;
import to.unified.unified_java_sdk.models.operations.ListLegalExpensesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLegalExpensesRequest req = ListLegalExpensesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLegalExpensesResponse res = sdk.legal().listLegalExpenses()
                .request(req)
                .call();

        if (res.legalExpenses().isPresent()) {
            System.out.println(res.legalExpenses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListLegalExpensesRequest](../../models/operations/ListLegalExpensesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListLegalExpensesResponse](../../models/operations/ListLegalExpensesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLegalMatters

List all matters

### Example Usage

<!-- UsageSnippet language="java" operationID="listLegalMatters" method="get" path="/legal/{connection_id}/matter" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLegalMattersRequest;
import to.unified.unified_java_sdk.models.operations.ListLegalMattersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLegalMattersRequest req = ListLegalMattersRequest.builder()
                .connectionId("<id>")
                .build();

        ListLegalMattersResponse res = sdk.legal().listLegalMatters()
                .request(req)
                .call();

        if (res.legalMatters().isPresent()) {
            System.out.println(res.legalMatters().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListLegalMattersRequest](../../models/operations/ListLegalMattersRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListLegalMattersResponse](../../models/operations/ListLegalMattersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLegalPracticeareas

List all practiceareas

### Example Usage

<!-- UsageSnippet language="java" operationID="listLegalPracticeareas" method="get" path="/legal/{connection_id}/practicearea" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLegalPracticeareasRequest;
import to.unified.unified_java_sdk.models.operations.ListLegalPracticeareasResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLegalPracticeareasRequest req = ListLegalPracticeareasRequest.builder()
                .connectionId("<id>")
                .build();

        ListLegalPracticeareasResponse res = sdk.legal().listLegalPracticeareas()
                .request(req)
                .call();

        if (res.legalPracticeareas().isPresent()) {
            System.out.println(res.legalPracticeareas().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListLegalPracticeareasRequest](../../models/operations/ListLegalPracticeareasRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListLegalPracticeareasResponse](../../models/operations/ListLegalPracticeareasResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLegalTimeentries

List all timeentries

### Example Usage

<!-- UsageSnippet language="java" operationID="listLegalTimeentries" method="get" path="/legal/{connection_id}/timeentry" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLegalTimeentriesRequest;
import to.unified.unified_java_sdk.models.operations.ListLegalTimeentriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLegalTimeentriesRequest req = ListLegalTimeentriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLegalTimeentriesResponse res = sdk.legal().listLegalTimeentries()
                .request(req)
                .call();

        if (res.legalTimeentries().isPresent()) {
            System.out.println(res.legalTimeentries().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListLegalTimeentriesRequest](../../models/operations/ListLegalTimeentriesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListLegalTimeentriesResponse](../../models/operations/ListLegalTimeentriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLegalExpense

Update an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLegalExpense" method="patch" path="/legal/{connection_id}/expense/{id}" example="legal_expense" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.PatchLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLegalExpenseRequest req = PatchLegalExpenseRequest.builder()
                .legalExpense(LegalExpense.builder()
                    .category("Kids")
                    .createdAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .currency("MVR")
                    .description("Temporibus agnitio sui.")
                    .id("2b0aa4bd-4855-4ad5-a378-87fd168cc5fd")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-03-28T16:36:59.998Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLegalExpenseResponse res = sdk.legal().patchLegalExpense()
                .request(req)
                .call();

        if (res.legalExpense().isPresent()) {
            System.out.println(res.legalExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchLegalExpenseRequest](../../models/operations/PatchLegalExpenseRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchLegalExpenseResponse](../../models/operations/PatchLegalExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLegalMatter

Update a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLegalMatter" method="patch" path="/legal/{connection_id}/matter/{id}" example="legal_matter" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.PatchLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLegalMatterRequest req = PatchLegalMatterRequest.builder()
                .legalMatter(LegalMatter.builder()
                    .billingMethod(BillingMethod.OTHER)
                    .clientReference("qSrjIBAD")
                    .companyIds(List.of())
                    .contactIds(List.of())
                    .createdAt(OffsetDateTime.parse("2023-05-28T04:10:42.375Z"))
                    .currency("BOB")
                    .description("Speciosus cresco aut cotidie temeritas arma.")
                    .id("57b63d1e-0fe7-4001-8303-cfc29d8eec1c")
                    .metadata(List.of())
                    .name("Walter v. Franecki - Spinka")
                    .number("2023-3062")
                    .openedAt(OffsetDateTime.parse("2023-07-05T03:22:03.146Z"))
                    .parties(List.of(
                        LegalParty.builder()
                            .description("Urban Walter")
                            .role(LegalPartyRole.EXPERT)
                            .build()))
                    .stage("currus")
                    .status(LegalMatterStatus.OPEN)
                    .statuteOfLimitationsAt(OffsetDateTime.parse("2027-06-24T21:11:59.273Z"))
                    .updatedAt(OffsetDateTime.parse("2023-07-17T06:12:20.297Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLegalMatterResponse res = sdk.legal().patchLegalMatter()
                .request(req)
                .call();

        if (res.legalMatter().isPresent()) {
            System.out.println(res.legalMatter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchLegalMatterRequest](../../models/operations/PatchLegalMatterRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchLegalMatterResponse](../../models/operations/PatchLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLegalPracticearea

Update a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLegalPracticearea" method="patch" path="/legal/{connection_id}/practicearea/{id}" example="legal_practicearea" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.PatchLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLegalPracticeareaRequest req = PatchLegalPracticeareaRequest.builder()
                .legalPracticearea(LegalPracticearea.builder()
                    .code("QCA")
                    .createdAt(OffsetDateTime.parse("2023-01-28T21:00:26.264Z"))
                    .id("fe21de1a-2e40-4b43-9331-92e24f7311f9")
                    .metadata(List.of())
                    .name("witty Law")
                    .type(LegalPracticeareaType.EDUCATION)
                    .updatedAt(OffsetDateTime.parse("2025-08-24T22:42:56.084Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLegalPracticeareaResponse res = sdk.legal().patchLegalPracticearea()
                .request(req)
                .call();

        if (res.legalPracticearea().isPresent()) {
            System.out.println(res.legalPracticearea().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchLegalPracticeareaRequest](../../models/operations/PatchLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchLegalPracticeareaResponse](../../models/operations/PatchLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLegalTimeentry

Update a timeentry

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLegalTimeentry" method="patch" path="/legal/{connection_id}/timeentry/{id}" example="legal_timeentry" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.PatchLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.LegalTimeentry;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLegalTimeentryRequest req = PatchLegalTimeentryRequest.builder()
                .legalTimeentry(LegalTimeentry.builder()
                    .billableMinutes(390d)
                    .createdAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .currency("ZAR")
                    .description("Ea derideo adulatio torrens.")
                    .id("da554a74-0fb5-4742-9277-0ea6a36fc406")
                    .isBillable(true)
                    .metadata(List.of())
                    .minutes(390d)
                    .rateAmount(637d)
                    .totalAmount(4140.5)
                    .updatedAt(OffsetDateTime.parse("2022-06-29T22:35:10.944Z"))
                    .workedAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLegalTimeentryResponse res = sdk.legal().patchLegalTimeentry()
                .request(req)
                .call();

        if (res.legalTimeentry().isPresent()) {
            System.out.println(res.legalTimeentry().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchLegalTimeentryRequest](../../models/operations/PatchLegalTimeentryRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchLegalTimeentryResponse](../../models/operations/PatchLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLegalExpense

Remove an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLegalExpense" method="delete" path="/legal/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLegalExpenseRequest req = RemoveLegalExpenseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLegalExpenseResponse res = sdk.legal().removeLegalExpense()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveLegalExpenseRequest](../../models/operations/RemoveLegalExpenseRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveLegalExpenseResponse](../../models/operations/RemoveLegalExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLegalMatter

Remove a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLegalMatter" method="delete" path="/legal/{connection_id}/matter/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLegalMatterRequest req = RemoveLegalMatterRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLegalMatterResponse res = sdk.legal().removeLegalMatter()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveLegalMatterRequest](../../models/operations/RemoveLegalMatterRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveLegalMatterResponse](../../models/operations/RemoveLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLegalPracticearea

Remove a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLegalPracticearea" method="delete" path="/legal/{connection_id}/practicearea/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLegalPracticeareaRequest req = RemoveLegalPracticeareaRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLegalPracticeareaResponse res = sdk.legal().removeLegalPracticearea()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveLegalPracticeareaRequest](../../models/operations/RemoveLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveLegalPracticeareaResponse](../../models/operations/RemoveLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLegalTimeentry

Remove a timeentry

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLegalTimeentry" method="delete" path="/legal/{connection_id}/timeentry/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLegalTimeentryRequest req = RemoveLegalTimeentryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLegalTimeentryResponse res = sdk.legal().removeLegalTimeentry()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveLegalTimeentryRequest](../../models/operations/RemoveLegalTimeentryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveLegalTimeentryResponse](../../models/operations/RemoveLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLegalExpense

Update an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLegalExpense" method="put" path="/legal/{connection_id}/expense/{id}" example="legal_expense" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLegalExpenseRequest req = UpdateLegalExpenseRequest.builder()
                .legalExpense(LegalExpense.builder()
                    .category("Kids")
                    .createdAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .currency("MVR")
                    .description("Temporibus agnitio sui.")
                    .id("2b0aa4bd-4855-4ad5-a378-87fd168cc5fd")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-03-28T16:36:59.998Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLegalExpenseResponse res = sdk.legal().updateLegalExpense()
                .request(req)
                .call();

        if (res.legalExpense().isPresent()) {
            System.out.println(res.legalExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateLegalExpenseRequest](../../models/operations/UpdateLegalExpenseRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateLegalExpenseResponse](../../models/operations/UpdateLegalExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLegalMatter

Update a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLegalMatter" method="put" path="/legal/{connection_id}/matter/{id}" example="legal_matter" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLegalMatterRequest req = UpdateLegalMatterRequest.builder()
                .legalMatter(LegalMatter.builder()
                    .billingMethod(BillingMethod.OTHER)
                    .clientReference("qSrjIBAD")
                    .companyIds(List.of())
                    .contactIds(List.of())
                    .createdAt(OffsetDateTime.parse("2023-05-28T04:10:42.375Z"))
                    .currency("BOB")
                    .description("Speciosus cresco aut cotidie temeritas arma.")
                    .id("57b63d1e-0fe7-4001-8303-cfc29d8eec1c")
                    .metadata(List.of())
                    .name("Walter v. Franecki - Spinka")
                    .number("2023-3062")
                    .openedAt(OffsetDateTime.parse("2023-07-05T03:22:03.146Z"))
                    .parties(List.of(
                        LegalParty.builder()
                            .description("Urban Walter")
                            .role(LegalPartyRole.EXPERT)
                            .build()))
                    .stage("currus")
                    .status(LegalMatterStatus.OPEN)
                    .statuteOfLimitationsAt(OffsetDateTime.parse("2027-06-24T21:11:59.273Z"))
                    .updatedAt(OffsetDateTime.parse("2023-07-17T06:12:20.297Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLegalMatterResponse res = sdk.legal().updateLegalMatter()
                .request(req)
                .call();

        if (res.legalMatter().isPresent()) {
            System.out.println(res.legalMatter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateLegalMatterRequest](../../models/operations/UpdateLegalMatterRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateLegalMatterResponse](../../models/operations/UpdateLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLegalPracticearea

Update a practicearea

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLegalPracticearea" method="put" path="/legal/{connection_id}/practicearea/{id}" example="legal_practicearea" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLegalPracticeareaRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLegalPracticeareaResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLegalPracticeareaRequest req = UpdateLegalPracticeareaRequest.builder()
                .legalPracticearea(LegalPracticearea.builder()
                    .code("QCA")
                    .createdAt(OffsetDateTime.parse("2023-01-28T21:00:26.264Z"))
                    .id("fe21de1a-2e40-4b43-9331-92e24f7311f9")
                    .metadata(List.of())
                    .name("witty Law")
                    .type(LegalPracticeareaType.EDUCATION)
                    .updatedAt(OffsetDateTime.parse("2025-08-24T22:42:56.084Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLegalPracticeareaResponse res = sdk.legal().updateLegalPracticearea()
                .request(req)
                .call();

        if (res.legalPracticearea().isPresent()) {
            System.out.println(res.legalPracticearea().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateLegalPracticeareaRequest](../../models/operations/UpdateLegalPracticeareaRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateLegalPracticeareaResponse](../../models/operations/UpdateLegalPracticeareaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLegalTimeentry

Update a timeentry

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLegalTimeentry" method="put" path="/legal/{connection_id}/timeentry/{id}" example="legal_timeentry" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.LegalTimeentry;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLegalTimeentryRequest req = UpdateLegalTimeentryRequest.builder()
                .legalTimeentry(LegalTimeentry.builder()
                    .billableMinutes(390d)
                    .createdAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .currency("ZAR")
                    .description("Ea derideo adulatio torrens.")
                    .id("da554a74-0fb5-4742-9277-0ea6a36fc406")
                    .isBillable(true)
                    .metadata(List.of())
                    .minutes(390d)
                    .rateAmount(637d)
                    .totalAmount(4140.5)
                    .updatedAt(OffsetDateTime.parse("2022-06-29T22:35:10.944Z"))
                    .workedAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLegalTimeentryResponse res = sdk.legal().updateLegalTimeentry()
                .request(req)
                .call();

        if (res.legalTimeentry().isPresent()) {
            System.out.println(res.legalTimeentry().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateLegalTimeentryRequest](../../models/operations/UpdateLegalTimeentryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateLegalTimeentryResponse](../../models/operations/UpdateLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |