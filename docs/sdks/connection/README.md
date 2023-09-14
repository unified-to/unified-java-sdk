# connection

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
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteUnifiedConnectionIdRequest req = new DeleteUnifiedConnectionIdRequest("excepturi");            

            DeleteUnifiedConnectionIdResponse res = sdk.connection.deleteUnifiedConnectionId(req, new DeleteUnifiedConnectionIdSecurity("occaecati") {{
                jwt = "";
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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdRequest](../../models/operations/DeleteUnifiedConnectionIdRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdSecurity](../../models/operations/DeleteUnifiedConnectionIdSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest() {{
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionCategories[]{{
                    add(GetUnifiedConnectionCategories.AUTH),
                }};
                env = "aliquam";
                externalXref = "nostrum";
                limit = 9887.49d;
                offset = 7573.64d;
                order = "sint";
                sort = "enim";
                updatedGte = OffsetDateTime.parse("2021-01-11T05:39:31.724Z");
            }};            

            GetUnifiedConnectionResponse res = sdk.connection.getUnifiedConnection(req, new GetUnifiedConnectionSecurity("quas") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest](../../models/operations/GetUnifiedConnectionRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionSecurity](../../models/operations/GetUnifiedConnectionSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedConnectionIdRequest req = new GetUnifiedConnectionIdRequest("totam");            

            GetUnifiedConnectionIdResponse res = sdk.connection.getUnifiedConnectionId(req, new GetUnifiedConnectionIdSecurity("molestias") {{
                jwt = "";
            }});

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdRequest](../../models/operations/GetUnifiedConnectionIdRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdSecurity](../../models/operations/GetUnifiedConnectionIdSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdSecurity;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchUnifiedConnectionIdRequest req = new PatchUnifiedConnectionIdRequest("odio") {{
                connection = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                    add(PropertyConnectionCategories.PASSTHROUGH),
                                }}, "saepe",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                    add(PropertyConnectionPermissions.AUTH_LOGIN),
                                }}) {{
                    auth = new PropertyConnectionAuth() {{
                        accessToken = "quos";
                        apiUrl = "iste";
                        appId = "assumenda";
                        authorizeUrl = "tempore";
                        clientId = "libero";
                        clientSecret = "velit";
                        consumerKey = "doloremque";
                        consumerSecret = "delectus";
                        emails = new String[]{{
                            add("impedit"),
                        }};
                        expiresIn = 7412.38d;
                        expiryDate = OffsetDateTime.parse("2022-10-06T03:01:15.693Z");
                        key = "saepe";
                        meta = new PropertyPropertyConnectionAuthMeta();;
                        name = "Anthony Hayes";
                        otherAuthInfo = new String[]{{
                            add("architecto"),
                        }};
                        pem = "cupiditate";
                        refreshToken = "molestiae";
                        state = "eligendi";
                        token = "possimus";
                        tokenUrl = "non";
                    }};;
                    authAwsArn = "magnam";
                    createdAt = OffsetDateTime.parse("2022-07-19T17:25:50.426Z");
                    environment = "asperiores";
                    externalXref = "veniam";
                    id = "2d82d351-3bb6-4f48-b656-bcdb35ff2e4b";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-07-24T02:47:29.895Z");
                    workspaceId = "nostrum";
                }};;
            }};            

            PatchUnifiedConnectionIdResponse res = sdk.connection.patchUnifiedConnectionId(req, new PatchUnifiedConnectionIdSecurity("neque") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdRequest](../../models/operations/PatchUnifiedConnectionIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdSecurity](../../models/operations/PatchUnifiedConnectionIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdResponse](../../models/operations/PatchUnifiedConnectionIdResponse.md)**


## postUnifiedConnection

Create connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionSecurity;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                add(PropertyConnectionCategories.CRM),
                            }}, "est",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                add(PropertyConnectionPermissions.MARTECH_LIST_WRITE),
                            }}) {{
                auth = new PropertyConnectionAuth() {{
                    accessToken = "eligendi";
                    apiUrl = "fugiat";
                    appId = "unde";
                    authorizeUrl = "officiis";
                    clientId = "ducimus";
                    clientSecret = "dolor";
                    consumerKey = "dicta";
                    consumerSecret = "error";
                    emails = new String[]{{
                        add("porro"),
                    }};
                    expiresIn = 1114.96d;
                    expiryDate = OffsetDateTime.parse("2022-07-17T11:25:26.149Z");
                    key = "fugiat";
                    meta = new PropertyPropertyConnectionAuthMeta();;
                    name = "Nicole Halvorson";
                    otherAuthInfo = new String[]{{
                        add("dignissimos"),
                    }};
                    pem = "libero";
                    refreshToken = "illo";
                    state = "ab";
                    token = "incidunt";
                    tokenUrl = "accusamus";
                }};;
                authAwsArn = "saepe";
                createdAt = OffsetDateTime.parse("2022-05-02T04:00:18.906Z");
                environment = "eos";
                externalXref = "reiciendis";
                id = "f785fc37-814d-44c9-8e0c-2bb89eb75dad";
                isPaused = false;
                updatedAt = OffsetDateTime.parse("2022-10-14T22:48:07.675Z");
                workspaceId = "commodi";
            }};            

            PostUnifiedConnectionResponse res = sdk.connection.postUnifiedConnection(req, new PostUnifiedConnectionSecurity("impedit") {{
                jwt = "";
            }});

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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.shared.Connection](../../models/shared/Connection.md)                                               | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionSecurity](../../models/operations/PostUnifiedConnectionSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdSecurity;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutUnifiedConnectionIdRequest req = new PutUnifiedConnectionIdRequest("commodi") {{
                connection = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                    add(PropertyConnectionCategories.PASSTHROUGH),
                                }}, "voluptatem",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                    add(PropertyConnectionPermissions.CRM_USER_WRITE),
                                }}) {{
                    auth = new PropertyConnectionAuth() {{
                        accessToken = "quae";
                        apiUrl = "amet";
                        appId = "illum";
                        authorizeUrl = "praesentium";
                        clientId = "quidem";
                        clientSecret = "cum";
                        consumerKey = "amet";
                        consumerSecret = "quasi";
                        emails = new String[]{{
                            add("dicta"),
                        }};
                        expiresIn = 5149.22d;
                        expiryDate = OffsetDateTime.parse("2022-01-23T11:30:38.329Z");
                        key = "iusto";
                        meta = new PropertyPropertyConnectionAuthMeta();;
                        name = "Shelly Pagac";
                        otherAuthInfo = new String[]{{
                            add("repudiandae"),
                        }};
                        pem = "consequatur";
                        refreshToken = "nemo";
                        state = "molestiae";
                        token = "itaque";
                        tokenUrl = "facilis";
                    }};;
                    authAwsArn = "corrupti";
                    createdAt = OffsetDateTime.parse("2022-06-05T10:57:17.595Z");
                    environment = "accusamus";
                    externalXref = "eos";
                    id = "810331f3-981d-44c7-80b6-07f3c93c73b9";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2021-01-30T14:43:38.066Z");
                    workspaceId = "amet";
                }};;
            }};            

            PutUnifiedConnectionIdResponse res = sdk.connection.putUnifiedConnectionId(req, new PutUnifiedConnectionIdSecurity("tenetur") {{
                jwt = "";
            }});

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdRequest](../../models/operations/PutUnifiedConnectionIdRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdSecurity](../../models/operations/PutUnifiedConnectionIdSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdResponse](../../models/operations/PutUnifiedConnectionIdResponse.md)**

