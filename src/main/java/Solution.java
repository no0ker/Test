import java.util.*;

import static java.lang.Math.min;

public class Solution {
    public static void main(String[] args) {
        Res2 res = new Res2();

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; ) {
            String line = scanner.nextLine();
            if ("".equals(line)) {
                continue;
            }
            res.add(line);
            i++;
        }

        res.getRes();

    }
}

class Res2 {
    private Map<String, String> results = new LinkedHashMap<>();
    private Map<String, Integer> resultsNo = new HashMap<>();

    public void add(String sOriginal) {
        String s = zz(sOriginal);

        if(results.containsKey(s)){
            results.put(s, results.get(s) + " " + sOriginal);
            resultsNo.put(s, resultsNo.get(s) + 1);
            return;
        } else {
            results.put(s, sOriginal);
            resultsNo.put(s, 1);
        }
    }

    private String zz(String valO) {
        String val = valO.toLowerCase();
        if (val.endsWith("@gmail.com")) {
            return val.substring(0, minn(val.indexOf("@"), val.indexOf("+"))).replaceAll("\\.", "") + "@gmail.com";
        } else {
            return val;
        }
    }

    private int minn(int i, int i1) {
        if (i1 <= 0) {
            return i;
        } else {
            return min(i, i1);
        }
    }

    public void getRes() {
//        StringBuilder res = new StringBuilder();
//        res.append(results.keySet().size());
        System.out.println(results.keySet().size());
//        res.append("\n");
        results
                .keySet()
                .stream()
                .forEachOrdered(i -> {
//                    res.append(resultsNo.get(i) + " " + results.get(i) + "\n");
                    System.out.println(resultsNo.get(i) + " " + results.get(i));
                });
//        return res.toString();
    }
}
