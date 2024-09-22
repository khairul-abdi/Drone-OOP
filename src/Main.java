public class Main {
    public static void main(String[] args) {
        //membuat objek Drone
        Drone drone = new Drone();

        // mengisi attribut drone
        drone.energi= 9;
        drone.ketinggian= 0;
        drone.kecepatan= 0;
        drone.merek = "DJI";

        drone.matikanMesin();
        drone.terbang();
    }
}