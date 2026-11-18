public class ConexionMongoDB implements ConexionBD {

    private boolean conectada = false;

    @Override
    public void conectar() {

        if (conectada) {
            System.out.println("MongoDB ya se encuentra conectado.");
        } else {
            conectada = true;
            System.out.println("Conectando a MongoDB...");
            System.out.println("Conexión MongoDB establecida correctamente.");
        }
    }

    @Override
    public void ejecutarConsulta(String sql) {

        if (!conectada) {
            System.out.println("Error: MongoDB no está conectado.");
        } else {
            System.out.println("Ejecutando operación en MongoDB: " + sql);
        }
    }

    @Override
    public void desconectar() {

        if (!conectada) {
            System.out.println("MongoDB ya se encuentra desconectado.");
        } else {
            conectada = false;
            System.out.println("Desconectando MongoDB...");
            System.out.println("Conexión MongoDB finalizada.");
        }
    }
}