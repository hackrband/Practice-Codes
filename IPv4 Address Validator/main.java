import java.util.Scanner;

// Class to hold the regex pattern for an IP address
class MyRegex {
    // Regex checks four numbers (1-3 digits) separated by dots
    // Leading zeros are allowed
    public static final String pattern = "^([0-9]{1,3}\\.){3}[0-9]{1,3}$";
}

public class IPAddressValidator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read IP addresses from input until no more lines
        while (in.hasNext()) {
            String IP = in.next();

            // First, check if it matches the general format
            if (IP.matches(MyRegex.pattern)) {
                // Split the IP into its four parts
                String[] parts = IP.split("\\.");
                boolean valid = true;

                // Check each part is <= 255
                for (String part : parts) {
                    if (Integer.parseInt(part) > 255) {
                        valid = false;
                        break;
                    }
                }

                System.out.println(valid);
            } else {
                System.out.println(false);
            }
        }

        in.close();
    }
}
