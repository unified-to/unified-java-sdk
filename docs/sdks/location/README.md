# Location
(*location*)

### Available Operations

* [createCommerceLocation](#createcommercelocation) - Create a location
* [getCommerceLocation](#getcommercelocation) - Retrieve a location
* [listCommerceLocations](#listcommercelocations) - List all locations
* [patchCommerceLocation](#patchcommercelocation) - Update a location
* [removeCommerceLocation](#removecommercelocation) - Remove a location
* [updateCommerceLocation](#updatecommercelocation) - Update a location

## createCommerceLocation

Create a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationResponse;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationSecurity;
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.models.shared.PropertyCommerceLocationAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationRequest req = new CreateCommerceLocationRequest(
                "<value>"){{
                commerceLocation = new CommerceLocation(
                    "<value>"){{
                    address = new PropertyCommerceLocationAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "North Marysecester";
                        country = "Maldives";
                        countryCode = "CU";
                        postalCode = "81935";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2024-01-11T11:46:34.114Z");
                    id = "<id>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-08T09:24:33.872Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationResponse res = sdk.location.createCommerceLocation(req, new CreateCommerceLocationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.commerceLocation != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationRequest](../../models/operations/CreateCommerceLocationRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationSecurity](../../models/operations/CreateCommerceLocationSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationResponse](../../models/operations/CreateCommerceLocationResponse.md)**


## getCommerceLocation

Retrieve a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.GetCommerceLocationResponse;
import com.unifiedapi.unifiedto.models.operations.GetCommerceLocationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetCommerceLocationRequest req = new GetCommerceLocationRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCommerceLocationResponse res = sdk.location.getCommerceLocation(req, new GetCommerceLocationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.commerceLocation != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetCommerceLocationRequest](../../models/operations/GetCommerceLocationRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetCommerceLocationSecurity](../../models/operations/GetCommerceLocationSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCommerceLocationResponse](../../models/operations/GetCommerceLocationResponse.md)**


## listCommerceLocations

List all locations

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsResponse;
import com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsRequest req = new ListCommerceLocationsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 2087.22d;
                offset = 1166.59d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-06-09T14:52:37.550Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsResponse res = sdk.location.listCommerceLocations(req, new ListCommerceLocationsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.commerceLocations != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsRequest](../../models/operations/ListCommerceLocationsRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsSecurity](../../models/operations/ListCommerceLocationsSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsResponse](../../models/operations/ListCommerceLocationsResponse.md)**


## patchCommerceLocation

Update a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationSecurity;
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.models.shared.PropertyCommerceLocationAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationRequest req = new PatchCommerceLocationRequest(
                "<value>",
                "<value>"){{
                commerceLocation = new CommerceLocation(
                    "<value>"){{
                    address = new PropertyCommerceLocationAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Lonniefurt";
                        country = "Libyan Arab Jamahiriya";
                        countryCode = "KM";
                        postalCode = "64647";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2023-03-12T06:32:06.220Z");
                    id = "<id>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-04-15T19:35:06.232Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationResponse res = sdk.location.patchCommerceLocation(req, new PatchCommerceLocationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.commerceLocation != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationRequest](../../models/operations/PatchCommerceLocationRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationSecurity](../../models/operations/PatchCommerceLocationSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationResponse](../../models/operations/PatchCommerceLocationResponse.md)**


## removeCommerceLocation

Remove a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationRequest req = new RemoveCommerceLocationRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationResponse res = sdk.location.removeCommerceLocation(req, new RemoveCommerceLocationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationRequest](../../models/operations/RemoveCommerceLocationRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationSecurity](../../models/operations/RemoveCommerceLocationSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationResponse](../../models/operations/RemoveCommerceLocationResponse.md)**


## updateCommerceLocation

Update a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationSecurity;
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.models.shared.PropertyCommerceLocationAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationRequest req = new UpdateCommerceLocationRequest(
                "<value>",
                "<value>"){{
                commerceLocation = new CommerceLocation(
                    "<value>"){{
                    address = new PropertyCommerceLocationAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Stillwater";
                        country = "Sierra Leone";
                        countryCode = "AL";
                        postalCode = "49876-8332";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2022-04-19T11:29:36.755Z");
                    id = "<id>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-11T12:53:41.097Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationResponse res = sdk.location.updateCommerceLocation(req, new UpdateCommerceLocationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.commerceLocation != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationRequest](../../models/operations/UpdateCommerceLocationRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationSecurity](../../models/operations/UpdateCommerceLocationSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationResponse](../../models/operations/UpdateCommerceLocationResponse.md)**

