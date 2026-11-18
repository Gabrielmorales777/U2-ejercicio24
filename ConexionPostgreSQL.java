public class ConexionPostgreSQL implements ConexionBD {

    private boolean conectada = false;

    @Override
    public void conectar() {

        if (conectada) {
            System.out.println("PostgreSQL ya se encuentra conectado.");
        } else {
            conectada = true;
            System.out.println("Conectando a PostgreSQL...");
            System.out.println("Conexión PostgreSQL establecida correctamente.");
        }
    }

    @Override
    public void ejecutarConsulta(String sql) {

        if (!conectada) {
            System.out.println("Error: PostgreSQL no está conectado.");
        } else {
            System.out.println("Ejecutando consulta en PostgreSQL: " + sql);
        }
    }

    @Override
    public void desconectar() {

        if (!conectada) {
            System.out.println("PostgreSQL ya se encuentra desconectado.");
        } else {
            conectada = false;
            System.out.println("Desconectando PostgreSQL...");
            System.out.println("Conexión PostgreSQL finalizada.");
        }
    }
}