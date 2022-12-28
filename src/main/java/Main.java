import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import modelos.DukeMascota;
import modelos.Mascota;
import persistencia.mysql.MySQLConnection;
import persistencia.persistenceCollections.MascotaPersistenceUseList;
import utils.RegistroCivilMascotas;

import java.sql.Connection;
import java.time.LocalTime;




public class Main {

    public static void main(String[] args) {
        MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Duke-Merlina", "Dianela");
    //  System.out.println(duke);
        DukeMascota duke2 = new DukeMascota("Duke-Cordobes", "Dianela");
        DukeMascota duke3 = new DukeMascota("Duke-Porteño", "Dianela");
        DukeMascota duke4 = new DukeMascota("Duke-Litoral", "Dianela");
        persistence.guardar(duke);
        persistence.guardar(duke2);
        persistence.guardar(duke3);
        persistence.guardar(duke4);

    //   for (Mascota mascota: persistence.getAllMascota()) {
    //        System.out.println(mascota);
    //    }

    //    for (Mascota mascota: persistence.getAllMascota()){
    //        System.out.println(mascota.getNombre());
    //    }

    //    System.out.println("antes de comer "+duke.getNivelEnergia());
    //    duke.comer(AlmacenAlimentos.ASADO);
    //    System.out.println("despues de comer "+duke.getNivelEnergia());

    //    duke.jugar(EntretenimientosEnum.POKER);
    //    duke.jugar(EntretenimientosEnum.PASEAR);
    //    duke.jugar(EntretenimientosEnum.PASEAR);
    //    duke.jugar(EntretenimientosEnum.PERINOLA);
    //    duke.jugar(EntretenimientosEnum.BAILAR);
    //    duke.jugar(EntretenimientosEnum.BAILAR);

    //    System.out.println("despues de entretenerse su nivel de aburrimiento es " + duke.getNivelAburrimiento());

    //    System.out.println("antes de dormir " + duke.getNivelEnergia());
    //    duke.dormir(LocalTime.of(0,25));
    //    System.out.println("despues de dormir " + duke.getNivelEnergia());

    //    duke.comer(AlmacenAlimentos.ASADO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    RegistroCivilMascotas.guardarActa(duke);

        MySQLConnection conexion = new MySQLConnection();
        Connection connection = conexion.establecerConexion();

        conexion.cerrarConexion(connection);
    }

}
