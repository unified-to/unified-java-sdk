# Employee

## Overview

### Available Operations

* [createHrisEmployee](#createhrisemployee) - Create an employee
* [getHrisEmployee](#gethrisemployee) - Retrieve an employee
* [listHrisEmployees](#listhrisemployees) - List all employees
* [patchHrisEmployee](#patchhrisemployee) - Update an employee
* [removeHrisEmployee](#removehrisemployee) - Remove an employee
* [updateHrisEmployee](#updatehrisemployee) - Update an employee

## createHrisEmployee

Creates a HrisEmployee. Provide the unified HrisEmployee fields in the request body; they are mapped to the provider's API. Returns the created HrisEmployee.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisEmployee" method="post" path="/hris/{connection_id}/employee" example="hris_employee" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisEmployeeRequest req = CreateHrisEmployeeRequest.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .address(PropertyHrisEmployeeAddress.builder()
                        .address1("1636 Anissa Circle")
                        .address2("Suite 844")
                        .city("North Breanneberg")
                        .countryCode("US")
                        .postalCode("18978")
                        .region("South Dakota")
                        .regionCode("MN")
                        .build())
                    .bio("sushi devotee, singer")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(95000d)
                            .currency("USD")
                            .frequency(HrisCompensationFrequency.YEAR)
                            .notes("Soleo.")
                            .startAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("USD")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("milo.padberg@known-petal.com")
                            .type(HrisEmailType.WORK)
                            .build()))
                    .employeeNumber("3qaL1eiPnL")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.PART_TIME)
                    .firstName("Milo")
                    .flsaStatus(FlsaStatus.EXEMPT)
                    .gender(HrisEmployeeGender.MALE)
                    .hasMfa(true)
                    .hiredAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .id("6d338785-806a-4f40-bd1e-321c9a74ac39")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/52.jpg")
                    .languageLocale("in")
                    .lastName("Padberg")
                    .locations(List.of())
                    .maritalStatus(HrisEmployeeMaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("922654aa-c4d8-4979-871f-4eeb422a24d5")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("teneo"))
                            .build()))
                    .name("Milo Padberg")
                    .payFrequency(PayFrequency.WEEK)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("amanda.padberg@gmail.com")
                                    .build()))
                            .name("Amanda Padberg")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("alex.padberg@icloud.com")
                                    .build()))
                            .name("Alex Padberg")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Miss")
                    .seniorityStartedAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .serviceStartedAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .ssnSin("755-85-7843")
                    .storageQuotaAllocated(3653713d)
                    .storageQuotaAvailable(3017275d)
                    .storageQuotaUsed(367449d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(980) 337-0594")
                            .type(HrisTelephoneType.HOME)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(840) 216-6463")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .timeoffDaysTotal(17d)
                    .timeoffDaysUsed(9d)
                    .timezone("America/Nome")
                    .title("Corporate Functionality Executive")
                    .updatedAt(OffsetDateTime.parse("2020-07-23T13:18:39.053Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisEmployeeResponse res = sdk.employee().createHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisEmployeeRequest](../../models/operations/CreateHrisEmployeeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisEmployeeResponse](../../models/operations/CreateHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisEmployee

Retrieves a single HrisEmployee by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisEmployee" method="get" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisEmployeeRequest req = GetHrisEmployeeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisEmployeeResponse res = sdk.employee().getHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisEmployeeRequest](../../models/operations/GetHrisEmployeeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisEmployeeResponse](../../models/operations/GetHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisEmployees

Returns a list of HrisEmployees. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisEmployees" method="get" path="/hris/{connection_id}/employee" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployeesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployeesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisEmployeesRequest req = ListHrisEmployeesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisEmployeesResponse res = sdk.employee().listHrisEmployees()
                .request(req)
                .call();

        if (res.hrisEmployees().isPresent()) {
            System.out.println(res.hrisEmployees().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisEmployeesRequest](../../models/operations/ListHrisEmployeesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisEmployeesResponse](../../models/operations/ListHrisEmployeesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisEmployee

Updates the HrisEmployee identified by `id`. Provide the unified HrisEmployee fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisEmployee" method="patch" path="/hris/{connection_id}/employee/{id}" example="hris_employee" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisEmployeeRequest req = PatchHrisEmployeeRequest.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .address(PropertyHrisEmployeeAddress.builder()
                        .address1("1636 Anissa Circle")
                        .address2("Suite 844")
                        .city("North Breanneberg")
                        .countryCode("US")
                        .postalCode("18978")
                        .region("South Dakota")
                        .regionCode("MN")
                        .build())
                    .bio("sushi devotee, singer")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(95000d)
                            .currency("USD")
                            .frequency(HrisCompensationFrequency.YEAR)
                            .notes("Soleo.")
                            .startAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("USD")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("milo.padberg@known-petal.com")
                            .type(HrisEmailType.WORK)
                            .build()))
                    .employeeNumber("3qaL1eiPnL")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.PART_TIME)
                    .firstName("Milo")
                    .flsaStatus(FlsaStatus.EXEMPT)
                    .gender(HrisEmployeeGender.MALE)
                    .hasMfa(true)
                    .hiredAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .id("e57f3469-651d-4e52-9faf-afe475d16bf3")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/52.jpg")
                    .languageLocale("in")
                    .lastName("Padberg")
                    .locations(List.of())
                    .maritalStatus(HrisEmployeeMaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("7c3cadad-68ea-42ce-8fa6-eb0f7108a25e")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("teneo"))
                            .build()))
                    .name("Milo Padberg")
                    .payFrequency(PayFrequency.WEEK)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("amanda.padberg@gmail.com")
                                    .build()))
                            .name("Amanda Padberg")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("alex.padberg@icloud.com")
                                    .build()))
                            .name("Alex Padberg")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Miss")
                    .seniorityStartedAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .serviceStartedAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .ssnSin("755-85-7843")
                    .storageQuotaAllocated(3653713d)
                    .storageQuotaAvailable(3017275d)
                    .storageQuotaUsed(367449d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(980) 337-0594")
                            .type(HrisTelephoneType.HOME)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(840) 216-6463")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .timeoffDaysTotal(17d)
                    .timeoffDaysUsed(9d)
                    .timezone("America/Nome")
                    .title("Corporate Functionality Executive")
                    .updatedAt(OffsetDateTime.parse("2020-07-23T13:18:39.061Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisEmployeeResponse res = sdk.employee().patchHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisEmployeeRequest](../../models/operations/PatchHrisEmployeeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisEmployeeResponse](../../models/operations/PatchHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisEmployee

Deletes the HrisEmployee identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisEmployee" method="delete" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisEmployeeRequest req = RemoveHrisEmployeeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisEmployeeResponse res = sdk.employee().removeHrisEmployee()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisEmployeeRequest](../../models/operations/RemoveHrisEmployeeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisEmployeeResponse](../../models/operations/RemoveHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisEmployee

Updates the HrisEmployee identified by `id`. Provide the unified HrisEmployee fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisEmployee" method="put" path="/hris/{connection_id}/employee/{id}" example="hris_employee" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisEmployeeRequest req = UpdateHrisEmployeeRequest.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .address(PropertyHrisEmployeeAddress.builder()
                        .address1("1636 Anissa Circle")
                        .address2("Suite 844")
                        .city("North Breanneberg")
                        .countryCode("US")
                        .postalCode("18978")
                        .region("South Dakota")
                        .regionCode("MN")
                        .build())
                    .bio("sushi devotee, singer")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(95000d)
                            .currency("USD")
                            .frequency(HrisCompensationFrequency.YEAR)
                            .notes("Soleo.")
                            .startAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("USD")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("milo.padberg@known-petal.com")
                            .type(HrisEmailType.WORK)
                            .build()))
                    .employeeNumber("3qaL1eiPnL")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.PART_TIME)
                    .firstName("Milo")
                    .flsaStatus(FlsaStatus.EXEMPT)
                    .gender(HrisEmployeeGender.MALE)
                    .hasMfa(true)
                    .hiredAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .id("e57f3469-651d-4e52-9faf-afe475d16bf3")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/52.jpg")
                    .languageLocale("in")
                    .lastName("Padberg")
                    .locations(List.of())
                    .maritalStatus(HrisEmployeeMaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("7c3cadad-68ea-42ce-8fa6-eb0f7108a25e")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("teneo"))
                            .build()))
                    .name("Milo Padberg")
                    .payFrequency(PayFrequency.WEEK)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("amanda.padberg@gmail.com")
                                    .build()))
                            .name("Amanda Padberg")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("alex.padberg@icloud.com")
                                    .build()))
                            .name("Alex Padberg")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Miss")
                    .seniorityStartedAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .serviceStartedAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .ssnSin("755-85-7843")
                    .storageQuotaAllocated(3653713d)
                    .storageQuotaAvailable(3017275d)
                    .storageQuotaUsed(367449d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(980) 337-0594")
                            .type(HrisTelephoneType.HOME)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(840) 216-6463")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .timeoffDaysTotal(17d)
                    .timeoffDaysUsed(9d)
                    .timezone("America/Nome")
                    .title("Corporate Functionality Executive")
                    .updatedAt(OffsetDateTime.parse("2020-07-23T13:18:39.061Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisEmployeeResponse res = sdk.employee().updateHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisEmployeeRequest](../../models/operations/UpdateHrisEmployeeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisEmployeeResponse](../../models/operations/UpdateHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |