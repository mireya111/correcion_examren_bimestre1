package sistemaTransporte;

    public class serviciosVIP extends ruta{
        String espacioMaletas="Solo para 2";
        int maletasAdicionaes;
        //Constructores
        public serviciosVIP(int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3, String espacioMaletas, int maletasAdicionaes) {
            super(numeroPersonas, rutaSeleccionada, pasaje2, pasaje1, pasaje3);
            this.espacioMaletas = espacioMaletas;
            this.maletasAdicionaes = maletasAdicionaes;
        }

        public serviciosVIP(int cedulaPasajero, String formaDePago, String empresaTransporte, int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3, String espacioMaletas, int maletasAdicionaes) {
            super(cedulaPasajero, formaDePago, empresaTransporte, numeroPersonas, rutaSeleccionada, pasaje2, pasaje1, pasaje3);
            this.espacioMaletas = espacioMaletas;
            this.maletasAdicionaes = maletasAdicionaes;
        }

        public serviciosVIP(String nombre, String apellido, int cedulaPasajero, String formaDePago, String empresaTransporte, int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3, String espacioMaletas, int maletasAdicionaes) {
            super(nombre, apellido, cedulaPasajero, formaDePago, empresaTransporte, numeroPersonas, rutaSeleccionada, pasaje2, pasaje1, pasaje3);
            this.espacioMaletas = espacioMaletas;
            this.maletasAdicionaes = maletasAdicionaes;
        }
        //Setters y getters
        public String getEspacioMaletas() {
            return espacioMaletas;
        }

        public void setEspacioMaletas(String espacioMaletas) {
            this.espacioMaletas = espacioMaletas;
        }

        public int getMaletasAdicionaes() {
            return maletasAdicionaes;
        }

        public void setMaletasAdicionaes(int maletasAdicionaes) {
            this.maletasAdicionaes = maletasAdicionaes;
        }
        //Metodos personalizados

        @Override
        public Double QuitoGuayaquil() {
            double recargo = super.QuitoGuayaquil()*0.30;
            return super.QuitoGuayaquil()+recargo;
        }

        @Override
        public Double QuitoPuyo() {
            double recargo = super.QuitoPuyo()*0.30;
            return super.QuitoPuyo()+recargo;
        }

        @Override
        public Double QuitoTulcan() {
            double recargo = super.QuitoTulcan()*0.30;
            return super.QuitoTulcan()+recargo;
        }

        @Override
        public Double QuitoRiobamba() {
            double recargo = super.QuitoRiobamba()*0.30;
            return super.QuitoRiobamba()+recargo;
        }

        @Override
        public void ruta1() {
            super.ruta1();
        }

        @Override
        public void ruta2() {
            super.ruta2();
        }

        @Override
        public void ruta3() {
            super.ruta3();
        }

        @Override
        public void ruta4() {
            super.ruta4();
        }
    }
