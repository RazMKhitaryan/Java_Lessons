import java.util.*;

public class Test {
    public static void main(String[] args) {

        Set<Human> hm = new LinkedHashSet<>();

        hm.add(new Human("Raz", 24));
        hm.add(new Human("Arpi", 20));
        hm.add(new Human("Artur", 23));


        List<Human> ss1 = new LinkedList<>(hm);
        ss1.sort(new NameCamparator().reversed());
        //System.out.println(ss1);
        StringJoiner st1 = new StringJoiner(" ");
        for (Human s : ss1) {
            st1.add(s.toString());
        }
        //  System.out.println(st1);

        Stack<Human> stack = new Stack();
        stack.add(new Human("Raz", 24));
        stack.add(new Human("Arpi", 20));
        stack.add(new Human("Artur", 23));

        //  System.out.println(stack.peek());

        Iterator<Human> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(stack.pop());
        }


        List<Integer> ss = new LinkedList<>(Arrays.asList(4, 7, 8, 6, 1, 2, 4, 7, 3));
        Stack<Integer> st = new Stack();

        System.out.println(st);
        st.addAll(ss);
        System.out.println(ss);
        st.push(96);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.peek();
        System.out.println(st);
        System.out.println(st.search(6));

        System.out.println("-----------------------");

        Iterator<Integer> iterator1 = st.iterator();
        while (iterator.hasNext()) {
            int x = iterator1.next();
            System.out.println(x);
        }
        System.out.println(st.get(2));
        System.out.println(st.isEmpty());
        st.clear();
        System.out.println(st);

        Queue<Integer> qe = new LinkedList<>();
        qe.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("-------------------------");
        System.out.println(qe);

        qe.offer(55);
        System.out.println(qe);
        qe.poll();
        qe.poll();
        qe.poll();
        System.out.println(qe);
        System.out.println(qe.peek());
        qe.remove(5);
        System.out.println(qe);
        System.out.println(qe.contains(2));
        qe.clear();
        System.out.println(qe);
        System.out.println(qe.isEmpty());


        PriorityQueue<Integer> qp = new PriorityQueue<>();
        qp.offer(4);
        qp.offer(44);
        qp.offer(3);
        qp.offer(1);
        qp.offer(87);
        System.out.println(qp);
        qp.offer(87);
        System.out.println(qp);
        qp.add(97);
        System.out.println(qp);
        qp.add(6);
        System.out.println(qp);
        qp.add(9);
        System.out.println(qp);
        qp.offer(21);
        System.out.println(qp);
        qp.add(2);
        System.out.println(qp);
        System.out.println(qp.poll());//FIFO
        qp.clear();
        System.out.println(qp);


    }
}
