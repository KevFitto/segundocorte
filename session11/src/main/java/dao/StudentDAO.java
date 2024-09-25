package dao;

import Interface.Operation;
import models.Student;

import java.util.ArrayList;

public class StudentDAO implements Operation {
    private ArrayList<Student> listado = new ArrayList<>();

    /**
     * Agrega un estudiante
     * @param object
     */

    @Override
    public void create(Object object) {
        try {
            Student student = (Student) object;
            listado.add(student);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     *
     * @return
     */

    @Override
    public ArrayList<Object> read() {
        return null;
    }

    public ArrayList<Student> showList() {
        return listado;
    }

    /**
     *
     * @param object
     */

    @Override
    public void update(Object object) {

        Student  est = (Student) object;

        for(Student student : listado){
            if(student.getCif().equals(est.getCif())){
                student.setNombres(est.getNombres());
                student.setApellidos(est.getApellidos());
                student.setEmail(est.getEmail());
                student.setTelefono(est.getTelefono());
                return;
            }
        }
    }

    /**
     *
     * @param id
     */

    @Override
    public void delete(String id) {

        for(Student student : listado){
            if(student.getCif().equals(id)){
                listado.remove(student);
                return;
            }
        }

    }

    /**
     *
     * @param value
     * @return
     */

    @Override
    public Object search(String value) {
        for(Student student : listado){
            if(student.getCif().equals(value)
                    || student.getNombres().equals(value)){
                return student;
            }
        }
        return null;
    }
}