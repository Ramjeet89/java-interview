package com.interview.utils.alight;

public class IPv4Validation {
    public String validateIPv4(String queryIP) {
        String[] segments = queryIP.split("\\.");

        // Check if there are exactly four segments
        if (segments.length != 4) {
            return "Neither";
        }

        for (String segment : segments) {
            // Check if the segment is empty
            if (segment.isEmpty()) {
                return "Neither";
            }

            // Check if the segment contains only digits
            if (!segment.matches("\\d+")) {
                return "Neither";
            }

            // Check if the segment starts with '0' but is not '0'
            if (segment.startsWith("0") && segment.length() > 1) {
                return "Neither";
            }

            // Check if the parsed integer value of the segment is between 0 and 255 (inclusive)
            int num = Integer.parseInt(segment);
            if (num < 0 || num > 255) {
                return "Neither";
            }
        }
        return "IPv4";
    }

    public static void main(String[] args) {
        IPv4Validation validator = new IPv4Validation();
        String queryIP1 = "192.168.1.1";
        String queryIP2 = "192.168.1.0";
        String queryIP3 = "192.168.01.1";
        String queryIP4 = "192.168.1.00";
        String queryIP5 = "192.168@1.1";

        System.out.println(validator.validateIPv4(queryIP1)); // Output: IPv4
        System.out.println(validator.validateIPv4(queryIP2)); // Output: IPv4
        System.out.println(validator.validateIPv4(queryIP3)); // Output: Neither
        System.out.println(validator.validateIPv4(queryIP4)); // Output: Neither
        System.out.println(validator.validateIPv4(queryIP5)); // Output: Neither
    }
}
