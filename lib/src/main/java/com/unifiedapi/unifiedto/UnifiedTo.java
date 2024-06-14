/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto;

import com.unifiedapi.unifiedto.utils.HTTPClient;
import com.unifiedapi.unifiedto.utils.SpeakeasyHTTPClient;

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
  	
    public Accounting accounting;
    public Account account;
    public Contact contact;
    public Invoice invoice;
    public Journal journal;
    public Organization organization;
    public Taxrate taxrate;
    public Transaction transaction;
    public Ats ats;
    public Activity activity;
    public Application application;
    public Applicationstatus applicationstatus;
    public Candidate candidate;
    public Company company;
    public Document document;
    public Interview interview;
    public Job job;
    public Scorecard scorecard;
    public Commerce commerce;
    public Collection collection;
    public Inventory inventory;
    public Item item;
    public Location location;
    public Crm crm;
    public Deal deal;
    public Event event;
    public Lead lead;
    public Pipeline pipeline;
    public Enrich enrich;
    public Person person;
    public Genai genai;
    public Model model;
    public Prompt prompt;
    public Hris hris;
    public Employee employee;
    public Group group;
    public Payslip payslip;
    public Timeoff timeoff;
    public Kms kms;
    public Page page;
    public Space space;
    public Martech martech;
    public List list;
    public Member member;
    public Messaging messaging;
    public Channel channel;
    public Message message;
    public Passthrough passthrough;
    public Payment payment;
    public Link link;
    public Payout payout;
    public Refund refund;
    public Storage storage;
    public File file;
    public Task task;
    public Project project;
    public Ticketing ticketing;
    public Customer customer;
    public Note note;
    public Ticket ticket;
    public Uc uc;
    public Call call;
    public Unified unified;
    public Apicall apicall;
    public Connection connection;
    public Integration integration;
    public Auth auth;
    public Login login;
    public Issue issue;
    public Webhook webhook;	

	private SDKConfiguration sdkConfiguration;

	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private SDKConfiguration sdkConfiguration = new SDKConfiguration();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.sdkConfiguration.defaultClient = client;
			return this;
		}
		
		/**
		 * Configures the SDK to use the provided security details.
		 * @param security The security details to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setSecurity(com.unifiedapi.unifiedto.models.shared.Security security) {
			this.sdkConfiguration.security = security;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.sdkConfiguration.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.sdkConfiguration.serverUrl = com.unifiedapi.unifiedto.utils.Utils.templateUrl(serverUrl, params);
			return this;
		}
		
		/**
		 * Allows the overriding of the default server by index
		 * @param serverIdx The server to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerIndex(int serverIdx) {
			this.sdkConfiguration.serverIdx = serverIdx;
			this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public UnifiedTo build() throws Exception {
			if (this.sdkConfiguration.defaultClient == null) {
				this.sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
			}
			
			if (this.sdkConfiguration.security != null) {
				this.sdkConfiguration.securityClient = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, this.sdkConfiguration.security);
			}
			
			if (this.sdkConfiguration.securityClient == null) {
				this.sdkConfiguration.securityClient = this.sdkConfiguration.defaultClient;
			}
			
			if (this.sdkConfiguration.serverUrl == null || this.sdkConfiguration.serverUrl.isBlank()) {
				this.sdkConfiguration.serverUrl = SERVERS[0];
				this.sdkConfiguration.serverIdx = 0;
			}

			if (this.sdkConfiguration.serverUrl.endsWith("/")) {
				this.sdkConfiguration.serverUrl = this.sdkConfiguration.serverUrl.substring(0, this.sdkConfiguration.serverUrl.length() - 1);
			}
			
			return new UnifiedTo(this.sdkConfiguration);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private UnifiedTo(SDKConfiguration sdkConfiguration) throws Exception {
		this.sdkConfiguration = sdkConfiguration;
		
		this.accounting = new Accounting(this.sdkConfiguration);
		
		this.account = new Account(this.sdkConfiguration);
		
		this.contact = new Contact(this.sdkConfiguration);
		
		this.invoice = new Invoice(this.sdkConfiguration);
		
		this.journal = new Journal(this.sdkConfiguration);
		
		this.organization = new Organization(this.sdkConfiguration);
		
		this.taxrate = new Taxrate(this.sdkConfiguration);
		
		this.transaction = new Transaction(this.sdkConfiguration);
		
		this.ats = new Ats(this.sdkConfiguration);
		
		this.activity = new Activity(this.sdkConfiguration);
		
		this.application = new Application(this.sdkConfiguration);
		
		this.applicationstatus = new Applicationstatus(this.sdkConfiguration);
		
		this.candidate = new Candidate(this.sdkConfiguration);
		
		this.company = new Company(this.sdkConfiguration);
		
		this.document = new Document(this.sdkConfiguration);
		
		this.interview = new Interview(this.sdkConfiguration);
		
		this.job = new Job(this.sdkConfiguration);
		
		this.scorecard = new Scorecard(this.sdkConfiguration);
		
		this.commerce = new Commerce(this.sdkConfiguration);
		
		this.collection = new Collection(this.sdkConfiguration);
		
		this.inventory = new Inventory(this.sdkConfiguration);
		
		this.item = new Item(this.sdkConfiguration);
		
		this.location = new Location(this.sdkConfiguration);
		
		this.crm = new Crm(this.sdkConfiguration);
		
		this.deal = new Deal(this.sdkConfiguration);
		
		this.event = new Event(this.sdkConfiguration);
		
		this.lead = new Lead(this.sdkConfiguration);
		
		this.pipeline = new Pipeline(this.sdkConfiguration);
		
		this.enrich = new Enrich(this.sdkConfiguration);
		
		this.person = new Person(this.sdkConfiguration);
		
		this.genai = new Genai(this.sdkConfiguration);
		
		this.model = new Model(this.sdkConfiguration);
		
		this.prompt = new Prompt(this.sdkConfiguration);
		
		this.hris = new Hris(this.sdkConfiguration);
		
		this.employee = new Employee(this.sdkConfiguration);
		
		this.group = new Group(this.sdkConfiguration);
		
		this.payslip = new Payslip(this.sdkConfiguration);
		
		this.timeoff = new Timeoff(this.sdkConfiguration);
		
		this.kms = new Kms(this.sdkConfiguration);
		
		this.page = new Page(this.sdkConfiguration);
		
		this.space = new Space(this.sdkConfiguration);
		
		this.martech = new Martech(this.sdkConfiguration);
		
		this.list = new List(this.sdkConfiguration);
		
		this.member = new Member(this.sdkConfiguration);
		
		this.messaging = new Messaging(this.sdkConfiguration);
		
		this.channel = new Channel(this.sdkConfiguration);
		
		this.message = new Message(this.sdkConfiguration);
		
		this.passthrough = new Passthrough(this.sdkConfiguration);
		
		this.payment = new Payment(this.sdkConfiguration);
		
		this.link = new Link(this.sdkConfiguration);
		
		this.payout = new Payout(this.sdkConfiguration);
		
		this.refund = new Refund(this.sdkConfiguration);
		
		this.storage = new Storage(this.sdkConfiguration);
		
		this.file = new File(this.sdkConfiguration);
		
		this.task = new Task(this.sdkConfiguration);
		
		this.project = new Project(this.sdkConfiguration);
		
		this.ticketing = new Ticketing(this.sdkConfiguration);
		
		this.customer = new Customer(this.sdkConfiguration);
		
		this.note = new Note(this.sdkConfiguration);
		
		this.ticket = new Ticket(this.sdkConfiguration);
		
		this.uc = new Uc(this.sdkConfiguration);
		
		this.call = new Call(this.sdkConfiguration);
		
		this.unified = new Unified(this.sdkConfiguration);
		
		this.apicall = new Apicall(this.sdkConfiguration);
		
		this.connection = new Connection(this.sdkConfiguration);
		
		this.integration = new Integration(this.sdkConfiguration);
		
		this.auth = new Auth(this.sdkConfiguration);
		
		this.login = new Login(this.sdkConfiguration);
		
		this.issue = new Issue(this.sdkConfiguration);
		
		this.webhook = new Webhook(this.sdkConfiguration);
	}
}