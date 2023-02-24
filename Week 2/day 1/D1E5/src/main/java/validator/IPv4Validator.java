package validator;

public class IPv4Validator {
    public static boolean validateIpv4Address(String ipAddress) {
        String[] blocks = ipAddress.split("\\.");
        if (blocks.length != 4) {
            return false;
        }
        for (String block : blocks) {
            if (!block.matches("\\d+")) {
                return false;
            }
            int value = Integer.parseInt(block);
            if (value < 0 || value > 255) {
                return false;
            }
        }
        int lastBlock = Integer.parseInt(blocks[3]);
        if (lastBlock == 0 || lastBlock == 255) {
            return false;
        }
        return true;
    }
}
