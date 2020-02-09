package oOp.matchbox;

import java.util.ArrayList;

public class Box {
    int matchesAmount;
    boolean boxIsOpened;

    //Box- открыть/закрыть
//- достать спичку/положить спичку
//- посчитать количество спичек
//- зажеч спичку
//
//    что посчитать количество спичек или взять/положить спичку
//    можно только при открытом коробке! Значит в реализации нужно учитывать в каком состоянии находится обьект спичечный коробок. Если коробок спичек находится в неправильном состоянии то методы должны выкидывать ошибку (специфичный exception).
// использовать не % а сколько-то раз
//у коробка должен быть метод зажечь спичку, который принимает в виде параметра обьект спичку. Внутри реализует проверку состояния наждачной бумаги и зажигает или нет спичку.
    public Box(int matchesAmount){
        ArrayList<Matches> matches = new ArrayList<Matches>();
        for (int i = 0; i< matchesAmount; i++){
            matches.add(new Matches());
        }
    }

    void openBox(){
        if (!boxIsOpened){
            boxIsOpened = true;
            System.out.println("Matchbox is opened.");
        }else {System.out.println("Matchbox is already opened.");}
    }

    void closeBox(){
        if (boxIsOpened){
            boxIsOpened = false;
            System.out.println("Matchbox is close.");
        }else {System.out.println("Matchbox is already closed.");}
    }

    public ArrayList<Matches> getMatch(ArrayList<Matches> matches){
        if (boxIsOpened) {
            matches.remove(0);
        } else {
            System.out.println("Matchbox is close! If you want to get Match you have to open Box at first!");
        }
        return matches;

    }
    public ArrayList<Matches> placeMatches(ArrayList<Matches> matches){
        if (boxIsOpened) {
            matches.add(new Matches());
        }else{
            System.out.println("Matchbox is close! If you want to place Match you have to open Box at first!");
        }
        return matches;
    }
    public int countMatches(ArrayList<Matches> matches){
        return matches.size();
    }

    void burnMatches(ArrayList<Matches> matches){
        matches.remove(0);
        matches.get(0).burned();
    }
}