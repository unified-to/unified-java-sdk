# group

### Available Operations

* [deleteHrisConnectionIdGroupId](#deletehrisconnectionidgroupid) - Remove a Group
* [getHrisConnectionIdGroup](#gethrisconnectionidgroup) - List all Groups
* [getHrisConnectionIdGroupId](#gethrisconnectionidgroupid) - Retrieve a Group
* [patchHrisConnectionIdGroupId](#patchhrisconnectionidgroupid) - Update a Group
* [postHrisConnectionIdGroup](#posthrisconnectionidgroup) - Create a Group
* [putHrisConnectionIdGroupId](#puthrisconnectionidgroupid) - Update a Group

## deleteHrisConnectionIdGroupId

Remove a Group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteHrisConnectionIdGroupIdRequest req = new DeleteHrisConnectionIdGroupIdRequest("aperiam", "pariatur");            

            DeleteHrisConnectionIdGroupIdResponse res = sdk.group.deleteHrisConnectionIdGroupId(req, new DeleteHrisConnectionIdGroupIdSecurity("ad") {{
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdRequest](../../models/operations/DeleteHrisConnectionIdGroupIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdSecurity](../../models/operations/DeleteHrisConnectionIdGroupIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdResponse](../../models/operations/DeleteHrisConnectionIdGroupIdResponse.md)**


## getHrisConnectionIdGroup

List all Groups

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupResponse;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetHrisConnectionIdGroupRequest req = new GetHrisConnectionIdGroupRequest("architecto") {{
                limit = 6340.84d;
                offset = 3056.95d;
                order = "ut";
                query = "quidem";
                sort = "doloribus";
                updatedGte = OffsetDateTime.parse("2022-11-25T00:27:09.327Z");
            }};            

            GetHrisConnectionIdGroupResponse res = sdk.group.getHrisConnectionIdGroup(req, new GetHrisConnectionIdGroupSecurity("tempore") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupRequest](../../models/operations/GetHrisConnectionIdGroupRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupSecurity](../../models/operations/GetHrisConnectionIdGroupSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupResponse](../../models/operations/GetHrisConnectionIdGroupResponse.md)**


## getHrisConnectionIdGroupId

Retrieve a Group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetHrisConnectionIdGroupIdRequest req = new GetHrisConnectionIdGroupIdRequest("deserunt", "nulla");            

            GetHrisConnectionIdGroupIdResponse res = sdk.group.getHrisConnectionIdGroupId(req, new GetHrisConnectionIdGroupIdSecurity("corrupti") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdRequest](../../models/operations/GetHrisConnectionIdGroupIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdSecurity](../../models/operations/GetHrisConnectionIdGroupIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdResponse](../../models/operations/GetHrisConnectionIdGroupIdResponse.md)**


## patchHrisConnectionIdGroupId

Update a Group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdSecurity;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisGroupRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchHrisConnectionIdGroupIdRequest req = new PatchHrisConnectionIdGroupIdRequest("voluptate", "alias") {{
                hrisGroup = new HrisGroup() {{
                    createdAt = OffsetDateTime.parse("2022-02-28T06:13:48.877Z");
                    description = "incidunt";
                    employeeIds = new String[]{{
                        add("ea"),
                    }};
                    id = "082bfbdc-41ff-45d4-a2ae-4fb5cb35d176";
                    isActive = false;
                    managerIds = new String[]{{
                        add("consectetur"),
                    }};
                    name = "Van Casper";
                    parentId = "distinctio";
                    raw = new PropertyHrisGroupRaw();;
                    type = HrisGroupType.DIVISION;
                    updatedAt = OffsetDateTime.parse("2022-07-13T21:36:37.401Z");
                }};;
            }};            

            PatchHrisConnectionIdGroupIdResponse res = sdk.group.patchHrisConnectionIdGroupId(req, new PatchHrisConnectionIdGroupIdSecurity("nemo") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdRequest](../../models/operations/PatchHrisConnectionIdGroupIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdSecurity](../../models/operations/PatchHrisConnectionIdGroupIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdResponse](../../models/operations/PatchHrisConnectionIdGroupIdResponse.md)**


## postHrisConnectionIdGroup

Create a Group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupRequest;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupResponse;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupSecurity;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisGroupRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostHrisConnectionIdGroupRequest req = new PostHrisConnectionIdGroupRequest("provident") {{
                hrisGroup = new HrisGroup() {{
                    createdAt = OffsetDateTime.parse("2020-08-15T09:08:43.801Z");
                    description = "impedit";
                    employeeIds = new String[]{{
                        add("minima"),
                    }};
                    id = "cb860f8c-d580-4ba7-b810-e4fe4447297c";
                    isActive = false;
                    managerIds = new String[]{{
                        add("pariatur"),
                    }};
                    name = "Susie Bins";
                    parentId = "amet";
                    raw = new PropertyHrisGroupRaw();;
                    type = HrisGroupType.BUSINESS_UNIT;
                    updatedAt = OffsetDateTime.parse("2021-06-16T21:24:14.090Z");
                }};;
            }};            

            PostHrisConnectionIdGroupResponse res = sdk.group.postHrisConnectionIdGroup(req, new PostHrisConnectionIdGroupSecurity("repudiandae") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupRequest](../../models/operations/PostHrisConnectionIdGroupRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupSecurity](../../models/operations/PostHrisConnectionIdGroupSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupResponse](../../models/operations/PostHrisConnectionIdGroupResponse.md)**


## putHrisConnectionIdGroupId

Update a Group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdSecurity;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisGroupRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutHrisConnectionIdGroupIdRequest req = new PutHrisConnectionIdGroupIdRequest("dolores", "ut") {{
                hrisGroup = new HrisGroup() {{
                    createdAt = OffsetDateTime.parse("2022-04-23T21:52:29.427Z");
                    description = "voluptate";
                    employeeIds = new String[]{{
                        add("aliquid"),
                    }};
                    id = "84eff501-26d7-41cf-bbd0-eb74b8421953";
                    isActive = false;
                    managerIds = new String[]{{
                        add("rerum"),
                    }};
                    name = "Hazel Predovic";
                    parentId = "quisquam";
                    raw = new PropertyHrisGroupRaw();;
                    type = HrisGroupType.DEPARTMENT;
                    updatedAt = OffsetDateTime.parse("2022-11-30T06:52:52.452Z");
                }};;
            }};            

            PutHrisConnectionIdGroupIdResponse res = sdk.group.putHrisConnectionIdGroupId(req, new PutHrisConnectionIdGroupIdSecurity("veniam") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdRequest](../../models/operations/PutHrisConnectionIdGroupIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdSecurity](../../models/operations/PutHrisConnectionIdGroupIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdResponse](../../models/operations/PutHrisConnectionIdGroupIdResponse.md)**

