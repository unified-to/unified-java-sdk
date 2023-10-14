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
                .setSecurity(new Security("meter"){{
                    jwt = "";
                }})
                .build();

            CreateHrisEmployeeRequest req = new CreateHrisEmployeeRequest("technologies"){{
                hrisEmployee = new HrisEmployee(){{
                    address = new PropertyHrisEmployeeAddress(){{
                        address1 = "composite redefine";
                        address2 = "repudiandae white primary";
                        city = "Kent";
                        country = "Faroe Islands";
                        countryCode = "CC";
                        postalCode = "14318-3860";
                        region = "candela Data";
                        regionCode = "Koruna where Director";
                    }};
                    createdAt = OffsetDateTime.parse("2022-08-18T03:26:10.390Z");
                    dateOfBirth = OffsetDateTime.parse("2021-01-06T20:54:57.707Z");
                    department = "City snake";
                    division = "since Dinar Mills";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("deeply"){{
                            email = "Graciela19@hotmail.com";
                        }}),
                    }};
                    employeeNumber = "barley Kia";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.FULL_TIME;
                    gender = HrisEmployeeGender.NON_BINARY;
                    hiredAt = OffsetDateTime.parse("2023-12-17T04:53:53.732Z");
                    id = "<ID>";
                    location = "Reggae extensible Guinea";
                    managerId = "Cedi";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "Wagon";
                    raw = new PropertyHrisEmployeeRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("Executive"){{
                            telephone = "Carolina";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2022-01-16T19:09:51.878Z");
                    title = "payment North";
                    updatedAt = OffsetDateTime.parse("2023-03-05T19:24:43.770Z");
                }};
                fields = new String[]{{
                    add("generally"),
                }};
            }};            

            CreateHrisEmployeeResponse res = sdk.hris.createHrisEmployee(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeRequest](../../models/operations/CreateHrisEmployeeRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisGroupRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("transmitter"){{
                    jwt = "";
                }})
                .build();

            CreateHrisGroupRequest req = new CreateHrisGroupRequest("dependable"){{
                hrisGroup = new HrisGroup(){{
                    createdAt = OffsetDateTime.parse("2021-01-15T12:45:54.663Z");
                    description = "Re-contextualized executive model";
                    employeeIds = new String[]{{
                        add("markets"),
                    }};
                    id = "<ID>";
                    isActive = false;
                    managerIds = new String[]{{
                        add("Forks"),
                    }};
                    name = "M2F Iranian";
                    parentId = "driver Electric";
                    raw = new PropertyHrisGroupRaw();
                    type = HrisGroupType.DEPARTMENT;
                    updatedAt = OffsetDateTime.parse("2022-11-20T16:35:37.465Z");
                }};
                fields = new String[]{{
                    add("SCSI"),
                }};
            }};            

            CreateHrisGroupResponse res = sdk.hris.createHrisGroup(req);

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
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateHrisGroupRequest](../../models/operations/CreateHrisGroupRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Louisiana"){{
                    jwt = "";
                }})
                .build();

            GetHrisEmployeeRequest req = new GetHrisEmployeeRequest("Afghanistan", "Minivan"){{
                fields = new String[]{{
                    add("hourly"),
                }};
            }};            

            GetHrisEmployeeResponse res = sdk.hris.getHrisEmployee(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeRequest](../../models/operations/GetHrisEmployeeRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("likewise"){{
                    jwt = "";
                }})
                .build();

            GetHrisGroupRequest req = new GetHrisGroupRequest("while", "Cadillac"){{
                fields = new String[]{{
                    add("optical"),
                }};
            }};            

            GetHrisGroupResponse res = sdk.hris.getHrisGroup(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetHrisGroupRequest](../../models/operations/GetHrisGroupRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("overriding"){{
                    jwt = "";
                }})
                .build();

            ListHrisEmployeesRequest req = new ListHrisEmployeesRequest("Krona"){{
                fields = new String[]{{
                    add("payment"),
                }};
                limit = 9587.43d;
                offset = 9972.64d;
                order = "Lari Cedi";
                query = "pug";
                sort = "SUV";
                updatedGte = OffsetDateTime.parse("2022-01-13T14:38:18.201Z");
            }};            

            ListHrisEmployeesResponse res = sdk.hris.listHrisEmployees(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesRequest](../../models/operations/ListHrisEmployeesRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Northwest"){{
                    jwt = "";
                }})
                .build();

            ListHrisGroupsRequest req = new ListHrisGroupsRequest("however"){{
                fields = new String[]{{
                    add("positive"),
                }};
                limit = 1929.12d;
                offset = 3809.99d;
                order = "portals even Manager";
                query = "proactive deliverables";
                sort = "West Plastic transmit";
                updatedGte = OffsetDateTime.parse("2023-02-19T02:41:06.804Z");
            }};            

            ListHrisGroupsResponse res = sdk.hris.listHrisGroups(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListHrisGroupsRequest](../../models/operations/ListHrisGroupsRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


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
                .setSecurity(new Security("invoice"){{
                    jwt = "";
                }})
                .build();

            PatchHrisEmployeeRequest req = new PatchHrisEmployeeRequest("New", "cyan"){{
                hrisEmployee = new HrisEmployee(){{
                    address = new PropertyHrisEmployeeAddress(){{
                        address1 = "Hybrid Fresh Alaska";
                        address2 = "siemens ohm";
                        city = "Fort Myrna";
                        country = "Switzerland";
                        countryCode = "SC";
                        postalCode = "59699-8615";
                        region = "hard";
                        regionCode = "Soft Producer Borders";
                    }};
                    createdAt = OffsetDateTime.parse("2023-01-28T09:34:42.602Z");
                    dateOfBirth = OffsetDateTime.parse("2021-05-03T17:00:57.006Z");
                    department = "Plastic outlet";
                    division = "intuitive monitor";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("Terbium"){{
                            email = "Desmond65@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "Card";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.OTHER;
                    gender = HrisEmployeeGender.MALE;
                    hiredAt = OffsetDateTime.parse("2023-05-23T18:25:46.914Z");
                    id = "<ID>";
                    location = "USB South";
                    managerId = "inventore";
                    maritalStatus = HrisEmployeeMaritalStatus.SINGLE;
                    name = "Cambridgeshire genre Assurance";
                    raw = new PropertyHrisEmployeeRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("Lilangeni"){{
                            telephone = "concept disburse Prairie";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2021-06-18T18:33:10.110Z");
                    title = "where instead female";
                    updatedAt = OffsetDateTime.parse("2021-08-30T22:54:54.298Z");
                }};
                fields = new String[]{{
                    add("West"),
                }};
            }};            

            PatchHrisEmployeeResponse res = sdk.hris.patchHrisEmployee(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeRequest](../../models/operations/PatchHrisEmployeeRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisGroupRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("scalable"){{
                    jwt = "";
                }})
                .build();

            PatchHrisGroupRequest req = new PatchHrisGroupRequest("Bespoke", "indexing"){{
                hrisGroup = new HrisGroup(){{
                    createdAt = OffsetDateTime.parse("2022-12-25T07:04:30.987Z");
                    description = "Adaptive radical methodology";
                    employeeIds = new String[]{{
                        add("online"),
                    }};
                    id = "<ID>";
                    isActive = false;
                    managerIds = new String[]{{
                        add("boohoo"),
                    }};
                    name = "innovate";
                    parentId = "Chevrolet";
                    raw = new PropertyHrisGroupRaw();
                    type = HrisGroupType.DIVISION;
                    updatedAt = OffsetDateTime.parse("2023-01-02T08:52:32.014Z");
                }};
                fields = new String[]{{
                    add("gladly"),
                }};
            }};            

            PatchHrisGroupResponse res = sdk.hris.patchHrisGroup(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchHrisGroupRequest](../../models/operations/PatchHrisGroupRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Chicken"){{
                    jwt = "";
                }})
                .build();

            RemoveHrisEmployeeRequest req = new RemoveHrisEmployeeRequest("TCP", "Northeast");            

            RemoveHrisEmployeeResponse res = sdk.hris.removeHrisEmployee(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeRequest](../../models/operations/RemoveHrisEmployeeRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("glistening"){{
                    jwt = "";
                }})
                .build();

            RemoveHrisGroupRequest req = new RemoveHrisGroupRequest("positive", "fabulous");            

            RemoveHrisGroupResponse res = sdk.hris.removeHrisGroup(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupRequest](../../models/operations/RemoveHrisGroupRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


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
                .setSecurity(new Security("Alabama"){{
                    jwt = "";
                }})
                .build();

            UpdateHrisEmployeeRequest req = new UpdateHrisEmployeeRequest("Normal", "truly"){{
                hrisEmployee = new HrisEmployee(){{
                    address = new PropertyHrisEmployeeAddress(){{
                        address1 = "Brand Androgyne";
                        address2 = "Distributed";
                        city = "Yundtfield";
                        country = "Zambia";
                        countryCode = "SC";
                        postalCode = "58866";
                        region = "F2M";
                        regionCode = "HEX Internal Buckinghamshire";
                    }};
                    createdAt = OffsetDateTime.parse("2022-10-01T07:10:14.173Z");
                    dateOfBirth = OffsetDateTime.parse("2022-04-22T02:08:52.236Z");
                    department = "Gasoline anti";
                    division = "unleash whiteboard Northwest";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("SCSI"){{
                            email = "Monte55@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "Southeast budgetary overriding";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.PART_TIME;
                    gender = HrisEmployeeGender.MALE;
                    hiredAt = OffsetDateTime.parse("2021-12-05T02:34:17.642Z");
                    id = "<ID>";
                    location = "Direct";
                    managerId = "Other Corporate Keyboard";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "holistic";
                    raw = new PropertyHrisEmployeeRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("Outlying"){{
                            telephone = "Diesel";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2022-02-01T05:32:53.194Z");
                    title = "male";
                    updatedAt = OffsetDateTime.parse("2021-06-28T03:29:04.540Z");
                }};
                fields = new String[]{{
                    add("Bronze"),
                }};
            }};            

            UpdateHrisEmployeeResponse res = sdk.hris.updateHrisEmployee(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeRequest](../../models/operations/UpdateHrisEmployeeRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.models.shared.HrisGroupType;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisGroupRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("disintermediate"){{
                    jwt = "";
                }})
                .build();

            UpdateHrisGroupRequest req = new UpdateHrisGroupRequest("schemas", "Southwest"){{
                hrisGroup = new HrisGroup(){{
                    createdAt = OffsetDateTime.parse("2021-02-20T16:10:10.066Z");
                    description = "Business-focused analyzing help-desk";
                    employeeIds = new String[]{{
                        add("Southeast"),
                    }};
                    id = "<ID>";
                    isActive = false;
                    managerIds = new String[]{{
                        add("Table"),
                    }};
                    name = "lime";
                    parentId = "Wagon Rubber";
                    raw = new PropertyHrisGroupRaw();
                    type = HrisGroupType.SUB_DEPARTMENT;
                    updatedAt = OffsetDateTime.parse("2023-08-16T02:52:12.983Z");
                }};
                fields = new String[]{{
                    add("Hat"),
                }};
            }};            

            UpdateHrisGroupResponse res = sdk.hris.updateHrisGroup(req);

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
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupRequest](../../models/operations/UpdateHrisGroupRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupResponse](../../models/operations/UpdateHrisGroupResponse.md)**

