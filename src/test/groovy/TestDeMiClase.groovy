import org.junit.Test
import org.junit.Before

class TestDeMiClase {
    def testee

    @Before void setUp() {
        testee = new MiClase()
    }

    @Test void cuadradoDe1() {
        assert testee.cuadrado(2) == 4	: "el cuadrado de 2 debe ser 4"
    }
}
