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

Creates a LegalExpense. Provide the unified LegalExpense fields in the request body; they are mapped to the provider's API. Returns the created LegalExpense.

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
                    .id("e18450f9-5b54-405d-a64f-965d6e62fa75")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-04-01T02:33:18.056Z"))
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

Creates a LegalMatter. Provide the unified LegalMatter fields in the request body; they are mapped to the provider's API. Returns the created LegalMatter.

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
                    .id("b25436f1-15c4-4493-9585-44d52ed6ceef")
                    .metadata(List.of())
                    .name("Walter v. Franecki - Spinka")
                    .number("2023-3062")
                    .openedAt(OffsetDateTime.parse("2023-07-05T07:46:31.494Z"))
                    .parties(List.of(
                        LegalParty.builder()
                            .description("Urban Walter")
                            .role(LegalPartyRole.EXPERT)
                            .build()))
                    .stage("currus")
                    .status(LegalMatterStatus.OPEN)
                    .statuteOfLimitationsAt(OffsetDateTime.parse("2027-06-30T20:54:34.884Z"))
                    .updatedAt(OffsetDateTime.parse("2023-07-17T12:01:13.588Z"))
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

Creates a LegalPracticearea. Provide the unified LegalPracticearea fields in the request body; they are mapped to the provider's API. Returns the created LegalPracticearea.

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
                    .id("f1e1b76b-cf8c-43a6-966a-0efb9a9b1841")
                    .metadata(List.of())
                    .name("witty Law")
                    .type(LegalPracticeareaType.EDUCATION)
                    .updatedAt(OffsetDateTime.parse("2025-08-29T02:09:27.295Z"))
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

Creates a LegalTimeentry. Provide the unified LegalTimeentry fields in the request body; they are mapped to the provider's API. Returns the created LegalTimeentry.

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
                    .id("a5b3d58f-55a0-4301-8039-a6dd661669b1")
                    .isBillable(true)
                    .metadata(List.of())
                    .minutes(390d)
                    .rateAmount(637d)
                    .totalAmount(4140.5)
                    .updatedAt(OffsetDateTime.parse("2022-06-30T03:25:58.816Z"))
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

Retrieves a single LegalExpense by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single LegalMatter by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single LegalPracticearea by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single LegalTimeentry by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of LegalExpenses. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of LegalMatters. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of LegalPracticeareas. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of LegalTimeentries. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Updates the LegalExpense identified by `id`. Provide the unified LegalExpense fields to change in the request body.

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
                    .id("d7007f79-1ee1-482c-8c32-86ec3f5da1ee")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-04-01T02:33:18.062Z"))
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

Updates the LegalMatter identified by `id`. Provide the unified LegalMatter fields to change in the request body.

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
                    .id("60610e6a-fb7e-4aff-98e4-dff5d46ed9f4")
                    .metadata(List.of())
                    .name("Walter v. Franecki - Spinka")
                    .number("2023-3062")
                    .openedAt(OffsetDateTime.parse("2023-07-05T07:46:31.495Z"))
                    .parties(List.of(
                        LegalParty.builder()
                            .description("Urban Walter")
                            .role(LegalPartyRole.EXPERT)
                            .build()))
                    .stage("currus")
                    .status(LegalMatterStatus.OPEN)
                    .statuteOfLimitationsAt(OffsetDateTime.parse("2027-06-30T20:54:34.904Z"))
                    .updatedAt(OffsetDateTime.parse("2023-07-17T12:01:13.589Z"))
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

Updates the LegalPracticearea identified by `id`. Provide the unified LegalPracticearea fields to change in the request body.

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
                    .id("3de6dba0-f2f0-4d96-9d48-09bd5ae9c718")
                    .metadata(List.of())
                    .name("witty Law")
                    .type(LegalPracticeareaType.EDUCATION)
                    .updatedAt(OffsetDateTime.parse("2025-08-29T02:09:27.304Z"))
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

Updates the LegalTimeentry identified by `id`. Provide the unified LegalTimeentry fields to change in the request body.

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
                    .id("e80b449c-2b78-43e1-9955-9eefd429f4da")
                    .isBillable(true)
                    .metadata(List.of())
                    .minutes(390d)
                    .rateAmount(637d)
                    .totalAmount(4140.5)
                    .updatedAt(OffsetDateTime.parse("2022-06-30T03:25:58.817Z"))
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

Deletes the LegalExpense identified by `id`.

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

Deletes the LegalMatter identified by `id`.

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

Deletes the LegalPracticearea identified by `id`.

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

Deletes the LegalTimeentry identified by `id`.

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

Updates the LegalExpense identified by `id`. Provide the unified LegalExpense fields to change in the request body.

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
                    .id("d7007f79-1ee1-482c-8c32-86ec3f5da1ee")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-04-01T02:33:18.062Z"))
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

Updates the LegalMatter identified by `id`. Provide the unified LegalMatter fields to change in the request body.

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
                    .id("60610e6a-fb7e-4aff-98e4-dff5d46ed9f4")
                    .metadata(List.of())
                    .name("Walter v. Franecki - Spinka")
                    .number("2023-3062")
                    .openedAt(OffsetDateTime.parse("2023-07-05T07:46:31.495Z"))
                    .parties(List.of(
                        LegalParty.builder()
                            .description("Urban Walter")
                            .role(LegalPartyRole.EXPERT)
                            .build()))
                    .stage("currus")
                    .status(LegalMatterStatus.OPEN)
                    .statuteOfLimitationsAt(OffsetDateTime.parse("2027-06-30T20:54:34.904Z"))
                    .updatedAt(OffsetDateTime.parse("2023-07-17T12:01:13.589Z"))
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

Updates the LegalPracticearea identified by `id`. Provide the unified LegalPracticearea fields to change in the request body.

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
                    .id("3de6dba0-f2f0-4d96-9d48-09bd5ae9c718")
                    .metadata(List.of())
                    .name("witty Law")
                    .type(LegalPracticeareaType.EDUCATION)
                    .updatedAt(OffsetDateTime.parse("2025-08-29T02:09:27.304Z"))
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

Updates the LegalTimeentry identified by `id`. Provide the unified LegalTimeentry fields to change in the request body.

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
                    .id("e80b449c-2b78-43e1-9955-9eefd429f4da")
                    .isBillable(true)
                    .metadata(List.of())
                    .minutes(390d)
                    .rateAmount(637d)
                    .totalAmount(4140.5)
                    .updatedAt(OffsetDateTime.parse("2022-06-30T03:25:58.817Z"))
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