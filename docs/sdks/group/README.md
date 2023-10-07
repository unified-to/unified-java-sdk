# Group
(*group*)

### Available Operations

* [deleteHrisConnectionIdGroupId](#deletehrisconnectionidgroupid) - Remove a group
* [getHrisConnectionIdGroup](#gethrisconnectionidgroup) - List all groups
* [getHrisConnectionIdGroupId](#gethrisconnectionidgroupid) - Retrieve a group
* [patchHrisConnectionIdGroupId](#patchhrisconnectionidgroupid) - Update a group
* [postHrisConnectionIdGroup](#posthrisconnectionidgroup) - Create a group
* [putHrisConnectionIdGroupId](#puthrisconnectionidgroupid) - Update a group

## deleteHrisConnectionIdGroupId

Remove a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Human"){{
                    jwt = "";
                }})
                .build();

            DeleteHrisConnectionIdGroupIdRequest req = new DeleteHrisConnectionIdGroupIdRequest("Metal", "Country");            

            DeleteHrisConnectionIdGroupIdResponse res = sdk.group.deleteHrisConnectionIdGroupId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdRequest](../../models/operations/DeleteHrisConnectionIdGroupIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdResponse](../../models/operations/DeleteHrisConnectionIdGroupIdResponse.md)**


## getHrisConnectionIdGroup

List all groups

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Shirt"){{
                    jwt = "";
                }})
                .build();

            GetHrisConnectionIdGroupRequest req = new GetHrisConnectionIdGroupRequest("Jaguar"){{
                limit = 3486.96d;
                offset = 9705.73d;
                order = "Coordinator";
                query = "World";
                sort = "Dollar";
                updatedGte = OffsetDateTime.parse("2021-01-15T16:06:13.340Z");
            }};            

            GetHrisConnectionIdGroupResponse res = sdk.group.getHrisConnectionIdGroup(req);

            if (res.hrisGroups != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupRequest](../../models/operations/GetHrisConnectionIdGroupRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupResponse](../../models/operations/GetHrisConnectionIdGroupResponse.md)**


## getHrisConnectionIdGroupId

Retrieve a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Chips"){{
                    jwt = "";
                }})
                .build();

            GetHrisConnectionIdGroupIdRequest req = new GetHrisConnectionIdGroupIdRequest("eyeglasses", "nationalize");            

            GetHrisConnectionIdGroupIdResponse res = sdk.group.getHrisConnectionIdGroupId(req);

            if (res.hrisGroup != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdRequest](../../models/operations/GetHrisConnectionIdGroupIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdResponse](../../models/operations/GetHrisConnectionIdGroupIdResponse.md)**


## patchHrisConnectionIdGroupId

Update a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdResponse;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisGroupRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("gosh"){{
                    jwt = "";
                }})
                .build();

            PatchHrisConnectionIdGroupIdRequest req = new PatchHrisConnectionIdGroupIdRequest("Northwest", "shootdown"){{
                hrisGroup = new HrisGroup(){{
                    createdAt = OffsetDateTime.parse("2022-02-05T05:07:10.835Z");
                    description = "Advanced fresh-thinking methodology";
                    employeeIds = new String[]{{
                        add("West"),
                    }};
                    id = "<ID>";
                    isActive = false;
                    managerIds = new String[]{{
                        add("ouch"),
                    }};
                    name = "Shoes Kids Sedan";
                    parentId = "Bike Intersex";
                    raw = new PropertyHrisGroupRaw();
                    type = HrisGroupType.BUSINESS_UNIT;
                    updatedAt = OffsetDateTime.parse("2023-01-04T08:35:32.220Z");
                }};
            }};            

            PatchHrisConnectionIdGroupIdResponse res = sdk.group.patchHrisConnectionIdGroupId(req);

            if (res.hrisGroup != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdRequest](../../models/operations/PatchHrisConnectionIdGroupIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdResponse](../../models/operations/PatchHrisConnectionIdGroupIdResponse.md)**


## postHrisConnectionIdGroup

Create a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupRequest;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupResponse;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisGroupRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bhutan"){{
                    jwt = "";
                }})
                .build();

            PostHrisConnectionIdGroupRequest req = new PostHrisConnectionIdGroupRequest("Polestar"){{
                hrisGroup = new HrisGroup(){{
                    createdAt = OffsetDateTime.parse("2022-04-05T02:35:18.855Z");
                    description = "Synchronised discrete info-mediaries";
                    employeeIds = new String[]{{
                        add("XSS"),
                    }};
                    id = "<ID>";
                    isActive = false;
                    managerIds = new String[]{{
                        add("whereas"),
                    }};
                    name = "collaborative Cab Nissan";
                    parentId = "scorn Gorgeous";
                    raw = new PropertyHrisGroupRaw();
                    type = HrisGroupType.TEAM;
                    updatedAt = OffsetDateTime.parse("2022-05-06T13:36:36.113Z");
                }};
            }};            

            PostHrisConnectionIdGroupResponse res = sdk.group.postHrisConnectionIdGroup(req);

            if (res.hrisGroup != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupRequest](../../models/operations/PostHrisConnectionIdGroupRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupResponse](../../models/operations/PostHrisConnectionIdGroupResponse.md)**


## putHrisConnectionIdGroupId

Update a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdResponse;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisGroupRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("panel"){{
                    jwt = "";
                }})
                .build();

            PutHrisConnectionIdGroupIdRequest req = new PutHrisConnectionIdGroupIdRequest("And", "Orchestrator"){{
                hrisGroup = new HrisGroup(){{
                    createdAt = OffsetDateTime.parse("2023-06-29T06:24:40.797Z");
                    description = "Networked upward-trending flexibility";
                    employeeIds = new String[]{{
                        add("Northwest"),
                    }};
                    id = "<ID>";
                    isActive = false;
                    managerIds = new String[]{{
                        add("programming"),
                    }};
                    name = "Licensed Response";
                    parentId = "vortals interface Gasoline";
                    raw = new PropertyHrisGroupRaw();
                    type = HrisGroupType.BRANCH;
                    updatedAt = OffsetDateTime.parse("2021-05-16T01:59:50.660Z");
                }};
            }};            

            PutHrisConnectionIdGroupIdResponse res = sdk.group.putHrisConnectionIdGroupId(req);

            if (res.hrisGroup != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdRequest](../../models/operations/PutHrisConnectionIdGroupIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdResponse](../../models/operations/PutHrisConnectionIdGroupIdResponse.md)**

