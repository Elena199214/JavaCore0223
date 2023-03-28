package InputOutput.task4_4_5;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

class Animal implements Serializable{


    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public static void main(String[] args) {
        byte[] intermediate = null;
        try (
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(output)) {

            oos.writeInt(3);
            oos.writeObject(new Animal("Dog"));
            oos.writeObject(new Animal("Cat"));
            oos.writeObject(new Animal("Mouse"));

            output.flush();
            intermediate = output.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(intermediate));
        Animal[] animals = deserializeAnimalArray(intermediate);
        System.out.println(Arrays.toString(animals));

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

public static Animal[] deserializeAnimalArray(byte[] data) {
    final Animal[] animals;
    try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
        final int size = ois.readInt();
        animals = new Animal[size];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = (Animal) ois.readObject();
        }
    } catch (ClassNotFoundException | NegativeArraySizeException | ClassCastException | IOException e) {
        throw new IllegalArgumentException(e);
    }
    return animals;
}
}
