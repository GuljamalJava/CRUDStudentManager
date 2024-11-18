public class Student {
   private  long id;
    private String name;
    private int age;
    private String Course;

    public Student( int age, String course, long id, String name) {
        this.age = age;
        Course = course;
        this.id = id;
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Studenttin Dannyiy:" +
                "Jashy:" + age +
                ", id:" + id +
                ", aty:" + name + '\'' +
                ", Coursu:" + Course + '\'' +
                '}';
    }
}
