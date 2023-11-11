// tests/PasswordValidatorTest.java

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    // setup the test Object once
    private final PasswordValidator validator = new PasswordValidator();

    @Test
    public void testPasswordIsValid() {
        // All criteria are met
        assertTrue(validator.validate("P@ssw0rd1"), "Password should be valid");
    }

    // add the other 6 tests here
    @Test
    public void testPasswordIsTooShort() {
        assertTrue(validator.validate("P@ssw0rd"), "Password should be en least 8\");\n" +
                "    }");
    }

    @Test
    public void testPasswordIsTooLong() {
        assertTrue(validator.validate("P@ssw0rd1j"), "Password should be less than 8\");\n" +
                "    }");
    }

    @Test
    void testPasswordIsNull() {
        //Arrange
        PasswordValidator passwoord = new PasswordValidator();
        //Act
        Boolean result = passwoord.validate(null); // Pass null as input
        //Assert
        assertFalse(validator.validate(" "), "Password invalid\");\n" +
                "    }");
    }
    @Test
    public void testPasswordWithoutLetters() {
        assertFalse(validator.validate("2@46806214"), "Password should include letters\");\n" +
                "    }");
    }
    @Test
    public void testPasswordWithoutDigits() {
        assertFalse(validator.validate("P@sswhrddj"), "Password should include digits\");\n" +
                "    }");
    }
    @Test
    public void testPasswordWithoutSpecialCharacters() {
        assertFalse(validator.validate("Phssw0rd1"), "Password should include a special char\");\n" +
                "    }");
    }
}