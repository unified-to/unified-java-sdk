# candidate

### Available Operations

* [deleteAtsConnectionIdCandidateId](#deleteatsconnectionidcandidateid) - Remove a candidate
* [getAtsConnectionIdCandidate](#getatsconnectionidcandidate) - List all candidates
* [getAtsConnectionIdCandidateId](#getatsconnectionidcandidateid) - Retrieve a candidate
* [patchAtsConnectionIdCandidateId](#patchatsconnectionidcandidateid) - Update a candidate
* [postAtsConnectionIdCandidate](#postatsconnectionidcandidate) - Create a candidate
* [putAtsConnectionIdCandidateId](#putatsconnectionidcandidateid) - Update a candidate

## deleteAtsConnectionIdCandidateId

Remove a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdCandidateIdRequest req = new DeleteAtsConnectionIdCandidateIdRequest("aliquid", "perferendis");            

            DeleteAtsConnectionIdCandidateIdResponse res = sdk.candidate.deleteAtsConnectionIdCandidateId(req, new DeleteAtsConnectionIdCandidateIdSecurity("eum") {{
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
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdRequest](../../models/operations/DeleteAtsConnectionIdCandidateIdRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdSecurity](../../models/operations/DeleteAtsConnectionIdCandidateIdSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdResponse](../../models/operations/DeleteAtsConnectionIdCandidateIdResponse.md)**


## getAtsConnectionIdCandidate

List all candidates

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdCandidateRequest req = new GetAtsConnectionIdCandidateRequest("voluptas") {{
                limit = 6145.28d;
                offset = 6616.07d;
                order = "ab";
                query = "error";
                sort = "possimus";
                updatedGte = OffsetDateTime.parse("2021-01-15T12:05:30.894Z");
            }};            

            GetAtsConnectionIdCandidateResponse res = sdk.candidate.getAtsConnectionIdCandidate(req, new GetAtsConnectionIdCandidateSecurity("laborum") {{
                jwt = "";
            }});

            if (res.atsCandidates != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateRequest](../../models/operations/GetAtsConnectionIdCandidateRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateSecurity](../../models/operations/GetAtsConnectionIdCandidateSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateResponse](../../models/operations/GetAtsConnectionIdCandidateResponse.md)**


## getAtsConnectionIdCandidateId

Retrieve a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdCandidateIdRequest req = new GetAtsConnectionIdCandidateIdRequest("libero", "ad");            

            GetAtsConnectionIdCandidateIdResponse res = sdk.candidate.getAtsConnectionIdCandidateId(req, new GetAtsConnectionIdCandidateIdSecurity("deleniti") {{
                jwt = "";
            }});

            if (res.atsCandidate != null) {
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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdRequest](../../models/operations/GetAtsConnectionIdCandidateIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdSecurity](../../models/operations/GetAtsConnectionIdCandidateIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdResponse](../../models/operations/GetAtsConnectionIdCandidateIdResponse.md)**


## patchAtsConnectionIdCandidateId

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdCandidateIdRequest req = new PatchAtsConnectionIdCandidateIdRequest("enim", "vitae") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "repellendus";
                        address2 = "ex";
                        city = "Jakubowskiboro";
                        country = "Germany";
                        countryCode = "PK";
                        postalCode = "57315";
                        region = "omnis";
                        regionCode = "veritatis";
                    }};;
                    companyName = "rerum";
                    createdAt = OffsetDateTime.parse("2021-09-24T14:32:36.483Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("debitis") {{
                            email = "Vesta68@gmail.com";
                            type = AtsEmailType.OTHER;
                        }}),
                    }};
                    externalId = "voluptatem";
                    id = "08e6f8c5-f350-4d8c-9b5a-341814301042";
                    imageUrl = "ab";
                    name = "Eric Fadel";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("consequuntur"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("eveniet") {{
                            telephone = "ipsa";
                            type = AtsTelephoneType.OTHER;
                        }}),
                    }};
                    title = "Miss";
                    updatedAt = OffsetDateTime.parse("2021-08-19T05:33:23.931Z");
                }};;
            }};            

            PatchAtsConnectionIdCandidateIdResponse res = sdk.candidate.patchAtsConnectionIdCandidateId(req, new PatchAtsConnectionIdCandidateIdSecurity("necessitatibus") {{
                jwt = "";
            }});

            if (res.atsCandidate != null) {
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
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdRequest](../../models/operations/PatchAtsConnectionIdCandidateIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdSecurity](../../models/operations/PatchAtsConnectionIdCandidateIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdResponse](../../models/operations/PatchAtsConnectionIdCandidateIdResponse.md)**


