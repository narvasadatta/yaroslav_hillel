import java.util.ArrayList;
import java.util.List;

//      Реализовать класс для односвязного списка целых чисел.
//      Должны быть реализованы методы чтения и записи элемента по индексу,
//      удаление и добавление по индексу и добавление в конец списка.

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(190);                       //добавляю в конец
        list.add(790);                       //добавляю в конец
        list.add(34);                        //добавляю в конец
        list.add(1);                         //добавляю в конец
        list.add(7);                         //добавляю в конец
        list.add(8);                         //добавляю в конец

        list.set(5, 33);                      //записываю по индексу
        list.add(4, 66);       //добавляю по индексу
        list.remove(7);                //удаляю по индексу

        System.out.println(list.get(4));      //чтение по индексу
        System.out.println(list.get(2));      //чтение по индексу

        list.set(6, 111);                     //записываю по индексу
    }
}
