import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void createPerson() {
        String firstAndLastName = "petya,ivanov";
        Person p = Person.createPerson(firstAndLastName);

        Assert.assertNotNull(p);
        Assert.assertEquals("first name", "petya", p.getFirstName());
        Assert.assertEquals("last name", "ivanov", p.getLastName());
    }
}