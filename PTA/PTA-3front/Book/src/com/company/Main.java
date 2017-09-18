package com.company;

public class Main{
    public static void main(String args[]){
        Book book[]=new Book[3];            //创建对象数组
        book[0]=new Book("Java程序设计",34.5f);
        book[1]=new Book("数据结构",44.8f);
        book[2]=new Book("C++程序设计",35.0f);
        for(int i=0;i<book.length;i++){
            book[i].print();
        }
        System.out.println("图书总册数为："+((new Book().getId()-1)));    //输出总册数
    }
}

class Book{
    //私有数据
    private String name;
    private int id;
    private float price;
    private static int count=0;

    public Book(){           //无参构造函数
        count++;
        this.id=count;
    }

    public Book(String name,float price){      //双参构造函数
        this.name=name;
        this.price=price;
        this.id=(++count);
    }
    public int getId(){       //获取编号
        return this.id;
    }

    public void print(){             //显示编号、书名、价格
        System.out.println("书名："+this.name+", 书号："+getId()+", 书价："+price);
    }
}