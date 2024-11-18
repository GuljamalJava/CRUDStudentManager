import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*todo Создайте класс Student для  представления информации о студентах и класс
            StudentManager, который  будет управлять массивом  объектов Student. Реализуйте
            методы в StudentManager для добавления, поиска по ID, данных о студентах.
            Методы примерно такие же как в предыдущем задании  обновления и удаления */

        StudentManager manager = new StudentManager();

        System.out.println(manager.addStudent(new Student(19, "English", 1l, "Aysha")));
        System.out.println(manager.addStudent(new Student(23, "JS", 2l, "Elmira")));


        Student student = manager.findById(1);
        if(manager.findById(1) !=null){
            System.out.println("Find by id:" + student);

        }else{
            System.out.println("not foun student!");

        }


       manager.updateStudent(1l,new Student(20,"Peaksoft",1l,"Ainura"));
//        System.out.println("Ozgorulgon student: " + Update);

        System.out.println( manager.deleteById(2l));
        System.out.println("Ochurulgon jana Ozgorulgon student:" + Arrays.toString(manager.getAll()));


    }


    }

