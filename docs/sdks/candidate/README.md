# Candidate
(*candidate*)

### Available Operations

* [createAtsCandidate](#createatscandidate) - Create a candidate
* [getAtsCandidate](#getatscandidate) - Retrieve a candidate
* [listAtsCandidates](#listatscandidates) - List all candidates
* [patchAtsCandidate](#patchatscandidate) - Update a candidate
* [removeAtsCandidate](#removeatscandidate) - Remove a candidate
* [updateAtsCandidate](#updateatscandidate) - Update a candidate

## createAtsCandidate

Create a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest req = new CreateAtsCandidateRequest(
                "<value>"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "South Hill";
                        country = "Denmark";
                        countryCode = "KM";
                        postalCode = "72991-5163";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "Pollich - Lubowitz";
                    createdAt = OffsetDateTime.parse("2022-03-06T00:47:39.352Z");
                    dateOfBirth = OffsetDateTime.parse("2023-11-19T09:25:00.753Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "<value>"){{
                            email = "Mallory99@hotmail.com";
                        }}),
                    }};
                    externalId = "<value>";
                    id = "<id>";
                    imageUrl = "<value>";
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    origin = Origin.AGENCY;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    sources = new String[]{{
                        add("<value>"),
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2022-09-27T06:32:21.998Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse res = sdk.candidate.createAtsCandidate(req, new CreateAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest](../../models/operations/CreateAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateSecurity](../../models/operations/CreateAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse](../../models/operations/CreateAtsCandidateResponse.md)**


## getAtsCandidate

Retrieve a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsCandidateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest req = new GetAtsCandidateRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse res = sdk.candidate.getAtsCandidate(req, new GetAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest](../../models/operations/GetAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetAtsCandidateSecurity](../../models/operations/GetAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse](../../models/operations/GetAtsCandidateResponse.md)**


## listAtsCandidates

List all candidates

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest req = new ListAtsCandidatesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 6384.09d;
                offset = 7452.94d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-03-18T00:58:25.541Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse res = sdk.candidate.listAtsCandidates(req, new ListAtsCandidatesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest](../../models/operations/ListAtsCandidatesRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesSecurity](../../models/operations/ListAtsCandidatesSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse](../../models/operations/ListAtsCandidatesResponse.md)**


## patchAtsCandidate

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest req = new PatchAtsCandidateRequest(
                "<value>",
                "<value>"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Fort Bridget";
                        country = "Sri Lanka";
                        countryCode = "GI";
                        postalCode = "46054";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "Donnelly - Bartell";
                    createdAt = OffsetDateTime.parse("2024-01-07T04:20:35.612Z");
                    dateOfBirth = OffsetDateTime.parse("2023-10-20T03:10:26.424Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "<value>"){{
                            email = "Roslyn.Bergnaum@gmail.com";
                        }}),
                    }};
                    externalId = "<value>";
                    id = "<id>";
                    imageUrl = "<value>";
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    origin = Origin.UNIVERSITY;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    sources = new String[]{{
                        add("<value>"),
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-05-16T04:49:59.355Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse res = sdk.candidate.patchAtsCandidate(req, new PatchAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest](../../models/operations/PatchAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateSecurity](../../models/operations/PatchAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse](../../models/operations/PatchAtsCandidateResponse.md)**


## removeAtsCandidate

Remove a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest req = new RemoveAtsCandidateRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse res = sdk.candidate.removeAtsCandidate(req, new RemoveAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest](../../models/operations/RemoveAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateSecurity](../../models/operations/RemoveAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse](../../models/operations/RemoveAtsCandidateResponse.md)**


## updateAtsCandidate

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest req = new UpdateAtsCandidateRequest(
                "<value>",
                "<value>"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Hintzborough";
                        country = "Afghanistan";
                        countryCode = "TF";
                        postalCode = "39423";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "O'Reilly Inc";
                    createdAt = OffsetDateTime.parse("2023-08-31T03:55:05.691Z");
                    dateOfBirth = OffsetDateTime.parse("2023-12-18T17:01:22.026Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "<value>"){{
                            email = "Mose_Cremin@gmail.com";
                        }}),
                    }};
                    externalId = "<value>";
                    id = "<id>";
                    imageUrl = "<value>";
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    origin = Origin.SOURCED;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    sources = new String[]{{
                        add("<value>"),
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2022-10-06T11:04:23.402Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse res = sdk.candidate.updateAtsCandidate(req, new UpdateAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest](../../models/operations/UpdateAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateSecurity](../../models/operations/UpdateAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse](../../models/operations/UpdateAtsCandidateResponse.md)**

