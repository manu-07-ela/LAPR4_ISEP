package eapli.base.clientmanagement.domain;

import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ClientTest {

    private static final Name CLIENT_NAME = Name.valueOf("Rita Ariana","de Castro Ribeiro e Pereira Sobral");
    private static final Email CLIENT_EMAIL = Email.valueOf("arianasobral26@outlook.pt");
    private static final VAT CLIENT_VAT = VAT.valueOf("PT999999999");
    private static final PhoneNumber CLIENT_PHONE_NUMBER = PhoneNumber.valueOf("+351939213522");
    private static final PostalAddress CLIENT_POSTAL_ADDRESS = PostalAddress.valueOf("Rua do Ouro","353","4505-102","Aveiro","Portugal");

    private Set<PostalAddress> postalAddresses = new HashSet<>();

    private Client buildClient() {
        postalAddresses.add(CLIENT_POSTAL_ADDRESS);
        return new ClientBuilder().named(CLIENT_NAME).withEmail(CLIENT_EMAIL).withVAT(CLIENT_VAT).withPhoneNumber(CLIENT_PHONE_NUMBER).withAddresses(postalAddresses).build();
    }


    @Test
    public void ensureClientWithNameEmailPhoneNumberVatAndPostalAddress() {
        postalAddresses.add(CLIENT_POSTAL_ADDRESS);
        new Client(CLIENT_NAME,CLIENT_VAT,CLIENT_EMAIL,CLIENT_PHONE_NUMBER,postalAddresses);
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHaveName() {
        postalAddresses.add(CLIENT_POSTAL_ADDRESS);
        new Client(null,CLIENT_VAT,CLIENT_EMAIL,CLIENT_PHONE_NUMBER,postalAddresses);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHaveVat() {
        postalAddresses.add(CLIENT_POSTAL_ADDRESS);
        new Client(CLIENT_NAME,null,CLIENT_EMAIL,CLIENT_PHONE_NUMBER,postalAddresses);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHaveEmail() {
        postalAddresses.add(CLIENT_POSTAL_ADDRESS);
        new Client(CLIENT_NAME,CLIENT_VAT,null,CLIENT_PHONE_NUMBER,postalAddresses);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHavePhoneNumber() {
        postalAddresses.add(CLIENT_POSTAL_ADDRESS);
        new Client(CLIENT_NAME,CLIENT_VAT,CLIENT_EMAIL,null,postalAddresses);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHavePostalAddress() {
        new Client(CLIENT_NAME,CLIENT_VAT,CLIENT_EMAIL,CLIENT_PHONE_NUMBER,null);
    }

}