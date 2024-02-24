# Hris
(*hris*)

### Available Operations

* [createHrisEmployee](#createhrisemployee) - Create an employee
* [createHrisGroup](#createhrisgroup) - Create a group
* [getHrisEmployee](#gethrisemployee) - Retrieve an employee
* [getHrisGroup](#gethrisgroup) - Retrieve a group
* [listHrisEmployees](#listhrisemployees) - List all employees
* [listHrisGroups](#listhrisgroups) - List all groups
* [patchHrisEmployee](#patchhrisemployee) - Update an employee
* [patchHrisGroup](#patchhrisgroup) - Update a group
* [removeHrisEmployee](#removehrisemployee) - Remove an employee
* [removeHrisGroup](#removehrisgroup) - Remove a group
* [updateHrisEmployee](#updatehrisemployee) - Update an employee
* [updateHrisGroup](#updatehrisgroup) - Update a group

## createHrisEmployee

Create an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeResponse;
import com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeSecurity;
import com.unifiedapi.unifiedto.models.shared.EmploymentStatus;
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.MaritalStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeRequest req = new CreateHrisEmployeeRequest(
                "<value>"){{
                hrisEmployee = new HrisEmployee(
){{
                    address = new PropertyHrisEmployeeAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Armstrongborough";
                        country = "Indonesia";
                        countryCode = "MO";
                        postalCode = "23995";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2024-10-07T16:11:17.542Z");
                    currency = "Tunisian Dinar";
                    dateOfBirth = OffsetDateTime.parse("2022-09-15T21:52:09.133Z");
                    department = "<value>";
                    division = "<value>";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail(
                        "<value>"){{
                            email = "Audrey.Wilkinson@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "<value>";
                    employmentStatus = EmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.OTHER;
                    gender = HrisEmployeeGender.MALE;
                    hiredAt = OffsetDateTime.parse("2023-04-01T23:26:55.787Z");
                    id = "<id>";
                    imageUrl = "<value>";
                    languageLocale = "<value>";
                    location = "<value>";
                    managerId = "<value>";
                    maritalStatus = MaritalStatus.MARRIED;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2022-06-06T17:06:15.004Z");
                    timezone = "Australia/Melbourne";
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2023-02-26T16:14:34.561Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeResponse res = sdk.hris.createHrisEmployee(req, new CreateHrisEmployeeSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeRequest](../../models/operations/CreateHrisEmployeeRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeSecurity](../../models/operations/CreateHrisEmployeeSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeResponse](../../models/operations/CreateHrisEmployeeResponse.md)**


## createHrisGroup

Create a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.CreateHrisGroupResponse;
import com.unifiedapi.unifiedto.models.operations.CreateHrisGroupSecurity;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateHrisGroupRequest req = new CreateHrisGroupRequest(
                "<value>"){{
                hrisGroup = new HrisGroup(
){{
                    createdAt = OffsetDateTime.parse("2023-08-12T02:07:27.193Z");
                    description = "Self-enabling system-worthy collaboration";
                    id = "<id>";
                    isActive = false;
                    managerIds = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    parentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = HrisGroupType.TEAM;
                    updatedAt = OffsetDateTime.parse("2024-03-09T17:49:55.923Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateHrisGroupResponse res = sdk.hris.createHrisGroup(req, new CreateHrisGroupSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.CreateHrisGroupRequest](../../models/operations/CreateHrisGroupRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.CreateHrisGroupSecurity](../../models/operations/CreateHrisGroupSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateHrisGroupResponse](../../models/operations/CreateHrisGroupResponse.md)**


## getHrisEmployee

Retrieve an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeResponse;
import com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeRequest req = new GetHrisEmployeeRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeResponse res = sdk.hris.getHrisEmployee(req, new GetHrisEmployeeSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeRequest](../../models/operations/GetHrisEmployeeRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeSecurity](../../models/operations/GetHrisEmployeeSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeResponse](../../models/operations/GetHrisEmployeeResponse.md)**


## getHrisGroup

Retrieve a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisGroupResponse;
import com.unifiedapi.unifiedto.models.operations.GetHrisGroupSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetHrisGroupRequest req = new GetHrisGroupRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetHrisGroupResponse res = sdk.hris.getHrisGroup(req, new GetHrisGroupSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetHrisGroupRequest](../../models/operations/GetHrisGroupRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetHrisGroupSecurity](../../models/operations/GetHrisGroupSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisGroupResponse](../../models/operations/GetHrisGroupResponse.md)**


## listHrisEmployees

List all employees

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesRequest;
import com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesResponse;
import com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesRequest req = new ListHrisEmployeesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5148.12d;
                offset = 2185.43d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-04-10T00:54:40.984Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesResponse res = sdk.hris.listHrisEmployees(req, new ListHrisEmployeesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesRequest](../../models/operations/ListHrisEmployeesRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesSecurity](../../models/operations/ListHrisEmployeesSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesResponse](../../models/operations/ListHrisEmployeesResponse.md)**


## listHrisGroups

List all groups

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListHrisGroupsRequest;
import com.unifiedapi.unifiedto.models.operations.ListHrisGroupsResponse;
import com.unifiedapi.unifiedto.models.operations.ListHrisGroupsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListHrisGroupsRequest req = new ListHrisGroupsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 4815.14d;
                offset = 2554.75d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-04-30T00:40:26.357Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListHrisGroupsResponse res = sdk.hris.listHrisGroups(req, new ListHrisGroupsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.ListHrisGroupsRequest](../../models/operations/ListHrisGroupsRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.ListHrisGroupsSecurity](../../models/operations/ListHrisGroupsSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListHrisGroupsResponse](../../models/operations/ListHrisGroupsResponse.md)**


## patchHrisEmployee

Update an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeResponse;
import com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeSecurity;
import com.unifiedapi.unifiedto.models.shared.EmploymentStatus;
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.MaritalStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeRequest req = new PatchHrisEmployeeRequest(
                "<value>",
                "<value>"){{
                hrisEmployee = new HrisEmployee(
){{
                    address = new PropertyHrisEmployeeAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Zettaland";
                        country = "Mexico";
                        countryCode = "DJ";
                        postalCode = "87892";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2023-07-12T22:40:07.218Z");
                    currency = "Venezuelan bolívar";
                    dateOfBirth = OffsetDateTime.parse("2024-05-04T03:46:56.564Z");
                    department = "<value>";
                    division = "<value>";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail(
                        "<value>"){{
                            email = "Bobby_Balistreri@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "<value>";
                    employmentStatus = EmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.SEASONAL;
                    gender = HrisEmployeeGender.INTERSEX;
                    hiredAt = OffsetDateTime.parse("2022-10-18T06:05:07.523Z");
                    id = "<id>";
                    imageUrl = "<value>";
                    languageLocale = "<value>";
                    location = "<value>";
                    managerId = "<value>";
                    maritalStatus = MaritalStatus.SINGLE;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2024-03-19T18:41:09.098Z");
                    timezone = "Australia/Darwin";
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-05-06T18:18:28.829Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeResponse res = sdk.hris.patchHrisEmployee(req, new PatchHrisEmployeeSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeRequest](../../models/operations/PatchHrisEmployeeRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeSecurity](../../models/operations/PatchHrisEmployeeSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeResponse](../../models/operations/PatchHrisEmployeeResponse.md)**


## patchHrisGroup

Update a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.PatchHrisGroupResponse;
import com.unifiedapi.unifiedto.models.operations.PatchHrisGroupSecurity;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchHrisGroupRequest req = new PatchHrisGroupRequest(
                "<value>",
                "<value>"){{
                hrisGroup = new HrisGroup(
){{
                    createdAt = OffsetDateTime.parse("2022-11-10T03:17:00.454Z");
                    description = "Compatible contextually-based local area network";
                    id = "<id>";
                    isActive = false;
                    managerIds = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    parentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = HrisGroupType.DIVISION;
                    updatedAt = OffsetDateTime.parse("2023-06-23T21:37:16.122Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchHrisGroupResponse res = sdk.hris.patchHrisGroup(req, new PatchHrisGroupSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchHrisGroupRequest](../../models/operations/PatchHrisGroupRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PatchHrisGroupSecurity](../../models/operations/PatchHrisGroupSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchHrisGroupResponse](../../models/operations/PatchHrisGroupResponse.md)**


## removeHrisEmployee

Remove an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeRequest req = new RemoveHrisEmployeeRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeResponse res = sdk.hris.removeHrisEmployee(req, new RemoveHrisEmployeeSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeRequest](../../models/operations/RemoveHrisEmployeeRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeSecurity](../../models/operations/RemoveHrisEmployeeSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeResponse](../../models/operations/RemoveHrisEmployeeResponse.md)**


## removeHrisGroup

Remove a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupRequest req = new RemoveHrisGroupRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupResponse res = sdk.hris.removeHrisGroup(req, new RemoveHrisGroupSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupRequest](../../models/operations/RemoveHrisGroupRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupSecurity](../../models/operations/RemoveHrisGroupSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupResponse](../../models/operations/RemoveHrisGroupResponse.md)**


## updateHrisEmployee

Update an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeSecurity;
import com.unifiedapi.unifiedto.models.shared.EmploymentStatus;
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.MaritalStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeRequest req = new UpdateHrisEmployeeRequest(
                "<value>",
                "<value>"){{
                hrisEmployee = new HrisEmployee(
){{
                    address = new PropertyHrisEmployeeAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "North Alfurt";
                        country = "Thailand";
                        countryCode = "ST";
                        postalCode = "60601-3179";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2024-06-07T16:21:55.126Z");
                    currency = "Zimbabwe Dollar";
                    dateOfBirth = OffsetDateTime.parse("2024-05-03T23:33:19.708Z");
                    department = "<value>";
                    division = "<value>";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail(
                        "<value>"){{
                            email = "Larue_Schroeder65@gmail.com";
                        }}),
                    }};
                    employeeNumber = "<value>";
                    employmentStatus = EmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.CASUAL;
                    gender = HrisEmployeeGender.FEMALE;
                    hiredAt = OffsetDateTime.parse("2024-03-13T20:08:58.858Z");
                    id = "<id>";
                    imageUrl = "<value>";
                    languageLocale = "<value>";
                    location = "<value>";
                    managerId = "<value>";
                    maritalStatus = MaritalStatus.MARRIED;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2023-01-08T01:17:38.194Z");
                    timezone = "Asia/Karachi";
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-07-22T23:45:01.037Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeResponse res = sdk.hris.updateHrisEmployee(req, new UpdateHrisEmployeeSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeRequest](../../models/operations/UpdateHrisEmployeeRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeSecurity](../../models/operations/UpdateHrisEmployeeSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeResponse](../../models/operations/UpdateHrisEmployeeResponse.md)**


## updateHrisGroup

Update a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupSecurity;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupRequest req = new UpdateHrisGroupRequest(
                "<value>",
                "<value>"){{
                hrisGroup = new HrisGroup(
){{
                    createdAt = OffsetDateTime.parse("2022-12-07T01:08:49.621Z");
                    description = "Integrated empowering productivity";
                    id = "<id>";
                    isActive = false;
                    managerIds = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    parentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = HrisGroupType.TEAM;
                    updatedAt = OffsetDateTime.parse("2024-09-12T13:33:00.416Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupResponse res = sdk.hris.updateHrisGroup(req, new UpdateHrisGroupSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupRequest](../../models/operations/UpdateHrisGroupRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupSecurity](../../models/operations/UpdateHrisGroupSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupResponse](../../models/operations/UpdateHrisGroupResponse.md)**

