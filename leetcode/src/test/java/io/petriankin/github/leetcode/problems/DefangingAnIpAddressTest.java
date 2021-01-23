package io.petriankin.github.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DefangingAnIpAddressTest {

    private final DefangingAnIpAddress solution = new DefangingAnIpAddress();

    @Test
    void defangingAnIpAddressTestExampleTestCase1() {
        String result = solution.defangIPaddr("1.1.1.1");
        assertThat(result).isEqualTo("1[.]1[.]1[.]1");
    }

    @Test
    void defangingAnIpAddressTestExampleTestCase2() {
        String result = solution.defangIPaddr("255.100.50.0");
        assertThat(result).isEqualTo("255[.]100[.]50[.]0");
    }
}
