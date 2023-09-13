# employee

### Available Operations

* [deleteHrisConnectionIdEmployeeId](#deletehrisconnectionidemployeeid) - Remove a Employee
* [getHrisConnectionIdEmployee](#gethrisconnectionidemployee) - List all Employees
* [getHrisConnectionIdEmployeeId](#gethrisconnectionidemployeeid) - Retrieve a Employee
* [patchHrisConnectionIdEmployeeId](#patchhrisconnectionidemployeeid) - Update a Employee
* [postHrisConnectionIdEmployee](#posthrisconnectionidemployee) - Create a Employee
* [putHrisConnectionIdEmployeeId](#puthrisconnectionidemployeeid) - Update a Employee

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

            DeleteHrisConnectionIdEmployeeIdRequest req = new DeleteHrisConnectionIdEmployeeIdRequest("necessitatibus", "voluptatem");            

            DeleteHrisConnectionIdEmployeeIdResponse res = sdk.employee.deleteHrisConnectionIdEmployeeId(req, new DeleteHrisConnectionIdEmployeeIdSecurity("maiores") {{
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

            GetHrisConnectionIdEmployeeRequest req = new GetHrisConnectionIdEmployeeRequest("odio") {{
                limit = 3324.29d;
                offset = 6831.92d;
                order = "itaque";
                query = "possimus";
                sort = "tenetur";
                updatedGte = LocalDate.parse("2022-05-09");
            }};            

            GetHrisConnectionIdEmployeeResponse res = sdk.employee.getHrisConnectionIdEmployee(req, new GetHrisConnectionIdEmployeeSecurity("eligendi") {{
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

            GetHrisConnectionIdEmployeeIdRequest req = new GetHrisConnectionIdEmployeeIdRequest("id", "distinctio");            

            GetHrisConnectionIdEmployeeIdResponse res = sdk.employee.getHrisConnectionIdEmployeeId(req, new GetHrisConnectionIdEmployeeIdSecurity("corporis") {{
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

            PatchHrisConnectionIdEmployeeIdRequest req = new PatchHrisConnectionIdEmployeeIdRequest("quas", "soluta") {{
                hrisEmployee = new HrisEmployee() {{
                    address = new PropertyHrisEmployeeAddress() {{
                        address1 = "cupiditate";
                        address2 = "unde";
                        city = "Port Layneville";
                        country = "Holy See (Vatican City State)";
                        countryCode = "SL";
                        postalCode = "73552-4084";
                        region = "numquam";
                        regionCode = "fugit";
                    }};;
                    createdAt = LocalDate.parse("2022-03-28");
                    dateOfBirth = LocalDate.parse("2021-02-25");
                    department = "commodi";
                    division = "possimus";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("vero") {{
                            email = "Ervin95@yahoo.com";
                            type = HrisEmailType.WORK;
                        }}),
                    }};
                    employeeNumber = "id";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.PART_TIME;
                    gender = HrisEmployeeGender.MALE;
                    hiredAt = LocalDate.parse("2022-03-31");
                    id = "9f7ac2f7-2f88-4500-9049-11608207888e";
                    location = "minus";
                    managerId = "autem";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "Olga Feeney";
                    raw = new PropertyHrisEmployeeRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("suscipit") {{
                            telephone = "necessitatibus";
                            type = HrisTelephoneType.OTHER;
                        }}),
                    }};
                    terminatedAt = LocalDate.parse("2022-05-26");
                    title = "Dr.";
                    updatedAt = LocalDate.parse("2022-05-26");
                }};;
            }};            

            PatchHrisConnectionIdEmployeeIdResponse res = sdk.employee.patchHrisConnectionIdEmployeeId(req, new PatchHrisConnectionIdEmployeeIdSecurity("doloremque") {{
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

            PostHrisConnectionIdEmployeeRequest req = new PostHrisConnectionIdEmployeeRequest("accusamus") {{
                hrisEmployee = new HrisEmployee() {{
                    address = new PropertyHrisEmployeeAddress() {{
                        address1 = "quod";
                        address2 = "sunt";
                        city = "Fort Marco";
                        country = "United Arab Emirates";
                        countryCode = "KI";
                        postalCode = "70731";
                        region = "eos";
                        regionCode = "id";
                    }};;
                    createdAt = LocalDate.parse("2022-02-24");
                    dateOfBirth = LocalDate.parse("2022-07-13");
                    department = "reprehenderit";
                    division = "eligendi";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("quia") {{
                            email = "Lorenz.Nienow26@hotmail.com";
                            type = HrisEmailType.WORK;
                        }}),
                    }};
                    employeeNumber = "quod";
                    employmentStatus = HrisEmployeeEmploymentStatus.ACTIVE;
                    employmentType = HrisEmployeeEmploymentType.VOLUNTEER;
                    gender = HrisEmployeeGender.FEMALE;
                    hiredAt = LocalDate.parse("2022-03-30");
                    id = "9b2ad32d-afe8-41a8-8f44-44573fecd473";
                    location = "nemo";
                    managerId = "nesciunt";
                    maritalStatus = HrisEmployeeMaritalStatus.SINGLE;
                    name = "Rosa Schowalter";
                    raw = new PropertyHrisEmployeeRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("ratione") {{
                            telephone = "eaque";
                            type = HrisTelephoneType.FAX;
                        }}),
                    }};
                    terminatedAt = LocalDate.parse("2022-05-25");
                    title = "Miss";
                    updatedAt = LocalDate.parse("2022-03-12");
                }};;
            }};            

            PostHrisConnectionIdEmployeeResponse res = sdk.employee.postHrisConnectionIdEmployee(req, new PostHrisConnectionIdEmployeeSecurity("occaecati") {{
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

            PutHrisConnectionIdEmployeeIdRequest req = new PutHrisConnectionIdEmployeeIdRequest("optio", "at") {{
                hrisEmployee = new HrisEmployee() {{
                    address = new PropertyHrisEmployeeAddress() {{
                        address1 = "ad";
                        address2 = "asperiores";
                        city = "Runolfsdottirworth";
                        country = "Democratic People's Republic of Korea";
                        countryCode = "ML";
                        postalCode = "61564-5116";
                        region = "voluptatibus";
                        regionCode = "omnis";
                    }};;
                    createdAt = LocalDate.parse("2022-06-13");
                    dateOfBirth = LocalDate.parse("2022-05-22");
                    department = "vero";
                    division = "nisi";
                    emails = new com.unifiedapi.unifiedto.models.shared.HrisEmail[]{{
                        add(new HrisEmail("ullam") {{
                            email = "Horace_Buckridge@yahoo.com";
                            type = HrisEmailType.OTHER;
                        }}),
                    }};
                    employeeNumber = "quaerat";
                    employmentStatus = HrisEmployeeEmploymentStatus.INACTIVE;
                    employmentType = HrisEmployeeEmploymentType.CASUAL;
                    gender = HrisEmployeeGender.NON_BINARY;
                    hiredAt = LocalDate.parse("2022-02-23");
                    id = "751c9fe8-f750-42bf-9c34-50841f176445";
                    location = "ex";
                    managerId = "amet";
                    maritalStatus = HrisEmployeeMaritalStatus.MARRIED;
                    name = "Jan Emmerich";
                    raw = new PropertyHrisEmployeeRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.HrisTelephone[]{{
                        add(new HrisTelephone("accusamus") {{
                            telephone = "odit";
                            type = HrisTelephoneType.OTHER;
                        }}),
                    }};
                    terminatedAt = LocalDate.parse("2022-12-02");
                    title = "Dr.";
                    updatedAt = LocalDate.parse("2022-03-16");
                }};;
            }};            

            PutHrisConnectionIdEmployeeIdResponse res = sdk.employee.putHrisConnectionIdEmployeeId(req, new PutHrisConnectionIdEmployeeIdSecurity("consequuntur") {{
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

