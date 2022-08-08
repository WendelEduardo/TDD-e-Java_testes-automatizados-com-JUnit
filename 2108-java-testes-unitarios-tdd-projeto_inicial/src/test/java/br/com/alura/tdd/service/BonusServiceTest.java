package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		
		//BigDecimal calcularBonus = service.calcularBonus(new Funcionario("Wendel", LocalDate.now(), new BigDecimal(25000)));
	
		//assertThrows(IllegalArgumentException.class , () -> assertEquals(new BigDecimal("0.00"), calcularBonus));
		
		try {
			service.calcularBonus(new Funcionario("Wendel", LocalDate.now(), new BigDecimal(25000)));
			fail("N�o deu a exception");
		} catch (Exception e) {
			assertEquals("Funcionario com sal�rio maior que 1000 n�o pode receber b�nus.", e.getMessage());
		}
	}
	
	@Test
	void bonusDeveriaSerDezPorcentoDoSalario() {
		BonusService service = new BonusService();
		
		BigDecimal calcularBonus = service.calcularBonus(new Funcionario("Wendel", LocalDate.now(), new BigDecimal(2500)));
	
		assertEquals(new BigDecimal("250.00"), calcularBonus);
	}
	
	@Test
	void bonusDeveriaSerMil() {
		BonusService service = new BonusService();
		
		BigDecimal calcularBonus = service.calcularBonus(new Funcionario("Wendel", LocalDate.now(), new BigDecimal(10000)));
	
		assertEquals(new BigDecimal("1000.00"), calcularBonus);
	}

}
