package com.task.ht2;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .withName("Vova")
                .withSurname("Ts")
                .withEmail("qwerty@12345gmail.com")
                .withPassword("12345")
                .withCode(777).build();
        System.out.println(user.toString());
    }

}
