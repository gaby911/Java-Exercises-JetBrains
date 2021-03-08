class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if(firstName != null){
            this.firstName=firstName;
        }else{
            this.firstName="";
        }
    }

    public void setLastName(String lastName) {
        // write your code here
          if(lastName != null){
            this.lastName=lastName;
        }else{
            this.lastName="";
        }
    }

    public String getFullName() {
        
        
        if(firstName == null){
            return lastName;
        } else if(lastName ==null){
            return firstName;
        }else if(firstName == "" && lastName ==""){
            return "Unknown";
        }else {
            return firstName + " " + lastName;
        }
    }
}