## postAtsConnectionIdCandidate

Create a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdCandidateRequest req = new PostAtsConnectionIdCandidateRequest("sed") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "veniam";
                        address2 = "nesciunt";
                        city = "Kemmerview";
                        country = "Madagascar";
                        countryCode = "GA";
                        postalCode = "07473";
                        region = "recusandae";
                        regionCode = "consequuntur";
                    }};;
                    companyName = "voluptatem";
                    createdAt = OffsetDateTime.parse("2022-02-08T01:44:39.255Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("doloribus") {{
                            email = "Gladys_Swaniawski69@gmail.com";
                            type = AtsEmailType.WORK;
                        }}),
                    }};
                    externalId = "repudiandae";
                    id = "c9578a64-5842-473a-8418-d162309fb092";
                    imageUrl = "occaecati";
                    name = "Ernest Bode";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("voluptatibus"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("delectus") {{
                            telephone = "distinctio";
                            type = AtsTelephoneType.FAX;
                        }}),
                    }};
                    title = "Mrs.";
                    updatedAt = OffsetDateTime.parse("2021-05-25T00:50:01.296Z");
                }};;
            }};            

            PostAtsConnectionIdCandidateResponse res = sdk.candidate.postAtsConnectionIdCandidate(req, new PostAtsConnectionIdCandidateSecurity("magnam") {{
                jwt = "";
            }});

            if (res.atsCandidate != null) {
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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateRequest](../../models/operations/PostAtsConnectionIdCandidateRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateSecurity](../../models/operations/PostAtsConnectionIdCandidateSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateResponse](../../models/operations/PostAtsConnectionIdCandidateResponse.md)**


## putAtsConnectionIdCandidateId

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdCandidateIdRequest req = new PutAtsConnectionIdCandidateIdRequest("temporibus", "quos") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "commodi";
                        address2 = "itaque";
                        city = "Jovanshire";
                        country = "Estonia";
                        countryCode = "PM";
                        postalCode = "03400-2935";
                        region = "nulla";
                        regionCode = "deserunt";
                    }};;
                    companyName = "esse";
                    createdAt = OffsetDateTime.parse("2022-07-22T17:24:54.812Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("asperiores") {{
                            email = "Ethan_Marquardt94@hotmail.com";
                            type = AtsEmailType.OTHER;
                        }}),
                    }};
                    externalId = "ex";
                    id = "6ef1caa3-383c-42be-b477-373c8d72f64d";
                    imageUrl = "inventore";
                    name = "Wm Brakus";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("porro"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("illo") {{
                            telephone = "aliquam";
                            type = AtsTelephoneType.HOME;
                        }}),
                    }};
                    title = "Mr.";
                    updatedAt = OffsetDateTime.parse("2022-08-05T11:21:49.286Z");
                }};;
            }};            

            PutAtsConnectionIdCandidateIdResponse res = sdk.candidate.putAtsConnectionIdCandidateId(req, new PutAtsConnectionIdCandidateIdSecurity("beatae") {{
                jwt = "";
            }});

            if (res.atsCandidate != null) {
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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdRequest](../../models/operations/PutAtsConnectionIdCandidateIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdSecurity](../../models/operations/PutAtsConnectionIdCandidateIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdResponse](../../models/operations/PutAtsConnectionIdCandidateIdResponse.md)**

