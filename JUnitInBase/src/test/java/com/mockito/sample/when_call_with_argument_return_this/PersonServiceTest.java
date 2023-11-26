package com.mockito.sample.when_call_with_argument_return_this;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;

public class PersonServiceTest {

    @Test
    public void testAddPerson() {
        // Create a mock of PersonService
        PersonService personServiceMock = mock(PersonService.class);

        // Argument Matcher using custom method
        ArgumentMatcher<Person> personMatcher = new ArgumentMatcher<Person>() {
            @Override
            public boolean matches(Person person) {
                return person.getName().equals("John") && person.getAge() >=18 ;
            }
        };

        // Use the matcher in stubbing; ArgumentMatcher!!
        when(personServiceMock.addPerson(argThat(personMatcher))).thenReturn(true);

        // Create a person instance
        Person person = new Person("John", 30);

        // Call the method with the person
        boolean result = personServiceMock.addPerson(person);

        // Verify the method was called with the correct arguments
        verify(personServiceMock).addPerson(argThat(personMatcher));

        // Assertions (optional)
        //assertTrue(result);
    }
}
