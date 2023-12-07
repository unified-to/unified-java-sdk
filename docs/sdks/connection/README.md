# Connection
(*connection*)

### Available Operations

* [createUnifiedConnection](#createunifiedconnection) - Create connection
* [getUnifiedConnection](#getunifiedconnection) - Retrieve connection
* [listUnifiedConnections](#listunifiedconnections) - List all connections
* [patchUnifiedConnection](#patchunifiedconnection) - Update connection
* [removeUnifiedConnection](#removeunifiedconnection) - Remove connection
* [updateUnifiedConnection](#updateunifiedconnection) - Update connection

## createUnifiedConnection

Create connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                "string"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(
                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.ACCOUNTING),
                }},
                "string",
                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.ATS_DOCUMENT_WRITE),
                }}){{
                auth = new PropertyConnectionAuth(
){{
                    accessToken = "string";
                    apiUrl = "string";
                    appId = "string";
                    authorizeUrl = "string";
                    clientId = "string";
                    clientSecret = "string";
                    consumerKey = "string";
                    consumerSecret = "string";
                    emails = new String[]{{
                        add("string"),
                    }};
                    expiresIn = 4311.07d;
                    expiryDate = OffsetDateTime.parse("2023-01-23T23:52:45.470Z");
                    key = "<key>";
                    meta = new PropertyPropertyConnectionAuthMeta(
);
                    name = "string";
                    otherAuthInfo = new String[]{{
                        add("string"),
                    }};
                    pem = "string";
                    refreshToken = "string";
                    refreshTokenExpiresDate = OffsetDateTime.parse("2021-12-09T02:07:35.874Z");
                    refreshTokenExpiresIn = 5012.48d;
                    state = "string";
                    token = "string";
                    tokenUrl = "string";

                }};
                authAwsArn = "string";
                createdAt = OffsetDateTime.parse("2021-12-11T09:33:42.804Z");
                environment = "string";
                externalXref = "string";
                id = "<ID>";
                isPaused = false;
                updatedAt = OffsetDateTime.parse("2023-06-29T03:45:15.691Z");
                workspaceId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.CreateUnifiedConnectionResponse res = sdk.connection.createUnifiedConnection(req);

            if (res.connection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [com.unifiedapi.unifiedto.models.shared.Connection](../../models/shared/Connection.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateUnifiedConnectionResponse](../../models/operations/CreateUnifiedConnectionResponse.md)**


## getUnifiedConnection

Retrieve connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                "string"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest(
                "string");

            com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse res = sdk.connection.getUnifiedConnection(req);

            if (res.connection != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest](../../models/operations/GetUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse](../../models/operations/GetUnifiedConnectionResponse.md)**


## listUnifiedConnections

List all connections

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.Categories;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                "string"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest req = new ListUnifiedConnectionsRequest(
){{
                categories = new com.unifiedapi.unifiedto.models.operations.Categories[]{{
                    add(Categories.ENRICH),
                }};
                env = "string";
                externalXref = "string";
                limit = 9638.08d;
                offset = 15.12d;
                order = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-06-20T10:15:04.986Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse res = sdk.connection.listUnifiedConnections(req);

            if (res.connections != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest](../../models/operations/ListUnifiedConnectionsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse](../../models/operations/ListUnifiedConnectionsResponse.md)**


## patchUnifiedConnection

Update connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                "string"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest req = new PatchUnifiedConnectionRequest(
                "string"){{
                connection = new Connection(
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                        add(PropertyConnectionCategories.MARTECH),
                    }},
                    "string",
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                        add(PropertyConnectionPermissions.MARTECH_LIST_READ),
                    }}){{
                    auth = new PropertyConnectionAuth(
){{
                        accessToken = "string";
                        apiUrl = "string";
                        appId = "string";
                        authorizeUrl = "string";
                        clientId = "string";
                        clientSecret = "string";
                        consumerKey = "string";
                        consumerSecret = "string";
                        emails = new String[]{{
                            add("string"),
                        }};
                        expiresIn = 9973.13d;
                        expiryDate = OffsetDateTime.parse("2023-07-15T22:36:11.466Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta(
);
                        name = "string";
                        otherAuthInfo = new String[]{{
                            add("string"),
                        }};
                        pem = "string";
                        refreshToken = "string";
                        refreshTokenExpiresDate = OffsetDateTime.parse("2021-09-17T11:34:26.348Z");
                        refreshTokenExpiresIn = 1170.66d;
                        state = "string";
                        token = "string";
                        tokenUrl = "string";

                    }};
                    authAwsArn = "string";
                    createdAt = OffsetDateTime.parse("2021-05-14T09:50:52.127Z");
                    environment = "string";
                    externalXref = "string";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-07-09T00:35:16.005Z");
                    workspaceId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionResponse res = sdk.connection.patchUnifiedConnection(req);

            if (res.connection != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest](../../models/operations/PatchUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionResponse](../../models/operations/PatchUnifiedConnectionResponse.md)**


## removeUnifiedConnection

Remove connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                "string"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionRequest req = new RemoveUnifiedConnectionRequest(
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionResponse res = sdk.connection.removeUnifiedConnection(req);

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionRequest](../../models/operations/RemoveUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionResponse](../../models/operations/RemoveUnifiedConnectionResponse.md)**


## updateUnifiedConnection

Update connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                "string"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest req = new UpdateUnifiedConnectionRequest(
                "string"){{
                connection = new Connection(
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                        add(PropertyConnectionCategories.TICKETING),
                    }},
                    "string",
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                        add(PropertyConnectionPermissions.CRM_DEAL_READ),
                    }}){{
                    auth = new PropertyConnectionAuth(
){{
                        accessToken = "string";
                        apiUrl = "string";
                        appId = "string";
                        authorizeUrl = "string";
                        clientId = "string";
                        clientSecret = "string";
                        consumerKey = "string";
                        consumerSecret = "string";
                        emails = new String[]{{
                            add("string"),
                        }};
                        expiresIn = 9842.07d;
                        expiryDate = OffsetDateTime.parse("2023-03-25T08:32:03.332Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta(
);
                        name = "string";
                        otherAuthInfo = new String[]{{
                            add("string"),
                        }};
                        pem = "string";
                        refreshToken = "string";
                        refreshTokenExpiresDate = OffsetDateTime.parse("2022-05-18T12:30:29.270Z");
                        refreshTokenExpiresIn = 618.81d;
                        state = "string";
                        token = "string";
                        tokenUrl = "string";

                    }};
                    authAwsArn = "string";
                    createdAt = OffsetDateTime.parse("2023-11-26T11:58:40.326Z");
                    environment = "string";
                    externalXref = "string";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-06-09T04:40:33.286Z");
                    workspaceId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionResponse res = sdk.connection.updateUnifiedConnection(req);

            if (res.connection != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest](../../models/operations/UpdateUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionResponse](../../models/operations/UpdateUnifiedConnectionResponse.md)**

