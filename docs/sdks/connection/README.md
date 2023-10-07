# Connection
(*connection*)

### Available Operations

* [deleteUnifiedConnectionId](#deleteunifiedconnectionid) - Remove connection
* [getUnifiedConnection](#getunifiedconnection) - List all connections
* [getUnifiedConnectionId](#getunifiedconnectionid) - Retrieve connection
* [patchUnifiedConnectionId](#patchunifiedconnectionid) - Update connection
* [postUnifiedConnection](#postunifiedconnection) - Create connection
* [putUnifiedConnectionId](#putunifiedconnectionid) - Update connection

## deleteUnifiedConnectionId

Remove connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Clothing"){{
                    jwt = "";
                }})
                .build();

            DeleteUnifiedConnectionIdRequest req = new DeleteUnifiedConnectionIdRequest("Rand");            

            DeleteUnifiedConnectionIdResponse res = sdk.connection.deleteUnifiedConnectionId(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdRequest](../../models/operations/DeleteUnifiedConnectionIdRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdResponse](../../models/operations/DeleteUnifiedConnectionIdResponse.md)**


## getUnifiedConnection

List all connections

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionCategories;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Granite"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest(){{
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionCategories[]{{
                    add(GetUnifiedConnectionCategories.TICKETING),
                }};
                env = "HTTP Islands West";
                externalXref = "Bespoke Salad consequently";
                limit = 5071.38d;
                offset = 8108.56d;
                order = "Product seamless Coupe";
                sort = "Manager";
                updatedGte = OffsetDateTime.parse("2022-09-23T00:11:33.487Z");
            }};            

            GetUnifiedConnectionResponse res = sdk.connection.getUnifiedConnection(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest](../../models/operations/GetUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse](../../models/operations/GetUnifiedConnectionResponse.md)**


## getUnifiedConnectionId

Retrieve connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Interactions"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedConnectionIdRequest req = new GetUnifiedConnectionIdRequest("deploy");            

            GetUnifiedConnectionIdResponse res = sdk.connection.getUnifiedConnectionId(req);

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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdRequest](../../models/operations/GetUnifiedConnectionIdRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdResponse](../../models/operations/GetUnifiedConnectionIdResponse.md)**


## patchUnifiedConnectionId

Update connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdResponse;
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
                .setSecurity(new Security("Executive"){{
                    jwt = "";
                }})
                .build();

            PatchUnifiedConnectionIdRequest req = new PatchUnifiedConnectionIdRequest("Cupertino"){{
                connection = new Connection(new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.MARTECH),
                }}, "Center", new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.TICKETING_NOTE_READ),
                }}){{
                    auth = new PropertyConnectionAuth(){{
                        accessToken = "Electric Latin Personal";
                        apiUrl = "Electric Bicycle payment";
                        appId = "transmitting North";
                        authorizeUrl = "mole Gasoline morph";
                        clientId = "Keyboard Antimony primary";
                        clientSecret = "yearly";
                        consumerKey = "Concrete array inside";
                        consumerSecret = "Implemented Modern";
                        emails = new String[]{{
                            add("UTF8"),
                        }};
                        expiresIn = 6521.92d;
                        expiryDate = OffsetDateTime.parse("2021-10-21T20:04:54.899Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta();
                        name = "guard Internal";
                        otherAuthInfo = new String[]{{
                            add("Bacon"),
                        }};
                        pem = "mug";
                        refreshToken = "Cotton";
                        state = "synthesizing payment dolorum";
                        token = "Electric now Southwest";
                        tokenUrl = "Games";
                    }};
                    authAwsArn = "Northwest Balanced";
                    createdAt = OffsetDateTime.parse("2021-11-27T20:38:25.719Z");
                    environment = "North Soft relationships";
                    externalXref = "extend";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2023-12-13T08:49:01.120Z");
                    workspaceId = "Creative";
                }};
            }};            

            PatchUnifiedConnectionIdResponse res = sdk.connection.patchUnifiedConnectionId(req);

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdRequest](../../models/operations/PatchUnifiedConnectionIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdResponse](../../models/operations/PatchUnifiedConnectionIdResponse.md)**


