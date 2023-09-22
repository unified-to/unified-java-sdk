# Candidate

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
                .setSecurity(new Security("voluptates") {{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdCandidateIdRequest req = new DeleteAtsConnectionIdCandidateIdRequest("mollitia", "laborum");            

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
                .setSecurity(new Security("libero") {{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdCandidateRequest req = new GetAtsConnectionIdCandidateRequest("ad") {{
                limit = 5369.23d;
                offset = 3162.2d;
                order = "vitae";
                query = "repellendus";
                sort = "ex";
                updatedGte = OffsetDateTime.parse("2021-10-14T02:46:55.259Z");
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
                .setSecurity(new Security("ut") {{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdCandidateIdRequest req = new GetAtsConnectionIdCandidateIdRequest("ad", "expedita");            

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
                .setSecurity(new Security("voluptatem") {{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdCandidateIdRequest req = new PatchAtsConnectionIdCandidateIdRequest("molestias", "cum") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "aliquid";
                        address2 = "beatae";
                        city = "Lemuelton";
                        country = "Philippines";
                        countryCode = "NL";
                        postalCode = "09816-8800";
                        region = "deleniti";
                        regionCode = "earum";
                    }};;
                    companyName = "ex";
                    createdAt = OffsetDateTime.parse("2021-06-06T00:26:53.355Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("illum") {{
                            email = "Freda35@hotmail.com";
                            type = AtsEmailType.WORK;
                        }}),
                    }};
                    externalId = "totam";
                    id = "cdb5a341-8143-4010-8218-13d5208ece7e";
                    imageUrl = "sed";
                    name = "Robin Ratke";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("voluptatum"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("ab") {{
                            telephone = "magnam";
                            type = AtsTelephoneType.HOME;
                        }}),
                    }};
                    title = "Miss";
                    updatedAt = OffsetDateTime.parse("2022-04-01T21:03:01.050Z");
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
                .setSecurity(new Security("laboriosam") {{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdCandidateRequest req = new PostAtsConnectionIdCandidateRequest("recusandae") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "consequuntur";
                        address2 = "voluptatem";
                        city = "Fort Austin";
                        country = "Hong Kong";
                        countryCode = "TG";
                        postalCode = "66199-7534";
                        region = "blanditiis";
                        regionCode = "officia";
                    }};;
                    companyName = "voluptas";
                    createdAt = OffsetDateTime.parse("2022-08-20T19:22:19.746Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("laudantium") {{
                            email = "Devin.Cole@yahoo.com";
                            type = AtsEmailType.OTHER;
                        }}),
                    }};
                    externalId = "incidunt";
                    id = "18d16230-9fb0-4929-921a-efb9f58c4d86";
                    imageUrl = "itaque";
                    name = "Deanna Wehner";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("vero"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("vel") {{
                            telephone = "voluptatem";
                            type = AtsTelephoneType.HOME;
                        }}),
                    }};
                    title = "Mr.";
                    updatedAt = OffsetDateTime.parse("2022-10-02T14:16:44.513Z");
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
                .setSecurity(new Security("maiores") {{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdCandidateIdRequest req = new PutAtsConnectionIdCandidateIdRequest("enim", "sint") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "nulla";
                        address2 = "deserunt";
                        city = "Franzport";
                        country = "Norway";
                        countryCode = "GL";
                        postalCode = "87999-4389";
                        region = "quae";
                        regionCode = "minus";
                    }};;
                    companyName = "fuga";
                    createdAt = OffsetDateTime.parse("2022-07-16T07:39:08.844Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("nam") {{
                            email = "Kallie.Emmerich74@gmail.com";
                            type = AtsEmailType.OTHER;
                        }}),
                    }};
                    externalId = "dolore";
                    id = "77373c8d-72f6-44d1-9b1f-2c4310661e96";
                    imageUrl = "velit";
                    name = "Miss Katrina Weber";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("iste"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("nisi") {{
                            telephone = "itaque";
                            type = AtsTelephoneType.WORK;
                        }}),
                    }};
                    title = "Dr.";
                    updatedAt = OffsetDateTime.parse("2022-04-30T01:11:05.137Z");
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

