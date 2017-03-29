package com.sdajava.builder_constructor_wzorce_projektowe_2;

/**
 * Created by user on 2017-03-28.
 */
public class User {

    private String name;    //required
    private String surname; //required
    private String telephone;   //optional
    private int age;    //optional
    private String address; //optional

    private User(Builder builder) {
        setName(builder.name);
        setSurname(builder.surname);
        setTelephone(builder.telephone);
        setAge(builder.age);
        setAddress(builder.address);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", telephone='" + telephone + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static final class Builder {
        private String name;
        private String surname;
        private String telephone;
        private int age;
        private String address;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder surname(String val) {
            surname = val;
            return this;
        }

        public Builder telephone(String val) {
            telephone = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
    //tworzymy klase w klasie
}
