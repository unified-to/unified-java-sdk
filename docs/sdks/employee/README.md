# Employee
(*employee*)

### Available Operations

* [deleteHrisConnectionIdEmployeeId](#deletehrisconnectionidemployeeid) - Remove an employee
* [getHrisConnectionIdEmployee](#gethrisconnectionidemployee) - List all employees
* [getHrisConnectionIdEmployeeId](#gethrisconnectionidemployeeid) - Retrieve an employee
* [patchHrisConnectionIdEmployeeId](#patchhrisconnectionidemployeeid) - Update an employee
* [postHrisConnectionIdEmployee](#posthrisconnectionidemployee) - Create an employee
* [putHrisConnectionIdEmployeeId](#puthrisconnectionidemployeeid) - Update an employee

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
                .setSecurity(new Security("Cargo"){{
                    jwt = "";
                }})
                .build();

            DeleteHrisConnectionIdEmployeeIdRequest req = new DeleteHrisConnectionIdEmployeeIdRequest("turquoise", "port");            

            DeleteHrisConnectionIdEmployeeIdResponse res = sdk.employee.deleteHrisConnectionIdEmployeeId(req);

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
                .setSecurity(new Security("glittering"){{
                    jwt = "";
                }})
                .build();

            GetHrisConnectionIdEmployeeRequest req = new GetHrisConnectionIdEmployeeRequest("cyan"){{
                limit = 3071.3d;
                offset = 3821.57d;
                order = "olive reinvent Aston";
                query = "logistical methodology blue";
                sort = "BMW";
                updatedGte = OffsetDateTime.parse("2023-08-16T09:49:18.256Z");
            }};            

            GetHrisConnectionIdEmployeeResponse res = sdk.employee.getHrisConnectionIdEmployee(req);

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
                .setSecurity(new Security("for"){{
                    jwt = "";
                }})
                .build();

            GetHrisConnectionIdEmployeeIdRequest req = new GetHrisConnectionIdEmployeeIdRequest("Flat", "relationships");            

            GetHrisConnectionIdEmployeeIdResponse res = sdk.employee.getHrisConnectionIdEmployeeId(req);

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
                .setSecurity(new Security("male"){{
                    jwt = "";
                }})
                .build();

            PatchHrisConnectionIdEmployeeIdRequest req = new PatchHrisConnectionIdEmployeeIdRequest("virtual", "focus"){{
                hrisEmployee = new HrisEmployee(){{
                    address = new PropertyHrisEmployeeAddress(){{
                        address1 = "female Upgradable";
                        address2 = "Cambridgeshire";
                        city = "Fort Everett";
                        country = "Nepal";
                        countryCode = "GI";
                        postalCode = "11502";
                        region = "Denar";
                        regionCode = "Oregon Engineer";
                    }};
                    createdAt = OffsetDateTime.parse("2023-10-29T05:35:50.072Z");
                    dateOfBirth = OffsetDateTime.parse("2023-08-06T11:11:44.158Z");
                    department = "web Robust onto";
                    division = "loudly";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("monitor"){{
                            email = "Korbin.Quigley63@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "hydrate indigo transmit";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.FULL_TIME;
                    gender = HrisEmployeeGender.INTERSEX;
                    hiredAt = OffsetDateTime.parse("2021-07-20T11:37:42.486Z");
                    id = "<ID>";
                    location = "withdrawal wonderfully";
                    managerId = "molestias white Gainesville";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "tensely technologies";
                    raw = new PropertyHrisEmployeeRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("Sedan"){{
                            telephone = "Northeast Music Hassium";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2023-10-17T18:58:49.012Z");
                    title = "deposit eavesdrop purple";
                    updatedAt = OffsetDateTime.parse("2022-11-14T10:34:20.270Z");
                }};
            }};            

            PatchHrisConnectionIdEmployeeIdResponse res = sdk.employee.patchHrisConnectionIdEmployeeId(req);

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
                .setSecurity(new Security("Diesel"){{
                    jwt = "";
                }})
                .build();

            PostHrisConnectionIdEmployeeRequest req = new PostHrisConnectionIdEmployeeRequest("Erbium"){{
                hrisEmployee = new HrisEmployee(){{
                    address = new PropertyHrisEmployeeAddress(){{
                        address1 = "withdrawal male";
                        address2 = "yellow righteously";
                        city = "Port Lula";
                        country = "Saudi Arabia";
                        countryCode = "SL";
                        postalCode = "34772";
                        region = "Kyat";
                        regionCode = "silver Licensed";
                    }};
                    createdAt = OffsetDateTime.parse("2022-09-25T20:39:21.870Z");
                    dateOfBirth = OffsetDateTime.parse("2022-04-06T20:53:56.362Z");
                    department = "payment mull";
                    division = "Blues red";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("Fantastic"){{
                            email = "Jacquelyn8@hotmail.com";
                        }}),
                    }};
                    employeeNumber = "lumbering Bulgarian";
                    employmentStatus = HrisEmployeeEmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.INTERN;
                    gender = HrisEmployeeGender.MALE;
                    hiredAt = OffsetDateTime.parse("2023-06-26T04:20:32.892Z");
                    id = "<ID>";
                    location = "connect Xenogender";
                    managerId = "platforms hmph";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "Classical Market";
                    raw = new PropertyHrisEmployeeRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("Agent"){{
                            telephone = "Vietnam male";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2021-06-03T01:35:30.577Z");
                    title = "Concrete unlike Officer";
                    updatedAt = OffsetDateTime.parse("2021-12-19T23:49:44.425Z");
                }};
            }};            

            PostHrisConnectionIdEmployeeResponse res = sdk.employee.postHrisConnectionIdEmployee(req);

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
                .setSecurity(new Security("Northeast"){{
                    jwt = "";
                }})
                .build();

            PutHrisConnectionIdEmployeeIdRequest req = new PutHrisConnectionIdEmployeeIdRequest("Fresh", "singular"){{
                hrisEmployee = new HrisEmployee(){{
                    address = new PropertyHrisEmployeeAddress(){{
                        address1 = "East deposit Internal";
                        address2 = "Somoni";
                        city = "East Anikaville";
                        country = "Isle of Man";
                        countryCode = "UY";
                        postalCode = "07843-0940";
                        region = "volt";
                        regionCode = "saepe";
                    }};
                    createdAt = OffsetDateTime.parse("2022-10-28T22:40:08.423Z");
                    dateOfBirth = OffsetDateTime.parse("2022-11-03T23:19:59.295Z");
                    department = "now Cheese";
                    division = "Berkshire Metal";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("primary"){{
                            email = "Lambert41@yahoo.com";
                        }}),
                    }};
                    employeeNumber = "Tokelau";
                    employmentStatus = HrisEmployeeEmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.VOLUNTEER;
                    gender = HrisEmployeeGender.FEMALE;
                    hiredAt = OffsetDateTime.parse("2022-08-21T14:57:31.067Z");
                    id = "<ID>";
                    location = "Dollar East";
                    managerId = "deposit withdrawal";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "Analyst Card modern";
                    raw = new PropertyHrisEmployeeRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("Southwest"){{
                            telephone = "Tennessine hack blushing";
                        }}),
                    }};
                    terminatedAt = OffsetDateTime.parse("2021-07-04T13:15:32.676Z");
                    title = "onto reboot BMW";
                    updatedAt = OffsetDateTime.parse("2023-05-24T20:02:32.617Z");
                }};
            }};            

            PutHrisConnectionIdEmployeeIdResponse res = sdk.employee.putHrisConnectionIdEmployeeId(req);

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

