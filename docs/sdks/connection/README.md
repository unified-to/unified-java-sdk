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

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(
                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.KMS),
                }},
                "<value>",
                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.ATS_DOCUMENT_WRITE),
                }}){{
                auth = new PropertyConnectionAuth(
){{
                    accessToken = "<value>";
                    apiUrl = "<value>";
                    appId = "<value>";
                    authorizeUrl = "<value>";
                    clientId = "<value>";
                    clientSecret = "<value>";
                    consumerKey = "<value>";
                    consumerSecret = "<value>";
                    devApiKey = "<value>";
                    emails = new String[]{{
                        add("<value>"),
                    }};
                    expiresIn = 4311.07d;
                    expiryDate = OffsetDateTime.parse("2024-01-24T16:22:59.867Z");
                    key = "<key>";
                    meta = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    name = "<value>";
                    otherAuthInfo = new String[]{{
                        add("<value>"),
                    }};
                    pem = "<value>";
                    refreshToken = "<value>";
                    refreshTokenExpiresDate = OffsetDateTime.parse("2022-12-09T09:37:28.071Z");
                    refreshTokenExpiresIn = 5012.48d;
                    state = "Kansas";
                    token = "<value>";
                    tokenUrl = "<value>";

                }};
                authAwsArn = "<value>";
                createdAt = OffsetDateTime.parse("2024-06-28T23:40:51.869Z");
                cursorsCache = new java.util.HashMap<String, java.lang.Object>[]{{
                    add(new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }}),
                }};
                environment = "<value>";
                externalXref = "<value>";
                id = "<id>";
                isPaused = false;
                lastHealthyAt = OffsetDateTime.parse("2023-11-01T09:09:15.633Z");
                lastUnhealthyAt = OffsetDateTime.parse("2023-02-05T07:37:37.431Z");
                updatedAt = OffsetDateTime.parse("2024-07-21T18:48:43.528Z");
                workspaceId = "<value>";

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
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest(
                "<value>");

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
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest req = new ListUnifiedConnectionsRequest(
){{
                categories = new com.unifiedapi.unifiedto.models.operations.Categories[]{{
                    add(Categories.UC),
                }};
                env = "<value>";
                externalXref = "<value>";
                limit = 9638.08d;
                offset = 15.12d;
                updatedGte = OffsetDateTime.parse("2022-06-20T13:59:12.388Z");

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

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest req = new PatchUnifiedConnectionRequest(
                "<value>"){{
                connection = new Connection(
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                        add(PropertyConnectionCategories.COMMERCE),
                    }},
                    "<value>",
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                        add(PropertyConnectionPermissions.HRIS_GROUP_READ),
                    }}){{
                    auth = new PropertyConnectionAuth(
){{
                        accessToken = "<value>";
                        apiUrl = "<value>";
                        appId = "<value>";
                        authorizeUrl = "<value>";
                        clientId = "<value>";
                        clientSecret = "<value>";
                        consumerKey = "<value>";
                        consumerSecret = "<value>";
                        devApiKey = "<value>";
                        emails = new String[]{{
                            add("<value>"),
                        }};
                        expiresIn = 9973.13d;
                        expiryDate = OffsetDateTime.parse("2024-07-15T18:53:52.079Z");
                        key = "<key>";
                        meta = new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("key", "<value>");
                        }};
                        name = "<value>";
                        otherAuthInfo = new String[]{{
                            add("<value>"),
                        }};
                        pem = "<value>";
                        refreshToken = "<value>";
                        refreshTokenExpiresDate = OffsetDateTime.parse("2022-09-17T17:15:40.563Z");
                        refreshTokenExpiresIn = 1170.66d;
                        state = "Connecticut";
                        token = "<value>";
                        tokenUrl = "<value>";

                    }};
                    authAwsArn = "<value>";
                    createdAt = OffsetDateTime.parse("2023-07-09T12:43:50.814Z");
                    cursorsCache = new java.util.HashMap<String, java.lang.Object>[]{{
                        add(new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("key", "<value>");
                        }}),
                    }};
                    environment = "<value>";
                    externalXref = "<value>";
                    id = "<id>";
                    isPaused = false;
                    lastHealthyAt = OffsetDateTime.parse("2023-02-14T05:49:12.923Z");
                    lastUnhealthyAt = OffsetDateTime.parse("2024-06-03T13:20:07.463Z");
                    updatedAt = OffsetDateTime.parse("2024-03-09T11:43:14.112Z");
                    workspaceId = "<value>";

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
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionRequest req = new RemoveUnifiedConnectionRequest(
                "<value>");

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

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest req = new UpdateUnifiedConnectionRequest(
                "<value>"){{
                connection = new Connection(
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                        add(PropertyConnectionCategories.GENAI),
                    }},
                    "<value>",
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                        add(PropertyConnectionPermissions.CRM_DEAL_WRITE),
                    }}){{
                    auth = new PropertyConnectionAuth(
){{
                        accessToken = "<value>";
                        apiUrl = "<value>";
                        appId = "<value>";
                        authorizeUrl = "<value>";
                        clientId = "<value>";
                        clientSecret = "<value>";
                        consumerKey = "<value>";
                        consumerSecret = "<value>";
                        devApiKey = "<value>";
                        emails = new String[]{{
                            add("<value>"),
                        }};
                        expiresIn = 9842.07d;
                        expiryDate = OffsetDateTime.parse("2024-03-25T02:21:40.431Z");
                        key = "<key>";
                        meta = new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("key", "<value>");
                        }};
                        name = "<value>";
                        otherAuthInfo = new String[]{{
                            add("<value>"),
                        }};
                        pem = "<value>";
                        refreshToken = "<value>";
                        refreshTokenExpiresDate = OffsetDateTime.parse("2023-05-18T23:31:20.256Z");
                        refreshTokenExpiresIn = 618.81d;
                        state = "Wisconsin";
                        token = "<value>";
                        tokenUrl = "<value>";

                    }};
                    authAwsArn = "<value>";
                    createdAt = OffsetDateTime.parse("2023-06-09T16:09:54.412Z");
                    cursorsCache = new java.util.HashMap<String, java.lang.Object>[]{{
                        add(new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("key", "<value>");
                        }}),
                    }};
                    environment = "<value>";
                    externalXref = "<value>";
                    id = "<id>";
                    isPaused = false;
                    lastHealthyAt = OffsetDateTime.parse("2022-03-08T19:30:51.046Z");
                    lastUnhealthyAt = OffsetDateTime.parse("2023-01-09T16:11:04.721Z");
                    updatedAt = OffsetDateTime.parse("2023-03-20T19:30:15.010Z");
                    workspaceId = "<value>";

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

