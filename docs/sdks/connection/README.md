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
                .setSecurity(new Security("likewise"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
    add(PropertyConnectionCategories.AUTH),
}}, "Specialist", new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
    add(PropertyConnectionPermissions.MARTECH_LIST_READ),
}}){{
                auth = new PropertyConnectionAuth(){{
                    accessToken = "Maserati";
                    apiUrl = "Van fondly";
                    appId = "Lilangeni Rubber sticky";
                    authorizeUrl = "worrisome Programmable eos";
                    clientId = "Bicycle maroon";
                    clientSecret = "Account female";
                    consumerKey = "tart Centralized Tesla";
                    consumerSecret = "mint coulomb";
                    emails = new String[]{{
                        add("interpenetrate"),
                    }};
                    expiresIn = 5184.19d;
                    expiryDate = OffsetDateTime.parse("2022-06-18T09:15:26.195Z");
                    key = "<key>";
                    meta = new PropertyPropertyConnectionAuthMeta();
                    name = "as yowza";
                    otherAuthInfo = new String[]{{
                        add("online"),
                    }};
                    pem = "web";
                    refreshToken = "whenever";
                    state = "Salad person compress";
                    token = "Gasoline since";
                    tokenUrl = "quantify HDD";
                }};
                authAwsArn = "Pakistan Electric Bicycle";
                createdAt = OffsetDateTime.parse("2022-04-19T22:04:20.419Z");
                environment = "Bicycle transmitting";
                externalXref = "Loan";
                id = "<ID>";
                isPaused = false;
                updatedAt = OffsetDateTime.parse("2022-12-18T10:24:24.001Z");
                workspaceId = "Rock";
            }};            

            CreateUnifiedConnectionResponse res = sdk.connection.createUnifiedConnection(req);

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
                .setSecurity(new Security("Granite"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest("Gasoline");            

            GetUnifiedConnectionResponse res = sdk.connection.getUnifiedConnection(req);

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
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsCategories;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("parsing"){{
                    jwt = "";
                }})
                .build();

            ListUnifiedConnectionsRequest req = new ListUnifiedConnectionsRequest(){{
                categories = new com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsCategories[]{{
                    add(ListUnifiedConnectionsCategories.PASSTHROUGH),
                }};
                env = "Administrator";
                externalXref = "FTP orange";
                limit = 9313.63d;
                offset = 3975.39d;
                order = "female Southwest";
                sort = "Chief";
                updatedGte = OffsetDateTime.parse("2023-01-01T21:41:02.863Z");
            }};            

            ListUnifiedConnectionsResponse res = sdk.connection.listUnifiedConnections(req);

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
                .setSecurity(new Security("International"){{
                    jwt = "";
                }})
                .build();

            PatchUnifiedConnectionRequest req = new PatchUnifiedConnectionRequest("square"){{
                connection = new Connection(new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.ATS),
                }}, "Northeast", new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.MARTECH_LIST_READ),
                }}){{
                    auth = new PropertyConnectionAuth(){{
                        accessToken = "Gasoline given";
                        apiUrl = "Chair customized";
                        appId = "Branding Direct";
                        authorizeUrl = "Pop";
                        clientId = "streamline so";
                        clientSecret = "Chair Silver payment";
                        consumerKey = "violet via";
                        consumerSecret = "Southwest constrict magenta";
                        emails = new String[]{{
                            add("World"),
                        }};
                        expiresIn = 60.89d;
                        expiryDate = OffsetDateTime.parse("2022-03-18T20:14:39.397Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta();
                        name = "viral";
                        otherAuthInfo = new String[]{{
                            add("maximized"),
                        }};
                        pem = "FTM";
                        refreshToken = "Texas real Wooden";
                        state = "male Southwest Regional";
                        token = "West";
                        tokenUrl = "matrix Optimization";
                    }};
                    authAwsArn = "yuck Diesel";
                    createdAt = OffsetDateTime.parse("2021-03-01T19:03:24.336Z");
                    environment = "towards Executive";
                    externalXref = "Intelligent";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-03-18T19:38:58.861Z");
                    workspaceId = "Diesel";
                }};
            }};            

            PatchUnifiedConnectionResponse res = sdk.connection.patchUnifiedConnection(req);

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
                .setSecurity(new Security("Infrastructure"){{
                    jwt = "";
                }})
                .build();

            RemoveUnifiedConnectionRequest req = new RemoveUnifiedConnectionRequest("Coupe");            

            RemoveUnifiedConnectionResponse res = sdk.connection.removeUnifiedConnection(req);

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
                .setSecurity(new Security("tan"){{
                    jwt = "";
                }})
                .build();

            UpdateUnifiedConnectionRequest req = new UpdateUnifiedConnectionRequest("revitalize"){{
                connection = new Connection(new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.CRM),
                }}, "Cambridgeshire", new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.CRM_TEAM_WRITE),
                }}){{
                    auth = new PropertyConnectionAuth(){{
                        accessToken = "Intuitive";
                        apiUrl = "delete digital Minivan";
                        appId = "contest Fish Books";
                        authorizeUrl = "Southwest squall clang";
                        clientId = "Land Grocery";
                        clientSecret = "violet";
                        consumerKey = "Martinique";
                        consumerSecret = "Administrator";
                        emails = new String[]{{
                            add("groupware"),
                        }};
                        expiresIn = 8498.46d;
                        expiryDate = OffsetDateTime.parse("2023-05-02T14:37:36.929Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta();
                        name = "copy Toys Pants";
                        otherAuthInfo = new String[]{{
                            add("iste"),
                        }};
                        pem = "minus Van Account";
                        refreshToken = "TCP Chrysler";
                        state = "blockchains Southeast";
                        token = "Runolfsdottir Southwest";
                        tokenUrl = "North";
                    }};
                    authAwsArn = "red";
                    createdAt = OffsetDateTime.parse("2022-01-14T09:05:41.167Z");
                    environment = "out";
                    externalXref = "Waldorf Agent";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2021-12-25T08:16:04.688Z");
                    workspaceId = "Track";
                }};
            }};            

            UpdateUnifiedConnectionResponse res = sdk.connection.updateUnifiedConnection(req);

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

