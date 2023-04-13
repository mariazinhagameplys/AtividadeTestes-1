package org.example.ContaBancaria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaBancariaTest {


    private ContaBancaria contaBancaria;

    @BeforeEach
    public void setUp() {
        contaBancaria = new ContaBancaria("35", "Marta");
    }

    @Test
    public void testDepositar() {
        assertEquals(true, contaBancaria.depositar(100));
        assertEquals(false, contaBancaria.depositar(-10));
    }

    @Test
    public void testSacar() {
        contaBancaria.depositar(300);
        assertEquals(true, contaBancaria.sacar(20));
        assertEquals(false, contaBancaria.sacar(-6));
        assertEquals(false, contaBancaria.sacar(3000));
    }

    @Test
    public void testTransferir() {
        ContaBancaria contaDestino = new ContaBancaria("42", "Robson");
        contaBancaria.depositar(300);
        assertEquals(true, contaBancaria.transferir(contaDestino, 200));
        assertEquals(false, contaBancaria.transferir(contaDestino, -19));
    }

    @Test
    public void testAplicarJuros() {

        contaBancaria.setTaxaJuros(0.1);
        contaBancaria.depositar(200);
        contaBancaria.aplicarJuros();
        assertEquals(220, contaBancaria.getSaldo());
    }

    @Test
    public void testalterarTitular() {
        assertEquals(true, contaBancaria.alterarTitular("Jenna"));
        assertEquals(false, contaBancaria.alterarTitular(""));
    }

    @Test
    public void testgetTaxaJuros() {
        contaBancaria.setTaxaJuros(0.1);
        assertEquals(0.1, contaBancaria.getTaxaJuros());
    }

    @Test
    public void testgetTitular() {
        ContaBancaria contaDestino = new ContaBancaria("42", "Robson");
        assertEquals(0.1, contaBancaria.getTitular());
    }

    @Test
    public void testgetNumeroConta() {
        ContaBancaria contaDestino = new ContaBancaria("42", "Robson");
        assertEquals("42", contaBancaria.getNumeroConta());
    }

}
