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
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.MaritalStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeRaw;
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
                "string"){{
                hrisEmployee = new HrisEmployee(
){{
                    address = new PropertyHrisEmployeeAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Armstrongborough";
                        country = "Indonesia";
                        countryCode = "MO";
                        postalCode = "23995";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2023-10-07T18:03:23.931Z");
                    currency = "Tunisian Dinar";
                    dateOfBirth = OffsetDateTime.parse("2021-09-15T16:13:17.445Z");
                    department = "string";
                    division = "string";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail(
                        "string"){{
                            email = "Audrey.Wilkinson@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "string";
                    employmentStatus = EmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.OTHER;
                    gender = HrisEmployeeGender.MALE;
                    hiredAt = OffsetDateTime.parse("2022-04-01T13:27:50.152Z");
                    id = "<ID>";
                    imageUrl = "string";
                    languageLocale = "string";
                    location = "string";
                    managerId = "string";
                    maritalStatus = MaritalStatus.MARRIED;
                    name = "string";
                    raw = new PropertyHrisEmployeeRaw(
);
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2021-06-06T13:40:21.012Z");
                    timezone = "Australia/Melbourne";
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2022-02-26T07:00:32.887Z");

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
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
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
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 5148.12d;
                offset = 2185.43d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-04-09T14:44:59.888Z");

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
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.MaritalStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeRaw;
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
                "string",
                "string"){{
                hrisEmployee = new HrisEmployee(
){{
                    address = new PropertyHrisEmployeeAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Zettaland";
                        country = "Mexico";
                        countryCode = "DJ";
                        postalCode = "87892";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2022-07-12T10:27:03.270Z");
                    currency = "Venezuelan bolívar";
                    dateOfBirth = OffsetDateTime.parse("2023-05-04T09:04:41.512Z");
                    department = "string";
                    division = "string";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail(
                        "string"){{
                            email = "Bobby_Balistreri@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "string";
                    employmentStatus = EmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.SEASONAL;
                    gender = HrisEmployeeGender.INTERSEX;
                    hiredAt = OffsetDateTime.parse("2021-10-17T23:43:46.221Z");
                    id = "<ID>";
                    imageUrl = "string";
                    languageLocale = "string";
                    location = "string";
                    managerId = "string";
                    maritalStatus = MaritalStatus.SINGLE;
                    name = "string";
                    raw = new PropertyHrisEmployeeRaw(
);
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2023-03-20T00:58:31.370Z");
                    timezone = "Australia/Darwin";
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2023-05-06T23:32:48.401Z");

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
                "string",
                "string");

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
import com.unifiedapi.unifiedto.models.shared.HrisEmail;
import com.unifiedapi.unifiedto.models.shared.HrisEmailType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployee;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeEmploymentType;
import com.unifiedapi.unifiedto.models.shared.HrisEmployeeGender;
import com.unifiedapi.unifiedto.models.shared.HrisTelephone;
import com.unifiedapi.unifiedto.models.shared.HrisTelephoneType;
import com.unifiedapi.unifiedto.models.shared.MaritalStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyHrisEmployeeRaw;
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
                "string",
                "string"){{
                hrisEmployee = new HrisEmployee(
){{
                    address = new PropertyHrisEmployeeAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "North Alfurt";
                        country = "Thailand";
                        countryCode = "ST";
                        postalCode = "60601-3179";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2023-06-07T20:54:18.451Z");
                    currency = "Zimbabwe Dollar";
                    dateOfBirth = OffsetDateTime.parse("2023-05-04T04:51:18.540Z");
                    department = "string";
                    division = "string";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail(
                        "string"){{
                            email = "Larue_Schroeder65@gmail.com";
                        }}),
                    }};
                    employeeNumber = "string";
                    employmentStatus = EmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.CASUAL;
                    gender = HrisEmployeeGender.FEMALE;
                    hiredAt = OffsetDateTime.parse("2023-03-14T02:34:09.315Z");
                    id = "<ID>";
                    imageUrl = "string";
                    languageLocale = "string";
                    location = "string";
                    managerId = "string";
                    maritalStatus = MaritalStatus.MARRIED;
                    name = "string";
                    raw = new PropertyHrisEmployeeRaw(
);
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2022-01-07T17:08:48.397Z");
                    timezone = "Asia/Karachi";
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2023-07-23T03:17:52.660Z");

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

