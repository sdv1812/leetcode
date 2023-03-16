package com.sanskar.leet.code.sortingsearching.easy;

import java.util.Random;

public class VersionControl {
    private final Integer badVersion;

    public VersionControl(Integer version) {
        Random random = new Random();
        this.badVersion = random.nextInt(version);
        System.out.println("bad version = " + this.badVersion);
    }
    boolean isBadVersion(int version) {
        return version >= this.badVersion;
    }
}
