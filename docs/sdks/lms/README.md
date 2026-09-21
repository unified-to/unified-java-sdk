# Lms

## Overview

### Available Operations

* [createLmsActivity](#createlmsactivity) - Create an activity
* [createLmsClass](#createlmsclass) - Create a class
* [createLmsCollection](#createlmscollection) - Create a collection
* [createLmsContent](#createlmscontent) - Create a content
* [createLmsCourse](#createlmscourse) - Create a course
* [createLmsInstructor](#createlmsinstructor) - Create an instructor
* [createLmsStudent](#createlmsstudent) - Create a student
* [getLmsActivity](#getlmsactivity) - Retrieve an activity
* [getLmsClass](#getlmsclass) - Retrieve a class
* [getLmsCollection](#getlmscollection) - Retrieve a collection
* [getLmsContent](#getlmscontent) - Retrieve a content
* [getLmsCourse](#getlmscourse) - Retrieve a course
* [getLmsInstructor](#getlmsinstructor) - Retrieve an instructor
* [getLmsStudent](#getlmsstudent) - Retrieve a student
* [listLmsActivities](#listlmsactivities) - List all activities
* [listLmsClasses](#listlmsclasses) - List all classes
* [listLmsCollections](#listlmscollections) - List all collections
* [listLmsContents](#listlmscontents) - List all contents
* [listLmsCourses](#listlmscourses) - List all courses
* [listLmsInstructors](#listlmsinstructors) - List all instructors
* [listLmsStudents](#listlmsstudents) - List all students
* [patchLmsActivity](#patchlmsactivity) - Update an activity
* [patchLmsClass](#patchlmsclass) - Update a class
* [patchLmsCollection](#patchlmscollection) - Update a collection
* [patchLmsContent](#patchlmscontent) - Update a content
* [patchLmsCourse](#patchlmscourse) - Update a course
* [patchLmsInstructor](#patchlmsinstructor) - Update an instructor
* [patchLmsStudent](#patchlmsstudent) - Update a student
* [removeLmsActivity](#removelmsactivity) - Remove an activity
* [removeLmsClass](#removelmsclass) - Remove a class
* [removeLmsCollection](#removelmscollection) - Remove a collection
* [removeLmsContent](#removelmscontent) - Remove a content
* [removeLmsCourse](#removelmscourse) - Remove a course
* [removeLmsInstructor](#removelmsinstructor) - Remove an instructor
* [removeLmsStudent](#removelmsstudent) - Remove a student
* [updateLmsActivity](#updatelmsactivity) - Update an activity
* [updateLmsClass](#updatelmsclass) - Update a class
* [updateLmsCollection](#updatelmscollection) - Update a collection
* [updateLmsContent](#updatelmscontent) - Update a content
* [updateLmsCourse](#updatelmscourse) - Update a course
* [updateLmsInstructor](#updatelmsinstructor) - Update an instructor
* [updateLmsStudent](#updatelmsstudent) - Update a student

## createLmsActivity

Create an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsActivity" method="post" path="/lms/{connection_id}/activity" example="lms_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsActivityRequest req = CreateLmsActivityRequest.builder()
                .lmsActivity(LmsActivity.builder()
                    .assignedGrade("summopere")
                    .completedAt(OffsetDateTime.parse("2025-04-14T07:48:00.659Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("8121796d-85be-45e3-a87f-43bbbe4bdd8e")
                    .isCompleted(true)
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2023-12-24T04:54:05.825Z"))
                    .updatedAt(OffsetDateTime.parse("2022-01-24T13:21:48.887Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsActivityResponse res = sdk.lms().createLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateLmsActivityRequest](../../models/operations/CreateLmsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateLmsActivityResponse](../../models/operations/CreateLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsClass

Create a class

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsClass" method="post" path="/lms/{connection_id}/class" example="lms_class" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsClassRequest req = CreateLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-20T14:48:51.845Z"))
                    .description("Anser sperno decerno.")
                    .id("d8e86285-4d39-43ad-81b4-47162c03c8c3")
                    .instructors(List.of())
                    .languages(List.of(
                        "in"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Defetiscor aetas acies benevolentia ulterius. Creta bis beneficium canis. Bonus valeo vulgo creator arca peior ceno earum culpa. Tabesco apostolus talis. Ultra accommodo deinde sono culpo arto cruciamentum triduana.")
                            .description("Esse confido.")
                            .languages(List.of(
                                "fa",
                                "da"))
                            .name("illo")
                            .thumbnailUrl("https://loremflickr.com/199/1934?lock=4323325966476891")
                            .type(LmsMediaType.VIDEO)
                            .url("https://loremflickr.com/487/921?lock=5127962071241632")
                            .build()))
                    .name("virtus")
                    .students(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-07-10T09:08:36.712Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsClassResponse res = sdk.lms().createLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateLmsClassRequest](../../models/operations/CreateLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateLmsClassResponse](../../models/operations/CreateLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsCollection

Create a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCollection" method="post" path="/lms/{connection_id}/collection" example="lms_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCollectionRequest req = CreateLmsCollectionRequest.builder()
                .lmsCollection(LmsCollection.builder()
                    .createdAt(OffsetDateTime.parse("2019-08-19T14:40:29.227Z"))
                    .description("Ab.")
                    .id("0d256c95-5bf1-4475-aa61-72ba5c430511")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Accusamus earum sulum libero adficio testimonium vitae. Calcar contra vergo curis sollers. Caste brevis denuo. Tam amita ducimus capillus. Vulgaris temporibus arbustum solium id. Suppono commodo fuga surculus tripudio doloribus.")
                            .description("Aliquam tardus careo hic umbra.")
                            .languages(List.of(
                                "gl"))
                            .name("thymum")
                            .thumbnailUrl("https://picsum.photos/seed/15O5EfV/2982/752")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://loremflickr.com/2679/70?lock=6078357625960554")
                            .build()))
                    .name("ara")
                    .updatedAt(OffsetDateTime.parse("2026-07-01T06:30:00.795Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCollectionResponse res = sdk.lms().createLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateLmsCollectionRequest](../../models/operations/CreateLmsCollectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateLmsCollectionResponse](../../models/operations/CreateLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsContent

Create a content

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsContent" method="post" path="/lms/{connection_id}/content" example="lms_content" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsContentRequest req = CreateLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .categories(List.of(
                        "territo"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Usque laboriosam ventosus adflicto.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .externalReference("0d230e31-a9c4-4a35-a5b9-9168e91ffff5")
                    .id("89ae27e8-4507-4da5-8b22-b11ee45b2eda")
                    .instructors(List.of(
                        LmsReference.builder()
                            .id("91a23b20-a7a3-4323-9548-0897c09eb49e")
                            .name("Winston Ferry")
                            .build()))
                    .isActive(true)
                    .languages(List.of(
                        "despecto",
                        "suppellex"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Numquam.")
                            .language("es")
                            .name("validus")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Callide.")
                            .language("fr")
                            .name("crux")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Adnuo antepono vulticulus incidunt. Commemoro voro ocer arca velut vigor venustas una audeo. Consectetur totidem amor amo vigor. Patior ulciscor cohors necessitatibus beatae. Copiose cedo sub decens acer.")
                            .description("Venia aeternus tandem spargo.")
                            .languages(List.of(
                                "zu",
                                "ba"))
                            .name("subiungo")
                            .thumbnailUrl("https://loremflickr.com/2056/3712?lock=5644845642923518")
                            .type(LmsMediaType.OTHER)
                            .url("https://loremflickr.com/2593/1553?lock=8591263400111785")
                            .build(),
                        LmsMedia.builder()
                            .content("Terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum. Absque adversus desino aut tabernus tollo vigor. Cur agnitio totidem consuasor bene doloribus. Vetus abundans curriculum curatio usitas.")
                            .description("Comedo valde caste combibo.")
                            .languages(List.of(
                                "it",
                                "hu"))
                            .name("beneficium")
                            .thumbnailUrl("https://picsum.photos/seed/pNFr1/2597/885")
                            .type(LmsMediaType.WEB)
                            .url("https://loremflickr.com/3597/239?lock=7142808124990633")
                            .build(),
                        LmsMedia.builder()
                            .content("Coepi demo adversus capillus aro unus templum. Aspicio alius vehemens terminatio varietas vomica. Apud thorax defero decet impedit verbera pauci laboriosam molestiae urbanus. Aveho vergo crux certus nulla caute sophismata. Caute voluptatibus patrocinor demo verumtamen adeo canis sapiente depraedor verus.")
                            .description("Tunc barba decens.")
                            .languages(List.of(
                                "bn",
                                "yo"))
                            .name("qui")
                            .thumbnailUrl("https://loremflickr.com/1375/3377?lock=6601832177607674")
                            .type(LmsMediaType.IMAGE)
                            .url("https://loremflickr.com/3927/2086?lock=5199784913821481")
                            .build()))
                    .name("ut")
                    .providerName("Berge LLC")
                    .publishedAt(OffsetDateTime.parse("2023-11-08T11:32:09.080Z"))
                    .shortDescription("Commemoro.")
                    .skills(List.of(
                        "trucido"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("tibi")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "dens"))
                    .updatedAt(OffsetDateTime.parse("2022-09-24T10:52:26.776Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsContentResponse res = sdk.lms().createLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateLmsContentRequest](../../models/operations/CreateLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLmsContentResponse](../../models/operations/CreateLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsCourse

Create a course

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCourse" method="post" path="/lms/{connection_id}/course" example="lms_course" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCourseRequest req = CreateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .categories(List.of(
                        "tergiversatio",
                        "tumultus"))
                    .createdAt(OffsetDateTime.parse("2022-10-06T09:58:53.559Z"))
                    .currency("FJD")
                    .description("Vinco alias aut capitulus.")
                    .durationMinutes(148d)
                    .id("f635b758-af64-42a3-9389-1a94afbb201f")
                    .instructors(List.of())
                    .isActive(true)
                    .isPrivate(false)
                    .languages(List.of(
                        "desparatus",
                        "earum",
                        "deripio"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Adeptio crudelis ipsum utrimque quae architecto. Cum eius conitor anser abutor error adsuesco abeo. Denego nihil caries aveho.")
                            .description("Adipiscor.")
                            .languages(List.of(
                                "ms",
                                "te"))
                            .name("tandem")
                            .thumbnailUrl("https://picsum.photos/seed/syTatRhK03/928/273")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/fQAbsk/2472/1671")
                            .build()))
                    .name("comptus")
                    .priceAmount(84d)
                    .providerName("Homenick - Wunsch")
                    .publishedAt(OffsetDateTime.parse("2023-12-30T03:35:03.902Z"))
                    .skills(List.of(
                        "adiuvo",
                        "tam"))
                    .students(List.of())
                    .timeEstimateMinutes(100d)
                    .updatedAt(OffsetDateTime.parse("2023-02-07T04:44:43.438Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCourseResponse res = sdk.lms().createLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateLmsCourseRequest](../../models/operations/CreateLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateLmsCourseResponse](../../models/operations/CreateLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsInstructor

Create an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsInstructor" method="post" path="/lms/{connection_id}/instructor" example="lms_instructor" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsInstructorRequest req = CreateLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .createdAt(OffsetDateTime.parse("2021-10-12T16:38:54.979Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build(),
                        LmsEmail.builder()
                            .build()))
                    .firstName("Deangelo")
                    .id("290442f0-3bd4-4743-83d3-9c33c10f7ae0")
                    .imageUrl("https://avatars.githubusercontent.com/u/20232618")
                    .lastName("Ritchie")
                    .name("Deangelo Ritchie")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(352) 551-7989")
                            .type(LmsTelephoneType.HOME)
                            .build()))
                    .title("Product Solutions Engineer")
                    .updatedAt(OffsetDateTime.parse("2025-07-01T20:53:44.388Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsInstructorResponse res = sdk.lms().createLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateLmsInstructorRequest](../../models/operations/CreateLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateLmsInstructorResponse](../../models/operations/CreateLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsStudent

Create a student

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsStudent" method="post" path="/lms/{connection_id}/student" example="lms_student" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsStudentRequest req = CreateLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .address(PropertyLmsStudentAddress.builder()
                        .address1("94082 Kassandra Camp")
                        .address2("Apt. 461")
                        .city("New Ibrahimmouth")
                        .countryCode("US")
                        .postalCode("52851")
                        .region("Tennessee")
                        .regionCode("NV")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-03-23T06:59:29.777Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build(),
                        LmsEmail.builder()
                            .build()))
                    .firstName("Marcella")
                    .id("57a87fad-5a1b-4502-ac37-e71d6bd5ec19")
                    .imageUrl("https://avatars.githubusercontent.com/u/36301374")
                    .lastName("Murazik")
                    .name("Marcella Murazik")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(482) 469-8067")
                            .type(LmsTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-06-20T15:03:55.419Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsStudentResponse res = sdk.lms().createLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateLmsStudentRequest](../../models/operations/CreateLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLmsStudentResponse](../../models/operations/CreateLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsActivity

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsActivity" method="get" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsActivityRequest req = GetLmsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsActivityResponse res = sdk.lms().getLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLmsActivityRequest](../../models/operations/GetLmsActivityRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLmsActivityResponse](../../models/operations/GetLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsClass

Retrieve a class

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsClass" method="get" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsClassRequest req = GetLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsClassResponse res = sdk.lms().getLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetLmsClassRequest](../../models/operations/GetLmsClassRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetLmsClassResponse](../../models/operations/GetLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCollection

Retrieve a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsCollection" method="get" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsCollectionRequest req = GetLmsCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCollectionResponse res = sdk.lms().getLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetLmsCollectionRequest](../../models/operations/GetLmsCollectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetLmsCollectionResponse](../../models/operations/GetLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsContent

Retrieve a content

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsContent" method="get" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsContentRequest req = GetLmsContentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsContentResponse res = sdk.lms().getLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLmsContentRequest](../../models/operations/GetLmsContentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLmsContentResponse](../../models/operations/GetLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCourse

Retrieve a course

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsCourse" method="get" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsCourseRequest req = GetLmsCourseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCourseResponse res = sdk.lms().getLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetLmsCourseRequest](../../models/operations/GetLmsCourseRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetLmsCourseResponse](../../models/operations/GetLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsInstructor

Retrieve an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsInstructor" method="get" path="/lms/{connection_id}/instructor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsInstructorRequest req = GetLmsInstructorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsInstructorResponse res = sdk.lms().getLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetLmsInstructorRequest](../../models/operations/GetLmsInstructorRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetLmsInstructorResponse](../../models/operations/GetLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsStudent

Retrieve a student

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsStudent" method="get" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsStudentRequest req = GetLmsStudentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsStudentResponse res = sdk.lms().getLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLmsStudentRequest](../../models/operations/GetLmsStudentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLmsStudentResponse](../../models/operations/GetLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsActivities

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsActivities" method="get" path="/lms/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsActivitiesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsActivitiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsActivitiesRequest req = ListLmsActivitiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsActivitiesResponse res = sdk.lms().listLmsActivities()
                .request(req)
                .call();

        if (res.lmsActivities().isPresent()) {
            System.out.println(res.lmsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListLmsActivitiesRequest](../../models/operations/ListLmsActivitiesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListLmsActivitiesResponse](../../models/operations/ListLmsActivitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsClasses

List all classes

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsClasses" method="get" path="/lms/{connection_id}/class" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsClassesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsClassesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsClassesRequest req = ListLmsClassesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsClassesResponse res = sdk.lms().listLmsClasses()
                .request(req)
                .call();

        if (res.lmsClasses().isPresent()) {
            System.out.println(res.lmsClasses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListLmsClassesRequest](../../models/operations/ListLmsClassesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListLmsClassesResponse](../../models/operations/ListLmsClassesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsCollections

List all collections

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsCollections" method="get" path="/lms/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsCollectionsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsCollectionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsCollectionsRequest req = ListLmsCollectionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsCollectionsResponse res = sdk.lms().listLmsCollections()
                .request(req)
                .call();

        if (res.lmsCollections().isPresent()) {
            System.out.println(res.lmsCollections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListLmsCollectionsRequest](../../models/operations/ListLmsCollectionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListLmsCollectionsResponse](../../models/operations/ListLmsCollectionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsContents

List all contents

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsContents" method="get" path="/lms/{connection_id}/content" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsContentsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsContentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsContentsRequest req = ListLmsContentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsContentsResponse res = sdk.lms().listLmsContents()
                .request(req)
                .call();

        if (res.lmsContents().isPresent()) {
            System.out.println(res.lmsContents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsContentsRequest](../../models/operations/ListLmsContentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsContentsResponse](../../models/operations/ListLmsContentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsCourses

List all courses

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsCourses" method="get" path="/lms/{connection_id}/course" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsCoursesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsCoursesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsCoursesRequest req = ListLmsCoursesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsCoursesResponse res = sdk.lms().listLmsCourses()
                .request(req)
                .call();

        if (res.lmsCourses().isPresent()) {
            System.out.println(res.lmsCourses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListLmsCoursesRequest](../../models/operations/ListLmsCoursesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListLmsCoursesResponse](../../models/operations/ListLmsCoursesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsInstructors

List all instructors

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsInstructors" method="get" path="/lms/{connection_id}/instructor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsInstructorsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsInstructorsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsInstructorsRequest req = ListLmsInstructorsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsInstructorsResponse res = sdk.lms().listLmsInstructors()
                .request(req)
                .call();

        if (res.lmsInstructors().isPresent()) {
            System.out.println(res.lmsInstructors().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListLmsInstructorsRequest](../../models/operations/ListLmsInstructorsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListLmsInstructorsResponse](../../models/operations/ListLmsInstructorsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsStudents

List all students

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsStudents" method="get" path="/lms/{connection_id}/student" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsStudentsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsStudentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsStudentsRequest req = ListLmsStudentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsStudentsResponse res = sdk.lms().listLmsStudents()
                .request(req)
                .call();

        if (res.lmsStudents().isPresent()) {
            System.out.println(res.lmsStudents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsStudentsRequest](../../models/operations/ListLmsStudentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsStudentsResponse](../../models/operations/ListLmsStudentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsActivity

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsActivity" method="patch" path="/lms/{connection_id}/activity/{id}" example="lms_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsActivityRequest req = PatchLmsActivityRequest.builder()
                .lmsActivity(LmsActivity.builder()
                    .assignedGrade("summopere")
                    .completedAt(OffsetDateTime.parse("2025-04-14T07:48:00.664Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("5bfa4252-4269-48b7-98a0-a37088a2874c")
                    .isCompleted(true)
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2023-12-24T04:54:05.825Z"))
                    .updatedAt(OffsetDateTime.parse("2022-01-24T13:21:48.889Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsActivityResponse res = sdk.lms().patchLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchLmsActivityRequest](../../models/operations/PatchLmsActivityRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchLmsActivityResponse](../../models/operations/PatchLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsClass

Update a class

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsClass" method="patch" path="/lms/{connection_id}/class/{id}" example="lms_class" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsClassRequest req = PatchLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-20T14:48:51.845Z"))
                    .description("Anser sperno decerno.")
                    .id("e1649d98-707b-4ad9-a9ea-4ba1ea2b2fb9")
                    .instructors(List.of())
                    .languages(List.of(
                        "in"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Defetiscor aetas acies benevolentia ulterius. Creta bis beneficium canis. Bonus valeo vulgo creator arca peior ceno earum culpa. Tabesco apostolus talis. Ultra accommodo deinde sono culpo arto cruciamentum triduana.")
                            .description("Esse confido.")
                            .languages(List.of(
                                "fa",
                                "da"))
                            .name("illo")
                            .thumbnailUrl("https://loremflickr.com/199/1934?lock=4323325966476891")
                            .type(LmsMediaType.VIDEO)
                            .url("https://loremflickr.com/487/921?lock=5127962071241632")
                            .build()))
                    .name("virtus")
                    .students(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-07-10T09:08:36.732Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsClassResponse res = sdk.lms().patchLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchLmsClassRequest](../../models/operations/PatchLmsClassRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchLmsClassResponse](../../models/operations/PatchLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsCollection

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCollection" method="patch" path="/lms/{connection_id}/collection/{id}" example="lms_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCollectionRequest req = PatchLmsCollectionRequest.builder()
                .lmsCollection(LmsCollection.builder()
                    .createdAt(OffsetDateTime.parse("2019-08-19T14:40:29.227Z"))
                    .description("Ab.")
                    .id("e26a3dc1-586b-492a-b360-69f1e36e6c47")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Accusamus earum sulum libero adficio testimonium vitae. Calcar contra vergo curis sollers. Caste brevis denuo. Tam amita ducimus capillus. Vulgaris temporibus arbustum solium id. Suppono commodo fuga surculus tripudio doloribus.")
                            .description("Aliquam tardus careo hic umbra.")
                            .languages(List.of(
                                "gl"))
                            .name("thymum")
                            .thumbnailUrl("https://picsum.photos/seed/15O5EfV/2982/752")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://loremflickr.com/2679/70?lock=6078357625960554")
                            .build()))
                    .name("ara")
                    .updatedAt(OffsetDateTime.parse("2026-07-01T06:30:00.808Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCollectionResponse res = sdk.lms().patchLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchLmsCollectionRequest](../../models/operations/PatchLmsCollectionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchLmsCollectionResponse](../../models/operations/PatchLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsContent

Update a content

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsContent" method="patch" path="/lms/{connection_id}/content/{id}" example="lms_content" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsContentRequest req = PatchLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .categories(List.of(
                        "territo"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Usque laboriosam ventosus adflicto.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .externalReference("0d230e31-a9c4-4a35-a5b9-9168e91ffff5")
                    .id("c2d04ccd-bcf6-48cd-a878-2f2bf63e7a1a")
                    .instructors(List.of(
                        LmsReference.builder()
                            .id("91a23b20-a7a3-4323-9548-0897c09eb49e")
                            .name("Winston Ferry")
                            .build()))
                    .isActive(true)
                    .languages(List.of(
                        "despecto",
                        "suppellex"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Numquam.")
                            .language("es")
                            .name("validus")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Callide.")
                            .language("fr")
                            .name("crux")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Adnuo antepono vulticulus incidunt. Commemoro voro ocer arca velut vigor venustas una audeo. Consectetur totidem amor amo vigor. Patior ulciscor cohors necessitatibus beatae. Copiose cedo sub decens acer.")
                            .description("Venia aeternus tandem spargo.")
                            .languages(List.of(
                                "zu",
                                "ba"))
                            .name("subiungo")
                            .thumbnailUrl("https://loremflickr.com/2056/3712?lock=5644845642923518")
                            .type(LmsMediaType.OTHER)
                            .url("https://loremflickr.com/2593/1553?lock=8591263400111785")
                            .build(),
                        LmsMedia.builder()
                            .content("Terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum. Absque adversus desino aut tabernus tollo vigor. Cur agnitio totidem consuasor bene doloribus. Vetus abundans curriculum curatio usitas.")
                            .description("Comedo valde caste combibo.")
                            .languages(List.of(
                                "it",
                                "hu"))
                            .name("beneficium")
                            .thumbnailUrl("https://picsum.photos/seed/pNFr1/2597/885")
                            .type(LmsMediaType.WEB)
                            .url("https://loremflickr.com/3597/239?lock=7142808124990633")
                            .build(),
                        LmsMedia.builder()
                            .content("Coepi demo adversus capillus aro unus templum. Aspicio alius vehemens terminatio varietas vomica. Apud thorax defero decet impedit verbera pauci laboriosam molestiae urbanus. Aveho vergo crux certus nulla caute sophismata. Caute voluptatibus patrocinor demo verumtamen adeo canis sapiente depraedor verus.")
                            .description("Tunc barba decens.")
                            .languages(List.of(
                                "bn",
                                "yo"))
                            .name("qui")
                            .thumbnailUrl("https://loremflickr.com/1375/3377?lock=6601832177607674")
                            .type(LmsMediaType.IMAGE)
                            .url("https://loremflickr.com/3927/2086?lock=5199784913821481")
                            .build()))
                    .name("ut")
                    .providerName("Berge LLC")
                    .publishedAt(OffsetDateTime.parse("2023-11-08T11:32:09.080Z"))
                    .shortDescription("Commemoro.")
                    .skills(List.of(
                        "trucido"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("tibi")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "dens"))
                    .updatedAt(OffsetDateTime.parse("2022-09-24T10:52:26.787Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsContentResponse res = sdk.lms().patchLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchLmsContentRequest](../../models/operations/PatchLmsContentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchLmsContentResponse](../../models/operations/PatchLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsCourse

Update a course

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCourse" method="patch" path="/lms/{connection_id}/course/{id}" example="lms_course" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCourseRequest req = PatchLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .categories(List.of(
                        "tergiversatio",
                        "tumultus"))
                    .createdAt(OffsetDateTime.parse("2022-10-06T09:58:53.559Z"))
                    .currency("FJD")
                    .description("Vinco alias aut capitulus.")
                    .durationMinutes(148d)
                    .id("e5fd4218-b998-4e25-8ec9-c8d976623f7a")
                    .instructors(List.of())
                    .isActive(true)
                    .isPrivate(false)
                    .languages(List.of(
                        "desparatus",
                        "earum",
                        "deripio"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Adeptio crudelis ipsum utrimque quae architecto. Cum eius conitor anser abutor error adsuesco abeo. Denego nihil caries aveho.")
                            .description("Adipiscor.")
                            .languages(List.of(
                                "ms",
                                "te"))
                            .name("tandem")
                            .thumbnailUrl("https://picsum.photos/seed/syTatRhK03/928/273")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/fQAbsk/2472/1671")
                            .build()))
                    .name("comptus")
                    .priceAmount(84d)
                    .providerName("Homenick - Wunsch")
                    .publishedAt(OffsetDateTime.parse("2023-12-30T03:35:03.902Z"))
                    .skills(List.of(
                        "adiuvo",
                        "tam"))
                    .students(List.of())
                    .timeEstimateMinutes(100d)
                    .updatedAt(OffsetDateTime.parse("2023-02-07T04:44:43.440Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCourseResponse res = sdk.lms().patchLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchLmsCourseRequest](../../models/operations/PatchLmsCourseRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchLmsCourseResponse](../../models/operations/PatchLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsInstructor

Update an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsInstructor" method="patch" path="/lms/{connection_id}/instructor/{id}" example="lms_instructor" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsInstructorRequest req = PatchLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .createdAt(OffsetDateTime.parse("2021-10-12T16:38:54.979Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build(),
                        LmsEmail.builder()
                            .build()))
                    .firstName("Deangelo")
                    .id("da7712af-9bf9-4756-9098-68d148fe961e")
                    .imageUrl("https://avatars.githubusercontent.com/u/20232618")
                    .lastName("Ritchie")
                    .name("Deangelo Ritchie")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(352) 551-7989")
                            .type(LmsTelephoneType.HOME)
                            .build()))
                    .title("Product Solutions Engineer")
                    .updatedAt(OffsetDateTime.parse("2025-07-01T20:53:44.397Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsInstructorResponse res = sdk.lms().patchLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchLmsInstructorRequest](../../models/operations/PatchLmsInstructorRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchLmsInstructorResponse](../../models/operations/PatchLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsStudent

Update a student

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsStudent" method="patch" path="/lms/{connection_id}/student/{id}" example="lms_student" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsStudentRequest req = PatchLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .address(PropertyLmsStudentAddress.builder()
                        .address1("94082 Kassandra Camp")
                        .address2("Apt. 461")
                        .city("New Ibrahimmouth")
                        .countryCode("US")
                        .postalCode("52851")
                        .region("Tennessee")
                        .regionCode("NV")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-03-23T06:59:29.777Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build(),
                        LmsEmail.builder()
                            .build()))
                    .firstName("Marcella")
                    .id("dff1448f-dddf-4fd2-bc4a-5c8fff066a9d")
                    .imageUrl("https://avatars.githubusercontent.com/u/36301374")
                    .lastName("Murazik")
                    .name("Marcella Murazik")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(482) 469-8067")
                            .type(LmsTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-06-20T15:03:55.426Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsStudentResponse res = sdk.lms().patchLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchLmsStudentRequest](../../models/operations/PatchLmsStudentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchLmsStudentResponse](../../models/operations/PatchLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsActivity

Remove an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsActivity" method="delete" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsActivityRequest req = RemoveLmsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsActivityResponse res = sdk.lms().removeLmsActivity()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveLmsActivityRequest](../../models/operations/RemoveLmsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveLmsActivityResponse](../../models/operations/RemoveLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsClass

Remove a class

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsClass" method="delete" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsClassRequest req = RemoveLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsClassResponse res = sdk.lms().removeLmsClass()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveLmsClassRequest](../../models/operations/RemoveLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveLmsClassResponse](../../models/operations/RemoveLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsCollection

Remove a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsCollection" method="delete" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsCollectionRequest req = RemoveLmsCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCollectionResponse res = sdk.lms().removeLmsCollection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveLmsCollectionRequest](../../models/operations/RemoveLmsCollectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveLmsCollectionResponse](../../models/operations/RemoveLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsContent

Remove a content

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsContent" method="delete" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsContentRequest req = RemoveLmsContentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsContentResponse res = sdk.lms().removeLmsContent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveLmsContentRequest](../../models/operations/RemoveLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveLmsContentResponse](../../models/operations/RemoveLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsCourse

Remove a course

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsCourse" method="delete" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsCourseRequest req = RemoveLmsCourseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCourseResponse res = sdk.lms().removeLmsCourse()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveLmsCourseRequest](../../models/operations/RemoveLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveLmsCourseResponse](../../models/operations/RemoveLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsInstructor

Remove an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsInstructor" method="delete" path="/lms/{connection_id}/instructor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsInstructorRequest req = RemoveLmsInstructorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsInstructorResponse res = sdk.lms().removeLmsInstructor()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveLmsInstructorRequest](../../models/operations/RemoveLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveLmsInstructorResponse](../../models/operations/RemoveLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsStudent

Remove a student

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsStudent" method="delete" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsStudentRequest req = RemoveLmsStudentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsStudentResponse res = sdk.lms().removeLmsStudent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveLmsStudentRequest](../../models/operations/RemoveLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveLmsStudentResponse](../../models/operations/RemoveLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsActivity

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsActivity" method="put" path="/lms/{connection_id}/activity/{id}" example="lms_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsActivityRequest req = UpdateLmsActivityRequest.builder()
                .lmsActivity(LmsActivity.builder()
                    .assignedGrade("summopere")
                    .completedAt(OffsetDateTime.parse("2025-04-14T07:48:00.664Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("5bfa4252-4269-48b7-98a0-a37088a2874c")
                    .isCompleted(true)
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2023-12-24T04:54:05.825Z"))
                    .updatedAt(OffsetDateTime.parse("2022-01-24T13:21:48.889Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsActivityResponse res = sdk.lms().updateLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateLmsActivityRequest](../../models/operations/UpdateLmsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateLmsActivityResponse](../../models/operations/UpdateLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsClass

Update a class

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsClass" method="put" path="/lms/{connection_id}/class/{id}" example="lms_class" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsClassRequest req = UpdateLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-20T14:48:51.845Z"))
                    .description("Anser sperno decerno.")
                    .id("e1649d98-707b-4ad9-a9ea-4ba1ea2b2fb9")
                    .instructors(List.of())
                    .languages(List.of(
                        "in"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Defetiscor aetas acies benevolentia ulterius. Creta bis beneficium canis. Bonus valeo vulgo creator arca peior ceno earum culpa. Tabesco apostolus talis. Ultra accommodo deinde sono culpo arto cruciamentum triduana.")
                            .description("Esse confido.")
                            .languages(List.of(
                                "fa",
                                "da"))
                            .name("illo")
                            .thumbnailUrl("https://loremflickr.com/199/1934?lock=4323325966476891")
                            .type(LmsMediaType.VIDEO)
                            .url("https://loremflickr.com/487/921?lock=5127962071241632")
                            .build()))
                    .name("virtus")
                    .students(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-07-10T09:08:36.732Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsClassResponse res = sdk.lms().updateLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateLmsClassRequest](../../models/operations/UpdateLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateLmsClassResponse](../../models/operations/UpdateLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsCollection

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCollection" method="put" path="/lms/{connection_id}/collection/{id}" example="lms_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCollectionRequest req = UpdateLmsCollectionRequest.builder()
                .lmsCollection(LmsCollection.builder()
                    .createdAt(OffsetDateTime.parse("2019-08-19T14:40:29.227Z"))
                    .description("Ab.")
                    .id("e26a3dc1-586b-492a-b360-69f1e36e6c47")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Accusamus earum sulum libero adficio testimonium vitae. Calcar contra vergo curis sollers. Caste brevis denuo. Tam amita ducimus capillus. Vulgaris temporibus arbustum solium id. Suppono commodo fuga surculus tripudio doloribus.")
                            .description("Aliquam tardus careo hic umbra.")
                            .languages(List.of(
                                "gl"))
                            .name("thymum")
                            .thumbnailUrl("https://picsum.photos/seed/15O5EfV/2982/752")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://loremflickr.com/2679/70?lock=6078357625960554")
                            .build()))
                    .name("ara")
                    .updatedAt(OffsetDateTime.parse("2026-07-01T06:30:00.808Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCollectionResponse res = sdk.lms().updateLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateLmsCollectionRequest](../../models/operations/UpdateLmsCollectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateLmsCollectionResponse](../../models/operations/UpdateLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsContent

Update a content

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsContent" method="put" path="/lms/{connection_id}/content/{id}" example="lms_content" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsContentRequest req = UpdateLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .categories(List.of(
                        "territo"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Usque laboriosam ventosus adflicto.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .externalReference("0d230e31-a9c4-4a35-a5b9-9168e91ffff5")
                    .id("c2d04ccd-bcf6-48cd-a878-2f2bf63e7a1a")
                    .instructors(List.of(
                        LmsReference.builder()
                            .id("91a23b20-a7a3-4323-9548-0897c09eb49e")
                            .name("Winston Ferry")
                            .build()))
                    .isActive(true)
                    .languages(List.of(
                        "despecto",
                        "suppellex"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Numquam.")
                            .language("es")
                            .name("validus")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Callide.")
                            .language("fr")
                            .name("crux")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Adnuo antepono vulticulus incidunt. Commemoro voro ocer arca velut vigor venustas una audeo. Consectetur totidem amor amo vigor. Patior ulciscor cohors necessitatibus beatae. Copiose cedo sub decens acer.")
                            .description("Venia aeternus tandem spargo.")
                            .languages(List.of(
                                "zu",
                                "ba"))
                            .name("subiungo")
                            .thumbnailUrl("https://loremflickr.com/2056/3712?lock=5644845642923518")
                            .type(LmsMediaType.OTHER)
                            .url("https://loremflickr.com/2593/1553?lock=8591263400111785")
                            .build(),
                        LmsMedia.builder()
                            .content("Terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum. Absque adversus desino aut tabernus tollo vigor. Cur agnitio totidem consuasor bene doloribus. Vetus abundans curriculum curatio usitas.")
                            .description("Comedo valde caste combibo.")
                            .languages(List.of(
                                "it",
                                "hu"))
                            .name("beneficium")
                            .thumbnailUrl("https://picsum.photos/seed/pNFr1/2597/885")
                            .type(LmsMediaType.WEB)
                            .url("https://loremflickr.com/3597/239?lock=7142808124990633")
                            .build(),
                        LmsMedia.builder()
                            .content("Coepi demo adversus capillus aro unus templum. Aspicio alius vehemens terminatio varietas vomica. Apud thorax defero decet impedit verbera pauci laboriosam molestiae urbanus. Aveho vergo crux certus nulla caute sophismata. Caute voluptatibus patrocinor demo verumtamen adeo canis sapiente depraedor verus.")
                            .description("Tunc barba decens.")
                            .languages(List.of(
                                "bn",
                                "yo"))
                            .name("qui")
                            .thumbnailUrl("https://loremflickr.com/1375/3377?lock=6601832177607674")
                            .type(LmsMediaType.IMAGE)
                            .url("https://loremflickr.com/3927/2086?lock=5199784913821481")
                            .build()))
                    .name("ut")
                    .providerName("Berge LLC")
                    .publishedAt(OffsetDateTime.parse("2023-11-08T11:32:09.080Z"))
                    .shortDescription("Commemoro.")
                    .skills(List.of(
                        "trucido"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("tibi")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "dens"))
                    .updatedAt(OffsetDateTime.parse("2022-09-24T10:52:26.787Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsContentResponse res = sdk.lms().updateLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateLmsContentRequest](../../models/operations/UpdateLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLmsContentResponse](../../models/operations/UpdateLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsCourse

Update a course

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCourse" method="put" path="/lms/{connection_id}/course/{id}" example="lms_course" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCourseRequest req = UpdateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .categories(List.of(
                        "tergiversatio",
                        "tumultus"))
                    .createdAt(OffsetDateTime.parse("2022-10-06T09:58:53.559Z"))
                    .currency("FJD")
                    .description("Vinco alias aut capitulus.")
                    .durationMinutes(148d)
                    .id("e5fd4218-b998-4e25-8ec9-c8d976623f7a")
                    .instructors(List.of())
                    .isActive(true)
                    .isPrivate(false)
                    .languages(List.of(
                        "desparatus",
                        "earum",
                        "deripio"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Adeptio crudelis ipsum utrimque quae architecto. Cum eius conitor anser abutor error adsuesco abeo. Denego nihil caries aveho.")
                            .description("Adipiscor.")
                            .languages(List.of(
                                "ms",
                                "te"))
                            .name("tandem")
                            .thumbnailUrl("https://picsum.photos/seed/syTatRhK03/928/273")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/fQAbsk/2472/1671")
                            .build()))
                    .name("comptus")
                    .priceAmount(84d)
                    .providerName("Homenick - Wunsch")
                    .publishedAt(OffsetDateTime.parse("2023-12-30T03:35:03.902Z"))
                    .skills(List.of(
                        "adiuvo",
                        "tam"))
                    .students(List.of())
                    .timeEstimateMinutes(100d)
                    .updatedAt(OffsetDateTime.parse("2023-02-07T04:44:43.440Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCourseResponse res = sdk.lms().updateLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateLmsCourseRequest](../../models/operations/UpdateLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateLmsCourseResponse](../../models/operations/UpdateLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsInstructor

Update an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsInstructor" method="put" path="/lms/{connection_id}/instructor/{id}" example="lms_instructor" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsInstructorRequest req = UpdateLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .createdAt(OffsetDateTime.parse("2021-10-12T16:38:54.979Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build(),
                        LmsEmail.builder()
                            .build()))
                    .firstName("Deangelo")
                    .id("da7712af-9bf9-4756-9098-68d148fe961e")
                    .imageUrl("https://avatars.githubusercontent.com/u/20232618")
                    .lastName("Ritchie")
                    .name("Deangelo Ritchie")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(352) 551-7989")
                            .type(LmsTelephoneType.HOME)
                            .build()))
                    .title("Product Solutions Engineer")
                    .updatedAt(OffsetDateTime.parse("2025-07-01T20:53:44.397Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsInstructorResponse res = sdk.lms().updateLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateLmsInstructorRequest](../../models/operations/UpdateLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateLmsInstructorResponse](../../models/operations/UpdateLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsStudent

Update a student

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsStudent" method="put" path="/lms/{connection_id}/student/{id}" example="lms_student" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsStudentRequest req = UpdateLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .address(PropertyLmsStudentAddress.builder()
                        .address1("94082 Kassandra Camp")
                        .address2("Apt. 461")
                        .city("New Ibrahimmouth")
                        .countryCode("US")
                        .postalCode("52851")
                        .region("Tennessee")
                        .regionCode("NV")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-03-23T06:59:29.777Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build(),
                        LmsEmail.builder()
                            .build()))
                    .firstName("Marcella")
                    .id("dff1448f-dddf-4fd2-bc4a-5c8fff066a9d")
                    .imageUrl("https://avatars.githubusercontent.com/u/36301374")
                    .lastName("Murazik")
                    .name("Marcella Murazik")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(482) 469-8067")
                            .type(LmsTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-06-20T15:03:55.426Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsStudentResponse res = sdk.lms().updateLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateLmsStudentRequest](../../models/operations/UpdateLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLmsStudentResponse](../../models/operations/UpdateLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |