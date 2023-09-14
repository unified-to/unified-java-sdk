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
  	
    public Agent agent;
    public Apicall apicall;
    public Application application;
    public Ats ats;
    public Auth auth;
    public Call call;
    public Candidate candidate;
    public Company company;
    public Connection connection;
    public Contact contact;
    public Crm crm;
    public Customer customer;
    public Deal deal;
    public Document document;
    public Employee employee;
    public Enrich enrich;
    public Event event;
    public File file;
    public Group group;
    public Hris hris;
    public Integration integration;
    public Interview interview;
    public Job job;
    public Lead lead;
    public List list;
    public Login login;
    public Martech martech;
    public Member member;
    public Note note;
    public Passthrough passthrough;
    public Person person;
    public Pipeline pipeline;
    public Team team;
    public Ticket ticket;
    public Ticketing ticketing;
    public Uc uc;
    public Unified unified;
    public User user;
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
		
		this.agent = new Agent(this.sdkConfiguration);
		
		this.apicall = new Apicall(this.sdkConfiguration);
		
		this.application = new Application(this.sdkConfiguration);
		
		this.ats = new Ats(this.sdkConfiguration);
		
		this.auth = new Auth(this.sdkConfiguration);
		
		this.call = new Call(this.sdkConfiguration);
		
		this.candidate = new Candidate(this.sdkConfiguration);
		
		this.company = new Company(this.sdkConfiguration);
		
		this.connection = new Connection(this.sdkConfiguration);
		
		this.contact = new Contact(this.sdkConfiguration);
		
		this.crm = new Crm(this.sdkConfiguration);
		
		this.customer = new Customer(this.sdkConfiguration);
		
		this.deal = new Deal(this.sdkConfiguration);
		
		this.document = new Document(this.sdkConfiguration);
		
		this.employee = new Employee(this.sdkConfiguration);
		
		this.enrich = new Enrich(this.sdkConfiguration);
		
		this.event = new Event(this.sdkConfiguration);
		
		this.file = new File(this.sdkConfiguration);
		
		this.group = new Group(this.sdkConfiguration);
		
		this.hris = new Hris(this.sdkConfiguration);
		
		this.integration = new Integration(this.sdkConfiguration);
		
		this.interview = new Interview(this.sdkConfiguration);
		
		this.job = new Job(this.sdkConfiguration);
		
		this.lead = new Lead(this.sdkConfiguration);
		
		this.list = new List(this.sdkConfiguration);
		
		this.login = new Login(this.sdkConfiguration);
		
		this.martech = new Martech(this.sdkConfiguration);
		
		this.member = new Member(this.sdkConfiguration);
		
		this.note = new Note(this.sdkConfiguration);
		
		this.passthrough = new Passthrough(this.sdkConfiguration);
		
		this.person = new Person(this.sdkConfiguration);
		
		this.pipeline = new Pipeline(this.sdkConfiguration);
		
		this.team = new Team(this.sdkConfiguration);
		
		this.ticket = new Ticket(this.sdkConfiguration);
		
		this.ticketing = new Ticketing(this.sdkConfiguration);
		
		this.uc = new Uc(this.sdkConfiguration);
		
		this.unified = new Unified(this.sdkConfiguration);
		
		this.user = new User(this.sdkConfiguration);
		
		this.webhook = new Webhook(this.sdkConfiguration);
	}
}