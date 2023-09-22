# Connection

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
                .setSecurity(new Security("saepe") {{
                    jwt = "";
                }})
                .build();

            DeleteUnifiedConnectionIdRequest req = new DeleteUnifiedConnectionIdRequest("architecto");            

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
                .setSecurity(new Security("quos") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest() {{
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionCategories[]{{
                    add(GetUnifiedConnectionCategories.ENRICH),
                }};
                env = "assumenda";
                externalXref = "tempore";
                limit = 7255.74d;
                offset = 2440.32d;
                order = "doloremque";
                sort = "delectus";
                updatedGte = OffsetDateTime.parse("2020-10-11T08:15:47.736Z");
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
                .setSecurity(new Security("ipsum") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedConnectionIdRequest req = new GetUnifiedConnectionIdRequest("adipisci");            

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
                .setSecurity(new Security("saepe") {{
                    jwt = "";
                }})
                .build();

            PatchUnifiedConnectionIdRequest req = new PatchUnifiedConnectionIdRequest("deserunt") {{
                connection = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                    add(PropertyConnectionCategories.PASSTHROUGH),
                                }}, "quis",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                    add(PropertyConnectionPermissions.CRM_LEAD_READ),
                                }}) {{
                    auth = new PropertyConnectionAuth() {{
                        accessToken = "libero";
                        apiUrl = "architecto";
                        appId = "cupiditate";
                        authorizeUrl = "molestiae";
                        clientId = "eligendi";
                        clientSecret = "possimus";
                        consumerKey = "non";
                        consumerSecret = "magnam";
                        emails = new String[]{{
                            add("itaque"),
                        }};
                        expiresIn = 1509.35d;
                        expiryDate = OffsetDateTime.parse("2022-01-04T08:34:55.183Z");
                        key = "consequuntur";
                        meta = new PropertyPropertyConnectionAuthMeta();;
                        name = "Dwight Connelly";
                        otherAuthInfo = new String[]{{
                            add("exercitationem"),
                        }};
                        pem = "ab";
                        refreshToken = "velit";
                        state = "facilis";
                        token = "tempore";
                        tokenUrl = "nisi";
                    }};;
                    authAwsArn = "voluptatibus";
                    createdAt = OffsetDateTime.parse("2022-07-01T03:10:08.438Z");
                    environment = "distinctio";
                    externalXref = "nisi";
                    id = "56bcdb35-ff2e-44b2-b537-a8cd9e7319c1";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-07-17T11:25:26.149Z");
                    workspaceId = "fugiat";
                }};;
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
                .setSecurity(new Security("ad") {{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                add(PropertyConnectionCategories.HRIS),
                            }}, "enim",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                add(PropertyConnectionPermissions.ATS_JOB_WRITE),
                            }}) {{
                auth = new PropertyConnectionAuth() {{
                    accessToken = "iusto";
                    apiUrl = "dignissimos";
                    appId = "libero";
                    authorizeUrl = "illo";
                    clientId = "ab";
                    clientSecret = "incidunt";
                    consumerKey = "accusamus";
                    consumerSecret = "saepe";
                    emails = new String[]{{
                        add("tempore"),
                    }};
                    expiresIn = 3340.18d;
                    expiryDate = OffsetDateTime.parse("2022-01-11T22:06:57.023Z");
                    key = "earum";
                    meta = new PropertyPropertyConnectionAuthMeta();;
                    name = "Maxine Hilll";
                    otherAuthInfo = new String[]{{
                        add("sequi"),
                    }};
                    pem = "nihil";
                    refreshToken = "deleniti";
                    state = "illo";
                    token = "labore";
                    tokenUrl = "assumenda";
                }};;
                authAwsArn = "aliquam";
                createdAt = OffsetDateTime.parse("2021-03-24T18:48:06.074Z");
                environment = "laudantium";
                externalXref = "repudiandae";
                id = "0c2bb89e-b75d-4ad6-b6c6-00503d8bb311";
                isPaused = false;
                updatedAt = OffsetDateTime.parse("2022-12-02T06:45:21.747Z");
                workspaceId = "earum";
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
                .setSecurity(new Security("iusto") {{
                    jwt = "";
                }})
                .build();

            PutUnifiedConnectionIdRequest req = new PutUnifiedConnectionIdRequest("amet") {{
                connection = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                    add(PropertyConnectionCategories.ENRICH),
                                }}, "dolorum",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                    add(PropertyConnectionPermissions.ATS_INTERVIEW_READ),
                                }}) {{
                    auth = new PropertyConnectionAuth() {{
                        accessToken = "provident";
                        apiUrl = "repudiandae";
                        appId = "consequatur";
                        authorizeUrl = "nemo";
                        clientId = "molestiae";
                        clientSecret = "itaque";
                        consumerKey = "facilis";
                        consumerSecret = "corrupti";
                        emails = new String[]{{
                            add("aperiam"),
                        }};
                        expiresIn = 5740.92d;
                        expiryDate = OffsetDateTime.parse("2022-06-19T09:27:18.675Z");
                        key = "totam";
                        meta = new PropertyPropertyConnectionAuthMeta();;
                        name = "Sandra Frami DVM";
                        otherAuthInfo = new String[]{{
                            add("dolor"),
                        }};
                        pem = "occaecati";
                        refreshToken = "atque";
                        state = "beatae";
                        token = "at";
                        tokenUrl = "labore";
                    }};;
                    authAwsArn = "minus";
                    createdAt = OffsetDateTime.parse("2022-12-20T04:33:32.836Z");
                    environment = "perferendis";
                    externalXref = "rerum";
                    id = "607f3c93-c73b-49da-bf2c-eda7e23f2257";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-12-07T03:30:14.990Z");
                    workspaceId = "illo";
                }};;
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

