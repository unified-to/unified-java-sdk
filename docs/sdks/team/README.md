# Team
(*team*)

### Available Operations

* [createCrmTeam](#createcrmteam) - Create a team
* [getCrmTeam](#getcrmteam) - Retrieve a team
* [listCrmTeams](#listcrmteams) - List all teams
* [patchCrmTeam](#patchcrmteam) - Update a team
* [removeCrmTeam](#removecrmteam) - Remove a team
* [updateCrmTeam](#updatecrmteam) - Update a team

## createCrmTeam

Create a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("exercitationem"){{
                    jwt = "";
                }})
                .build();

            CreateCrmTeamRequest req = new CreateCrmTeamRequest("who"){{
                crmTeam = new CrmTeam(){{
                    createdAt = OffsetDateTime.parse("2021-03-06T10:56:47.076Z");
                    description = "Mandatory mission-critical ability";
                    id = "<ID>";
                    name = "Senior";
                    raw = new PropertyCrmTeamRaw();
                    updatedAt = OffsetDateTime.parse("2021-03-23T12:47:05.444Z");
                    userIds = new String[]{{
                        add("volt"),
                    }};
                }};
            }};            

            CreateCrmTeamResponse res = sdk.team.createCrmTeam(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmTeamRequest](../../models/operations/CreateCrmTeamRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmTeamResponse](../../models/operations/CreateCrmTeamResponse.md)**


## getCrmTeam

Retrieve a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("online"){{
                    jwt = "";
                }})
                .build();

            GetCrmTeamRequest req = new GetCrmTeamRequest("Outdoors", "Armenia"){{
                fields = new String[]{{
                    add("female"),
                }};
            }};            

            GetCrmTeamResponse res = sdk.team.getCrmTeam(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmTeamRequest](../../models/operations/GetCrmTeamRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmTeamResponse](../../models/operations/GetCrmTeamResponse.md)**


## listCrmTeams

List all teams

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmTeamsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmTeamsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Celsius"){{
                    jwt = "";
                }})
                .build();

            ListCrmTeamsRequest req = new ListCrmTeamsRequest("microchip"){{
                fields = new String[]{{
                    add("Wooden"),
                }};
                limit = 7301.3d;
                offset = 5943.38d;
                order = "Generic";
                query = "Maryland";
                sort = "Oriental";
                updatedGte = OffsetDateTime.parse("2021-12-11T20:47:57.669Z");
            }};            

            ListCrmTeamsResponse res = sdk.team.listCrmTeams(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmTeamsRequest](../../models/operations/ListCrmTeamsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmTeamsResponse](../../models/operations/ListCrmTeamsResponse.md)**


## patchCrmTeam

Update a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Account"){{
                    jwt = "";
                }})
                .build();

            PatchCrmTeamRequest req = new PatchCrmTeamRequest("Customer", "redefine"){{
                crmTeam = new CrmTeam(){{
                    createdAt = OffsetDateTime.parse("2021-07-12T19:43:20.661Z");
                    description = "Streamlined contextually-based encryption";
                    id = "<ID>";
                    name = "Rubber";
                    raw = new PropertyCrmTeamRaw();
                    updatedAt = OffsetDateTime.parse("2023-01-31T23:05:32.836Z");
                    userIds = new String[]{{
                        add("flexibility"),
                    }};
                }};
            }};            

            PatchCrmTeamResponse res = sdk.team.patchCrmTeam(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmTeamRequest](../../models/operations/PatchCrmTeamRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmTeamResponse](../../models/operations/PatchCrmTeamResponse.md)**


## removeCrmTeam

Remove a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Cotton"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmTeamRequest req = new RemoveCrmTeamRequest("Communications", "Recumbent");            

            RemoveCrmTeamResponse res = sdk.team.removeCrmTeam(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmTeamRequest](../../models/operations/RemoveCrmTeamRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmTeamResponse](../../models/operations/RemoveCrmTeamResponse.md)**


## updateCrmTeam

Update a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Carbon"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmTeamRequest req = new UpdateCrmTeamRequest("East", "Customer"){{
                crmTeam = new CrmTeam(){{
                    createdAt = OffsetDateTime.parse("2023-02-08T11:34:45.438Z");
                    description = "Fundamental actuating protocol";
                    id = "<ID>";
                    name = "Sleek";
                    raw = new PropertyCrmTeamRaw();
                    updatedAt = OffsetDateTime.parse("2022-12-05T16:56:47.878Z");
                    userIds = new String[]{{
                        add("West"),
                    }};
                }};
            }};            

            UpdateCrmTeamResponse res = sdk.team.updateCrmTeam(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmTeamRequest](../../models/operations/UpdateCrmTeamRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmTeamResponse](../../models/operations/UpdateCrmTeamResponse.md)**

