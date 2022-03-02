package lesson10_dsa.exercise;

public class MyListTest {
    static class Person {
        String name;
        int Age;

        public Person(String name, int age) {
            this.name = name;
            Age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", Age=" + Age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            Person person = (Person) obj;
            return this.name.equals (((Person) obj). name)
                    && this.Age == ((Person) obj).Age;
        }
    }

    public static void main(String[] args) {
        MyList<Person> myArrayList = new MyList<>(4);
        myArrayList.ensureCapacity(3);
        myArrayList.add(new Person("Linh", 23));
        myArrayList.add(new Person("Hoàng HH", 32));
        myArrayList.add(new Person("Thuận bê ", 26));
        myArrayList.add(new Person("Đạt 0 chín", 18), 2);
        myArrayList.remove(2);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i).toString());
        }
        System.out.println("*************************");

        MyList<Person> myArrayList2 = myArrayList.clone();

        for (int i = 0; i < myArrayList2.size(); i++) {
            System.out.println(myArrayList2.get(i).toString());
        }
        int index = myArrayList2.indexOf(new Person("Linh", 23));
        System.out.println("index = " + index);
        System.out.println("*************************");
        myArrayList2.clear();
        for (int i = 0; i < myArrayList2.size(); i++) {
            System.out.println(myArrayList2.get(i).toString());
        }
    }
}
