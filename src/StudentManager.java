import java.util.Arrays;

public class StudentManager {
    private long id;
    private Student [] StudentsArray = new Student[0];
    private int size = 0;

    public StudentManager() {
    }

    public StudentManager(int size, Student[] studentsArray) {
        this.size = size;
        StudentsArray = studentsArray;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Student[] getStudentsArray() {
        return StudentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        StudentsArray = studentsArray;
    }

    public String  addStudent(Student   newStudent){
        StudentsArray = Arrays.copyOf(StudentsArray,StudentsArray.length+1);
        StudentsArray[size] = newStudent;
        size++;
        return   "Student added successfully!" + newStudent;

    }

   public  Student [] getAll(){
    return  StudentsArray;
   }




    public Student findById(long id) {
        for (Student student : StudentsArray) {
            if (student.getId() == id) {
                return student;
            }

        }
        return null;
    }

    public String updateStudent(long id, Student newStudent) {
        for (Student student1 : StudentsArray) {
            if (student1.getId() == id) {
                student1.setName(newStudent.getName());
                student1.setAge(newStudent.getAge());
                student1.setCourse(newStudent.getCourse());
                return "Student with id: " + id +" " + "Student Upechno obnavlen!";
            }
        }
        return "Student with id: " + id;
    }

    public String deleteById(long id) {
        boolean Studentabuu = false;
        for (int i = 0; i < size; i++) {
            if (StudentsArray[i].getId() == id) {
                Studentabuu = true;
                for (int j = i; j < size-1; j++) {
                    StudentsArray[j] = StudentsArray[j + 1];
                }
                    size--;
            }

        }
        StudentsArray = Arrays.copyOf(StudentsArray, StudentsArray.length - 1);
        return "Uspeshno udalen: "+ id ;

    }

    @Override
    public String toString() {
        return "StudentManager{" + super.toString() +
                "id=" + id +
                ", StudentsArray=" + Arrays.toString(StudentsArray) +
                ", size=" + size +
                '}';
    }
}


