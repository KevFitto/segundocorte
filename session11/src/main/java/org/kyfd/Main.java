package org.kyfd;

import dao.StudentDAO;
import models.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sesion 24/09/24");
        Student andres = new Student("22021318", "Angel", "Moreno", "andres@gmail.com", "22032032");
        Student andrea = new Student("22021813", "Eduardo", "Mendoza", "andrea@gmail.com", "22032999");
        Student kevin = new Student("22028131", "Andrea", "Cuadra", "kevin@gmail.com", "88032999");

        StudentDAO listEst = new StudentDAO();
        System.out.println("Agregar estudiante");
        listEst.create(andres);
        listEst.create(andrea);
        listEst.create(kevin);
        System.out.println("Lista de estudiantes");

        for(Student student :listEst.showList());

    }
}