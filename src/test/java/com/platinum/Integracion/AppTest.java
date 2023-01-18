package com.platinum.Integracion;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.platinum.Integracion.ConexionBD;
import com.platinum.Integracion.SQLmetodos;
import com.platinum.Integracion.frmLogin;
import com.platinum.Integracion.App;
import com.platinum.Integracion.Principal;

import static org.junit.Assert.assertTrue;

public class AppTest 
{
	public AppTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

    @Test
    public void testApp()
    {
        assertTrue( true );
    }
}
