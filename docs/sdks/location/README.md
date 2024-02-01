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
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.models.shared.PropertyCommerceLocationAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationRequest req = new CreateCommerceLocationRequest(
                "string"){{
                commerceLocation = new CommerceLocation(
                    "string"){{
                    address = new PropertyCommerceLocationAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "North Marysecester";
                        country = "Maldives";
                        countryCode = "CU";
                        postalCode = "81935";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2024-01-11T11:46:34.114Z");
                    id = "<ID>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-08T09:24:33.872Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationResponse res = sdk.location.createCommerceLocation(req);

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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationRequest](../../models/operations/CreateCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCommerceLocationRequest req = new GetCommerceLocationRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCommerceLocationResponse res = sdk.location.getCommerceLocation(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCommerceLocationRequest](../../models/operations/GetCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsRequest req = new ListCommerceLocationsRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 2087.22d;
                offset = 1166.59d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-06-09T14:52:37.550Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsResponse res = sdk.location.listCommerceLocations(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsRequest](../../models/operations/ListCommerceLocationsRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.models.shared.PropertyCommerceLocationAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationRequest req = new PatchCommerceLocationRequest(
                "string",
                "string"){{
                commerceLocation = new CommerceLocation(
                    "string"){{
                    address = new PropertyCommerceLocationAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Lonniefurt";
                        country = "Libyan Arab Jamahiriya";
                        countryCode = "KM";
                        postalCode = "64647";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2023-03-12T06:32:06.220Z");
                    id = "<ID>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-04-15T19:35:06.232Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationResponse res = sdk.location.patchCommerceLocation(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationRequest](../../models/operations/PatchCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationRequest req = new RemoveCommerceLocationRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationResponse res = sdk.location.removeCommerceLocation(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationRequest](../../models/operations/RemoveCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.models.shared.PropertyCommerceLocationAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationRequest req = new UpdateCommerceLocationRequest(
                "string",
                "string"){{
                commerceLocation = new CommerceLocation(
                    "string"){{
                    address = new PropertyCommerceLocationAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Stillwater";
                        country = "Sierra Leone";
                        countryCode = "AL";
                        postalCode = "49876-8332";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2022-04-19T11:29:36.755Z");
                    id = "<ID>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-11T12:53:41.097Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationResponse res = sdk.location.updateCommerceLocation(req);

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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationRequest](../../models/operations/UpdateCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationResponse](../../models/operations/UpdateCommerceLocationResponse.md)**

