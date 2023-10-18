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
    add(PropertyConnectionPermissions.CRM_LEAD_READ),
}}){{
                auth = new PropertyConnectionAuth(){{
                    accessToken = "revolutionize";
                    apiUrl = "neutral";
                    appId = "Engineer";
                    authorizeUrl = "Lilangeni";
                    clientId = "Rubber";
                    clientSecret = "sticky";
                    consumerKey = "towards";
                    consumerSecret = "fit";
                    emails = new String[]{{
                        add("Designer"),
                    }};
                    expiresIn = 5649.9d;
                    expiryDate = OffsetDateTime.parse("2023-03-20T08:57:28.874Z");
                    key = "<key>";
                    meta = new PropertyPropertyConnectionAuthMeta();
                    name = "maroon";
                    otherAuthInfo = new String[]{{
                        add("Group"),
                    }};
                    pem = "Rap";
                    refreshToken = "female";
                    state = "Wagon";
                    token = "intensely";
                    tokenUrl = "Buckinghamshire";
                }};
                authAwsArn = "inquisitively";
                createdAt = OffsetDateTime.parse("2023-05-19T12:51:51.899Z");
                environment = "Music";
                externalXref = "coulomb";
                id = "<ID>";
                isPaused = false;
                updatedAt = OffsetDateTime.parse("2023-12-15T00:36:00.880Z");
                workspaceId = "PCI";
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
                env = "Schamberger";
                externalXref = "Tellurium";
                limit = 4785.07d;
                offset = 2709.69d;
                order = "orange";
                sort = "aha";
                updatedGte = OffsetDateTime.parse("2022-03-28T17:39:35.590Z");
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
                    add(PropertyConnectionPermissions.CRM_LEAD_READ),
                }}){{
                    auth = new PropertyConnectionAuth(){{
                        accessToken = "scalable";
                        apiUrl = "Flerovium";
                        appId = "online";
                        authorizeUrl = "Chair";
                        clientId = "customized";
                        clientSecret = "Classical";
                        consumerKey = "repeatedly";
                        consumerSecret = "Grocery";
                        emails = new String[]{{
                            add("Direct"),
                        }};
                        expiresIn = 867.16d;
                        expiryDate = OffsetDateTime.parse("2022-10-16T13:14:14.900Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta();
                        name = "Causeway";
                        otherAuthInfo = new String[]{{
                            add("hic"),
                        }};
                        pem = "Chair";
                        refreshToken = "Silver";
                        state = "payment";
                        token = "schemas";
                        tokenUrl = "Loti";
                    }};
                    authAwsArn = "buckwheat";
                    createdAt = OffsetDateTime.parse("2023-08-07T03:19:45.101Z");
                    environment = "constrict";
                    externalXref = "magenta";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-10-13T10:42:23.688Z");
                    workspaceId = "synergies";
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
                    add(PropertyConnectionPermissions.CRM_EVENT_WRITE),
                }}){{
                    auth = new PropertyConnectionAuth(){{
                        accessToken = "Berkshire";
                        apiUrl = "Account";
                        appId = "Recycled";
                        authorizeUrl = "Pizza";
                        clientId = "Accounts";
                        clientSecret = "contest";
                        consumerKey = "Fish";
                        consumerSecret = "Books";
                        emails = new String[]{{
                            add("ampere"),
                        }};
                        expiresIn = 9854.22d;
                        expiryDate = OffsetDateTime.parse("2023-12-23T03:55:24.236Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta();
                        name = "Wagon";
                        otherAuthInfo = new String[]{{
                            add("Shoals"),
                        }};
                        pem = "invoice";
                        refreshToken = "Grocery";
                        state = "Bacon";
                        token = "deposit";
                        tokenUrl = "Martinique";
                    }};
                    authAwsArn = "North";
                    createdAt = OffsetDateTime.parse("2022-04-13T10:14:02.294Z");
                    environment = "Tala";
                    externalXref = "groupware";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2023-07-20T13:56:27.665Z");
                    workspaceId = "Tricycle";
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

