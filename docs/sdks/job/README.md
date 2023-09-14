# job

### Available Operations

* [deleteAtsConnectionIdJobId](#deleteatsconnectionidjobid) - Remove a job
* [getAtsConnectionIdJob](#getatsconnectionidjob) - List all jobs
* [getAtsConnectionIdJobId](#getatsconnectionidjobid) - Retrieve a job
* [patchAtsConnectionIdJobId](#patchatsconnectionidjobid) - Update a job
* [postAtsConnectionIdJob](#postatsconnectionidjob) - Create a job
* [putAtsConnectionIdJobId](#putatsconnectionidjobid) - Update a job

## deleteAtsConnectionIdJobId

Remove a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdJobIdRequest req = new DeleteAtsConnectionIdJobIdRequest("tempora", "aspernatur");            

            DeleteAtsConnectionIdJobIdResponse res = sdk.job.deleteAtsConnectionIdJobId(req, new DeleteAtsConnectionIdJobIdSecurity("ad") {{
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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdRequest](../../models/operations/DeleteAtsConnectionIdJobIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdSecurity](../../models/operations/DeleteAtsConnectionIdJobIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdResponse](../../models/operations/DeleteAtsConnectionIdJobIdResponse.md)**


## getAtsConnectionIdJob

List all jobs

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdJobRequest req = new GetAtsConnectionIdJobRequest("incidunt") {{
                limit = 17.82d;
                offset = 2395.8d;
                order = "atque";
                query = "tempore";
                sort = "asperiores";
                updatedGte = OffsetDateTime.parse("2022-05-06T09:37:57.408Z");
            }};            

            GetAtsConnectionIdJobResponse res = sdk.job.getAtsConnectionIdJob(req, new GetAtsConnectionIdJobSecurity("cupiditate") {{
                jwt = "";
            }});

            if (res.atsJobs != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobRequest](../../models/operations/GetAtsConnectionIdJobRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobSecurity](../../models/operations/GetAtsConnectionIdJobSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobResponse](../../models/operations/GetAtsConnectionIdJobResponse.md)**


## getAtsConnectionIdJobId

Retrieve a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdJobIdRequest req = new GetAtsConnectionIdJobIdRequest("molestiae", "et");            

            GetAtsConnectionIdJobIdResponse res = sdk.job.getAtsConnectionIdJobId(req, new GetAtsConnectionIdJobIdSecurity("accusamus") {{
                jwt = "";
            }});

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdRequest](../../models/operations/GetAtsConnectionIdJobIdRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdSecurity](../../models/operations/GetAtsConnectionIdJobIdSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdResponse](../../models/operations/GetAtsConnectionIdJobIdResponse.md)**


## patchAtsConnectionIdJobId

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdJobIdRequest req = new PatchAtsConnectionIdJobIdRequest("excepturi", "deleniti") {{
                atsJob = new AtsJob() {{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress() {{
                            address1 = "inventore";
                            address2 = "perspiciatis";
                            city = "West Feltonport";
                            country = "Dominica";
                            countryCode = "LK";
                            postalCode = "79876-7498";
                            region = "culpa";
                            regionCode = "dolor";
                        }}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-04-19T12:44:04.907Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.EQUITY) {{
                            currency = "unde";
                            frequency = AtsCompensationFrequency.QUARTER;
                            max = 8658.06d;
                            min = 4269.42d;
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-01T09:31:54.610Z");
                    departments = new String[]{{
                        add("mollitia"),
                    }};
                    description = "officiis";
                    employmentType = AtsJobEmploymentType.INTERN;
                    hiringManagerIds = new String[]{{
                        add("quas"),
                    }};
                    id = "0632b995-4b6f-4a22-8636-9828553cb100";
                    languageLocale = "doloremque";
                    name = "Kelli Treutel";
                    publicJobUrls = new String[]{{
                        add("provident"),
                    }};
                    raw = new PropertyAtsJobRaw();;
                    recruiterIds = new String[]{{
                        add("dolores"),
                    }};
                    remote = false;
                    status = AtsJobStatus.ARCHIVED;
                    updatedAt = OffsetDateTime.parse("2020-08-10T19:52:55.197Z");
                }};;
            }};            

            PatchAtsConnectionIdJobIdResponse res = sdk.job.patchAtsConnectionIdJobId(req, new PatchAtsConnectionIdJobIdSecurity("magni") {{
                jwt = "";
            }});

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdRequest](../../models/operations/PatchAtsConnectionIdJobIdRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdSecurity](../../models/operations/PatchAtsConnectionIdJobIdSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdResponse](../../models/operations/PatchAtsConnectionIdJobIdResponse.md)**


## postAtsConnectionIdJob

Create a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobResponse;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdJobRequest req = new PostAtsConnectionIdJobRequest("sit") {{
                atsJob = new AtsJob() {{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress() {{
                            address1 = "voluptas";
                            address2 = "nesciunt";
                            city = "Krajcikboro";
                            country = "Morocco";
                            countryCode = "DJ";
                            postalCode = "36759";
                            region = "eveniet";
                            regionCode = "voluptatem";
                        }}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-07-04T04:57:29.459Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.STOCK_OPTIONS) {{
                            currency = "libero";
                            frequency = AtsCompensationFrequency.WEEK;
                            max = 871.69d;
                            min = 5927.91d;
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2021-05-17T02:42:52.909Z");
                    departments = new String[]{{
                        add("eius"),
                    }};
                    description = "doloremque";
                    employmentType = AtsJobEmploymentType.FREELANCE;
                    hiringManagerIds = new String[]{{
                        add("aut"),
                    }};
                    id = "3f3deba2-97be-43e9-8bc4-0df868fd5240";
                    languageLocale = "enim";
                    name = "Randolph Ernser PhD";
                    publicJobUrls = new String[]{{
                        add("numquam"),
                    }};
                    raw = new PropertyAtsJobRaw();;
                    recruiterIds = new String[]{{
                        add("provident"),
                    }};
                    remote = false;
                    status = AtsJobStatus.ARCHIVED;
                    updatedAt = OffsetDateTime.parse("2022-03-16T18:13:20.175Z");
                }};;
            }};            

            PostAtsConnectionIdJobResponse res = sdk.job.postAtsConnectionIdJob(req, new PostAtsConnectionIdJobSecurity("doloribus") {{
                jwt = "";
            }});

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobRequest](../../models/operations/PostAtsConnectionIdJobRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobSecurity](../../models/operations/PostAtsConnectionIdJobSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobResponse](../../models/operations/PostAtsConnectionIdJobResponse.md)**


## putAtsConnectionIdJobId

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdJobIdRequest req = new PutAtsConnectionIdJobIdRequest("et", "qui") {{
                atsJob = new AtsJob() {{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress() {{
                            address1 = "iusto";
                            address2 = "a";
                            city = "Beahanside";
                            country = "Anguilla";
                            countryCode = "PY";
                            postalCode = "19510-4545";
                            region = "nulla";
                            regionCode = "consequatur";
                        }}),
                    }};
                    closedAt = OffsetDateTime.parse("2021-06-29T17:11:28.894Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.OTHER) {{
                            currency = "impedit";
                            frequency = AtsCompensationFrequency.HOUR;
                            max = 4850.97d;
                            min = 4537.55d;
                            type = AtsCompensationType.EQUITY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-02-04T14:21:51.225Z");
                    departments = new String[]{{
                        add("cum"),
                    }};
                    description = "esse";
                    employmentType = AtsJobEmploymentType.FULL_TIME;
                    hiringManagerIds = new String[]{{
                        add("consequuntur"),
                    }};
                    id = "1a52046b-64e9-49fb-8e67-e094fdfed554";
                    languageLocale = "sit";
                    name = "Randal Herman";
                    publicJobUrls = new String[]{{
                        add("velit"),
                    }};
                    raw = new PropertyAtsJobRaw();;
                    recruiterIds = new String[]{{
                        add("ut"),
                    }};
                    remote = false;
                    status = AtsJobStatus.OPEN;
                    updatedAt = OffsetDateTime.parse("2022-04-19T16:52:53.258Z");
                }};;
            }};            

            PutAtsConnectionIdJobIdResponse res = sdk.job.putAtsConnectionIdJobId(req, new PutAtsConnectionIdJobIdSecurity("blanditiis") {{
                jwt = "";
            }});

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdRequest](../../models/operations/PutAtsConnectionIdJobIdRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdSecurity](../../models/operations/PutAtsConnectionIdJobIdSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdResponse](../../models/operations/PutAtsConnectionIdJobIdResponse.md)**

