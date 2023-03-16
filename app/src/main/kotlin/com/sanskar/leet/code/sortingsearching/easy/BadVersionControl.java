package com.sanskar.leet.code.sortingsearching.easy;

public class BadVersionControl extends VersionControl {
    public BadVersionControl(Integer version) {
        super(version);
    }

    public int firstBadVersion(int n) {
        int i = 0;
        int j = n;
        int mid = 0;
        while (i != j) {
            mid = i + j / 2;
            if (isBadVersion(mid)) {
                j = mid;
            } else {
                i = mid;
            }
        }
        return mid;
    }
}



