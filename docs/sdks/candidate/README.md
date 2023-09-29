# Candidate
(*candidate*)

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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Shirt") {{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdCandidateIdRequest req = new DeleteAtsConnectionIdCandidateIdRequest("Central", "transmitting");            

            DeleteAtsConnectionIdCandidateIdResponse res = sdk.candidate.deleteAtsConnectionIdCandidateId(req);

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
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdRequest](../../models/operations/DeleteAtsConnectionIdCandidateIdRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Executive") {{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdCandidateRequest req = new GetAtsConnectionIdCandidateRequest("optical") {{
                limit = 3001.75d;
                offset = 251d;
                order = "Oriental whether";
                query = "Kroon";
                sort = "content huzzah thistle";
                updatedGte = OffsetDateTime.parse("2022-03-13T15:14:03.645Z");
            }};            

            GetAtsConnectionIdCandidateResponse res = sdk.candidate.getAtsConnectionIdCandidate(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateRequest](../../models/operations/GetAtsConnectionIdCandidateRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("itaque") {{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdCandidateIdRequest req = new GetAtsConnectionIdCandidateIdRequest("female", "olive");            

            GetAtsConnectionIdCandidateIdResponse res = sdk.candidate.getAtsConnectionIdCandidateId(req);

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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdRequest](../../models/operations/GetAtsConnectionIdCandidateIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Hybrid") {{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdCandidateIdRequest req = new PatchAtsConnectionIdCandidateIdRequest("Northeast", "incidunt") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "utilisation female";
                        address2 = "Optimization Unbranded";
                        city = "Gabrielletown";
                        country = "American Samoa";
                        countryCode = "ML";
                        postalCode = "75348";
                        region = "katal up";
                        regionCode = "Senger Electric Direct";
                    }};;
                    companyName = "Moen - Gerlach";
                    createdAt = OffsetDateTime.parse("2022-11-23T18:06:40.151Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("Southwest") {{
                            email = "Carroll65@hotmail.com";
                            type = AtsEmailType.HOME;
                        }}),
                    }};
                    externalId = "phew qua";
                    id = "<ID>";
                    imageUrl = "Hybrid";
                    name = "ornery whether";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("Cadillac"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("Belarus") {{
                            telephone = "Marketing Cotton";
                            type = AtsTelephoneType.HOME;
                        }}),
                    }};
                    title = "wad";
                    updatedAt = OffsetDateTime.parse("2022-06-30T03:38:25.993Z");
                }};;
            }};            

            PatchAtsConnectionIdCandidateIdResponse res = sdk.candidate.patchAtsConnectionIdCandidateId(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdRequest](../../models/operations/PatchAtsConnectionIdCandidateIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Elegant") {{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdCandidateRequest req = new PostAtsConnectionIdCandidateRequest("iste") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "than";
                        address2 = "Wooden siemens Wooden";
                        city = "Lavonneview";
                        country = "Croatia";
                        countryCode = "FJ";
                        postalCode = "02355";
                        region = "Unbranded Architect";
                        regionCode = "incidunt so candela";
                    }};;
                    companyName = "Strosin, Grimes and Rogahn";
                    createdAt = OffsetDateTime.parse("2023-09-26T23:27:03.284Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("though") {{
                            email = "Ima.Johns@yahoo.com";
                            type = AtsEmailType.HOME;
                        }}),
                    }};
                    externalId = "Pants";
                    id = "<ID>";
                    imageUrl = "Raleigh";
                    name = "Sausages";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("opulent"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("Sleek") {{
                            telephone = "Hip";
                            type = AtsTelephoneType.WORK;
                        }}),
                    }};
                    title = "Ngultrum";
                    updatedAt = OffsetDateTime.parse("2021-07-10T22:22:03.940Z");
                }};;
            }};            

            PostAtsConnectionIdCandidateResponse res = sdk.candidate.postAtsConnectionIdCandidate(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateRequest](../../models/operations/PostAtsConnectionIdCandidateRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("East") {{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdCandidateIdRequest req = new PutAtsConnectionIdCandidateIdRequest("Northwest", "Specialist") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "interface compress";
                        address2 = "nicely Personal";
                        city = "New Vicenteshire";
                        country = "Algeria";
                        countryCode = "VN";
                        postalCode = "52769";
                        region = "Account person";
                        regionCode = "redundant";
                    }};;
                    companyName = "Barton - Kautzer";
                    createdAt = OffsetDateTime.parse("2022-03-27T16:22:41.297Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("Concrete") {{
                            email = "Allison.Jakubowski@yahoo.com";
                            type = AtsEmailType.HOME;
                        }}),
                    }};
                    externalId = "RSS Triathlon/Time";
                    id = "<ID>";
                    imageUrl = "Savings program collaborative";
                    name = "Pangender";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("until"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("than") {{
                            telephone = "Industrial Isle";
                            type = AtsTelephoneType.FAX;
                        }}),
                    }};
                    title = "West Ann Guinea";
                    updatedAt = OffsetDateTime.parse("2022-07-24T20:27:07.015Z");
                }};;
            }};            

            PutAtsConnectionIdCandidateIdResponse res = sdk.candidate.putAtsConnectionIdCandidateId(req);

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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdRequest](../../models/operations/PutAtsConnectionIdCandidateIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdResponse](../../models/operations/PutAtsConnectionIdCandidateIdResponse.md)**

