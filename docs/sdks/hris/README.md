# hris

### Available Operations

* [deleteHrisConnectionIdEmployeeId](#deletehrisconnectionidemployeeid) - Remove a Employee
* [deleteHrisConnectionIdGroupId](#deletehrisconnectionidgroupid) - Remove a Group
* [getHrisConnectionIdEmployee](#gethrisconnectionidemployee) - List all Employees
* [getHrisConnectionIdEmployeeId](#gethrisconnectionidemployeeid) - Retrieve a Employee
* [getHrisConnectionIdGroup](#gethrisconnectionidgroup) - List all Groups
* [getHrisConnectionIdGroupId](#gethrisconnectionidgroupid) - Retrieve a Group
* [patchHrisConnectionIdEmployeeId](#patchhrisconnectionidemployeeid) - Update a Employee
* [patchHrisConnectionIdGroupId](#patchhrisconnectionidgroupid) - Update a Group
* [postHrisConnectionIdEmployee](#posthrisconnectionidemployee) - Create a Employee
* [postHrisConnectionIdGroup](#posthrisconnectionidgroup) - Create a Group
* [putHrisConnectionIdEmployeeId](#puthrisconnectionidemployeeid) - Update a Employee
* [putHrisConnectionIdGroupId](#puthrisconnectionidgroupid) - Update a Group

## deleteHrisConnectionIdEmployeeId

Remove a Employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteHrisConnectionIdEmployeeIdRequest req = new DeleteHrisConnectionIdEmployeeIdRequest("unde", "assumenda");            

            DeleteHrisConnectionIdEmployeeIdResponse res = sdk.hris.deleteHrisConnectionIdEmployeeId(req, new DeleteHrisConnectionIdEmployeeIdSecurity("adipisci") {{
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdRequest](../../models/operations/DeleteHrisConnectionIdEmployeeIdRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdSecurity](../../models/operations/DeleteHrisConnectionIdEmployeeIdSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdResponse](../../models/operations/DeleteHrisConnectionIdEmployeeIdResponse.md)**


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

            DeleteHrisConnectionIdGroupIdRequest req = new DeleteHrisConnectionIdGroupIdRequest("velit", "accusamus");            

            DeleteHrisConnectionIdGroupIdResponse res = sdk.hris.deleteHrisConnectionIdGroupId(req, new DeleteHrisConnectionIdGroupIdSecurity("veniam") {{
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


## getHrisConnectionIdEmployee

List all Employees

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeResponse;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetHrisConnectionIdEmployeeRequest req = new GetHrisConnectionIdEmployeeRequest("provident") {{
                limit = 3430.67d;
                offset = 2217.56d;
                order = "quod";
                query = "consequatur";
                sort = "accusantium";
                updatedGte = LocalDate.parse("2022-12-05");
            }};            

            GetHrisConnectionIdEmployeeResponse res = sdk.hris.getHrisConnectionIdEmployee(req, new GetHrisConnectionIdEmployeeSecurity("amet") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeRequest](../../models/operations/GetHrisConnectionIdEmployeeRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeSecurity](../../models/operations/GetHrisConnectionIdEmployeeSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeResponse](../../models/operations/GetHrisConnectionIdEmployeeResponse.md)**


## getHrisConnectionIdEmployeeId

Retrieve a Employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetHrisConnectionIdEmployeeIdRequest req = new GetHrisConnectionIdEmployeeIdRequest("occaecati", "quos");            

            GetHrisConnectionIdEmployeeIdResponse res = sdk.hris.getHrisConnectionIdEmployeeId(req, new GetHrisConnectionIdEmployeeIdSecurity("aliquid") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdRequest](../../models/operations/GetHrisConnectionIdEmployeeIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdSecurity](../../models/operations/GetHrisConnectionIdEmployeeIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdResponse](../../models/operations/GetHrisConnectionIdEmployeeIdResponse.md)**


## getHrisConnectionIdGroup

List all Groups

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupResponse;
import com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetHrisConnectionIdGroupRequest req = new GetHrisConnectionIdGroupRequest("sequi") {{
                limit = 6328.85d;
                offset = 6827.03d;
                order = "modi";
                query = "et";
                sort = "eveniet";
                updatedGte = LocalDate.parse("2022-03-29");
            }};            

            GetHrisConnectionIdGroupResponse res = sdk.hris.getHrisConnectionIdGroup(req, new GetHrisConnectionIdGroupSecurity("adipisci") {{
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

            GetHrisConnectionIdGroupIdRequest req = new GetHrisConnectionIdGroupIdRequest("ab", "maxime");            

            GetHrisConnectionIdGroupIdResponse res = sdk.hris.getHrisConnectionIdGroupId(req, new GetHrisConnectionIdGroupIdSecurity("porro") {{
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


## patchHrisConnectionIdEmployeeId

Update a Employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdSecurity;
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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchHrisConnectionIdEmployeeIdRequest req = new PatchHrisConnectionIdEmployeeIdRequest("explicabo", "reiciendis") {{
                hrisEmployee = new HrisEmployee() {{
                    address = new PropertyHrisEmployeeAddress() {{
                        address1 = "dicta";
                        address2 = "hic";
                        city = "Ricebury";
                        country = "British Indian Ocean Territory (Chagos Archipelago)";
                        countryCode = "SE";
                        postalCode = "62099-7968";
                        region = "quidem";
                        regionCode = "temporibus";
                    }};;
                    createdAt = LocalDate.parse("2022-05-19");
                    dateOfBirth = LocalDate.parse("2022-01-30");
                    department = "earum";
                    division = "commodi";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("quisquam") {{
                            email = "Skye.Bauch@gmail.com";
                            type = HrisEmailType.OTHER;
                        }}),
                    }};
                    employeeNumber = "molestiae";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.CASUAL;
                    gender = HrisEmployeeGender.NON_BINARY;
                    hiredAt = LocalDate.parse("2022-11-23");
                    id = "6ea5c716-4193-44b9-8f2e-09d19d2fc2f9";
                    location = "earum";
                    managerId = "fugit";
                    maritalStatus = HrisEmployeeMaritalStatus.SINGLE;
                    name = "Barbara Hilll";
                    raw = new PropertyHrisEmployeeRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("molestias") {{
                            telephone = "numquam";
                            type = HrisTelephoneType.FAX;
                        }}),
                    }};
                    terminatedAt = LocalDate.parse("2022-09-06");
                    title = "Dr.";
                    updatedAt = LocalDate.parse("2022-10-05");
                }};;
            }};            

            PatchHrisConnectionIdEmployeeIdResponse res = sdk.hris.patchHrisConnectionIdEmployeeId(req, new PatchHrisConnectionIdEmployeeIdSecurity("reprehenderit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdRequest](../../models/operations/PatchHrisConnectionIdEmployeeIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdSecurity](../../models/operations/PatchHrisConnectionIdEmployeeIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdResponse](../../models/operations/PatchHrisConnectionIdEmployeeIdResponse.md)**


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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchHrisConnectionIdGroupIdRequest req = new PatchHrisConnectionIdGroupIdRequest("id", "ducimus") {{
                hrisGroup = new HrisGroup() {{
                    createdAt = LocalDate.parse("2022-01-04");
                    description = "occaecati";
                    employeeIds = new String[]{{
                        add("doloremque"),
                    }};
                    id = "849d6aed-4aec-4b75-b7cd-9222c9ff5749";
                    isActive = false;
                    managerIds = new String[]{{
                        add("inventore"),
                    }};
                    name = "Rex Pollich";
                    parentId = "aspernatur";
                    raw = new PropertyHrisGroupRaw();;
                    type = HrisGroupType.SUB_DEPARTMENT;
                    updatedAt = LocalDate.parse("2022-07-26");
                }};;
            }};            

            PatchHrisConnectionIdGroupIdResponse res = sdk.hris.patchHrisConnectionIdGroupId(req, new PatchHrisConnectionIdGroupIdSecurity("quasi") {{
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


## postHrisConnectionIdEmployee

Create a Employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeResponse;
import com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeSecurity;
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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostHrisConnectionIdEmployeeRequest req = new PostHrisConnectionIdEmployeeRequest("tenetur") {{
                hrisEmployee = new HrisEmployee() {{
                    address = new PropertyHrisEmployeeAddress() {{
                        address1 = "accusantium";
                        address2 = "quo";
                        city = "Goodwinhaven";
                        country = "Finland";
                        countryCode = "GM";
                        postalCode = "89102";
                        region = "inventore";
                        regionCode = "saepe";
                    }};;
                    createdAt = LocalDate.parse("2022-06-29");
                    dateOfBirth = LocalDate.parse("2021-10-14");
                    department = "hic";
                    division = "accusantium";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("quia") {{
                            email = "Branson9@hotmail.com";
                            type = HrisEmailType.OTHER;
                        }}),
                    }};
                    employeeNumber = "aspernatur";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.FREELANCE;
                    gender = HrisEmployeeGender.FEMALE;
                    hiredAt = LocalDate.parse("2022-03-15");
                    id = "c0584a18-4d76-4d97-9fc8-20c65b037bb8";
                    location = "saepe";
                    managerId = "sit";
                    maritalStatus = HrisEmployeeMaritalStatus.SINGLE;
                    name = "Byron MacGyver V";
                    raw = new PropertyHrisEmployeeRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("labore") {{
                            telephone = "molestiae";
                            type = HrisTelephoneType.MOBILE;
                        }}),
                    }};
                    terminatedAt = LocalDate.parse("2020-05-12");
                    title = "Mr.";
                    updatedAt = LocalDate.parse("2022-04-30");
                }};;
            }};            

            PostHrisConnectionIdEmployeeResponse res = sdk.hris.postHrisConnectionIdEmployee(req, new PostHrisConnectionIdEmployeeSecurity("hic") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeRequest](../../models/operations/PostHrisConnectionIdEmployeeRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeSecurity](../../models/operations/PostHrisConnectionIdEmployeeSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeResponse](../../models/operations/PostHrisConnectionIdEmployeeResponse.md)**


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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostHrisConnectionIdGroupRequest req = new PostHrisConnectionIdGroupRequest("sed") {{
                hrisGroup = new HrisGroup() {{
                    createdAt = LocalDate.parse("2021-05-24");
                    description = "ad";
                    employeeIds = new String[]{{
                        add("quibusdam"),
                    }};
                    id = "ddb46aa1-cfd6-4d82-8da0-131911296466";
                    isActive = false;
                    managerIds = new String[]{{
                        add("quaerat"),
                    }};
                    name = "Myra Bernier";
                    parentId = "et";
                    raw = new PropertyHrisGroupRaw();;
                    type = HrisGroupType.SUB_DEPARTMENT;
                    updatedAt = LocalDate.parse("2022-05-22");
                }};;
            }};            

            PostHrisConnectionIdGroupResponse res = sdk.hris.postHrisConnectionIdGroup(req, new PostHrisConnectionIdGroupSecurity("perferendis") {{
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


## putHrisConnectionIdEmployeeId

Update a Employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdSecurity;
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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutHrisConnectionIdEmployeeIdRequest req = new PutHrisConnectionIdEmployeeIdRequest("magnam", "aspernatur") {{
                hrisEmployee = new HrisEmployee() {{
                    address = new PropertyHrisEmployeeAddress() {{
                        address1 = "sapiente";
                        address2 = "nemo";
                        city = "New Maxie";
                        country = "Lao People's Democratic Republic";
                        countryCode = "MY";
                        postalCode = "90961-1048";
                        region = "libero";
                        regionCode = "saepe";
                    }};;
                    createdAt = LocalDate.parse("2022-07-05");
                    dateOfBirth = LocalDate.parse("2022-04-23");
                    department = "cumque";
                    division = "ab";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("harum") {{
                            email = "Daisha46@yahoo.com";
                            type = HrisEmailType.HOME;
                        }}),
                    }};
                    employeeNumber = "sequi";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.FULL_TIME;
                    gender = HrisEmployeeGender.INTERSEX;
                    hiredAt = LocalDate.parse("2022-02-16");
                    id = "a99257d0-4f40-4847-a742-d84496cbdeec";
                    location = "reiciendis";
                    managerId = "ex";
                    maritalStatus = HrisEmployeeMaritalStatus.SINGLE;
                    name = "Rene Rogahn";
                    raw = new PropertyHrisEmployeeRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("nisi") {{
                            telephone = "consectetur";
                            type = HrisTelephoneType.HOME;
                        }}),
                    }};
                    terminatedAt = LocalDate.parse("2022-02-02");
                    title = "Miss";
                    updatedAt = LocalDate.parse("2020-06-26");
                }};;
            }};            

            PutHrisConnectionIdEmployeeIdResponse res = sdk.hris.putHrisConnectionIdEmployeeId(req, new PutHrisConnectionIdEmployeeIdSecurity("delectus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdRequest](../../models/operations/PutHrisConnectionIdEmployeeIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdSecurity](../../models/operations/PutHrisConnectionIdEmployeeIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdResponse](../../models/operations/PutHrisConnectionIdEmployeeIdResponse.md)**


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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutHrisConnectionIdGroupIdRequest req = new PutHrisConnectionIdGroupIdRequest("enim", "ipsam") {{
                hrisGroup = new HrisGroup() {{
                    createdAt = LocalDate.parse("2022-06-23");
                    description = "iste";
                    employeeIds = new String[]{{
                        add("labore"),
                    }};
                    id = "c060b06a-1287-4764-aef6-d0c6d6ed9c73";
                    isActive = false;
                    managerIds = new String[]{{
                        add("temporibus"),
                    }};
                    name = "Andre Franey";
                    parentId = "dignissimos";
                    raw = new PropertyHrisGroupRaw();;
                    type = HrisGroupType.TEAM;
                    updatedAt = LocalDate.parse("2022-12-11");
                }};;
            }};            

            PutHrisConnectionIdGroupIdResponse res = sdk.hris.putHrisConnectionIdGroupId(req, new PutHrisConnectionIdGroupIdSecurity("occaecati") {{
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

