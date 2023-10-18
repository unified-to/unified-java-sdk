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
                        address1 = "Country";
                        address2 = "Gloves";
                        city = "West Palm Beach";
                        country = "Micronesia";
                        countryCode = "UA";
                        postalCode = "24094-2191";
                        region = "Money";
                        regionCode = "Gasoline";
                    }};
                    createdAt = OffsetDateTime.parse("2021-01-23T22:14:37.407Z");
                    currency = "Iranian Rial";
                    dateOfBirth = OffsetDateTime.parse("2023-04-02T19:32:38.780Z");
                    department = "Kids";
                    division = "olive";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("architectures"){{
                            email = "Coleman_Ward68@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "East";
                    employmentStatus = HrisEmployeeEmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.CONSULTANT;
                    gender = HrisEmployeeGender.INTERSEX;
                    hiredAt = OffsetDateTime.parse("2023-10-31T19:48:31.910Z");
                    id = "<ID>";
                    imageUrl = "Gasoline";
                    languageLocale = "since";
                    location = "Dinar";
                    managerId = "Mills";
                    maritalStatus = HrisEmployeeMaritalStatus.SINGLE;
                    name = "adapter";
                    raw = new PropertyHrisEmployeeRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("barley"){{
                            telephone = "Fresh";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2023-07-07T05:34:19.805Z");
                    timezone = "Europe/Istanbul";
                    title = "advice";
                    updatedAt = OffsetDateTime.parse("2023-10-16T16:26:29.360Z");
                }};
            }};            

            CreateHrisEmployeeResponse res = sdk.employee.createHrisEmployee(req);

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
                .setSecurity(new Security("Louisiana"){{
                    jwt = "";
                }})
                .build();

            GetHrisEmployeeRequest req = new GetHrisEmployeeRequest("Afghanistan", "Minivan"){{
                fields = new String[]{{
                    add("hourly"),
                }};
            }};            

            GetHrisEmployeeResponse res = sdk.employee.getHrisEmployee(req);

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
                order = "Investment";
                query = "Cedi";
                sort = "Virginia";
                updatedGte = OffsetDateTime.parse("2021-05-31T02:19:19.239Z");
            }};            

            ListHrisEmployeesResponse res = sdk.employee.listHrisEmployees(req);

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
                        address1 = "farad";
                        address2 = "barring";
                        city = "Rudyfort";
                        country = "Luxembourg";
                        countryCode = "BR";
                        postalCode = "47875";
                        region = "Pizza";
                        regionCode = "Terbium";
                    }};
                    createdAt = OffsetDateTime.parse("2023-12-09T22:20:00.252Z");
                    currency = "Solomon Islands Dollar";
                    dateOfBirth = OffsetDateTime.parse("2023-11-10T12:24:25.939Z");
                    department = "stickybeak";
                    division = "Cis";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("white"){{
                            email = "Danyka.Lindgren@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "Benz";
                    employmentStatus = HrisEmployeeEmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.VOLUNTEER;
                    gender = HrisEmployeeGender.TRANS;
                    hiredAt = OffsetDateTime.parse("2021-05-03T17:00:57.006Z");
                    id = "<ID>";
                    imageUrl = "withdrawal";
                    languageLocale = "Intersex";
                    location = "Rice";
                    managerId = "North";
                    maritalStatus = HrisEmployeeMaritalStatus.SINGLE;
                    name = "Terbium";
                    raw = new PropertyHrisEmployeeRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("killer"){{
                            telephone = "Oriental";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2023-01-20T14:01:14.505Z");
                    timezone = "Europe/Minsk";
                    title = "tonight";
                    updatedAt = OffsetDateTime.parse("2021-04-24T07:59:40.422Z");
                }};
            }};            

            PatchHrisEmployeeResponse res = sdk.employee.patchHrisEmployee(req);

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
                .setSecurity(new Security("Chicken"){{
                    jwt = "";
                }})
                .build();

            RemoveHrisEmployeeRequest req = new RemoveHrisEmployeeRequest("TCP", "Northeast");            

            RemoveHrisEmployeeResponse res = sdk.employee.removeHrisEmployee(req);

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
                        address1 = "Web";
                        address2 = "Borders";
                        city = "North Filibertoberg";
                        country = "Saudi Arabia";
                        countryCode = "YT";
                        postalCode = "97158-8660";
                        region = "F2M";
                        regionCode = "Barium";
                    }};
                    createdAt = OffsetDateTime.parse("2022-01-07T17:08:48.397Z");
                    currency = "Guarani";
                    dateOfBirth = OffsetDateTime.parse("2023-07-23T03:17:52.660Z");
                    department = "Buckinghamshire";
                    division = "Jazz";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("unleash"){{
                            email = "Rafaela.Lakin77@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "whiteboard";
                    employmentStatus = HrisEmployeeEmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.INTERN;
                    gender = HrisEmployeeGender.INTERSEX;
                    hiredAt = OffsetDateTime.parse("2023-03-10T13:52:47.416Z");
                    id = "<ID>";
                    imageUrl = "beckon";
                    languageLocale = "connect";
                    location = "Interactions";
                    managerId = "Southeast";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "Maryland";
                    raw = new PropertyHrisEmployeeRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("hack"){{
                            telephone = "overriding";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2021-01-23T11:48:01.774Z");
                    timezone = "Europe/Bratislava";
                    title = "Generic";
                    updatedAt = OffsetDateTime.parse("2021-05-24T07:13:49.503Z");
                }};
            }};            

            UpdateHrisEmployeeResponse res = sdk.employee.updateHrisEmployee(req);

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

