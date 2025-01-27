package marma.cuentas.repositorio;

import marma.cuentas.modelo.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {
}
