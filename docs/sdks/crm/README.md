# Crm

## Overview

### Available Operations

* [createCrmCompany](#createcrmcompany) - Create a company
* [createCrmContact](#createcrmcontact) - Create a contact
* [createCrmDeal](#createcrmdeal) - Create a deal
* [createCrmEvent](#createcrmevent) - Create an event
* [createCrmLead](#createcrmlead) - Create a lead
* [createCrmPipeline](#createcrmpipeline) - Create a pipeline
* [getCrmCompany](#getcrmcompany) - Retrieve a company
* [getCrmContact](#getcrmcontact) - Retrieve a contact
* [getCrmDeal](#getcrmdeal) - Retrieve a deal
* [getCrmEvent](#getcrmevent) - Retrieve an event
* [getCrmLead](#getcrmlead) - Retrieve a lead
* [getCrmPipeline](#getcrmpipeline) - Retrieve a pipeline
* [listCrmCompanies](#listcrmcompanies) - List all companies
* [listCrmContacts](#listcrmcontacts) - List all contacts
* [listCrmDeals](#listcrmdeals) - List all deals
* [listCrmEvents](#listcrmevents) - List all events
* [listCrmLeads](#listcrmleads) - List all leads
* [listCrmPipelines](#listcrmpipelines) - List all pipelines
* [listCrmTaxonomies](#listcrmtaxonomies) - List all taxonomies
* [patchCrmCompany](#patchcrmcompany) - Update a company
* [patchCrmContact](#patchcrmcontact) - Update a contact
* [patchCrmDeal](#patchcrmdeal) - Update a deal
* [patchCrmEvent](#patchcrmevent) - Update an event
* [patchCrmLead](#patchcrmlead) - Update a lead
* [patchCrmPipeline](#patchcrmpipeline) - Update a pipeline
* [removeCrmCompany](#removecrmcompany) - Remove a company
* [removeCrmContact](#removecrmcontact) - Remove a contact
* [removeCrmDeal](#removecrmdeal) - Remove a deal
* [removeCrmEvent](#removecrmevent) - Remove an event
* [removeCrmLead](#removecrmlead) - Remove a lead
* [removeCrmPipeline](#removecrmpipeline) - Remove a pipeline
* [updateCrmCompany](#updatecrmcompany) - Update a company
* [updateCrmContact](#updatecrmcontact) - Update a contact
* [updateCrmDeal](#updatecrmdeal) - Update a deal
* [updateCrmEvent](#updatecrmevent) - Update an event
* [updateCrmLead](#updatecrmlead) - Update a lead
* [updateCrmPipeline](#updatecrmpipeline) - Update a pipeline

## createCrmCompany

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmCompany" method="post" path="/crm/{connection_id}/company" example="crm_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmCompanyRequest req = CreateCrmCompanyRequest.builder()
                .crmCompany(CrmCompany.builder()
                    .address(PropertyCrmCompanyAddress.builder()
                        .address1("7261 Salisbury Road")
                        .address2("Apt. 778")
                        .city("Harrisburg")
                        .countryCode("US")
                        .postalCode("56293-3678")
                        .region("Pennsylvania")
                        .regionCode("ID")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-05-11T18:26:32.925Z"))
                    .description("Balbus crapula spiculum.")
                    .domains(List.of(
                        "fussy-nerve.info",
                        "sturdy-lobster.org",
                        "greedy-offset.name"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@gmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine.Jacobi@yahoo.com")
                            .type(CrmEmailType.OTHER)
                            .build()))
                    .employees(967d)
                    .id("7efd4e17-2edd-4d69-a609-1dc1909fcb7c")
                    .industry("Infrastructure")
                    .isActive(true)
                    .linkUrls(List.of(
                        "https://blue-license.org",
                        "https://minor-formation.com",
                        "https://ecstatic-hammock.com"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("b94c5ddf-e3fe-4afc-b54c-0ea1e62077fa")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("esse"))
                            .build()))
                    .name("Goodwin and Sons")
                    .tags(List.of(
                        "quaerat",
                        "valeo"))
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(432) 849-2690")
                            .type(CrmTelephoneType.MOBILE)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(606) 871-2046")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(842) 258-9395")
                            .type(CrmTelephoneType.MOBILE)
                            .build()))
                    .timezone("Europe/San_Marino")
                    .updatedAt(OffsetDateTime.parse("2025-02-07T06:18:51.352Z"))
                    .websites(List.of(
                        "https://wise-possession.org"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmCompanyResponse res = sdk.crm().createCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateCrmCompanyRequest](../../models/operations/CreateCrmCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCrmCompanyResponse](../../models/operations/CreateCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmContact

Create a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmContact" method="post" path="/crm/{connection_id}/contact" example="crm_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmContactRequest req = CreateCrmContactRequest.builder()
                .crmContact(CrmContact.builder()
                    .address(PropertyCrmContactAddress.builder()
                        .address1("518 Brannon Burg")
                        .city("East Helenebury")
                        .countryCode("US")
                        .postalCode("92622-2406")
                        .region("Vermont")
                        .regionCode("AZ")
                        .build())
                    .company("Lowe - Jakubowski")
                    .createdAt(OffsetDateTime.parse("2021-01-02T00:41:38.885Z"))
                    .department("systematic")
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Mohammad.Bartell45@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad.Bartell90@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad_Bartell@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .firstName("Mohammad")
                    .id("8954f110-bf69-44d4-af7a-c3d466099708")
                    .imageUrl("https://picsum.photos/seed/zmbPeg/2905/378")
                    .lastName("Bartell")
                    .linkUrls(List.of(
                        "https://limited-parade.info",
                        "https://faint-papa.com/",
                        "https://windy-accountability.name"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("84e44d63-19c0-4b7c-bfc6-cfa41e76a166")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("autem"))
                            .build()))
                    .name("Mohammad Bartell")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(975) 986-1658")
                            .type(CrmTelephoneType.WORK)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(489) 332-3509")
                            .type(CrmTelephoneType.HOME)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(205) 880-8886")
                            .type(CrmTelephoneType.HOME)
                            .build()))
                    .title("National Tactics Analyst")
                    .updatedAt(OffsetDateTime.parse("2021-02-23T09:49:00.163Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmContactResponse res = sdk.crm().createCrmContact()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateCrmContactRequest](../../models/operations/CreateCrmContactRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCrmContactResponse](../../models/operations/CreateCrmContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmDeal

Create a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmDeal" method="post" path="/crm/{connection_id}/deal" example="crm_deal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmDealRequest req = CreateCrmDealRequest.builder()
                .crmDeal(CrmDeal.builder()
                    .amount(98162d)
                    .closedAt(OffsetDateTime.parse("2024-03-03T18:42:54.835Z"))
                    .closingAt(OffsetDateTime.parse("2025-08-10T13:21:35.876Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("IQD")
                    .description("Tabula cicuta sophismata comis tepidus sit cavus.")
                    .id("8ad43c3e-51f9-49d2-9444-119544610fdf")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("61015e09-fe40-49cb-94ee-917f9208693a")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("conatus"))
                            .build()))
                    .name("Frozen Silk Chicken")
                    .pipelines(List.of(
                        CrmReference.builder()
                            .id("c0deac25-46fe-4a01-a7c7-18a6dd6b21f8")
                            .name("trans")
                            .build()))
                    .probability(65d)
                    .source("cubo")
                    .stages(List.of(
                        CrmReference.builder()
                            .id("3bf41a44-17fb-4b7d-8067-14a16550e3bf")
                            .name("tubineus")
                            .build(),
                        CrmReference.builder()
                            .id("68071f55-686a-4d3b-ae29-3f826e062003")
                            .name("adfectus")
                            .build()))
                    .tags(List.of(
                        "causa",
                        "suus"))
                    .updatedAt(OffsetDateTime.parse("2024-09-29T12:23:06.405Z"))
                    .wonReason("Usque libero soleo.")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmDealResponse res = sdk.crm().createCrmDeal()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateCrmDealRequest](../../models/operations/CreateCrmDealRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateCrmDealResponse](../../models/operations/CreateCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmEvent

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmEvent" method="post" path="/crm/{connection_id}/event" example="crm_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmEventRequest req = CreateCrmEventRequest.builder()
                .crmEvent(CrmEvent.builder()
                    .call(PropertyCrmEventCall.builder()
                        .description("Arbitro aptus.")
                        .duration(64d)
                        .startAt(OffsetDateTime.parse("2024-11-18T12:19:54.415Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("2a3f8bb1-268e-4e15-9de9-af59a9f4bc2b")
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-09-09T15:49:09.580Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmEventResponse res = sdk.crm().createCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateCrmEventRequest](../../models/operations/CreateCrmEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCrmEventResponse](../../models/operations/CreateCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmLead

Create a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmLead" method="post" path="/crm/{connection_id}/lead" example="crm_lead" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmLeadRequest req = CreateCrmLeadRequest.builder()
                .crmLead(CrmLead.builder()
                    .address(PropertyCrmLeadAddress.builder()
                        .address1("528 Forest Road")
                        .address2("Apt. 643")
                        .city("Palm Springs")
                        .countryCode("US")
                        .postalCode("55624-6499")
                        .region("New Jersey")
                        .regionCode("LA")
                        .build())
                    .companyName("Tillman - Wiegand")
                    .createdAt(OffsetDateTime.parse("2019-10-12T11:27:59.003Z"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Velda.Sporer16@yahoo.com")
                            .type(CrmEmailType.OTHER)
                            .build(),
                        CrmEmail.builder()
                            .email("Velda.Sporer@yahoo.com")
                            .type(CrmEmailType.HOME)
                            .build()))
                    .firstName("Velda")
                    .id("947ae514-5da3-45c3-ad6e-055aa7f83c44")
                    .isActive(true)
                    .lastName("Sporer")
                    .linkUrls(List.of(
                        "https://classic-sightseeing.com/"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("ee49ee9c-22c6-453a-947c-9fca0ad9acf7")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("sublime"))
                            .build()))
                    .name("Velda Sporer")
                    .source("aetas")
                    .status("vesco")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(955) 643-9849")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(621) 811-8800")
                            .type(CrmTelephoneType.WORK)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2020-05-15T04:10:15.743Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmLeadResponse res = sdk.crm().createCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateCrmLeadRequest](../../models/operations/CreateCrmLeadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateCrmLeadResponse](../../models/operations/CreateCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmPipeline

Create a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmPipeline" method="post" path="/crm/{connection_id}/pipeline" example="crm_pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmPipelineRequest req = CreateCrmPipelineRequest.builder()
                .crmPipeline(CrmPipeline.builder()
                    .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                    .dealProbability(99d)
                    .displayOrder(8d)
                    .id("d74c8e61-1eba-4207-99bd-a881b88219bb")
                    .isActive(true)
                    .name("Small Steel Bacon")
                    .stages(List.of(
                        CrmStage.builder()
                            .active(false)
                            .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                            .dealProbability(84d)
                            .displayOrder(72d)
                            .id("a65d62c4-e9e5-40d4-8eba-e0ee96b62797")
                            .isClosed(true)
                            .name("Veniam.")
                            .updatedAt(OffsetDateTime.parse("2025-09-17T03:21:50.034Z"))
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-10-08T08:48:53.206Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmPipelineResponse res = sdk.crm().createCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateCrmPipelineRequest](../../models/operations/CreateCrmPipelineRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateCrmPipelineResponse](../../models/operations/CreateCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmCompany

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmCompany" method="get" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmCompanyRequest req = GetCrmCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmCompanyResponse res = sdk.crm().getCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCrmCompanyRequest](../../models/operations/GetCrmCompanyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCrmCompanyResponse](../../models/operations/GetCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmContact

Retrieve a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmContact" method="get" path="/crm/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmContactRequest req = GetCrmContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmContactResponse res = sdk.crm().getCrmContact()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCrmContactRequest](../../models/operations/GetCrmContactRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCrmContactResponse](../../models/operations/GetCrmContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmDeal

Retrieve a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmDeal" method="get" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmDealRequest req = GetCrmDealRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmDealResponse res = sdk.crm().getCrmDeal()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetCrmDealRequest](../../models/operations/GetCrmDealRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetCrmDealResponse](../../models/operations/GetCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmEvent

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmEvent" method="get" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmEventRequest req = GetCrmEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmEventResponse res = sdk.crm().getCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCrmEventRequest](../../models/operations/GetCrmEventRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCrmEventResponse](../../models/operations/GetCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmLead

Retrieve a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmLead" method="get" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmLeadRequest req = GetCrmLeadRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmLeadResponse res = sdk.crm().getCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetCrmLeadRequest](../../models/operations/GetCrmLeadRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetCrmLeadResponse](../../models/operations/GetCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmPipeline

Retrieve a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmPipeline" method="get" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmPipelineRequest req = GetCrmPipelineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmPipelineResponse res = sdk.crm().getCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCrmPipelineRequest](../../models/operations/GetCrmPipelineRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCrmPipelineResponse](../../models/operations/GetCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmCompanies

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmCompanies" method="get" path="/crm/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmCompaniesRequest req = ListCrmCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmCompaniesResponse res = sdk.crm().listCrmCompanies()
                .request(req)
                .call();

        if (res.crmCompanies().isPresent()) {
            System.out.println(res.crmCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCrmCompaniesRequest](../../models/operations/ListCrmCompaniesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCrmCompaniesResponse](../../models/operations/ListCrmCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmContacts

List all contacts

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmContacts" method="get" path="/crm/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmContactsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmContactsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmContactsRequest req = ListCrmContactsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmContactsResponse res = sdk.crm().listCrmContacts()
                .request(req)
                .call();

        if (res.crmContacts().isPresent()) {
            System.out.println(res.crmContacts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListCrmContactsRequest](../../models/operations/ListCrmContactsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListCrmContactsResponse](../../models/operations/ListCrmContactsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmDeals

List all deals

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmDeals" method="get" path="/crm/{connection_id}/deal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmDealsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmDealsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmDealsRequest req = ListCrmDealsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmDealsResponse res = sdk.crm().listCrmDeals()
                .request(req)
                .call();

        if (res.crmDeals().isPresent()) {
            System.out.println(res.crmDeals().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListCrmDealsRequest](../../models/operations/ListCrmDealsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListCrmDealsResponse](../../models/operations/ListCrmDealsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmEvents

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmEvents" method="get" path="/crm/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmEventsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmEventsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmEventsRequest req = ListCrmEventsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmEventsResponse res = sdk.crm().listCrmEvents()
                .request(req)
                .call();

        if (res.crmEvents().isPresent()) {
            System.out.println(res.crmEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCrmEventsRequest](../../models/operations/ListCrmEventsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCrmEventsResponse](../../models/operations/ListCrmEventsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmLeads

List all leads

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmLeads" method="get" path="/crm/{connection_id}/lead" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmLeadsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmLeadsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmLeadsRequest req = ListCrmLeadsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmLeadsResponse res = sdk.crm().listCrmLeads()
                .request(req)
                .call();

        if (res.crmLeads().isPresent()) {
            System.out.println(res.crmLeads().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListCrmLeadsRequest](../../models/operations/ListCrmLeadsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListCrmLeadsResponse](../../models/operations/ListCrmLeadsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmPipelines

List all pipelines

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmPipelines" method="get" path="/crm/{connection_id}/pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelinesRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelinesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmPipelinesRequest req = ListCrmPipelinesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmPipelinesResponse res = sdk.crm().listCrmPipelines()
                .request(req)
                .call();

        if (res.crmPipelines().isPresent()) {
            System.out.println(res.crmPipelines().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCrmPipelinesRequest](../../models/operations/ListCrmPipelinesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCrmPipelinesResponse](../../models/operations/ListCrmPipelinesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmTaxonomies

List all taxonomies

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmTaxonomies" method="get" path="/crm/{connection_id}/taxonomy" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmTaxonomiesRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmTaxonomiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmTaxonomiesRequest req = ListCrmTaxonomiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmTaxonomiesResponse res = sdk.crm().listCrmTaxonomies()
                .request(req)
                .call();

        if (res.crmTaxonomies().isPresent()) {
            System.out.println(res.crmTaxonomies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCrmTaxonomiesRequest](../../models/operations/ListCrmTaxonomiesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCrmTaxonomiesResponse](../../models/operations/ListCrmTaxonomiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmCompany" method="patch" path="/crm/{connection_id}/company/{id}" example="crm_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmCompanyRequest req = PatchCrmCompanyRequest.builder()
                .crmCompany(CrmCompany.builder()
                    .address(PropertyCrmCompanyAddress.builder()
                        .address1("7261 Salisbury Road")
                        .address2("Apt. 778")
                        .city("Harrisburg")
                        .countryCode("US")
                        .postalCode("56293-3678")
                        .region("Pennsylvania")
                        .regionCode("ID")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-05-11T18:26:32.925Z"))
                    .description("Balbus crapula spiculum.")
                    .domains(List.of(
                        "fussy-nerve.info",
                        "sturdy-lobster.org",
                        "greedy-offset.name"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@gmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine.Jacobi@yahoo.com")
                            .type(CrmEmailType.OTHER)
                            .build()))
                    .employees(967d)
                    .id("be95d3c2-d02c-4135-a377-d6618352f6eb")
                    .industry("Infrastructure")
                    .isActive(true)
                    .linkUrls(List.of(
                        "https://blue-license.org",
                        "https://minor-formation.com",
                        "https://ecstatic-hammock.com"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("7108a934-06ff-40f8-8a80-b5ff2a50266c")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("esse"))
                            .build()))
                    .name("Goodwin and Sons")
                    .tags(List.of(
                        "quaerat",
                        "valeo"))
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(432) 849-2690")
                            .type(CrmTelephoneType.MOBILE)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(606) 871-2046")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(842) 258-9395")
                            .type(CrmTelephoneType.MOBILE)
                            .build()))
                    .timezone("Europe/San_Marino")
                    .updatedAt(OffsetDateTime.parse("2025-02-07T06:18:51.376Z"))
                    .websites(List.of(
                        "https://wise-possession.org"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmCompanyResponse res = sdk.crm().patchCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchCrmCompanyRequest](../../models/operations/PatchCrmCompanyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchCrmCompanyResponse](../../models/operations/PatchCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmContact" method="patch" path="/crm/{connection_id}/contact/{id}" example="crm_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmContactRequest req = PatchCrmContactRequest.builder()
                .crmContact(CrmContact.builder()
                    .address(PropertyCrmContactAddress.builder()
                        .address1("518 Brannon Burg")
                        .city("East Helenebury")
                        .countryCode("US")
                        .postalCode("92622-2406")
                        .region("Vermont")
                        .regionCode("AZ")
                        .build())
                    .company("Lowe - Jakubowski")
                    .createdAt(OffsetDateTime.parse("2021-01-02T00:41:38.885Z"))
                    .department("systematic")
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Mohammad.Bartell45@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad.Bartell90@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad_Bartell@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .firstName("Mohammad")
                    .id("ed2c1d54-038e-4d12-a7c8-b362b6c7769c")
                    .imageUrl("https://picsum.photos/seed/zmbPeg/2905/378")
                    .lastName("Bartell")
                    .linkUrls(List.of(
                        "https://limited-parade.info",
                        "https://faint-papa.com/",
                        "https://windy-accountability.name"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("bdd0a7c5-3f75-402d-8ac8-b0eac653fac0")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("autem"))
                            .build()))
                    .name("Mohammad Bartell")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(975) 986-1658")
                            .type(CrmTelephoneType.WORK)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(489) 332-3509")
                            .type(CrmTelephoneType.HOME)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(205) 880-8886")
                            .type(CrmTelephoneType.HOME)
                            .build()))
                    .title("National Tactics Analyst")
                    .updatedAt(OffsetDateTime.parse("2021-02-23T09:49:00.164Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmContactResponse res = sdk.crm().patchCrmContact()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchCrmContactRequest](../../models/operations/PatchCrmContactRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchCrmContactResponse](../../models/operations/PatchCrmContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmDeal

Update a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmDeal" method="patch" path="/crm/{connection_id}/deal/{id}" example="crm_deal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmDealRequest req = PatchCrmDealRequest.builder()
                .crmDeal(CrmDeal.builder()
                    .amount(98162d)
                    .closedAt(OffsetDateTime.parse("2024-03-03T18:42:54.841Z"))
                    .closingAt(OffsetDateTime.parse("2025-08-10T13:21:35.897Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("IQD")
                    .description("Tabula cicuta sophismata comis tepidus sit cavus.")
                    .id("1b288fe7-0b1e-4c66-9d57-8e9f0c29a73a")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("53d0e966-4c01-4219-aac9-7917340ec7ff")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("conatus"))
                            .build()))
                    .name("Frozen Silk Chicken")
                    .pipelines(List.of(
                        CrmReference.builder()
                            .id("44c9c344-b97b-4beb-b966-535231df214c")
                            .name("trans")
                            .build()))
                    .probability(65d)
                    .source("cubo")
                    .stages(List.of(
                        CrmReference.builder()
                            .id("258333c4-4239-4606-a5de-be52d7601fc5")
                            .name("tubineus")
                            .build(),
                        CrmReference.builder()
                            .id("cb5cd254-2c36-41b1-ab45-a7c1db70e518")
                            .name("adfectus")
                            .build()))
                    .tags(List.of(
                        "causa",
                        "suus"))
                    .updatedAt(OffsetDateTime.parse("2024-09-29T12:23:06.416Z"))
                    .wonReason("Usque libero soleo.")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmDealResponse res = sdk.crm().patchCrmDeal()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchCrmDealRequest](../../models/operations/PatchCrmDealRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchCrmDealResponse](../../models/operations/PatchCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmEvent" method="patch" path="/crm/{connection_id}/event/{id}" example="crm_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmEventRequest req = PatchCrmEventRequest.builder()
                .crmEvent(CrmEvent.builder()
                    .call(PropertyCrmEventCall.builder()
                        .description("Arbitro aptus.")
                        .duration(64d)
                        .startAt(OffsetDateTime.parse("2024-11-18T12:19:54.451Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("ab82d529-31c0-46b3-a811-97edb69724cc")
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-09-09T15:49:09.631Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmEventResponse res = sdk.crm().patchCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchCrmEventRequest](../../models/operations/PatchCrmEventRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchCrmEventResponse](../../models/operations/PatchCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmLead

Update a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmLead" method="patch" path="/crm/{connection_id}/lead/{id}" example="crm_lead" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmLeadRequest req = PatchCrmLeadRequest.builder()
                .crmLead(CrmLead.builder()
                    .address(PropertyCrmLeadAddress.builder()
                        .address1("528 Forest Road")
                        .address2("Apt. 643")
                        .city("Palm Springs")
                        .countryCode("US")
                        .postalCode("55624-6499")
                        .region("New Jersey")
                        .regionCode("LA")
                        .build())
                    .companyName("Tillman - Wiegand")
                    .createdAt(OffsetDateTime.parse("2019-10-12T11:27:59.003Z"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Velda.Sporer16@yahoo.com")
                            .type(CrmEmailType.OTHER)
                            .build(),
                        CrmEmail.builder()
                            .email("Velda.Sporer@yahoo.com")
                            .type(CrmEmailType.HOME)
                            .build()))
                    .firstName("Velda")
                    .id("76e93c41-c4ce-4f5d-a2de-846d3461d97f")
                    .isActive(true)
                    .lastName("Sporer")
                    .linkUrls(List.of(
                        "https://classic-sightseeing.com/"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("f6ebec83-23f2-4fd1-ae21-e863f804b1b7")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("sublime"))
                            .build()))
                    .name("Velda Sporer")
                    .source("aetas")
                    .status("vesco")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(955) 643-9849")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(621) 811-8800")
                            .type(CrmTelephoneType.WORK)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2020-05-15T04:10:15.745Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmLeadResponse res = sdk.crm().patchCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchCrmLeadRequest](../../models/operations/PatchCrmLeadRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchCrmLeadResponse](../../models/operations/PatchCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmPipeline

Update a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmPipeline" method="patch" path="/crm/{connection_id}/pipeline/{id}" example="crm_pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmPipelineRequest req = PatchCrmPipelineRequest.builder()
                .crmPipeline(CrmPipeline.builder()
                    .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                    .dealProbability(99d)
                    .displayOrder(8d)
                    .id("869c7c37-392b-4c3d-8391-41ba201b7e6f")
                    .isActive(true)
                    .name("Small Steel Bacon")
                    .stages(List.of(
                        CrmStage.builder()
                            .active(false)
                            .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                            .dealProbability(84d)
                            .displayOrder(72d)
                            .id("bde5f718-4c11-4ded-b919-a4a3f247f5e0")
                            .isClosed(true)
                            .name("Veniam.")
                            .updatedAt(OffsetDateTime.parse("2025-09-17T03:21:50.041Z"))
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-10-08T08:48:53.214Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmPipelineResponse res = sdk.crm().patchCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchCrmPipelineRequest](../../models/operations/PatchCrmPipelineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchCrmPipelineResponse](../../models/operations/PatchCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmCompany

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmCompany" method="delete" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmCompanyRequest req = RemoveCrmCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmCompanyResponse res = sdk.crm().removeCrmCompany()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveCrmCompanyRequest](../../models/operations/RemoveCrmCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveCrmCompanyResponse](../../models/operations/RemoveCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmContact

Remove a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmContact" method="delete" path="/crm/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmContactRequest req = RemoveCrmContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmContactResponse res = sdk.crm().removeCrmContact()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveCrmContactRequest](../../models/operations/RemoveCrmContactRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveCrmContactResponse](../../models/operations/RemoveCrmContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmDeal

Remove a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmDeal" method="delete" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmDealRequest req = RemoveCrmDealRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmDealResponse res = sdk.crm().removeCrmDeal()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveCrmDealRequest](../../models/operations/RemoveCrmDealRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveCrmDealResponse](../../models/operations/RemoveCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmEvent

Remove an event

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmEvent" method="delete" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmEventRequest req = RemoveCrmEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmEventResponse res = sdk.crm().removeCrmEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveCrmEventRequest](../../models/operations/RemoveCrmEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveCrmEventResponse](../../models/operations/RemoveCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmLead

Remove a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmLead" method="delete" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmLeadRequest req = RemoveCrmLeadRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmLeadResponse res = sdk.crm().removeCrmLead()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveCrmLeadRequest](../../models/operations/RemoveCrmLeadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveCrmLeadResponse](../../models/operations/RemoveCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmPipeline

Remove a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmPipeline" method="delete" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmPipelineRequest req = RemoveCrmPipelineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmPipelineResponse res = sdk.crm().removeCrmPipeline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveCrmPipelineRequest](../../models/operations/RemoveCrmPipelineRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveCrmPipelineResponse](../../models/operations/RemoveCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmCompany" method="put" path="/crm/{connection_id}/company/{id}" example="crm_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmCompanyRequest req = UpdateCrmCompanyRequest.builder()
                .crmCompany(CrmCompany.builder()
                    .address(PropertyCrmCompanyAddress.builder()
                        .address1("7261 Salisbury Road")
                        .address2("Apt. 778")
                        .city("Harrisburg")
                        .countryCode("US")
                        .postalCode("56293-3678")
                        .region("Pennsylvania")
                        .regionCode("ID")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-05-11T18:26:32.925Z"))
                    .description("Balbus crapula spiculum.")
                    .domains(List.of(
                        "fussy-nerve.info",
                        "sturdy-lobster.org",
                        "greedy-offset.name"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@gmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine.Jacobi@yahoo.com")
                            .type(CrmEmailType.OTHER)
                            .build()))
                    .employees(967d)
                    .id("be95d3c2-d02c-4135-a377-d6618352f6eb")
                    .industry("Infrastructure")
                    .isActive(true)
                    .linkUrls(List.of(
                        "https://blue-license.org",
                        "https://minor-formation.com",
                        "https://ecstatic-hammock.com"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("7108a934-06ff-40f8-8a80-b5ff2a50266c")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("esse"))
                            .build()))
                    .name("Goodwin and Sons")
                    .tags(List.of(
                        "quaerat",
                        "valeo"))
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(432) 849-2690")
                            .type(CrmTelephoneType.MOBILE)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(606) 871-2046")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(842) 258-9395")
                            .type(CrmTelephoneType.MOBILE)
                            .build()))
                    .timezone("Europe/San_Marino")
                    .updatedAt(OffsetDateTime.parse("2025-02-07T06:18:51.376Z"))
                    .websites(List.of(
                        "https://wise-possession.org"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmCompanyResponse res = sdk.crm().updateCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateCrmCompanyRequest](../../models/operations/UpdateCrmCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCrmCompanyResponse](../../models/operations/UpdateCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmContact" method="put" path="/crm/{connection_id}/contact/{id}" example="crm_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmContactRequest req = UpdateCrmContactRequest.builder()
                .crmContact(CrmContact.builder()
                    .address(PropertyCrmContactAddress.builder()
                        .address1("518 Brannon Burg")
                        .city("East Helenebury")
                        .countryCode("US")
                        .postalCode("92622-2406")
                        .region("Vermont")
                        .regionCode("AZ")
                        .build())
                    .company("Lowe - Jakubowski")
                    .createdAt(OffsetDateTime.parse("2021-01-02T00:41:38.885Z"))
                    .department("systematic")
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Mohammad.Bartell45@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad.Bartell90@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad_Bartell@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .firstName("Mohammad")
                    .id("ed2c1d54-038e-4d12-a7c8-b362b6c7769c")
                    .imageUrl("https://picsum.photos/seed/zmbPeg/2905/378")
                    .lastName("Bartell")
                    .linkUrls(List.of(
                        "https://limited-parade.info",
                        "https://faint-papa.com/",
                        "https://windy-accountability.name"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("bdd0a7c5-3f75-402d-8ac8-b0eac653fac0")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("autem"))
                            .build()))
                    .name("Mohammad Bartell")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(975) 986-1658")
                            .type(CrmTelephoneType.WORK)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(489) 332-3509")
                            .type(CrmTelephoneType.HOME)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(205) 880-8886")
                            .type(CrmTelephoneType.HOME)
                            .build()))
                    .title("National Tactics Analyst")
                    .updatedAt(OffsetDateTime.parse("2021-02-23T09:49:00.164Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmContactResponse res = sdk.crm().updateCrmContact()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateCrmContactRequest](../../models/operations/UpdateCrmContactRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCrmContactResponse](../../models/operations/UpdateCrmContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmDeal

Update a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmDeal" method="put" path="/crm/{connection_id}/deal/{id}" example="crm_deal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmDealRequest req = UpdateCrmDealRequest.builder()
                .crmDeal(CrmDeal.builder()
                    .amount(98162d)
                    .closedAt(OffsetDateTime.parse("2024-03-03T18:42:54.841Z"))
                    .closingAt(OffsetDateTime.parse("2025-08-10T13:21:35.897Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("IQD")
                    .description("Tabula cicuta sophismata comis tepidus sit cavus.")
                    .id("1b288fe7-0b1e-4c66-9d57-8e9f0c29a73a")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("53d0e966-4c01-4219-aac9-7917340ec7ff")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("conatus"))
                            .build()))
                    .name("Frozen Silk Chicken")
                    .pipelines(List.of(
                        CrmReference.builder()
                            .id("44c9c344-b97b-4beb-b966-535231df214c")
                            .name("trans")
                            .build()))
                    .probability(65d)
                    .source("cubo")
                    .stages(List.of(
                        CrmReference.builder()
                            .id("258333c4-4239-4606-a5de-be52d7601fc5")
                            .name("tubineus")
                            .build(),
                        CrmReference.builder()
                            .id("cb5cd254-2c36-41b1-ab45-a7c1db70e518")
                            .name("adfectus")
                            .build()))
                    .tags(List.of(
                        "causa",
                        "suus"))
                    .updatedAt(OffsetDateTime.parse("2024-09-29T12:23:06.416Z"))
                    .wonReason("Usque libero soleo.")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmDealResponse res = sdk.crm().updateCrmDeal()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateCrmDealRequest](../../models/operations/UpdateCrmDealRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateCrmDealResponse](../../models/operations/UpdateCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmEvent" method="put" path="/crm/{connection_id}/event/{id}" example="crm_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmEventRequest req = UpdateCrmEventRequest.builder()
                .crmEvent(CrmEvent.builder()
                    .call(PropertyCrmEventCall.builder()
                        .description("Arbitro aptus.")
                        .duration(64d)
                        .startAt(OffsetDateTime.parse("2024-11-18T12:19:54.451Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("ab82d529-31c0-46b3-a811-97edb69724cc")
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-09-09T15:49:09.631Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmEventResponse res = sdk.crm().updateCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateCrmEventRequest](../../models/operations/UpdateCrmEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCrmEventResponse](../../models/operations/UpdateCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmLead

Update a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmLead" method="put" path="/crm/{connection_id}/lead/{id}" example="crm_lead" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmLeadRequest req = UpdateCrmLeadRequest.builder()
                .crmLead(CrmLead.builder()
                    .address(PropertyCrmLeadAddress.builder()
                        .address1("528 Forest Road")
                        .address2("Apt. 643")
                        .city("Palm Springs")
                        .countryCode("US")
                        .postalCode("55624-6499")
                        .region("New Jersey")
                        .regionCode("LA")
                        .build())
                    .companyName("Tillman - Wiegand")
                    .createdAt(OffsetDateTime.parse("2019-10-12T11:27:59.003Z"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Velda.Sporer16@yahoo.com")
                            .type(CrmEmailType.OTHER)
                            .build(),
                        CrmEmail.builder()
                            .email("Velda.Sporer@yahoo.com")
                            .type(CrmEmailType.HOME)
                            .build()))
                    .firstName("Velda")
                    .id("76e93c41-c4ce-4f5d-a2de-846d3461d97f")
                    .isActive(true)
                    .lastName("Sporer")
                    .linkUrls(List.of(
                        "https://classic-sightseeing.com/"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("f6ebec83-23f2-4fd1-ae21-e863f804b1b7")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("sublime"))
                            .build()))
                    .name("Velda Sporer")
                    .source("aetas")
                    .status("vesco")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(955) 643-9849")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(621) 811-8800")
                            .type(CrmTelephoneType.WORK)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2020-05-15T04:10:15.745Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmLeadResponse res = sdk.crm().updateCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateCrmLeadRequest](../../models/operations/UpdateCrmLeadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateCrmLeadResponse](../../models/operations/UpdateCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmPipeline

Update a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmPipeline" method="put" path="/crm/{connection_id}/pipeline/{id}" example="crm_pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmPipelineRequest req = UpdateCrmPipelineRequest.builder()
                .crmPipeline(CrmPipeline.builder()
                    .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                    .dealProbability(99d)
                    .displayOrder(8d)
                    .id("869c7c37-392b-4c3d-8391-41ba201b7e6f")
                    .isActive(true)
                    .name("Small Steel Bacon")
                    .stages(List.of(
                        CrmStage.builder()
                            .active(false)
                            .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                            .dealProbability(84d)
                            .displayOrder(72d)
                            .id("bde5f718-4c11-4ded-b919-a4a3f247f5e0")
                            .isClosed(true)
                            .name("Veniam.")
                            .updatedAt(OffsetDateTime.parse("2025-09-17T03:21:50.041Z"))
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-10-08T08:48:53.214Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmPipelineResponse res = sdk.crm().updateCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateCrmPipelineRequest](../../models/operations/UpdateCrmPipelineRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateCrmPipelineResponse](../../models/operations/UpdateCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |