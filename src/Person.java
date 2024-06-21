public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public boolean isRevertToPreviousLastName() {
        return revertToPreviousLastName;
    }

    public void setRevertToPreviousLastName(boolean revertToPreviousLastName) {
        this.revertToPreviousLastName = revertToPreviousLastName;
    }

    private boolean revertToPreviousLastName;

    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }

    private String previousLastName;


    // Constructor
    public Person(String firstName, String lastName, int age, String partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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
        this.previousLastName = this.lastName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person isPartner() {
        return partner.isPartner();
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    protected abstract void updateLastName(Person partner);

    public void registerPartnership(Person partner){
        this.setPartner(partner.isPartner());
        partner.setPartner(this.isPartner());
        this.updateLastName(partner);
        partner.updateLastName(this);

    }

    public void deregisterPartnership() {
        if (this.partner == null) {
            System.out.println("No Partnership to deregister");
            return;
        }
        Person formerPartner = this.partner;
        this.setPartner(null);
        formerPartner.setPartner(null);
        ;
        if(isRevertToPreviousLastName()){
            this.setLastName(this.previousLastName);
            formerPartner.setLastName(formerPartner.getPreviousLastName());
        }
    }


}
