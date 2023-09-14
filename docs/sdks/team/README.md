# team

### Available Operations

* [deleteCrmConnectionIdTeamId](#deletecrmconnectionidteamid) - Remove a team
* [getCrmConnectionIdTeam](#getcrmconnectionidteam) - List all teams
* [getCrmConnectionIdTeamId](#getcrmconnectionidteamid) - Retrieve a team
* [patchCrmConnectionIdTeamId](#patchcrmconnectionidteamid) - Update a team
* [postCrmConnectionIdTeam](#postcrmconnectionidteam) - Create a team
* [putCrmConnectionIdTeamId](#putcrmconnectionidteamid) - Update a team

## deleteCrmConnectionIdTeamId

Remove a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdTeamIdRequest req = new DeleteCrmConnectionIdTeamIdRequest("inventore", "ut");            

            DeleteCrmConnectionIdTeamIdResponse res = sdk.team.deleteCrmConnectionIdTeamId(req, new DeleteCrmConnectionIdTeamIdSecurity("tempore") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdRequest](../../models/operations/DeleteCrmConnectionIdTeamIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdSecurity](../../models/operations/DeleteCrmConnectionIdTeamIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdResponse](../../models/operations/DeleteCrmConnectionIdTeamIdResponse.md)**


## getCrmConnectionIdTeam

List all teams

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdTeamRequest req = new GetCrmConnectionIdTeamRequest("molestias") {{
                limit = 6827.24d;
                offset = 1411.28d;
                order = "minus";
                query = "sunt";
                sort = "sint";
                updatedGte = OffsetDateTime.parse("2022-09-12T23:16:28.730Z");
            }};            

            GetCrmConnectionIdTeamResponse res = sdk.team.getCrmConnectionIdTeam(req, new GetCrmConnectionIdTeamSecurity("veniam") {{
                jwt = "";
            }});

            if (res.crmTeams != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamRequest](../../models/operations/GetCrmConnectionIdTeamRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamSecurity](../../models/operations/GetCrmConnectionIdTeamSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamResponse](../../models/operations/GetCrmConnectionIdTeamResponse.md)**


## getCrmConnectionIdTeamId

Retrieve a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdTeamIdRequest req = new GetCrmConnectionIdTeamIdRequest("quaerat", "minima");            

            GetCrmConnectionIdTeamIdResponse res = sdk.team.getCrmConnectionIdTeamId(req, new GetCrmConnectionIdTeamIdSecurity("officiis") {{
                jwt = "";
            }});

            if (res.crmTeam != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdRequest](../../models/operations/GetCrmConnectionIdTeamIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdSecurity](../../models/operations/GetCrmConnectionIdTeamIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdResponse](../../models/operations/GetCrmConnectionIdTeamIdResponse.md)**


## patchCrmConnectionIdTeamId

Update a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdTeamIdRequest req = new PatchCrmConnectionIdTeamIdRequest("unde", "ullam") {{
                crmTeam = new CrmTeam() {{
                    createdAt = OffsetDateTime.parse("2022-03-09T20:21:42.716Z");
                    description = "cumque";
                    id = "c185ea49-01c7-4c43-ad2d-aa784aba3d23";
                    name = "Silvia Stoltenberg";
                    raw = new PropertyCrmTeamRaw();;
                    updatedAt = OffsetDateTime.parse("2022-06-26T09:34:15.976Z");
                    userIds = new String[]{{
                        add("beatae"),
                    }};
                }};;
            }};            

            PatchCrmConnectionIdTeamIdResponse res = sdk.team.patchCrmConnectionIdTeamId(req, new PatchCrmConnectionIdTeamIdSecurity("vitae") {{
                jwt = "";
            }});

            if (res.crmTeam != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdRequest](../../models/operations/PatchCrmConnectionIdTeamIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdSecurity](../../models/operations/PatchCrmConnectionIdTeamIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdResponse](../../models/operations/PatchCrmConnectionIdTeamIdResponse.md)**


## postCrmConnectionIdTeam

Create a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamResponse;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdTeamRequest req = new PostCrmConnectionIdTeamRequest("laborum") {{
                crmTeam = new CrmTeam() {{
                    createdAt = OffsetDateTime.parse("2022-11-20T18:43:12.895Z");
                    description = "veniam";
                    id = "382bd7ed-5650-4762-9c58-f4d7396564c2";
                    name = "Lee Batz Jr.";
                    raw = new PropertyCrmTeamRaw();;
                    updatedAt = OffsetDateTime.parse("2021-10-14T00:11:30.228Z");
                    userIds = new String[]{{
                        add("commodi"),
                    }};
                }};;
            }};            

            PostCrmConnectionIdTeamResponse res = sdk.team.postCrmConnectionIdTeam(req, new PostCrmConnectionIdTeamSecurity("dicta") {{
                jwt = "";
            }});

            if (res.crmTeam != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamRequest](../../models/operations/PostCrmConnectionIdTeamRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamSecurity](../../models/operations/PostCrmConnectionIdTeamSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamResponse](../../models/operations/PostCrmConnectionIdTeamResponse.md)**


## putCrmConnectionIdTeamId

Update a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdTeamIdRequest req = new PutCrmConnectionIdTeamIdRequest("illum", "aspernatur") {{
                crmTeam = new CrmTeam() {{
                    createdAt = OffsetDateTime.parse("2022-05-09T21:33:40.745Z");
                    description = "dignissimos";
                    id = "dbb8f532-d892-4cf7-812c-b512c878240b";
                    name = "Lewis Goodwin";
                    raw = new PropertyCrmTeamRaw();;
                    updatedAt = OffsetDateTime.parse("2021-12-30T15:49:38.515Z");
                    userIds = new String[]{{
                        add("hic"),
                    }};
                }};;
            }};            

            PutCrmConnectionIdTeamIdResponse res = sdk.team.putCrmConnectionIdTeamId(req, new PutCrmConnectionIdTeamIdSecurity("blanditiis") {{
                jwt = "";
            }});

            if (res.crmTeam != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdRequest](../../models/operations/PutCrmConnectionIdTeamIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdSecurity](../../models/operations/PutCrmConnectionIdTeamIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdResponse](../../models/operations/PutCrmConnectionIdTeamIdResponse.md)**

