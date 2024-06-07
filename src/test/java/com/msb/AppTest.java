package com.msb;

import com.msb.bean.Person;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person1 = context.getBean("person", Person.class);
        System.out.println("person1 = " + person1);

        Person person2 = context.getBean("person", Person.class);
        System.out.println("person2 = " + person2);
        // scope="singleton"  person1 == person2 ？true
        System.out.println("person1 == person2 ？" + (person1 == person2));
    }

    public void testResf(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person2 = context.getBean("person", Person.class);
        System.out.println("person2 = " + person2);
    }
}
