package practice_2;

import java.util.*;

public class CollectionJava1 {
    public static void main(String[] args) {
//        //task-1
//        List <Integer> num = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
//        num.add(5);
//        System.out.println(num);
//
//        //task-2
//        List <Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 8, 9));
//        for (int a : nums){
//            if (a % 2 == 0){
//                System.out.println(a);
//            }
//        }
//
////        task-3
//        List <String> line = new ArrayList<>();
//        line.add("q");
//        line.add("qw");
//        line.add("qwe");
//        line.add("qwer");
//        line.add("qwert");
//        line.add("qwerty");
//        String word = "";
//        for (String len : line){
//            if (len.length() > word.length()){
//                word = len;
//            }
//        }
//        System.out.println(word);
//
//
//        //task-4
//        List <Integer> num = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 10, 12));
//        int a = 0;
//        for (int b : num){
//            a = a + b;
//        }
//        System.out.println(a);
//
//        //task-5
//        List <Integer> num = new ArrayList<>(Arrays.asList(1, 2, 4, 20, 5, 10, 12));
//        int a = 0;
//        for (int b : num){
//            if (b > a){
//                a = b;
//            }
//        }
//        System.out.println(a);
//
////        Linked
////        task-1
//        List <String> lines = new LinkedList<>(Arrays.asList("q", "qw", "qwe", "qwer", "qwert", "qwerty"));
//        System.out.println(lines);
//
////        task-2
//        List <String> lines = new LinkedList<>();
//        lines.add("q");
//        lines.add("qw");
//        lines.add("qwe");
//        System.out.println(lines);
//
////        task-3
//        Deque<String> lines = new LinkedList<>(Arrays.asList("q", "qw", "qwe", "qwer", "qwert", "qwerty"));
//        System.out.println(lines.getFirst());
//        System.out.println(lines.getLast());
//
//        //task-4
//        List <Integer> lines = new LinkedList<>(Arrays.asList(1,2,3,5,7,9));
//                int a = 0;
//        for (int b : lines){
//            a = a + b;
//        }
//        System.out.println(a);
//
////        task-5
//        List <Integer> lines = new LinkedList<>(Arrays.asList(1,2,3,5,7,9));
//        ListIterator<Integer> it = lines.listIterator();
//        while (it.hasNext()){
//            int b = it.next();
//            System.out.println(b);
//        }
//
//        System.out.println("-----------");
//
//        while (it.hasPrevious()){
//            int a = it.previous();
//            System.out.println(a);
//        }
//
////          HashSet
////          task-1
//        Set <Integer> nums = new HashSet<>(Arrays.asList(1,2,4,5,6));
//        System.out.println(nums);

//        //task-2
//        Set <Integer> nums = new HashSet<>();
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//        nums.add(4);
//        nums.add(5);
//        nums.add(6);
//        nums.add(7);
//        nums.add(8);
//        nums.add(9);
//        nums.add(10);
//        boolean a = nums.contains(4);
//        System.out.println(a);


//        //task-3
//        List <String> line = new ArrayList<>();
//        line.add("q");
//        line.add("q");
//        line.add("qw");
//        line.add("q");
//        line.add("qw");
//
//        Set <String> lineNoDublicate = new HashSet<>(line);
//        System.out.println(lineNoDublicate);


//        //task-4
//        Set<String> names = new HashSet<>();
//        names.add("Maks");
//        names.add("Petr");
//        names.add("Sveta");
//
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//
//        if (names.contains(name)){
//            System.out.println("Ваше имя здесь есть!");
//        }

//        //LinkedHashSet
//        //task-1
//
//        Set <String> lines = new LinkedHashSet<>();
//        lines.add("q");
//        lines.add("qw");
//        lines.add("qwe");
//        lines.add("qwer");
//        lines.add("qwert");
//
//        System.out.println(lines);

//        //task-2
//        Set <String> lines = new LinkedHashSet<>();
//        lines.add("a");
//        lines.add("a");
//        System.out.println(lines);
//
//        //TreeSet
//        //task-1
//        Set <Integer> nums = new TreeSet<>();
//        nums.add(7);
//        nums.add(2);
//        nums.add(1);
//        nums.add(4);
//        nums.add(5);
//        System.out.println(nums);
//
//        //HashMap
//        //task-1
//
//        Map <String, Integer> people = new HashMap<>();
//        people.put("ilya", 1);
//        people.put("maks", 2);
//        people.put("kolya", 3);
//        people.put("petya", 4);
//        people.put("grisha", 5);
//        System.out.println(people);

//        //task-2
//        Map <String, Integer> people = new HashMap<>();
//        people.put("ilya", 1);
//        people.put("maks", 2);
//        people.put("kolya", 3);
//        people.put("petya", 4);
//        people.put("grisha", 5);
//
//        boolean a = people.containsKey("ilya");
//        System.out.println(a);

//        //LinkedHashMap
//        //task-1
//        Map <String, Integer> people = new LinkedHashMap<>();
//        people.put("ilya", 1);
//        people.put("maks", 2);
//        people.put("kolya", 3);
//        people.put("petya", 4);
//        people.put("grisha", 5);
//
//        System.out.println(people);

//        //TreeMap
//        //task-1
//        Map <String, Integer> student = new TreeMap<>();
//        student.put("ilya", 1);
//        student.put("maks", 5);
//        student.put("grisha", 2);
//        student.put("jora", 3);
//        student.put("vasya", 10);
//
//        System.out.println(student);
//
//        //task-2
//        NavigableMap <Integer, Integer> nums = new TreeMap<>();
//        nums.put(1, 10);
//        nums.put(2, 10);
//        nums.put(3, 10);
//        nums.put(4, 10);
//        nums.put(5, 10);
//
//        Integer a = nums.lastKey();
//        Integer b = nums.firstKey();
//
//        System.out.println(a);
//        System.out.println(b);

//        //PriorityQueue
//        //task-1
//        Queue<Integer> nums = new PriorityQueue<>();
//        nums.add(9);
//        nums.add(10);
//        nums.add(7);
//        nums.add(4);
//        nums.add(5);
//        int a = nums.poll();
//        System.out.println(a);
//        System.out.println(nums);

//        //task-1 ArrayDeque
//        Deque <Integer> nums = new ArrayDeque<>();
//        nums.add(1);
//        nums.add(2);
//        nums.add(5);
//        nums.add(10);
//        nums.add(3);
//        while(!nums.isEmpty()){
//            int a  = nums.removeLast();
//            System.out.println(a);
//        }

        }
}
