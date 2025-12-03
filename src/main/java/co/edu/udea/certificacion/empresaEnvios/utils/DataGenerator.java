package co.edu.udea.certificacion.empresaEnvios.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {

    private static final Faker faker = new Faker(new Locale("es"));

    public static String generateFullName() {
        return faker.name().firstName() + " " + faker.name().lastName();
    }

    public static String generateEmail() {
        String firstName = faker.name().firstName()
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");
        String lastName = faker.name().lastName()
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");
        int randomNumber = faker.number().numberBetween(100, 9999);
        return firstName + lastName + randomNumber + "@gmail.com";
    }

    public static String generatePhoneNumber() {
        return String.valueOf(faker.number().numberBetween(3000000000L, 3999999999L));
    }

    public static String generatePassword() {
        return faker.internet().password(8, 12, true, false);
    }
}

