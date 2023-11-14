package main;

import assets.weapons.Knife;
import assets.weapons.LongSword;

import javax.swing.*;

public class Story {

    Game game;
    UI ui;
    ViewManager vm;
    Player player = new Player();

    public Story(Game g, UI userInterface, ViewManager vManager){

        game = g;
        ui = userInterface;
        vm = vManager;
    }

    public void defaultSetup(){

        player.gold = 100;
        player.tax = 2;
        player.food = 30;
        player.wood = 50;
        player.ppl = 15;
        player.soldier = 5;
        player.power = 10;

        player.goldProduction = player.ppl * player.tax;
        player.foodProduction = 10;
        player.woodProduction = 15;
        player.soldierProduction = 0;
        player.powerProduction = 0;

        player.pplConsumption = player.soldierProduction;
        player.goldConsumption = player.soldier * 1;
        player.foodConsumption = player.soldier * 3;
        player.woodConsumption = player.soldier * 5;

        ui.goldLabel.setText("Gold: "+player.gold);
        ui.taxLabel.setText("Tax: "+player.tax);
        ui.foodLabel.setText("Food: "+player.food);
        ui.woodLabel.setText("Wood: "+player.wood);
        ui.pplLabel.setText("People: "+player.ppl);
        ui.soldierLabel.setText("Soldiers: "+player.soldier);

        player.map = "map1.png";

        player.currentWeapon = new Knife();

    }
    public void selectPosition(String nextPosition){

        switch (nextPosition){
            case "prologue1":
                prologue1();
                break;
            case "prologue2":
                prologue2();
                break;
            case "office":
                office();
                break;
            case "test":
                test();
                break;
            case "test1":
                test1();
                break;
            default:
                break;
        }
    }


    public void prologue1(){
        ui.mainTextArea.setText("1");

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "prologue2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void prologue2(){
        ui.mainTextArea.setText("2");

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "office";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }public void office(){
        ui.mainTextArea.setText("You are in your Office.\nFrom here you can make new laws or command your army.");

        ImageIcon mapIcon = new ImageIcon(getClass().getClassLoader().getResource(player.map));
        ui.mainImgLabel.setIcon(mapIcon);

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "test";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
public void test(){
    ui.mainTextArea.setText("You are in your Office.\nFrom here you can make new laws or command your army.");

    ImageIcon mapIcon = new ImageIcon(getClass().getClassLoader().getResource("forest.png"));
    ui.mainImgLabel.setIcon(mapIcon);

    ui.choice1.setText(">");
    ui.choice2.setText("");
    ui.choice3.setText("");
    ui.choice4.setText("");

    game.nextPosition1 = "test1";
    game.nextPosition2 = "";
    game.nextPosition3 = "";
    game.nextPosition4 = "";
}
    public void test1(){
        ui.mainTextArea.setText("You are in your Office.\nFrom here you can make new laws or command your army.");

        ImageIcon mapIcon = new ImageIcon(getClass().getClassLoader().getResource("map/map1.png"));
        ui.mainImgLabel.setIcon(mapIcon);

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "office";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void town(){
        ui.mainTextArea.setText("");

        ui.choice1.setText("Ansprechen");
        ui.choice2.setText("Angreifen");
        ui.choice3.setText("Verlassen");
        ui.choice4.setText("");

        game.nextPosition1 = "talkGuard";
        game.nextPosition2 = "attackGuard";
        game.nextPosition3 = "crossRoad";
        game.nextPosition4 = "";
    }
    public void talkGuard(){
        ui.mainTextArea.setText("Wache: Abend, der Herr! \nSie sind mir ein frisches Gesicht, \nes kommen keine Fremde in unsre Stadt rein!");

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "townGate";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

}
