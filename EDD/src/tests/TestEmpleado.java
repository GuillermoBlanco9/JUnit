package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import syspagos.Empleado;
import syspagos.Prima;
import excepciones.*;

public class TestEmpleado
{
	
	/*																					Pruebas calculo de Prima
	 * 																		Número de 3 dígitos mayor a 000 y menor o igual a 999
	 *                     													String de 10 o mas caracteres de letras
	 *                     													21-Número de 3 dígitos mayor o igual a 000 y menor o igual a 999
	 *                     													Char '+' o '-'
	 *                     
	 */
	
	
	
	
	
	
	
	
	
	
	@Test
	public void calcularPrimaCorrecta1()
	{
		Empleado e = new Empleado();
		try
		{
			e.calcularPrima("998", "VladimirIlyich", "23", "+");
		} catch (Exception c)
		{
			fail();
		}
		assertEquals(Prima.P1, e.getPrima());
	}
	
	@Test
	public void calcularPrimaCorrecta2()
	{
		Empleado e = new Empleado();
		try
		{
			e.calcularPrima("998", "VladimirIlyich", "23", "-");
		} catch (Exception c)
		{
			fail();
		}
		assertEquals(Prima.P2, e.getPrima());
	}
	
	@Test
	public void calcularPrimaCorrecta3()
	{
		Empleado e = new Empleado();
		try
		{
			e.calcularPrima("998", "VladimirIlyich", "10", "+");
		} catch (Exception c)
		{
			fail();
		}
		assertEquals(Prima.P3, e.getPrima());
	}
	
	@Test
	public void calcularPrimaCorrecta4()
	{
		Empleado e = new Empleado();
		try
		{
			e.calcularPrima("998", "VladimirIlyich", "10", "-");
		} catch (Exception c)
		{
			fail();
		}
		assertEquals(Prima.P4, e.getPrima());
	}
	
	
	
	
	
	
	
	
	/*                                                                 Pruebas sobre el numero de empleado
																Número de 3 dígitos mayor a 000 y menor o igual a 999
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	@Test
	public void establecerNumeroDeEmpleadoFallo1()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerNumeroEmpleado("-1");
		} catch (NumeroEmpleadoException c)
		{
			fail();
		}
		assertEquals(998, e.getNumeroEmpleado());
	}
	
	@Test
	public void establecerNumeroDeEmpleadoFallo2()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerNumeroEmpleado("000");
		} catch (NumeroEmpleadoException c)
		{
			fail();
		}
		assertEquals(998, e.getNumeroEmpleado());
	}
	
	@Test
	public void establecerNumeroDeEmpleadoCorrecto()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerNumeroEmpleado("998");
		} catch (NumeroEmpleadoException c)
		{
			fail();
		}
		assertEquals(998, e.getNumeroEmpleado());
	}
	
	
	
	
	/*             															Pruebas nombre de empleado
																		String de 10 o mas caracteres de letras
	
	
	*/
	
	
	
	
	
	
	@Test
	public void establecerNombreDeEmpleadoFallo1()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceNombreEmpleado("azul ");
		} catch (NombreEmpleadoException c)
		{
			fail();
		}
		assertEquals("VladimirIlyich", e.getNombreEmpleado());
	}
	
	@Test
	public void establecerNombreDeEmpleadoFallo2()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceNombreEmpleado(" ");
		} catch (NombreEmpleadoException c)
		{
			fail();
		}
		assertEquals("VladimirIlyich", e.getNombreEmpleado());
	}

	@Test
	public void establecerNombreDeEmpleadoFallo3()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceNombreEmpleado("312");
		} catch (NombreEmpleadoException c)
		{
			fail();
		}
		assertEquals("VladimirIlyich", e.getNombreEmpleado());
	}
	
	@Test
	public void establecerNombreDeEmpleadoCorrecto()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceNombreEmpleado("VladimirIlyich");
		} catch (NombreEmpleadoException c)
		{
			fail();
		}
		assertEquals("VladimirIlyich", e.getNombreEmpleado());
	}
	
	
	
	
	
	/*																				Pruebas meses de trabajo del empleado
																		21-Número de 3 dígitos mayor o igual a 000 y menor o igual a 999
	
	*/
	
	

	

	
	@Test
	public void estableceMesesTrabajoFallo1()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceMesesTrabajo("1000");
		} catch (MesesTrabajoException c)
		{
			fail();
		}
		assertEquals(36, e.getMesesTrabajo());
	}
	
	@Test
	public void estableceMesesTrabajoFallo2()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceMesesTrabajo("09");
		} catch (MesesTrabajoException c)
		{
			fail();
		}
		assertEquals(36, e.getMesesTrabajo());
	}
	
	@Test
	public void estableceMesesTrabajoCorrecto()
	{
		Empleado e = new Empleado();
		try
		{
			e.estableceMesesTrabajo("36");
		} catch (MesesTrabajoException c)
		{
			fail();
		}
		assertEquals(36, e.getMesesTrabajo());
	}
	
	
	
	
	
	/* 																				Prueba sobre ser directivo
																						Char '+' o '-'
	
	*/
	
	
	
	
	
	
	
	@Test
	public void establecerSerDirectivoFallo1()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerSerDirectivo("false");
		} catch (CargoException c)
		{
			fail();
		}
		assertEquals(false, e.getDirectivo());
	}
	@Test
	public void establecerSerDirectivoFallo2()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerSerDirectivo("N");
		} catch (CargoException c)
		{
			fail();
		}
		assertEquals(false, e.getDirectivo());
	}
	
	@Test
	public void establecerSerDirectivoCorrecto()
	{
		Empleado e = new Empleado();
		try
		{
			e.establecerSerDirectivo("-");
		} catch (CargoException c)
		{
			fail();
		}
		assertEquals(false, e.getDirectivo());
	}
	
	
	
	
	
	
}
