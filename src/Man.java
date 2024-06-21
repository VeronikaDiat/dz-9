public class Man extends Person {

    public Man (String firstName, String lastName, int age, String partner){
        super (firstName,lastName,age,partner);
    }   public boolean isRetired(int age) {
        return age >= 65;
    }  @Override
    protected void updateLastName(Person partner) {
    }
}
