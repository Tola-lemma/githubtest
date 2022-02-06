/**
 * Design a class named Person with the following member variables:
 * FirstName
 * LastName
 * Address
 * City
 * State
 * Zip
 * PhoneNo
 * Struct DOB (day, month, year)Having a private constructor.
 * Write the appropriate accessor (getter) and mutator (setter)
 * methods for these member variables.In the main() method,
 * create an array of objects of user defined size by calling a static method for making objects.
 * Input data of all the persons and then display it by using a constant method
 */
package tola.lemma.test222;

/**
 *
 * @author Tola Lemma
 */

class PersonData
{    
    private String lastName;
    private String firstName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
   public  String getFirstName()
    {
        return firstName;
    }
   public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
   public String getAddress()
    {
        return address;
    }
  public void setAddress(String address)
    {
        this.address = address;
    }
    
   public  String getCity()
    {
        return city;
    }
   public void setCity(String city)
    {
        this.city = city;
    }
    
   public String getState()
    {
        return state;
    }
   public void setState(String state)
    {
        this.state = state;
    }
    
   public String getZip()
    {
        return zip;
    }
   public void setZip(String zip)
    {
        this.zip = zip;
    }
    
   public String getPhone()
    {
        return phone;
    }
   public void setPhone(String phone)
    {
        this.phone = phone;
    }
}
 class CustomerData extends PersonData
{
private int customerNumber;
private String dOb ;
private boolean mailingList;
    public int getCustomerNumber()
    {
        return customerNumber;
    }
    public void setCustomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }
   public String getDOb(){
    return dOb;
    }
    public void setDOb(String dOb){
    this.dOb=dOb;
    }
   public boolean getMailingList()
    {
        return mailingList;
    }
    public void setMailingList(boolean mailingList)
    {
        this.mailingList = mailingList;
    }
}
        class Test2{
public static void main(String[] args)
{
    CustomerData customer=new CustomerData();
    customer.setLastName("Tola");
    customer.setFirstName("Lemma");
    customer.setAddress("Addis Ababa");
    customer.setCity("Bishoftu");
    customer.setState("Oromia");
    customer.setZip("0004");
    customer.setPhone("+(251) 2459-7367");
    customer.setCustomerNumber(2825);
    customer.setDOb("06/02/1999");
    customer.setMailingList(true);
    System.out.println(
    customer.getLastName() + "\t" +
    customer.getFirstName() + "\t" +
    customer.getAddress() + "\t" +
    customer.getCity() + "\t" +
    customer.getState() + "\t" +
    customer.getZip() + "\t" +
    customer.getPhone() + "\tCustomer No:" +
    customer.getCustomerNumber()+ "\tDOB "+ 
    customer.getDOb()+"\tMailing List:  "+
    customer.getMailingList());
}
        }