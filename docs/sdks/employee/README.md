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
                        .address1("7431 Hintz Parkway")
                        .address2("Apt. 520")
                        .city("Port Rogerview")
                        .countryCode("US")
                        .postalCode("01711")
                        .region("Missouri")
                        .regionCode("TN")
                        .build())
                    .bio("fun advocate  🇱🇻")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(95000d)
                            .currency("USD")
                            .frequency(HrisCompensationFrequency.YEAR)
                            .notes("Eius.")
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("USD")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("zetta.prohaska@insidious-stump.net")
                            .type(HrisEmailType.WORK)
                            .build()))
                    .employeeNumber("uCk3qaL1ei")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.PART_TIME)
                    .firstName("Zetta")
                    .flsaStatus(FlsaStatus.EXEMPT)
                    .gender(HrisEmployeeGender.MALE)
                    .hasMfa(true)
                    .hiredAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .id("143906c4-eace-4fbc-9d71-8a7d86f52979")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/female/512/85.jpg")
                    .languageLocale("in")
                    .lastName("Prohaska")
                    .locations(List.of())
                    .maritalStatus(HrisEmployeeMaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("19f4ab82-f6f2-4961-b38f-362dcc7e3d31")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("tutis"))
                            .build()))
                    .name("Zetta Prohaska")
                    .payFrequency(PayFrequency.WEEK)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keith.prohaska@gmail.com")
                                    .build()))
                            .name("Keith Prohaska")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keely.prohaska@icloud.com")
                                    .build()))
                            .name("Keely Prohaska")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Ms.")
                    .ssnSin("284-82-8167")
                    .storageQuotaAllocated(3653713d)
                    .storageQuotaAvailable(3017275d)
                    .storageQuotaUsed(367449d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(320) 980-1370")
                            .type(HrisTelephoneType.HOME)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(694) 840-0166")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .timeoffDaysTotal(17d)
                    .timeoffDaysUsed(9d)
                    .timezone("Europe/Ljubljana")
                    .title("District Branding Specialist")
                    .updatedAt(OffsetDateTime.parse("2020-07-20T00:10:44.351Z"))
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
                        .address1("7431 Hintz Parkway")
                        .address2("Apt. 520")
                        .city("Port Rogerview")
                        .countryCode("US")
                        .postalCode("01711")
                        .region("Missouri")
                        .regionCode("TN")
                        .build())
                    .bio("fun advocate  🇱🇻")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(95000d)
                            .currency("USD")
                            .frequency(HrisCompensationFrequency.YEAR)
                            .notes("Eius.")
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("USD")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("zetta.prohaska@insidious-stump.net")
                            .type(HrisEmailType.WORK)
                            .build()))
                    .employeeNumber("uCk3qaL1ei")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.PART_TIME)
                    .firstName("Zetta")
                    .flsaStatus(FlsaStatus.EXEMPT)
                    .gender(HrisEmployeeGender.MALE)
                    .hasMfa(true)
                    .hiredAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .id("39dc12a5-27c2-4ac0-9c08-72313e7f861f")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/female/512/85.jpg")
                    .languageLocale("in")
                    .lastName("Prohaska")
                    .locations(List.of())
                    .maritalStatus(HrisEmployeeMaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("4e3a0b6d-3b9d-49d1-8297-1607f24fc169")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("tutis"))
                            .build()))
                    .name("Zetta Prohaska")
                    .payFrequency(PayFrequency.WEEK)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keith.prohaska@gmail.com")
                                    .build()))
                            .name("Keith Prohaska")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keely.prohaska@icloud.com")
                                    .build()))
                            .name("Keely Prohaska")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Ms.")
                    .ssnSin("284-82-8167")
                    .storageQuotaAllocated(3653713d)
                    .storageQuotaAvailable(3017275d)
                    .storageQuotaUsed(367449d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(320) 980-1370")
                            .type(HrisTelephoneType.HOME)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(694) 840-0166")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .timeoffDaysTotal(17d)
                    .timeoffDaysUsed(9d)
                    .timezone("Europe/Ljubljana")
                    .title("District Branding Specialist")
                    .updatedAt(OffsetDateTime.parse("2020-07-20T00:10:44.366Z"))
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
                        .address1("7431 Hintz Parkway")
                        .address2("Apt. 520")
                        .city("Port Rogerview")
                        .countryCode("US")
                        .postalCode("01711")
                        .region("Missouri")
                        .regionCode("TN")
                        .build())
                    .bio("fun advocate  🇱🇻")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(95000d)
                            .currency("USD")
                            .frequency(HrisCompensationFrequency.YEAR)
                            .notes("Eius.")
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("USD")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("zetta.prohaska@insidious-stump.net")
                            .type(HrisEmailType.WORK)
                            .build()))
                    .employeeNumber("uCk3qaL1ei")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.PART_TIME)
                    .firstName("Zetta")
                    .flsaStatus(FlsaStatus.EXEMPT)
                    .gender(HrisEmployeeGender.MALE)
                    .hasMfa(true)
                    .hiredAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .id("39dc12a5-27c2-4ac0-9c08-72313e7f861f")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/female/512/85.jpg")
                    .languageLocale("in")
                    .lastName("Prohaska")
                    .locations(List.of())
                    .maritalStatus(HrisEmployeeMaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("4e3a0b6d-3b9d-49d1-8297-1607f24fc169")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("tutis"))
                            .build()))
                    .name("Zetta Prohaska")
                    .payFrequency(PayFrequency.WEEK)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keith.prohaska@gmail.com")
                                    .build()))
                            .name("Keith Prohaska")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keely.prohaska@icloud.com")
                                    .build()))
                            .name("Keely Prohaska")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Ms.")
                    .ssnSin("284-82-8167")
                    .storageQuotaAllocated(3653713d)
                    .storageQuotaAvailable(3017275d)
                    .storageQuotaUsed(367449d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(320) 980-1370")
                            .type(HrisTelephoneType.HOME)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(694) 840-0166")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .timeoffDaysTotal(17d)
                    .timeoffDaysUsed(9d)
                    .timezone("Europe/Ljubljana")
                    .title("District Branding Specialist")
                    .updatedAt(OffsetDateTime.parse("2020-07-20T00:10:44.366Z"))
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