package com.learn.designPattern.creational.factory;

public class AnimalFactory {
    Animal getAnimal(String str){
        if(str=="Bird")
            return new Bird();
        else if(str=="Lion")
            return new Lion();
        return null;
    }
}
