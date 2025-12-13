
import java.util.*;
import java.util.regex.*;

class Solution {
    static class Coupon {
        String code;
        String businessLine;

        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Coupon> validCoupons = new ArrayList<>();
        Set<String> allowedCategories = new HashSet<>(Arrays.asList("electronics", "grocery", "pharmacy", "restaurant"));
        Pattern validCodePattern = Pattern.compile("^[a-zA-Z0-9_]+$");

        for (int i = 0; i < code.length; i++) {
            if (code[i] == null || code[i].isEmpty()) continue;
            if (!validCodePattern.matcher(code[i]).matches()) continue;
            if (!allowedCategories.contains(businessLine[i])) continue;
            if (!isActive[i]) continue;

            validCoupons.add(new Coupon(code[i], businessLine[i]));
        }

        Map<String, Integer> categoryOrder = new HashMap<>();
        categoryOrder.put("electronics", 0);
        categoryOrder.put("grocery", 1);
        categoryOrder.put("pharmacy", 2);
        categoryOrder.put("restaurant", 3);

        validCoupons.sort((a, b) -> {
            if (!a.businessLine.equals(b.businessLine)) {
                return Integer.compare(categoryOrder.get(a.businessLine), categoryOrder.get(b.businessLine));
            }
            return a.code.compareTo(b.code);
        });

        List<String> result = new ArrayList<>();
        for (Coupon c : validCoupons) {
            result.add(c.code);
        }

        return result;
    }
}
