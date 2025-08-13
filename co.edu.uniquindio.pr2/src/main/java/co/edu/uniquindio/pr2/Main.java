package co.edu.uniquindio.pr2;

import co.edu.uniquindio.pr2.model.EmpresaTransporte;

public class Main {
    public static void main(String[] args) {
       EmpresaTransporte empresaTransporte = inicializarDatos();
       crearPropietarioVehiculoCarga(empresaTransporte);
    }

    private static void crearPropietarioVehiculoCarga(EmpresaTransporte empresaTransporte) {



    }

    private static EmpresaTransporte inicializarDatos() {
        EmpresaTransporte empresa = new EmpresaTransporte();

        return empresa;
    }
}