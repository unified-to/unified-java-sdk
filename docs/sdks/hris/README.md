# Hris
(*hris*)

### Available Operations

* [deleteHrisConnectionIdEmployeeId](#deletehrisconnectionidemployeeid) - Remove an employee
* [deleteHrisConnectionIdGroupId](#deletehrisconnectionidgroupid) - Remove a group
* [getHrisConnectionIdEmployee](#gethrisconnectionidemployee) - List all employees
* [getHrisConnectionIdEmployeeId](#gethrisconnectionidemployeeid) - Retrieve an employee
* [getHrisConnectionIdGroup](#gethrisconnectionidgroup) - List all groups
* [getHrisConnectionIdGroupId](#gethrisconnectionidgroupid) - Retrieve a group
* [patchHrisConnectionIdEmployeeId](#patchhrisconnectionidemployeeid) - Update an employee
* [patchHrisConnectionIdGroupId](#patchhrisconnectionidgroupid) - Update a group
* [postHrisConnectionIdEmployee](#posthrisconnectionidemployee) - Create an employee
* [postHrisConnectionIdGroup](#posthrisconnectionidgroup) - Create a group
* [putHrisConnectionIdEmployeeId](#puthrisconnectionidemployeeid) - Update an employee
* [putHrisConnectionIdGroupId](#puthrisconnectionidgroupid) - Update a group

## deleteHrisConnectionIdEmployeeId

Remove an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Cargo") {{
                    jwt = "";
                }})
                .build();

            DeleteHrisConnectionIdEmployeeIdRequest req = new DeleteHrisConnectionIdEmployeeIdRequest("turquoise", "port");            

            DeleteHrisConnectionIdEmployeeIdResponse res = sdk.hris.deleteHrisConnectionIdEmployeeId(req);

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdRequest](../../models/operations/DeleteHrisConnectionIdEmployeeIdRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdResponse](../../models/operations/DeleteHrisConnectionIdEmployeeIdResponse.md)**


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
                .setSecurity(new Security("Human") {{
                    jwt = "";
                }})
                .build();

            DeleteHrisConnectionIdGroupIdRequest req = new DeleteHrisConnectionIdGroupIdRequest("Metal", "Country");            

            DeleteHrisConnectionIdGroupIdResponse res = sdk.hris.deleteHrisConnectionIdGroupId(req);

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


## getHrisConnectionIdEmployee

List all employees

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("glittering") {{
                    jwt = "";
                }})
                .build();

            GetHrisConnectionIdEmployeeRequest req = new GetHrisConnectionIdEmployeeRequest("cyan") {{
                limit = 3071.3d;
                offset = 3821.57d;
                order = "olive reinvent Aston";
                query = "logistical methodology blue";
                sort = "BMW";
                updatedGte = OffsetDateTime.parse("2023-08-16T09:49:18.256Z");
            }};            

            GetHrisConnectionIdEmployeeResponse res = sdk.hris.getHrisConnectionIdEmployee(req);

            if (res.hrisEmployees != null) {
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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeRequest](../../models/operations/GetHrisConnectionIdEmployeeRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeResponse](../../models/operations/GetHrisConnectionIdEmployeeResponse.md)**


## getHrisConnectionIdEmployeeId

Retrieve an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("for") {{
                    jwt = "";
                }})
                .build();

            GetHrisConnectionIdEmployeeIdRequest req = new GetHrisConnectionIdEmployeeIdRequest("Flat", "relationships");            

            GetHrisConnectionIdEmployeeIdResponse res = sdk.hris.getHrisConnectionIdEmployeeId(req);

            if (res.hrisEmployee != null) {
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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdRequest](../../models/operations/GetHrisConnectionIdEmployeeIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdResponse](../../models/operations/GetHrisConnectionIdEmployeeIdResponse.md)**


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
                .setSecurity(new Security("Shirt") {{
                    jwt = "";
                }})
                .build();

            GetHrisConnectionIdGroupRequest req = new GetHrisConnectionIdGroupRequest("Jaguar") {{
                limit = 3486.96d;
                offset = 9705.73d;
                order = "Coordinator";
                query = "World";
                sort = "Dollar";
                updatedGte = OffsetDateTime.parse("2021-01-15T16:06:13.340Z");
            }};            

            GetHrisConnectionIdGroupResponse res = sdk.hris.getHrisConnectionIdGroup(req);

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
                .setSecurity(new Security("Chips") {{
                    jwt = "";
                }})
                .build();

            GetHrisConnectionIdGroupIdRequest req = new GetHrisConnectionIdGroupIdRequest("eyeglasses", "nationalize");            

            GetHrisConnectionIdGroupIdResponse res = sdk.hris.getHrisConnectionIdGroupId(req);

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


## patchHrisConnectionIdEmployeeId

Update an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdResponse;
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentStatus;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeMaritalStatus;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("male") {{
                    jwt = "";
                }})
                .build();

            PatchHrisConnectionIdEmployeeIdRequest req = new PatchHrisConnectionIdEmployeeIdRequest("virtual", "focus") {{
                hrisEmployee = new HrisEmployee() {{
                    address = new PropertyHrisEmployeeAddress() {{
                        address1 = "female Upgradable";
                        address2 = "Cambridgeshire";
                        city = "Fort Everett";
                        country = "Nepal";
                        countryCode = "GI";
                        postalCode = "11502";
                        region = "Denar";
                        regionCode = "Oregon Engineer";
                    }};;
                    createdAt = OffsetDateTime.parse("2023-10-29T05:35:50.072Z");
                    dateOfBirth = OffsetDateTime.parse("2023-08-06T11:11:44.158Z");
                    department = "web Robust onto";
                    division = "loudly";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("male") {{
                            email = "Korbin.Quigley63@yahoo.com";
                            type = HrisEmailType.HOME;
                        }}),
                    }};
                    employeeNumber = "Manat salmon Gasoline";
                    employmentStatus = HrisEmployeeEmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.VOLUNTEER;
                    gender = HrisEmployeeGender.MALE;
                    hiredAt = OffsetDateTime.parse("2022-04-08T21:47:44.135Z");
                    id = "<ID>";
                    location = "USB vice";
                    managerId = "minus Steel";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "Country Cambridgeshire";
                    raw = new PropertyHrisEmployeeRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("Music") {{
                            telephone = "technologies female array";
                            type = HrisTelephoneType.OTHER;
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2023-03-21T11:19:18.360Z");
                    title = "Sedan oof deposit";
                    updatedAt = OffsetDateTime.parse("2023-12-13T08:59:37.168Z");
                }};;
            }};            

            PatchHrisConnectionIdEmployeeIdResponse res = sdk.hris.patchHrisConnectionIdEmployeeId(req);

            if (res.hrisEmployee != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdRequest](../../models/operations/PatchHrisConnectionIdEmployeeIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdResponse](../../models/operations/PatchHrisConnectionIdEmployeeIdResponse.md)**


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
                .setSecurity(new Security("gosh") {{
                    jwt = "";
                }})
                .build();

            PatchHrisConnectionIdGroupIdRequest req = new PatchHrisConnectionIdGroupIdRequest("Northwest", "shootdown") {{
                hrisGroup = new HrisGroup() {{
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
                    raw = new PropertyHrisGroupRaw();;
                    type = HrisGroupType.BUSINESS_UNIT;
                    updatedAt = OffsetDateTime.parse("2023-01-04T08:35:32.220Z");
                }};;
            }};            

            PatchHrisConnectionIdGroupIdResponse res = sdk.hris.patchHrisConnectionIdGroupId(req);

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


## postHrisConnectionIdEmployee

Create an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeResponse;
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentStatus;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeMaritalStatus;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Diesel") {{
                    jwt = "";
                }})
                .build();

            PostHrisConnectionIdEmployeeRequest req = new PostHrisConnectionIdEmployeeRequest("Erbium") {{
                hrisEmployee = new HrisEmployee() {{
                    address = new PropertyHrisEmployeeAddress() {{
                        address1 = "withdrawal male";
                        address2 = "yellow righteously";
                        city = "Port Lula";
                        country = "Saudi Arabia";
                        countryCode = "SL";
                        postalCode = "34772";
                        region = "Kyat";
                        regionCode = "silver Licensed";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-09-25T20:39:21.870Z");
                    dateOfBirth = OffsetDateTime.parse("2022-04-06T20:53:56.362Z");
                    department = "payment mull";
                    division = "Blues red";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("24/7") {{
                            email = "Jacquelyn8@hotmail.com";
                            type = HrisEmailType.WORK;
                        }}),
                    }};
                    employeeNumber = "Southeast";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.VOLUNTEER;
                    gender = HrisEmployeeGender.INTERSEX;
                    hiredAt = OffsetDateTime.parse("2021-03-26T14:20:42.258Z");
                    id = "<ID>";
                    location = "East";
                    managerId = "Maserati";
                    maritalStatus = HrisEmployeeMaritalStatus.SINGLE;
                    name = "Xenogender copy";
                    raw = new PropertyHrisEmployeeRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("quantify") {{
                            telephone = "hmph";
                            type = HrisTelephoneType.WORK;
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2022-12-17T04:52:58.406Z");
                    title = "synthesize auxiliary";
                    updatedAt = OffsetDateTime.parse("2023-11-29T05:45:10.446Z");
                }};;
            }};            

            PostHrisConnectionIdEmployeeResponse res = sdk.hris.postHrisConnectionIdEmployee(req);

            if (res.hrisEmployee != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeRequest](../../models/operations/PostHrisConnectionIdEmployeeRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeResponse](../../models/operations/PostHrisConnectionIdEmployeeResponse.md)**


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
                .setSecurity(new Security("Bhutan") {{
                    jwt = "";
                }})
                .build();

            PostHrisConnectionIdGroupRequest req = new PostHrisConnectionIdGroupRequest("Polestar") {{
                hrisGroup = new HrisGroup() {{
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
                    raw = new PropertyHrisGroupRaw();;
                    type = HrisGroupType.TEAM;
                    updatedAt = OffsetDateTime.parse("2022-05-06T13:36:36.113Z");
                }};;
            }};            

            PostHrisConnectionIdGroupResponse res = sdk.hris.postHrisConnectionIdGroup(req);

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


## putHrisConnectionIdEmployeeId

Update an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdResponse;
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentStatus;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeMaritalStatus;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Northeast") {{
                    jwt = "";
                }})
                .build();

            PutHrisConnectionIdEmployeeIdRequest req = new PutHrisConnectionIdEmployeeIdRequest("Fresh", "singular") {{
                hrisEmployee = new HrisEmployee() {{
                    address = new PropertyHrisEmployeeAddress() {{
                        address1 = "East deposit Internal";
                        address2 = "Somoni";
                        city = "East Anikaville";
                        country = "Isle of Man";
                        countryCode = "UY";
                        postalCode = "07843-0940";
                        region = "volt";
                        regionCode = "saepe";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-10-28T22:40:08.423Z");
                    dateOfBirth = OffsetDateTime.parse("2022-11-03T23:19:59.295Z");
                    department = "now Cheese";
                    division = "Berkshire Metal";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("North") {{
                            email = "Lambert41@yahoo.com";
                            type = HrisEmailType.HOME;
                        }}),
                    }};
                    employeeNumber = "daintily";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.CONTRACTOR;
                    gender = HrisEmployeeGender.INTERSEX;
                    hiredAt = OffsetDateTime.parse("2022-03-31T19:23:55.809Z");
                    id = "<ID>";
                    location = "New User";
                    managerId = "withdrawal";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "Analyst Card modern";
                    raw = new PropertyHrisEmployeeRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("deliberately") {{
                            telephone = "Tennessine hack blushing";
                            type = HrisTelephoneType.WORK;
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2023-06-23T02:25:04.157Z");
                    title = "Global somewhere Southwest";
                    updatedAt = OffsetDateTime.parse("2021-12-03T07:28:30.288Z");
                }};;
            }};            

            PutHrisConnectionIdEmployeeIdResponse res = sdk.hris.putHrisConnectionIdEmployeeId(req);

            if (res.hrisEmployee != null) {
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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdRequest](../../models/operations/PutHrisConnectionIdEmployeeIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdResponse](../../models/operations/PutHrisConnectionIdEmployeeIdResponse.md)**


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
                .setSecurity(new Security("panel") {{
                    jwt = "";
                }})
                .build();

            PutHrisConnectionIdGroupIdRequest req = new PutHrisConnectionIdGroupIdRequest("And", "Orchestrator") {{
                hrisGroup = new HrisGroup() {{
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
                    raw = new PropertyHrisGroupRaw();;
                    type = HrisGroupType.BRANCH;
                    updatedAt = OffsetDateTime.parse("2021-05-16T01:59:50.660Z");
                }};;
            }};            

            PutHrisConnectionIdGroupIdResponse res = sdk.hris.putHrisConnectionIdGroupId(req);

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

