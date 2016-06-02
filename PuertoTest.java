
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test001()
    {
        Puerto puerto2 = new Puerto();
        Cliente cliente1 = new Cliente("Pepe", "1");
        Cliente cliente2 = new Cliente("Antonio", "2");
        Cliente cliente3 = new Cliente("Pedro", "3");
        Cliente cliente4 = new Cliente("Juan Carlos", "4");
        Cliente cliente5 = new Cliente("Manolo", "5");
        Velero velero1 = new Velero(2, "1", 2.5F, 1980);
        Velero velero2 = new Velero(6, "2", 4F, 1980);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(120, "3", 5.5F, 1980);
        Yate yate1 = new Yate(4, 130, "4", 7, 1980);
        Yate yate2 = new Yate(2, 100, "5", 6, 1980);
        assertEquals(0, puerto2.addAlquiler(20, cliente1, velero1));
        assertEquals(1, puerto2.addAlquiler(10, cliente2, velero2));
        assertEquals(2, puerto2.addAlquiler(5, cliente3, embarcac1));
        assertEquals(3, puerto2.addAlquiler(5, cliente4, yate1));
        assertEquals(-1, puerto2.addAlquiler(5, cliente5, yate2));
        assertEquals(1100, puerto2.liquidarAlquiler(0), 0.1);
        assertEquals(2200, puerto2.liquidarAlquiler(1), 0.1);
        assertEquals(36275, puerto2.liquidarAlquiler(2), 0.1);
        assertEquals(40550, puerto2.liquidarAlquiler(3), 0.1);
        assertEquals(-1, puerto2.liquidarAlquiler(4), 0.1);
    }

    @Test
    public void test002()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero(2, "AAA", 12, 1990);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(1200, "BBB", 40, 2014);
        Yate yate1 = new Yate(8, 4000, "CCC", 23, 2001);
        Velero velero2 = new Velero(3, "DDD", 5, 2016);
        Cliente cliente1 = new Cliente("enrique", "5555k");
        Cliente cliente2 = new Cliente("juan", "5555D");
        Cliente cliente3 = new Cliente("cristiano", "5555F");
        Cliente cliente4 = new Cliente("gerald", "5555G");
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(4, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(5, cliente3, yate1));
        assertEquals(361600, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(27), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(4, cliente4, velero2));
        puerto1.verEstadoAmarres();
    }

    @Test
    public void testPuerto01()
    {
        Velero velero1 = new Velero(4, "ABC", 20, 1989);
        Yate yate1 = new Yate(10, 20000, "GGG", 40, 1999);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(3000, "JKJ", 22, 2001);
        Cliente cliente1 = new Cliente("Juan Magan", "33444555K");
        Cliente cliente2 = new Cliente("Paulina Rubio", "27666777O");
        Cliente cliente3 = new Cliente("Enrique Iglesias", "90888777G");
        Puerto puerto1 = new Puerto();
        assertEquals(0, puerto1.addAlquiler(5, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente2, yate1));
        assertEquals(2, puerto1.addAlquiler(3, cliente3, embarcac1));
        Velero velero2 = new Velero(1, "BBB", 15, 2010);
        Cliente cliente4 = new Cliente("Julio Iglesias", "23444555K");
        assertEquals(3, puerto1.addAlquiler(10, cliente4, velero2));
        Cliente cliente5 = new Cliente("Pedro Duque", "89777444K");
        Yate yate2 = new Yate(8, 40000, "YYY", 45, 2012);
        assertEquals(-1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
        assertEquals(800 + (300 * 20010), puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
    }
}



