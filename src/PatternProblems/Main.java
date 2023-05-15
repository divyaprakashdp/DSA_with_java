package PatternProblems;

class Student {
    int id;
    String name;
    String type;

    static  String college = "IIT";//static keyword is usually used for memory management as it gets memory only once and shared across the objects
    Student(int id, String name){
        //this keyword is used to access the instance variable
        //Here if parameters name were different, this keyword was not needed, but we should have meaningful variable names
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    Student(){};

    void display(){
        System.out.println(id+" - "+name+" - "+type + " - "+college);
    }
}

class Main{

    public static void main(String[] args) {
        Student st = new Student(1, "Rocky");
        Student st2 = new Student(2, "Rambo", "Studious");
        Student st3 = new Student();
        st.display();
        System.out.println("###############################");
        st2.display();
        System.out.println("###############################");
        st3.id = st2.id;
        st3.name = st2.name;
        st3.type = st2.type;
        Student.college="NIT";
        st3.display();
    }
}
