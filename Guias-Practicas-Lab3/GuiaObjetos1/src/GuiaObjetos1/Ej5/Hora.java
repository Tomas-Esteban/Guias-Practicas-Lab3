package GuiaObjetos1.Ej5;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;
        this.minuto = (minuto >= 0 && minuto < 60) ? minuto : 0;
        this.segundo = (segundo >= 0 && segundo < 60) ? segundo : 0;
    }

    private void sumarHs() {
        if (this.hora == 23) {
            this.hora = 0;
        } else {
            this.hora++;
        }
    }

    private void sumarMin() {
        if (this.minuto == 59) {
            this.minuto = 0;
            sumarHs();
        } else {
            this.minuto++;
        }
    }

    public Hora sumarSeg() {
        if (this.segundo == 59) {
            this.segundo = 0;
            sumarMin();
        } else {
            this.segundo++;
        }
        return this;
    }

    private void restarHora() {
        if (this.hora == 0) {
            this.hora = 23;
        } else {
            this.hora--;
        }
    }

    private void restarMin() {
        if (this.minuto == 0) {
            this.minuto = 59;
            restarHora();
        } else {
            this.minuto--;
        }
    }

    public Hora restarSeg() {
        if (this.segundo == 0) {
            this.segundo = 59;
            restarMin();
        } else {
            this.segundo--;
        }
        return this;
    }

    @Override
    public String toString() {
        String hh = String.format("%02d", hora);
        String mm = String.format("%02d", minuto);
        String ss = String.format("%02d", segundo);

        return hh + ":" + mm + ":" + ss;
    }
}
