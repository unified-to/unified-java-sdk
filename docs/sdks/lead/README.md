# Lead

## Overview

### Available Operations

* [createCrmLead](#createcrmlead) - Create a lead
* [getCrmLead](#getcrmlead) - Retrieve a lead
* [listCrmLeads](#listcrmleads) - List all leads
* [patchCrmLead](#patchcrmlead) - Update a lead
* [removeCrmLead](#removecrmlead) - Remove a lead
* [updateCrmLead](#updatecrmlead) - Update a lead

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
                    .id("d4cb6aca-1880-4725-9cb8-629d9cbf435e")
                    .isActive(true)
                    .lastName("Sporer")
                    .linkUrls(List.of(
                        "https://classic-sightseeing.com/"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("463a4237-e0b4-43f0-8bf9-9bd031047f8c")
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
                    .updatedAt(OffsetDateTime.parse("2020-05-15T08:20:31.030Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmLeadResponse res = sdk.lead().createCrmLead()
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

        GetCrmLeadResponse res = sdk.lead().getCrmLead()
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

        ListCrmLeadsResponse res = sdk.lead().listCrmLeads()
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
                    .id("2177b1e1-dd39-4571-b135-943ed6c6fd45")
                    .isActive(true)
                    .lastName("Sporer")
                    .linkUrls(List.of(
                        "https://classic-sightseeing.com/"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("470ce16e-9651-4ec0-8553-548e8cf4d373")
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
                    .updatedAt(OffsetDateTime.parse("2020-05-15T08:20:31.031Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmLeadResponse res = sdk.lead().patchCrmLead()
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

        RemoveCrmLeadResponse res = sdk.lead().removeCrmLead()
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
                    .id("2177b1e1-dd39-4571-b135-943ed6c6fd45")
                    .isActive(true)
                    .lastName("Sporer")
                    .linkUrls(List.of(
                        "https://classic-sightseeing.com/"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("470ce16e-9651-4ec0-8553-548e8cf4d373")
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
                    .updatedAt(OffsetDateTime.parse("2020-05-15T08:20:31.031Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmLeadResponse res = sdk.lead().updateCrmLead()
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