## postUnifiedConnection

Create connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionResponse;
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
                .setSecurity(new Security("RSS"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
    add(PropertyConnectionCategories.UC),
}}, "indexing", new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
    add(PropertyConnectionPermissions.HRIS_EMPLOYEE_WRITE),
}}){{
                auth = new PropertyConnectionAuth(){{
                    accessToken = "Livermorium Coordinator Sol";
                    apiUrl = "PNG Modern Intranet";
                    appId = "Integration";
                    authorizeUrl = "Configurable Architect";
                    clientId = "Audi";
                    clientSecret = "Human";
                    consumerKey = "intuitive Account membership";
                    consumerSecret = "Configuration Crooks";
                    emails = new String[]{{
                        add("Riel"),
                    }};
                    expiresIn = 8567.25d;
                    expiryDate = OffsetDateTime.parse("2023-12-23T23:29:58.525Z");
                    key = "<key>";
                    meta = new PropertyPropertyConnectionAuthMeta();
                    name = "Pula";
                    otherAuthInfo = new String[]{{
                        add("South"),
                    }};
                    pem = "Northwest";
                    refreshToken = "unbutton";
                    state = "Investor circuit";
                    token = "Designer";
                    tokenUrl = "monitor";
                }};
                authAwsArn = "port orchid";
                createdAt = OffsetDateTime.parse("2023-10-03T19:36:19.419Z");
                environment = "tan male stamp";
                externalXref = "Towels Plastic";
                id = "<ID>";
                isPaused = false;
                updatedAt = OffsetDateTime.parse("2021-09-22T05:13:05.778Z");
                workspaceId = "Auto";
            }};            

            PostUnifiedConnectionResponse res = sdk.connection.postUnifiedConnection(req);

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

**[com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionResponse](../../models/operations/PostUnifiedConnectionResponse.md)**


## putUnifiedConnectionId

Update connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdResponse;
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
                .setSecurity(new Security("Assurance"){{
                    jwt = "";
                }})
                .build();

            PutUnifiedConnectionIdRequest req = new PutUnifiedConnectionIdRequest("Avon"){{
                connection = new Connection(new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.MARTECH),
                }}, "Northern", new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.TICKETING_CUSTOMER_READ),
                }}){{
                    auth = new PropertyConnectionAuth(){{
                        accessToken = "Dinar";
                        apiUrl = "Account since Bacon";
                        appId = "white Handmade navigating";
                        authorizeUrl = "gray";
                        clientId = "Officer";
                        clientSecret = "Account Accountability Gorgeous";
                        consumerKey = "oh";
                        consumerSecret = "Virtual incidentally shrimp";
                        emails = new String[]{{
                            add("bypass"),
                        }};
                        expiresIn = 4451.19d;
                        expiryDate = OffsetDateTime.parse("2023-09-04T21:32:52.916Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta();
                        name = "recent midst Northeast";
                        otherAuthInfo = new String[]{{
                            add("ivory"),
                        }};
                        pem = "Product deleniti unfortunately";
                        refreshToken = "Wagon Response";
                        state = "withdrawal West personnel";
                        token = "fuchsia experiences eveniet";
                        tokenUrl = "Account Camren";
                    }};
                    authAwsArn = "firewall";
                    createdAt = OffsetDateTime.parse("2021-06-04T22:03:31.352Z");
                    environment = "parsing";
                    externalXref = "salmon excluding salmon";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-03-18T18:34:01.951Z");
                    workspaceId = "software functionalities";
                }};
            }};            

            PutUnifiedConnectionIdResponse res = sdk.connection.putUnifiedConnectionId(req);

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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdRequest](../../models/operations/PutUnifiedConnectionIdRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdResponse](../../models/operations/PutUnifiedConnectionIdResponse.md)**

