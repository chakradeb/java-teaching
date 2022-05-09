class Student {
    private String name;
    private int rollNo;
    private String address;
    Student(String name, int rollNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student { name = " + getName() +
                ", rollNo = " + getRollNo() +
                ", address = " + getAddress() + "}";
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student("lucifer", 1, "Dumdum");
        Student student2 = new Student("loki", 2, "Sankrail");
        Student student3 = new Student("aris", 3, "Subhash Nagar");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        student3.setAddress("Dumdum");
        System.out.println(student3);
    }
}
