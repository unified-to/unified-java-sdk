/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto;

import com.unifiedapi.unifiedto.models.operations.SDKMethodInterfaces.*;
import com.unifiedapi.unifiedto.utils.HTTPClient;
import com.unifiedapi.unifiedto.utils.RetryConfig;
import com.unifiedapi.unifiedto.utils.SpeakeasyHTTPClient;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

/**
 * Unified.to API: One API to Rule Them All
 */
public class UnifiedTo {


    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        /**
         * North American data region
         */
        "https://api.unified.to",
        /**
         * European data region
         */
        "https://api-eu.unified.to",
    };

    private final Accounting accounting;

    private final Account account;

    private final Contact contact;

    private final Invoice invoice;

    private final Journal journal;

    private final Order order;

    private final Organization organization;

    private final Taxrate taxrate;

    private final Transaction transaction;

    private final Ats ats;

    private final Activity activity;

    private final Application application;

    private final Applicationstatus applicationstatus;

    private final Candidate candidate;

    private final Company company;

    private final Document document;

    private final Interview interview;

    private final Job job;

    private final Scorecard scorecard;

    private final Commerce commerce;

    private final Collection collection;

    private final Inventory inventory;

    private final Item item;

    private final Location location;

    private final Crm crm;

    private final Deal deal;

    private final Event event;

    private final Lead lead;

    private final Pipeline pipeline;

    private final Enrich enrich;

    private final Person person;

    private final Genai genai;

    private final Model model;

    private final Prompt prompt;

    private final Hris hris;

    private final Employee employee;

    private final Group group;

    private final Payslip payslip;

    private final Timeoff timeoff;

    private final Kms kms;

    private final Page page;

    private final Space space;

    private final Lms lms;

    private final Class class_;

    private final Course course;

    private final Instructor instructor;

    private final Student student;

    private final Martech martech;

    private final List list;

    private final Member member;

    private final Messaging messaging;

    private final Channel channel;

    private final Message message;

    private final Metadata metadata;

    private final Passthrough passthrough;

    private final Payment payment;

    private final Link link;

    private final Payout payout;

    private final Refund refund;

    private final Repo repo;

    private final Branch branch;

    private final Commit commit;

    private final Pullrequest pullrequest;

    private final Repository repository;

    private final Scim scim;

    private final User user;

    private final Storage storage;

    private final File file;

    private final Task task;

    private final Project project;

    private final Ticketing ticketing;

    private final Customer customer;

    private final Note note;

    private final Ticket ticket;

    private final Uc uc;

    private final Call call;

    private final Unified unified;

    private final Apicall apicall;

    private final Connection connection;

    private final Integration integration;

    private final Auth auth;

    private final Login login;

    private final Issue issue;

    private final Webhook webhook;

    public Accounting accounting() {
        return accounting;
    }

    public Account account() {
        return account;
    }

    public Contact contact() {
        return contact;
    }

    public Invoice invoice() {
        return invoice;
    }

    public Journal journal() {
        return journal;
    }

    public Order order() {
        return order;
    }

    public Organization organization() {
        return organization;
    }

    public Taxrate taxrate() {
        return taxrate;
    }

    public Transaction transaction() {
        return transaction;
    }

    public Ats ats() {
        return ats;
    }

    public Activity activity() {
        return activity;
    }

    public Application application() {
        return application;
    }

    public Applicationstatus applicationstatus() {
        return applicationstatus;
    }

    public Candidate candidate() {
        return candidate;
    }

    public Company company() {
        return company;
    }

    public Document document() {
        return document;
    }

    public Interview interview() {
        return interview;
    }

    public Job job() {
        return job;
    }

    public Scorecard scorecard() {
        return scorecard;
    }

    public Commerce commerce() {
        return commerce;
    }

    public Collection collection() {
        return collection;
    }

    public Inventory inventory() {
        return inventory;
    }

    public Item item() {
        return item;
    }

    public Location location() {
        return location;
    }

    public Crm crm() {
        return crm;
    }

    public Deal deal() {
        return deal;
    }

    public Event event() {
        return event;
    }

    public Lead lead() {
        return lead;
    }

    public Pipeline pipeline() {
        return pipeline;
    }

    public Enrich enrich() {
        return enrich;
    }

    public Person person() {
        return person;
    }

    public Genai genai() {
        return genai;
    }

    public Model model() {
        return model;
    }

    public Prompt prompt() {
        return prompt;
    }

    public Hris hris() {
        return hris;
    }

    public Employee employee() {
        return employee;
    }

    public Group group() {
        return group;
    }

    public Payslip payslip() {
        return payslip;
    }

    public Timeoff timeoff() {
        return timeoff;
    }

    public Kms kms() {
        return kms;
    }

    public Page page() {
        return page;
    }

    public Space space() {
        return space;
    }

    public Lms lms() {
        return lms;
    }

    public Class class_() {
        return class_;
    }

    public Course course() {
        return course;
    }

    public Instructor instructor() {
        return instructor;
    }

    public Student student() {
        return student;
    }

    public Martech martech() {
        return martech;
    }

    public List list() {
        return list;
    }

    public Member member() {
        return member;
    }

    public Messaging messaging() {
        return messaging;
    }

    public Channel channel() {
        return channel;
    }

    public Message message() {
        return message;
    }

    public Metadata metadata() {
        return metadata;
    }

    public Passthrough passthrough() {
        return passthrough;
    }

    public Payment payment() {
        return payment;
    }

    public Link link() {
        return link;
    }

    public Payout payout() {
        return payout;
    }

    public Refund refund() {
        return refund;
    }

    public Repo repo() {
        return repo;
    }

    public Branch branch() {
        return branch;
    }

    public Commit commit() {
        return commit;
    }

    public Pullrequest pullrequest() {
        return pullrequest;
    }

    public Repository repository() {
        return repository;
    }

    public Scim scim() {
        return scim;
    }

    public User user() {
        return user;
    }

    public Storage storage() {
        return storage;
    }

    public File file() {
        return file;
    }

    public Task task() {
        return task;
    }

    public Project project() {
        return project;
    }

    public Ticketing ticketing() {
        return ticketing;
    }

    public Customer customer() {
        return customer;
    }

    public Note note() {
        return note;
    }

    public Ticket ticket() {
        return ticket;
    }

    public Uc uc() {
        return uc;
    }

    public Call call() {
        return call;
    }

    public Unified unified() {
        return unified;
    }

    public Apicall apicall() {
        return apicall;
    }

    public Connection connection() {
        return connection;
    }

    public Integration integration() {
        return integration;
    }

    public Auth auth() {
        return auth;
    }

    public Login login() {
        return login;
    }

    public Issue issue() {
        return issue;
    }

    public Webhook webhook() {
        return webhook;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        
        /**
         * Configures the SDK to use the provided security details.
         *
         * @param security The security details to use for all requests.
         * @return The builder instance.
         */
        public Builder security(com.unifiedapi.unifiedto.models.shared.Security security) {
            this.sdkConfiguration.securitySource = SecuritySource.of(security);
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public UnifiedTo build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new UnifiedTo(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private UnifiedTo(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.accounting = new Accounting(sdkConfiguration);
        this.account = new Account(sdkConfiguration);
        this.contact = new Contact(sdkConfiguration);
        this.invoice = new Invoice(sdkConfiguration);
        this.journal = new Journal(sdkConfiguration);
        this.order = new Order(sdkConfiguration);
        this.organization = new Organization(sdkConfiguration);
        this.taxrate = new Taxrate(sdkConfiguration);
        this.transaction = new Transaction(sdkConfiguration);
        this.ats = new Ats(sdkConfiguration);
        this.activity = new Activity(sdkConfiguration);
        this.application = new Application(sdkConfiguration);
        this.applicationstatus = new Applicationstatus(sdkConfiguration);
        this.candidate = new Candidate(sdkConfiguration);
        this.company = new Company(sdkConfiguration);
        this.document = new Document(sdkConfiguration);
        this.interview = new Interview(sdkConfiguration);
        this.job = new Job(sdkConfiguration);
        this.scorecard = new Scorecard(sdkConfiguration);
        this.commerce = new Commerce(sdkConfiguration);
        this.collection = new Collection(sdkConfiguration);
        this.inventory = new Inventory(sdkConfiguration);
        this.item = new Item(sdkConfiguration);
        this.location = new Location(sdkConfiguration);
        this.crm = new Crm(sdkConfiguration);
        this.deal = new Deal(sdkConfiguration);
        this.event = new Event(sdkConfiguration);
        this.lead = new Lead(sdkConfiguration);
        this.pipeline = new Pipeline(sdkConfiguration);
        this.enrich = new Enrich(sdkConfiguration);
        this.person = new Person(sdkConfiguration);
        this.genai = new Genai(sdkConfiguration);
        this.model = new Model(sdkConfiguration);
        this.prompt = new Prompt(sdkConfiguration);
        this.hris = new Hris(sdkConfiguration);
        this.employee = new Employee(sdkConfiguration);
        this.group = new Group(sdkConfiguration);
        this.payslip = new Payslip(sdkConfiguration);
        this.timeoff = new Timeoff(sdkConfiguration);
        this.kms = new Kms(sdkConfiguration);
        this.page = new Page(sdkConfiguration);
        this.space = new Space(sdkConfiguration);
        this.lms = new Lms(sdkConfiguration);
        this.class_ = new Class(sdkConfiguration);
        this.course = new Course(sdkConfiguration);
        this.instructor = new Instructor(sdkConfiguration);
        this.student = new Student(sdkConfiguration);
        this.martech = new Martech(sdkConfiguration);
        this.list = new List(sdkConfiguration);
        this.member = new Member(sdkConfiguration);
        this.messaging = new Messaging(sdkConfiguration);
        this.channel = new Channel(sdkConfiguration);
        this.message = new Message(sdkConfiguration);
        this.metadata = new Metadata(sdkConfiguration);
        this.passthrough = new Passthrough(sdkConfiguration);
        this.payment = new Payment(sdkConfiguration);
        this.link = new Link(sdkConfiguration);
        this.payout = new Payout(sdkConfiguration);
        this.refund = new Refund(sdkConfiguration);
        this.repo = new Repo(sdkConfiguration);
        this.branch = new Branch(sdkConfiguration);
        this.commit = new Commit(sdkConfiguration);
        this.pullrequest = new Pullrequest(sdkConfiguration);
        this.repository = new Repository(sdkConfiguration);
        this.scim = new Scim(sdkConfiguration);
        this.user = new User(sdkConfiguration);
        this.storage = new Storage(sdkConfiguration);
        this.file = new File(sdkConfiguration);
        this.task = new Task(sdkConfiguration);
        this.project = new Project(sdkConfiguration);
        this.ticketing = new Ticketing(sdkConfiguration);
        this.customer = new Customer(sdkConfiguration);
        this.note = new Note(sdkConfiguration);
        this.ticket = new Ticket(sdkConfiguration);
        this.uc = new Uc(sdkConfiguration);
        this.call = new Call(sdkConfiguration);
        this.unified = new Unified(sdkConfiguration);
        this.apicall = new Apicall(sdkConfiguration);
        this.connection = new Connection(sdkConfiguration);
        this.integration = new Integration(sdkConfiguration);
        this.auth = new Auth(sdkConfiguration);
        this.login = new Login(sdkConfiguration);
        this.issue = new Issue(sdkConfiguration);
        this.webhook = new Webhook(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}
