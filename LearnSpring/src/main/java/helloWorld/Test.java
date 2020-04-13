package helloWorld;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import utility.Course;  
  
public class Test {  
public static void main(String[] args) { 
	
	// Beanfactory
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource); 
    Student student=(Student)factory.getBean("studentbean"); 
    
    // ApplicationContext
    
    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});  
   
         
    Student student1= (Student)context.getBean("studentbean");
    student1.displayInfo();

    student.displayInfo();  
    
    
    // Test AutoWiring
    
    Course c1 = (Course)context.getBean("courseBean");
 
   System.out.println("Register-- > "  +  c1.getRegisterdStudents());
   
   
   
   // Scope
   
   
   Student student2= (Student)context.getBean("studentbean");
   Student student3= (Student)context.getBean("studentbean");
   
   System.out.println(student2 + " " + student3);
   
    
}  
}