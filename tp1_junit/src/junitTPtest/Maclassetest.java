package junitTPtest;

import junitTP.Maclasse;
import junit.framework.TestCase;

public class Maclassetest extends TestCase{
	public void testcalculer() throws Exception {
		assertEquals (5,Maclasse.calculer(2, 3));
	}
	

}
