package com.task.object;



import javax.xml.bind.ValidationException;

public class Main {

    public static void main(String[] args) throws ValidationException {

        Address address = new Address("Kyiv", 777);
        User user = new User("Vova","Ts", 20,true, address);
        System.out.println(user);
        address.setCity("Kiev1");
        System.out.println(user);

        User user1 = new User("Roma","Ts", 20,true, address);
        System.out.println("Equals: " + user.equals(user1));
        boolean hashCode = user.hashCode() == user1.hashCode();
        System.out.println("HashCode: " + hashCode);



    }

}
