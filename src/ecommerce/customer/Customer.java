package ecommerce.customer;


	
	public class Customer implements java.io.Serializable {
		//private String custName;
		private String custName;
		private long aadhar;
		private String address;
		private long phone;	
		private String password;
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public long getAadhar() {
			return aadhar;
		}
		public void setAadhar(long aadhar) {
			this.aadhar = aadhar;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
	}

	





