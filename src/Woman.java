public class Woman extends Person {

    public Woman  (String firstName, String lastName, int age, String partner){
        super (firstName,lastName,age,partner);
    }

    public boolean isRetired(int age) {
        return age >= 60;
    }
    @Override
    protected void updateLastName(Person partner) {
        this.setLastName(partner.getLastName());
    }


    }
