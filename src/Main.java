public class Main {
    public static void main(String[] args) {
        Mylist<Integer> mylist= new Mylist<>(5);
        mylist.add(30);
        mylist.add(43);
        mylist.add(330);
        mylist.add(67);
        mylist.add(99);
        mylist.add(23);
        System.out.println(mylist.getCapacity());







    }
}