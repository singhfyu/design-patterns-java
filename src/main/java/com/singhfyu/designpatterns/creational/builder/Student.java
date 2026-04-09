package com.singhfyu.designpatterns.creational.builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String univName;
    private String batchName;
    private long id;
    private int gradYear;
    private long phoneNo;



    private Student(StudentBuilder input) throws Exception {

        id=input.getId();
        name=input.getName();
        age=input.getAge();
    }
    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    static class StudentBuilder {
        private String name;
        private int age;
        private double psp;
        private String univName;
        private String batchName;
        private long id;
        private int gradYear;
        private long phoneNo;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;

        }

        public String getUnivName() {
            return univName;
        }

        public StudentBuilder setUnivName(String univName) {
            this.univName = univName;
            return this;

        }

        public String getBatchName() {
            return batchName;
        }

        public StudentBuilder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;

        }

        public long getId() {
            return id;
        }

        public StudentBuilder setId(long id) {
            this.id = id;
            return this;

        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;

        }

        public long getPhoneNo() {
            return phoneNo;
        }

        public StudentBuilder setPhoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public Student build() throws Exception {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be above 18");
            }
            if (name == null) {
                throw new IllegalArgumentException("Name can't be null");
            }
            return new Student(this);
        }
    }


}
