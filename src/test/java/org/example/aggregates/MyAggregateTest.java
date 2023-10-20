package org.example.aggregates;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MyAggregateTest {
    @Test
    void myFirstTest() {
        assertThat(0, is(1));
    }
}
