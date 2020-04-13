package List;

//   Реализовать класс для односвязного списка целых чисел.
//   Должны быть реализованы методы чтения и записи элемента по индексу,
//   удаление и добавление по индексу и добавление в конец списка.

public class Main {

    public static void main(String[] args) {
        MyList list = new MyList();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.add(55, 5);
        list.set(444, 4);
        list.remove(6);

        list.print();
        System.out.println("get list: " + list.get(9));
    }
}

