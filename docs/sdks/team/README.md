# Team
(*team*)

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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Louisiana"){{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdTeamIdRequest req = new DeleteCrmConnectionIdTeamIdRequest("Tuna", "Cruiser");            

            DeleteCrmConnectionIdTeamIdResponse res = sdk.team.deleteCrmConnectionIdTeamId(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdRequest](../../models/operations/DeleteCrmConnectionIdTeamIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Buckinghamshire"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdTeamRequest req = new GetCrmConnectionIdTeamRequest("bypass"){{
                limit = 1586.42d;
                offset = 8382.08d;
                order = "Northeast Shoes transform";
                query = "Bedfordshire Senior strategize";
                sort = "Ford up";
                updatedGte = OffsetDateTime.parse("2021-01-24T11:58:31.884Z");
            }};            

            GetCrmConnectionIdTeamResponse res = sdk.team.getCrmConnectionIdTeam(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamRequest](../../models/operations/GetCrmConnectionIdTeamRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Arsenic"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdTeamIdRequest req = new GetCrmConnectionIdTeamIdRequest("Garden", "CLI");            

            GetCrmConnectionIdTeamIdResponse res = sdk.team.getCrmConnectionIdTeamId(req);

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdRequest](../../models/operations/GetCrmConnectionIdTeamIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Arizona"){{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdTeamIdRequest req = new PatchCrmConnectionIdTeamIdRequest("to", "Internal"){{
                crmTeam = new CrmTeam(){{
                    createdAt = OffsetDateTime.parse("2022-01-07T23:31:14.855Z");
                    description = "Up-sized high-level portal";
                    id = "<ID>";
                    name = "Moroccan pink";
                    raw = new PropertyCrmTeamRaw();
                    updatedAt = OffsetDateTime.parse("2023-08-14T10:23:48.923Z");
                    userIds = new String[]{{
                        add("Candace"),
                    }};
                }};
            }};            

            PatchCrmConnectionIdTeamIdResponse res = sdk.team.patchCrmConnectionIdTeamId(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdRequest](../../models/operations/PatchCrmConnectionIdTeamIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("local"){{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdTeamRequest req = new PostCrmConnectionIdTeamRequest("when"){{
                crmTeam = new CrmTeam(){{
                    createdAt = OffsetDateTime.parse("2022-02-04T15:43:12.746Z");
                    description = "Horizontal contextually-based orchestration";
                    id = "<ID>";
                    name = "bandwidth Legacy holistic";
                    raw = new PropertyCrmTeamRaw();
                    updatedAt = OffsetDateTime.parse("2021-02-01T07:27:20.539Z");
                    userIds = new String[]{{
                        add("East"),
                    }};
                }};
            }};            

            PostCrmConnectionIdTeamResponse res = sdk.team.postCrmConnectionIdTeam(req);

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamRequest](../../models/operations/PostCrmConnectionIdTeamRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("immense"){{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdTeamIdRequest req = new PutCrmConnectionIdTeamIdRequest("Quality", "Orchestrator"){{
                crmTeam = new CrmTeam(){{
                    createdAt = OffsetDateTime.parse("2022-11-23T06:02:39.043Z");
                    description = "Multi-channelled methodical success";
                    id = "<ID>";
                    name = "Montebello as pixel";
                    raw = new PropertyCrmTeamRaw();
                    updatedAt = OffsetDateTime.parse("2023-12-25T12:21:33.544Z");
                    userIds = new String[]{{
                        add("Southwest"),
                    }};
                }};
            }};            

            PutCrmConnectionIdTeamIdResponse res = sdk.team.putCrmConnectionIdTeamId(req);

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdRequest](../../models/operations/PutCrmConnectionIdTeamIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdResponse](../../models/operations/PutCrmConnectionIdTeamIdResponse.md)**

