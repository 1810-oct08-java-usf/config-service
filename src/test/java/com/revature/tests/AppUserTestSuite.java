package com.revature.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.revature.models.AppUser;

/**
 * This will be used to test the AppUser Class.
 * 
 * @author Alonzo Muncy (190107-Java-Spark-USF)
 */

@RunWith(MockitoJUnitRunner.class)
public class AppUserTestSuite {
	
	/**
	 * Variables to be used for testing.
	 * 
	 * @author Alonzo Muncy (190107-Java-Spark-USF)
	 */
	
	Integer testId = 17;
	String testUsername = "John";
	String testPassword = "Password";
	String testRole = "ADMIN";
	String testFirstName = "Johnny";
	String testLastName = "Appleseed";
	String testEmail = "Johnny@Appleseed.com";
	String testToString = "AppUser [id=17, firstName=Johnny, lastName=Appleseed, username=John, password=Password, email=Johnny@Appleseed.com, role=ADMIN]";
	Integer testHashCode = 1753639290;
	Integer testNullHashCode = 1742810335;
	
	/**
	 * Don't mock the thing you are testing;
	 * 
	 * @author Alonzo Muncy (190107-Java-Spark-USF)
	 */
	
	AppUser testAppUser = new AppUser();
	
	/**
	 * Testing default constructor
	 * 
	 * @author Alonzo Muncy (190107-Java-Spark-USF)
	 */
	
	@Test
	public void testDefaultConstructor () {
		AppUser testConstructor = new AppUser(); 
		assertThat(testConstructor, instanceOf(AppUser.class));
	}
	
	/**
	 * Testing the overloaded constructor that has 4 arguments.
	 * 
	 * @author Alonzo Muncy (190107-Java-Spark-USF)
	 */
	
	@Test
	public void testOverloadedConstructor4Args () {
		AppUser testConstructor = new AppUser(testId, testUsername, testPassword, testRole);
		assertThat(testConstructor, instanceOf(AppUser.class));
		assertEquals(testConstructor.getPassword(), testPassword);
		assertEquals(testConstructor.getUsername(), testUsername);
		assertEquals(testConstructor.getId(), testId);
		assertEquals(testConstructor.getRole(), testRole);
	}
	
	/**
	 * Testing overloaded constructor with 7 arguments.
	 * 
	 * @author Alonzo Muncy (190107-Java-Spark-USF)
	 */
	
	@Test
	public void testOverloadedConstructor7Args () {
		AppUser testConstructor = new AppUser(testId, testFirstName, testLastName, testUsername, testPassword, testEmail, testRole);
		assertThat(testConstructor, instanceOf(AppUser.class));
		assertEquals(testPassword, testConstructor.getPassword());
		assertEquals(testUsername, testConstructor.getUsername());
		assertEquals(testId, testConstructor.getId());
		assertEquals(testRole, testConstructor.getRole());
		assertEquals(testFirstName, testConstructor.getFirstName());
		assertEquals(testLastName, testConstructor.getLastName());
		assertEquals(testEmail, testConstructor.getEmail());
	}
	
	/**
	 * Testing getters and setters. We are doing this by setting each field of the class and then verifying that what we put into the setters we are able to get out.
	 * 
	 * @author Alonzo Muncy (190107-Java-Spark-USF)
	 */
	
	@Test
	public void testGettersAndSetters () {
		testAppUser.setEmail(testEmail);
		testAppUser.setFirstName(testFirstName);
		testAppUser.setLastName(testLastName);
		testAppUser.setId(testId);
		testAppUser.setPassword(testPassword);
		testAppUser.setRole(testRole);
		testAppUser.setUsername(testUsername);
		
		assertEquals(testPassword, testAppUser.getPassword());
		assertEquals(testUsername, testAppUser.getUsername());
		assertEquals(testId, testAppUser.getId());
		assertEquals(testRole, testAppUser.getRole());
		assertEquals(testFirstName, testAppUser.getFirstName());
		assertEquals(testLastName, testAppUser.getLastName());
		assertEquals(testEmail, testAppUser.getEmail());
	}
	/**
	 * Testing Hashcode. We do this by generating correct hash codes and then checking that they equal what is in the code.
	 * 
	 * @author Alonzo Muncy (190107-Java-Spark-USF)
	 */
	@Test
	public void testHashCode () {
		testAppUser.setEmail(testEmail);
		testAppUser.setFirstName(testFirstName);
		testAppUser.setLastName(testLastName);
		testAppUser.setId(testId);
		testAppUser.setPassword(testPassword);
		testAppUser.setRole(testRole);
		testAppUser.setUsername(testUsername);
		
		Integer testCode = testAppUser.hashCode();
		
		assertEquals(testHashCode, testCode);
		
		testAppUser.setEmail(null);
		testAppUser.setFirstName(null);
		testAppUser.setLastName(null);
		testAppUser.setId(null);
		testAppUser.setPassword(null);
		testAppUser.setRole(null);
		testAppUser.setUsername(null);
		
		testCode = testAppUser.hashCode();
		
		assertEquals(testNullHashCode, testCode);
		
	}
	/**
	 * Testing to string by comparing a test string to a known correct string.
	 * 
	 * @author Alonzo Muncy (190107-Java-Spark-USF)
	 */
	
	@Test
	public void testToString () {
		testAppUser.setEmail(testEmail);
		testAppUser.setFirstName(testFirstName);
		testAppUser.setLastName(testLastName);
		testAppUser.setId(testId);
		testAppUser.setPassword(testPassword);
		testAppUser.setRole(testRole);
		testAppUser.setUsername(testUsername);
		
		String testString = testAppUser.toString();
		
		assertEquals(testToString, testString);
	}
	
	/**
	 * Testing autogenerated code like this feels stupid, but it's what we have to do to get the numbers where they need to be.
	 * In this we create two AppUsers who are all null and therefore identical. Then we change one thing at a time and assert that they will not be equal.
	 * Then we reset the item and do a new one.
	 * 
	 * @author Alonzo Muncy (190107-Java-Spark-USF)
	 */
	
	@Test
	public void testEquals() {
		AppUser a = new AppUser();
		AppUser b = new AppUser();
		
		assertTrue(a.equals(b));
		assertFalse(a.equals(new Integer(testId)));
		
		a.setUsername(testUsername);
		assertFalse(a.equals(b));
		a.setUsername(null);
		
		a.setRole(testRole);
		assertFalse(a.equals(b));
		a.setRole(null);
		
		a.setPassword(testPassword);
		assertFalse(a.equals(b));
		a.setPassword(null);
		
		a.setLastName(testLastName);
		assertFalse(a.equals(b));
		a.setLastName(null);
		
		a.setId(testId);
		assertFalse(a.equals(b));
		a.setId(null);
		
		a.setEmail(testEmail);
		assertFalse(a.equals(b));
		a.setEmail(null);
		
		a.setFirstName(testFirstName);
		assertFalse(a.equals(b));
		a.setFirstName(null);
	}
	

}
