# Hris
(*hris*)

### Available Operations

* [createHrisCompany](#createhriscompany) - Create a company
* [createHrisEmployee](#createhrisemployee) - Create an employee
* [createHrisGroup](#createhrisgroup) - Create a group
* [getHrisCompany](#gethriscompany) - Retrieve a company
* [getHrisEmployee](#gethrisemployee) - Retrieve an employee
* [getHrisGroup](#gethrisgroup) - Retrieve a group
* [getHrisPayslip](#gethrispayslip) - Retrieve a payslip
* [getHrisTimeoff](#gethristimeoff) - Retrieve a timeoff
* [listHrisCompanies](#listhriscompanies) - List all companies
* [listHrisEmployees](#listhrisemployees) - List all employees
* [listHrisGroups](#listhrisgroups) - List all groups
* [listHrisPayslips](#listhrispayslips) - List all payslips
* [listHrisTimeoffs](#listhristimeoffs) - List all timeoffs
* [patchHrisCompany](#patchhriscompany) - Update a company
* [patchHrisEmployee](#patchhrisemployee) - Update an employee
* [patchHrisGroup](#patchhrisgroup) - Update a group
* [removeHrisCompany](#removehriscompany) - Remove a company
* [removeHrisEmployee](#removehrisemployee) - Remove an employee
* [removeHrisGroup](#removehrisgroup) - Remove a group
* [updateHrisCompany](#updatehriscompany) - Update a company
* [updateHrisEmployee](#updatehrisemployee) - Update an employee
* [updateHrisGroup](#updatehrisgroup) - Update a group

## createHrisCompany

Create a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateHrisCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.CreateHrisCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.HrisCompany;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisCompanyAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateHrisCompanyRequest req = new CreateHrisCompanyRequest(
                "<value>"){{
                hrisCompany = new HrisCompany(
){{
                    address = new PropertyHrisCompanyAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Leuschketon";
                        country = "Greenland";
                        countryCode = "UG";
                        postalCode = "28999";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2024-11-26T14:41:42.849Z");
                    id = "<id>";
                    legalName = "<value>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-04-03T15:03:14.449Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateHrisCompanyResponse res = sdk.hris.createHrisCompany(req);

            if (res.hrisCompany != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreateHrisCompanyRequest](../../models/operations/CreateHrisCompanyRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateHrisCompanyResponse](../../models/operations/CreateHrisCompanyResponse.md)**


## createHrisEmployee

Create an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeResponse;
import com.unifiedapi.unifiedto.models.shared.EmploymentStatus;
import com.unifiedapi.unifiedto.models.shared.HrisCompensation;
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.MaritalStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeEmployeeRoles;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

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
                    bio = "<value>";
                    companyId = "<value>";
                    compensation = new com.unifiedapi.unifiedto.models.shared.HrisCompensation[]{{
                        add(new HrisCompensation(
                        ){{}}),
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
                    employeeRoles = new com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeEmployeeRoles[]{{
                        add(PropertyHrisEmployeeEmployeeRoles.ADMIN),
                    }};
                    employmentStatus = EmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.PART_TIME;
                    gender = HrisEmployeeGender.INTERSEX;
                    hiredAt = OffsetDateTime.parse("2023-02-04T07:13:32.548Z");
                    id = "<id>";
                    imageUrl = "<value>";
                    languageLocale = "<value>";
                    location = "<value>";
                    managerId = "<value>";
                    maritalStatus = MaritalStatus.MARRIED;
                    name = "<value>";
                    pronouns = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    salutation = "<value>";
                    ssnSin = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2024-08-22T00:48:11.323Z");
                    timezone = "Europe/Madrid";
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-06-06T14:46:00.678Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeResponse res = sdk.hris.createHrisEmployee(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateHrisGroupRequest req = new CreateHrisGroupRequest(
                "<value>"){{
                hrisGroup = new HrisGroup(
){{
                    companyId = "<value>";
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

            com.unifiedapi.unifiedto.models.operations.CreateHrisGroupResponse res = sdk.hris.createHrisGroup(req);

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


## getHrisCompany

Retrieve a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetHrisCompanyRequest req = new GetHrisCompanyRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetHrisCompanyResponse res = sdk.hris.getHrisCompany(req);

            if (res.hrisCompany != null) {
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
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetHrisCompanyRequest](../../models/operations/GetHrisCompanyRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisCompanyResponse](../../models/operations/GetHrisCompanyResponse.md)**


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeRequest req = new GetHrisEmployeeRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeResponse res = sdk.hris.getHrisEmployee(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetHrisGroupRequest req = new GetHrisGroupRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetHrisGroupResponse res = sdk.hris.getHrisGroup(req);

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


## getHrisPayslip

Retrieve a payslip

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisPayslipRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisPayslipResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetHrisPayslipRequest req = new GetHrisPayslipRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetHrisPayslipResponse res = sdk.hris.getHrisPayslip(req);

            if (res.hrisPayslip != null) {
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
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetHrisPayslipRequest](../../models/operations/GetHrisPayslipRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisPayslipResponse](../../models/operations/GetHrisPayslipResponse.md)**


## getHrisTimeoff

Retrieve a timeoff

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisTimeoffRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisTimeoffResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetHrisTimeoffRequest req = new GetHrisTimeoffRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetHrisTimeoffResponse res = sdk.hris.getHrisTimeoff(req);

            if (res.hrisTimeoff != null) {
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
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetHrisTimeoffRequest](../../models/operations/GetHrisTimeoffRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetHrisTimeoffResponse](../../models/operations/GetHrisTimeoffResponse.md)**


## listHrisCompanies

List all companies

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListHrisCompaniesRequest;
import com.unifiedapi.unifiedto.models.operations.ListHrisCompaniesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListHrisCompaniesRequest req = new ListHrisCompaniesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 9887.05d;
                offset = 4708.81d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-12-23T09:20:33.437Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListHrisCompaniesResponse res = sdk.hris.listHrisCompanies(req);

            if (res.hrisCompanies != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListHrisCompaniesRequest](../../models/operations/ListHrisCompaniesRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListHrisCompaniesResponse](../../models/operations/ListHrisCompaniesResponse.md)**


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesRequest req = new ListHrisEmployeesRequest(
                "<value>"){{
                companyId = "<value>";
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

            com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesResponse res = sdk.hris.listHrisEmployees(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListHrisGroupsRequest req = new ListHrisGroupsRequest(
                "<value>"){{
                companyId = "<value>";
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

            com.unifiedapi.unifiedto.models.operations.ListHrisGroupsResponse res = sdk.hris.listHrisGroups(req);

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


## listHrisPayslips

List all payslips

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListHrisPayslipsRequest;
import com.unifiedapi.unifiedto.models.operations.ListHrisPayslipsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListHrisPayslipsRequest req = new ListHrisPayslipsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 254.98d;
                offset = 7922.79d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-04-05T03:49:22.310Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListHrisPayslipsResponse res = sdk.hris.listHrisPayslips(req);

            if (res.hrisPayslips != null) {
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
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListHrisPayslipsRequest](../../models/operations/ListHrisPayslipsRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListHrisPayslipsResponse](../../models/operations/ListHrisPayslipsResponse.md)**


## listHrisTimeoffs

List all timeoffs

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListHrisTimeoffsRequest;
import com.unifiedapi.unifiedto.models.operations.ListHrisTimeoffsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListHrisTimeoffsRequest req = new ListHrisTimeoffsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 1802.06d;
                offset = 8928.71d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-11-20T05:14:17.047Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListHrisTimeoffsResponse res = sdk.hris.listHrisTimeoffs(req);

            if (res.hrisTimeoffs != null) {
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
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListHrisTimeoffsRequest](../../models/operations/ListHrisTimeoffsRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListHrisTimeoffsResponse](../../models/operations/ListHrisTimeoffsResponse.md)**


## patchHrisCompany

Update a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchHrisCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.PatchHrisCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.HrisCompany;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisCompanyAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchHrisCompanyRequest req = new PatchHrisCompanyRequest(
                "<value>",
                "<value>"){{
                hrisCompany = new HrisCompany(
){{
                    address = new PropertyHrisCompanyAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "West Tressashire";
                        country = "Norfolk Island";
                        countryCode = "MW";
                        postalCode = "36009-7244";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2023-12-23T19:08:18.404Z");
                    id = "<id>";
                    legalName = "<value>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-12-13T07:35:41.815Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchHrisCompanyResponse res = sdk.hris.patchHrisCompany(req);

            if (res.hrisCompany != null) {
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
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchHrisCompanyRequest](../../models/operations/PatchHrisCompanyRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchHrisCompanyResponse](../../models/operations/PatchHrisCompanyResponse.md)**


## patchHrisEmployee

Update an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeResponse;
import com.unifiedapi.unifiedto.models.shared.EmploymentStatus;
import com.unifiedapi.unifiedto.models.shared.HrisCompensation;
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.MaritalStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeEmployeeRoles;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

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
                    bio = "<value>";
                    companyId = "<value>";
                    compensation = new com.unifiedapi.unifiedto.models.shared.HrisCompensation[]{{
                        add(new HrisCompensation(
                        ){{}}),
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
                    employeeRoles = new com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeEmployeeRoles[]{{
                        add(PropertyHrisEmployeeEmployeeRoles.INTERVIEWER),
                    }};
                    employmentStatus = EmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.VOLUNTEER;
                    gender = HrisEmployeeGender.FEMALE;
                    hiredAt = OffsetDateTime.parse("2024-12-01T15:09:08.937Z");
                    id = "<id>";
                    imageUrl = "<value>";
                    languageLocale = "<value>";
                    location = "<value>";
                    managerId = "<value>";
                    maritalStatus = MaritalStatus.SINGLE;
                    name = "<value>";
                    pronouns = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    salutation = "<value>";
                    ssnSin = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2024-08-01T11:49:18.424Z");
                    timezone = "Asia/Urumqi";
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-03-12T16:01:13.505Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeResponse res = sdk.hris.patchHrisEmployee(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchHrisGroupRequest req = new PatchHrisGroupRequest(
                "<value>",
                "<value>"){{
                hrisGroup = new HrisGroup(
){{
                    companyId = "<value>";
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

            com.unifiedapi.unifiedto.models.operations.PatchHrisGroupResponse res = sdk.hris.patchHrisGroup(req);

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


## removeHrisCompany

Remove a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveHrisCompanyRequest req = new RemoveHrisCompanyRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveHrisCompanyResponse res = sdk.hris.removeHrisCompany(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemoveHrisCompanyRequest](../../models/operations/RemoveHrisCompanyRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveHrisCompanyResponse](../../models/operations/RemoveHrisCompanyResponse.md)**


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeRequest req = new RemoveHrisEmployeeRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeResponse res = sdk.hris.removeHrisEmployee(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupRequest req = new RemoveHrisGroupRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupResponse res = sdk.hris.removeHrisGroup(req);

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


## updateHrisCompany

Update a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.HrisCompany;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisCompanyAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateHrisCompanyRequest req = new UpdateHrisCompanyRequest(
                "<value>",
                "<value>"){{
                hrisCompany = new HrisCompany(
){{
                    address = new PropertyHrisCompanyAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Rancho Santa Margarita";
                        country = "Somalia";
                        countryCode = "CL";
                        postalCode = "49321";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2023-11-24T00:12:57.019Z");
                    id = "<id>";
                    legalName = "<value>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-01-24T14:39:44.271Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateHrisCompanyResponse res = sdk.hris.updateHrisCompany(req);

            if (res.hrisCompany != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdateHrisCompanyRequest](../../models/operations/UpdateHrisCompanyRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateHrisCompanyResponse](../../models/operations/UpdateHrisCompanyResponse.md)**


## updateHrisEmployee

Update an employee

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeResponse;
import com.unifiedapi.unifiedto.models.shared.EmploymentStatus;
import com.unifiedapi.unifiedto.models.shared.HrisCompensation;
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.MaritalStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeEmployeeRoles;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

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
                    bio = "<value>";
                    companyId = "<value>";
                    compensation = new com.unifiedapi.unifiedto.models.shared.HrisCompensation[]{{
                        add(new HrisCompensation(
                        ){{}}),
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
                    employeeRoles = new com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeEmployeeRoles[]{{
                        add(PropertyHrisEmployeeEmployeeRoles.ADMIN),
                    }};
                    employmentStatus = EmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.CONTRACTOR;
                    gender = HrisEmployeeGender.TRANS;
                    hiredAt = OffsetDateTime.parse("2023-05-31T18:44:44.765Z");
                    id = "<id>";
                    imageUrl = "<value>";
                    languageLocale = "<value>";
                    location = "<value>";
                    managerId = "<value>";
                    maritalStatus = MaritalStatus.MARRIED;
                    name = "<value>";
                    pronouns = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    salutation = "<value>";
                    ssnSin = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2023-12-23T19:07:50.425Z");
                    timezone = "Asia/Yakutsk";
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2022-03-08T08:58:17.351Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeResponse res = sdk.hris.updateHrisEmployee(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupRequest req = new UpdateHrisGroupRequest(
                "<value>",
                "<value>"){{
                hrisGroup = new HrisGroup(
){{
                    companyId = "<value>";
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

            com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupResponse res = sdk.hris.updateHrisGroup(req);

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

