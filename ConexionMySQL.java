public class ConexionMySQL implements ConexionBD {

    private boolean conectada = false;

    @Override
    public void conectar() {

        if (conectada) {
            System.out.println("MySQL ya se encuentra conectado.");
        } else {
            conectada = true;
            System.out.println("Conectando a MySQL...");
            System.out.println("Conexión MySQL establecida correctamente.");
        }
    }

    @Override
    public void ejecutarConsulta(String sql) {

        if (!conectada) {
            System.out.println("Error: MySQL no está conectado.");
        } else {
            System.out.println("Ejecutando consulta en MySQL: " + sql);
        }
    }

    @Override
    public void desconectar() {

        if (!conectada) {
            System.out.println("MySQL ya se encuentra desconectado.");
        } else {
            conectada = false;
            System.out.println("Desconectando MySQL...");
            System.out.println("Conexión MySQL finalizada.");
        }
    }
}