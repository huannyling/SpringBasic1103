package di;

import di.Student;
import org.junit.Test;

public class Test_Student1 {
    @Test
    public void test(){
        Student s1=new Student();
        s1.setName("john");
        s1.setAge(18);
        System.out.println(s1);
    }
}
