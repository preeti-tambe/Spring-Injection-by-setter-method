import org.apache.log4j.lf5.util.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import model.Employee;

public class Test {

	 public static void main(String[] args) {  
         
	        Resource r=new Resource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory((org.springframework.core.io.Resource) r);  
	          
	        Employee s=(Employee)factory.getBean("obj");  
	        
			s.display();  
	          
	    }  
}
