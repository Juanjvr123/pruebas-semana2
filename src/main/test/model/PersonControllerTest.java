package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonControllerTest {

    private PersonController controller;

    private void setups1(){
        controller = new PersonController();
    }

    private void setUp2(){
        controller = new PersonController();
        controller.addPerson();
    }

    @Test
    public void testAddPerson(){
        // init
        setups1(); //la lista esta vacia

        // act
        controller.addPerson("NameA",10, "A0", 70);

        // Assert
        assertFalse(controller.getPeople().isEmpty());

    }

    @Test
    public void testAddPerson2(){

        // init
        setups1(); //la lista esta vacia

        // act
        String name = "nameA";
        int age = 10;
        String cc = "A0";
        double weight = 70;
        controller.addPerson(name,age, cc, weight);

        // Assert
        assertEquals(name, controller.getPeople().get(0).getName());
        assertEquals(age, controller.getPeople().get(0).getAge());
        assertEquals(cc, controller.getPeople().get(0).getCc());
        assertEquals(weight, controller.getPeople().get(0).getWeight());
        //El delta es para marcar un margen de error
        //assertEquals(weight, 67, 5);
    }

}


