package ar.edu.unlam.tallerweb.cuentaBancaria;

public class CuentaBancaria {
	
	private Integer nroCuenta = 0;
	private Integer saldo = 0;

	public CuentaBancaria (Integer numeroCuenta, Integer saldo)
	{
		nroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	public boolean depositar (Integer monto)
	{
	
		if(monto<0)
		{
			System.out.println("La Cantidad que quiere depositar es un valor negativo.");
			return false;
		}
		else
		{
			saldo = saldo + monto;
			return true;
		}
		
	}
	
	public boolean extraer (Integer monto)
	{
		if(monto>saldo)
		{
			System.out.println("La Cantidad que quiere extraer es superior al saldo que dispone actualmente.");
			return false;
		}
		else
		{
			saldo = saldo - monto;
			return true;
		}
		
	}
	
	public boolean consulta ()
	{
		
		System.out.println("Su Saldo actual es: "+saldo);
		return true;
		
	}
	
	
	
}
