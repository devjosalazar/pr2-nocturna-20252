package co.edu.uniquindio.programacion2.patrones_comportamiento.command;

import co.edu.uniquindio.programacion2.patrones_comportamiento.command.commands.Cuenta;
import co.edu.uniquindio.programacion2.patrones_comportamiento.command.commands.DepositarImpl;
import co.edu.uniquindio.programacion2.patrones_comportamiento.command.commands.Invoker;
import co.edu.uniquindio.programacion2.patrones_comportamiento.command.commands.RetirarImpl;
public class App {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1, 200);

		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		
		ivk.realizarOperaciones();
	}

}
