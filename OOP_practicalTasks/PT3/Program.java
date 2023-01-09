// 1. Класс Группа содержит в себе коллекцию Студентов.
// По группе можно перемещаться с помощью итератора.
// (Это повторяет 1-ю задачу из классной работы).
// Остальные задачи надстраиваются поверх неё.
// 2. Создайте класс GroupListIterator,
// который позволяет перемещаться по группе в обоих направлениях.
// Он реализует интерфейс ListIterator<Student>.
// Добавьте в Группу метод listIterator (),
// который позволяет начать итерацию с помощью GroupListIterator.
// 3. Создайте класс ReverseIterator,
// который работает как итератор по группе в обратном направлении:
// • Он отслеживает текущую позицию в переборе
// • Он изначально выставлен на конечную позицию
// • Он движется справа налево
// Проверьте, как он работает.

package OOP_practicalTasks.PT3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(Arrays.asList(
            new Student("Иванов", "12.04.2000", 4.5f), 
            new Student("Сидорова", "26.11.1999", 4.7f),
            new Student("Петров", "02.01.2001", 3.8f)));
        
        // StudentGroupIterator studentIt = new StudentGroupIterator(studentGroup);

        // Iterator<Student> studentIt = studentGroup.iterator();

        // while (studentIt.hasNext()) {
        //     System.out.println(studentIt.next());
        // }

        System.out.println("----");
        System.out.println("Проверка StudentGroupIterator => ");
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----");
        System.out.println("Проверка GroupListIterator => ");
        Iterator<Student> listIteratorPrevious = studentGroup.listIterator(2);
        while (((ListIterator<Student>) listIteratorPrevious).hasPrevious()) {
            System.out.println(((ListIterator<Student>) listIteratorPrevious).previous());
        }

        System.out.println("----");
        System.out.println("Смена направления ");
        Iterator<Student> listIteratorNext = studentGroup.listIterator(0);
        while (((ListIterator<Student>) listIteratorNext).hasNext()) {
            System.out.println(((ListIterator<Student>) listIteratorNext).next());
        }

        System.out.println("----");
        System.out.println("Проверка ReverseIterator => ");
        Iterator<Student> reverseIterator = studentGroup.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

    }
}
