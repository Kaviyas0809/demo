 class constructor {
   int id;
   String name; 
    constructor(int i, String n) {
         id = i;
         name = n;
    }
    void display() {
        System.out.println("ID: " +id);
        System.out.println("Name: " +name);
    }
    public static void main(String[] args) {
        constructor obj = new constructor(1, "kaviya");
        obj.display();
    }
}

