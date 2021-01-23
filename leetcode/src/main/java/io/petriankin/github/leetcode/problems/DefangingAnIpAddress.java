package io.petriankin.github.leetcode.problems;

public class DefangingAnIpAddress {
    public String defangIPaddr(String address) {
        return String.join("[.]", address.split("\\."));
    }
}
