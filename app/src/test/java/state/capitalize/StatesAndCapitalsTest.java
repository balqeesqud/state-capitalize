/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package state.capitalize;

import org.junit.jupiter.api.Test;
import state.capitalize.statesAndCapitals.StatesAndCapitals;

import java.io.IOException;

class StatesAndCapitalsTest
{
    @Test void Test_states_and_capitals() throws IOException
    {
        StatesAndCapitals sut = new StatesAndCapitals();
        sut.testStatesAndCapitals();
    }
}