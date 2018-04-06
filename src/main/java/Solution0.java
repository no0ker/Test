import java.util.*;
import java.util.stream.Collectors;

public class Solution0 {
    public static void main(String[] args) {
        Res res = new Res();

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        res.init(size);
        for (int i = 0; i < size; i++) {
            short val = scanner.nextShort();
            res.add(val);
        }

        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            short from = scanner.nextShort();
            short to = scanner.nextShort();
            System.out.println(res.getRes(from, to));
        }
    }
}


class Res {
    private List<Short> grades;
    private Map<Short, Map<Short, Short>> results;

    void init(int size) {
        grades = new ArrayList<Short>(size);
        results = new HashMap<Short, Map<Short, Short>>();
    }

    void add(short val) {
        grades.add(val);
    }

    short getRes(int from, int to) {
        return getRes((short) from, (short) to);
    }

    short getRes(short from, short to) {
        if (results.containsKey(from) && results.get(from).containsKey(to)) {
            return results.get(from).get(to);
        }

        List<Short> list = new ArrayList<Short>(grades.subList(from, to + 1));

        if(list.stream().distinct().collect(Collectors.toList()).size() == 1){
            return list.get(0);
        }

        Collections.sort(list);
        int size = list.size();
        short res;
        if (size % 2 == 0) {
            res = list.get(size / 2 - 1);
        } else {
            res = list.get(size / 2);
        }

        if (!results.containsKey(from)) {
            results.put(from, new HashMap<Short, Short>());
        }
        results.get(from).put(to, res);

        return res;
    }
}
