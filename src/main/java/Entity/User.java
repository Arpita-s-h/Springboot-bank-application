package Entity;
	
	import java.math.BigDecimal;
	import java.time.LocalDateTime;

	import org.hibernate.annotations.CreationTimestamp;
	import org.hibernate.annotations.UpdateTimestamp;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name =  "users")
	public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String firstName;
		private String lastName;
		private String otherName;
		private String gender;
		private String address;
		private String stateOfOrigin;
		private String accountNumber;
		private BigDecimal accountBalance;
		private String email;
		private String phooneNumber;
		private String alternatePhoneNumber;
		private String status;
		@CreationTimestamp
		private LocalDateTime createdAt;
		@UpdateTimestamp
		private LocalDateTime modifiedAt;
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(Long id, String firstName, String lastName, String otherName, String gender, String address,
				String stateOfOrigin, String accountNumber, BigDecimal accountBalance, String email, String phooneNumber,
				String alternatePhoneNumber, String status, LocalDateTime createdAt, LocalDateTime modifiedAt) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.otherName = otherName;
			this.gender = gender;
			this.address = address;
			this.stateOfOrigin = stateOfOrigin;
			this.accountNumber = accountNumber;
			this.accountBalance = accountBalance;
			this.email = email;
			this.phooneNumber = phooneNumber;
			this.alternatePhoneNumber = alternatePhoneNumber;
			this.status = status;
			this.createdAt = createdAt;
			this.modifiedAt = modifiedAt;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getOtherName() {
			return otherName;
		}
		public void setOtherName(String otherName) {
			this.otherName = otherName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getStateOfOrigin() {
			return stateOfOrigin;
		}
		public void setStateOfOrigin(String stateOfOrigin) {
			this.stateOfOrigin = stateOfOrigin;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public BigDecimal getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(BigDecimal accountBalance) {
			this.accountBalance = accountBalance;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhooneNumber() {
			return phooneNumber;
		}
		public void setPhooneNumber(String phooneNumber) {
			this.phooneNumber = phooneNumber;
		}
		public String getAlternatePhoneNumber() {
			return alternatePhoneNumber;
		}
		public void setAlternatePhoneNumber(String alternatePhoneNumber) {
			this.alternatePhoneNumber = alternatePhoneNumber;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
		public LocalDateTime getModifiedAt() {
			return modifiedAt;
		}
		public void setModifiedAt(LocalDateTime modifiedAt) {
			this.modifiedAt = modifiedAt;
		}
		
		
		
		
		

	}

