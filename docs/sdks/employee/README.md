# Employee
(*employee*)

### Available Operations

* [createHrisEmployee](#createhrisemployee) - Create an employee
* [getHrisEmployee](#gethrisemployee) - Retrieve an employee
* [listHrisEmployees](#listhrisemployees) - List all employees
* [patchHrisEmployee](#patchhrisemployee) - Update an employee
* [removeHrisEmployee](#removehrisemployee) - Remove an employee
* [updateHrisEmployee](#updatehrisemployee) - Update an employee

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

            com.unifiedapi.unifiedto.models.operations.CreateHrisEmployeeResponse res = sdk.employee.createHrisEmployee(req);

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

            com.unifiedapi.unifiedto.models.operations.GetHrisEmployeeResponse res = sdk.employee.getHrisEmployee(req);

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

            com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesResponse res = sdk.employee.listHrisEmployees(req);

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

            com.unifiedapi.unifiedto.models.operations.PatchHrisEmployeeResponse res = sdk.employee.patchHrisEmployee(req);

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

            com.unifiedapi.unifiedto.models.operations.RemoveHrisEmployeeResponse res = sdk.employee.removeHrisEmployee(req);

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

            com.unifiedapi.unifiedto.models.operations.UpdateHrisEmployeeResponse res = sdk.employee.updateHrisEmployee(req);

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

