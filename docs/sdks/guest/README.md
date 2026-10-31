# Guest

## Overview

### Available Operations

* [createPropertyGuest](#createpropertyguest) - Create a guest
* [getPropertyGuest](#getpropertyguest) - Retrieve a guest
* [listPropertyGuests](#listpropertyguests) - List all guests
* [patchPropertyGuest](#patchpropertyguest) - Update a guest
* [updatePropertyGuest](#updatepropertyguest) - Update a guest

## createPropertyGuest

Creates a PropertyGuest. Provide the unified PropertyGuest fields in the request body; they are mapped to the provider's API. Returns the created PropertyGuest.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPropertyGuest" method="post" path="/property/{connection_id}/guest" example="property_guest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePropertyGuestRequest;
import to.unified.unified_java_sdk.models.operations.CreatePropertyGuestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePropertyGuestRequest req = CreatePropertyGuestRequest.builder()
                .propertyGuest(PropertyGuest.builder()
                    .address(PropertyPropertyGuestAddress.builder()
                        .address1("874 Rice Trafficway")
                        .city("East Dollyside")
                        .country("Cameroon")
                        .countryCode("MX")
                        .postalCode("51113-4329")
                        .region("Missouri")
                        .build())
                    .companyName("Kertzmann, Bednar and Bashirian")
                    .createdAt(OffsetDateTime.parse("2021-10-17T05:59:05.070Z"))
                    .emails(List.of(
                        PropertyEmail.builder()
                            .email("melissa.green@icloud.com")
                            .type(PropertyEmailType.HOME)
                            .build()))
                    .firstName("Melissa")
                    .id("229617b9-b966-4171-8db7-5e90ea9e70b6")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/36.jpg")
                    .language("es")
                    .lastName("Green")
                    .metadata(List.of())
                    .name("Melissa Green")
                    .nationality("SI")
                    .notes("Minus incidunt corporis.")
                    .telephones(List.of(
                        PropertyTelephone.builder()
                            .telephone("+14564841285")
                            .type(PropertyTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-07-04T05:03:07.300Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePropertyGuestResponse res = sdk.guest().createPropertyGuest()
                .request(req)
                .call();

        if (res.propertyGuest().isPresent()) {
            System.out.println(res.propertyGuest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreatePropertyGuestRequest](../../models/operations/CreatePropertyGuestRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreatePropertyGuestResponse](../../models/operations/CreatePropertyGuestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPropertyGuest

Retrieves a single PropertyGuest by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPropertyGuest" method="get" path="/property/{connection_id}/guest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPropertyGuestRequest;
import to.unified.unified_java_sdk.models.operations.GetPropertyGuestResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPropertyGuestRequest req = GetPropertyGuestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPropertyGuestResponse res = sdk.guest().getPropertyGuest()
                .request(req)
                .call();

        if (res.propertyGuest().isPresent()) {
            System.out.println(res.propertyGuest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPropertyGuestRequest](../../models/operations/GetPropertyGuestRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPropertyGuestResponse](../../models/operations/GetPropertyGuestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPropertyGuests

Returns a list of PropertyGuests. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyGuests" method="get" path="/property/{connection_id}/guest" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyGuestsRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyGuestsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyGuestsRequest req = ListPropertyGuestsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyGuestsResponse res = sdk.guest().listPropertyGuests()
                .request(req)
                .call();

        if (res.propertyGuests().isPresent()) {
            System.out.println(res.propertyGuests().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListPropertyGuestsRequest](../../models/operations/ListPropertyGuestsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListPropertyGuestsResponse](../../models/operations/ListPropertyGuestsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPropertyGuest

Updates the PropertyGuest identified by `id`. Provide the unified PropertyGuest fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPropertyGuest" method="patch" path="/property/{connection_id}/guest/{id}" example="property_guest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPropertyGuestRequest;
import to.unified.unified_java_sdk.models.operations.PatchPropertyGuestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPropertyGuestRequest req = PatchPropertyGuestRequest.builder()
                .propertyGuest(PropertyGuest.builder()
                    .address(PropertyPropertyGuestAddress.builder()
                        .address1("874 Rice Trafficway")
                        .city("East Dollyside")
                        .country("Cameroon")
                        .countryCode("MX")
                        .postalCode("51113-4329")
                        .region("Missouri")
                        .build())
                    .companyName("Kertzmann, Bednar and Bashirian")
                    .createdAt(OffsetDateTime.parse("2021-10-17T05:59:05.070Z"))
                    .emails(List.of(
                        PropertyEmail.builder()
                            .email("melissa.green@icloud.com")
                            .type(PropertyEmailType.HOME)
                            .build()))
                    .firstName("Melissa")
                    .id("c69227dc-f51b-4503-9c39-afbd92f745fd")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/36.jpg")
                    .language("es")
                    .lastName("Green")
                    .metadata(List.of())
                    .name("Melissa Green")
                    .nationality("SI")
                    .notes("Minus incidunt corporis.")
                    .telephones(List.of(
                        PropertyTelephone.builder()
                            .telephone("+14564841285")
                            .type(PropertyTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-07-04T05:03:07.313Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPropertyGuestResponse res = sdk.guest().patchPropertyGuest()
                .request(req)
                .call();

        if (res.propertyGuest().isPresent()) {
            System.out.println(res.propertyGuest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchPropertyGuestRequest](../../models/operations/PatchPropertyGuestRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchPropertyGuestResponse](../../models/operations/PatchPropertyGuestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePropertyGuest

Updates the PropertyGuest identified by `id`. Provide the unified PropertyGuest fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePropertyGuest" method="put" path="/property/{connection_id}/guest/{id}" example="property_guest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyGuestRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyGuestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePropertyGuestRequest req = UpdatePropertyGuestRequest.builder()
                .propertyGuest(PropertyGuest.builder()
                    .address(PropertyPropertyGuestAddress.builder()
                        .address1("874 Rice Trafficway")
                        .city("East Dollyside")
                        .country("Cameroon")
                        .countryCode("MX")
                        .postalCode("51113-4329")
                        .region("Missouri")
                        .build())
                    .companyName("Kertzmann, Bednar and Bashirian")
                    .createdAt(OffsetDateTime.parse("2021-10-17T05:59:05.070Z"))
                    .emails(List.of(
                        PropertyEmail.builder()
                            .email("melissa.green@icloud.com")
                            .type(PropertyEmailType.HOME)
                            .build()))
                    .firstName("Melissa")
                    .id("c69227dc-f51b-4503-9c39-afbd92f745fd")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/36.jpg")
                    .language("es")
                    .lastName("Green")
                    .metadata(List.of())
                    .name("Melissa Green")
                    .nationality("SI")
                    .notes("Minus incidunt corporis.")
                    .telephones(List.of(
                        PropertyTelephone.builder()
                            .telephone("+14564841285")
                            .type(PropertyTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-07-04T05:03:07.313Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePropertyGuestResponse res = sdk.guest().updatePropertyGuest()
                .request(req)
                .call();

        if (res.propertyGuest().isPresent()) {
            System.out.println(res.propertyGuest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdatePropertyGuestRequest](../../models/operations/UpdatePropertyGuestRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdatePropertyGuestResponse](../../models/operations/UpdatePropertyGuestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |