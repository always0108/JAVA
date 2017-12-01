package com.company;



public class Main {

    public static void main(String[] args) {
        Node<Apple> apple1 = new Node<>(new Apple(),null);
        Node<Apple> apple2 = new Node<>(new Apple(),apple1);
        Node<Apple> apple3 = new Node<>(new Apple(),apple2);

        Node<Banana> banana1 = new Node<>(new Banana(),null);
        Node<Banana> banana2 = new Node<>(new Banana(),banana1);

        show(apple3);
        show(banana2);
    }

    public static void show(Node<? extends Fruit> n){
        Node<? extends Fruit> node = n;
        do{
            System.out.println(node.value);
            node = node.next;
        }while(node!=null);

    }
}

class Node<T>{
    public T value;
    public Node<T> next;

    public Node(T value,Node<T> next){
        this.value = value;
        this.next = next;
    }
}

class Fruit {
    int price;
    int weight;

    Fruit() {}

    Fruit(int price,int weight){
        this.price = price;
        this.weight = weight;
    }
}

class Apple extends Fruit{
    Apple(){}

    Apple(int price,int weight){
        super(price,weight);
    }

    @Override
    public String toString(){
        return "Apple";
    }
}

class Banana extends Fruit{
    Banana(){}

    Banana(int price,int weight){
        super(price,weight);
    }

    @Override
    public String toString(){
        return "Banana";
    }
}


