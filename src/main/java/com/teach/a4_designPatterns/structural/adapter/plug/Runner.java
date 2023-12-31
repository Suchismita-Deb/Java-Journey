package com.teach.a4_designPatterns.structural.adapter.plug;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nThe European says...");
        Plug europeanPlug = new EuropeanPlug();
        europeanPlug.pin3();

        System.out.println("The Plug Adapter says...");

        Switch indianSwitch = new IndianSwitch();
        Plug plugAdapter = new SwitchToPlugAdapter(indianSwitch);
        plugAdapter.pin3();

    }
}
