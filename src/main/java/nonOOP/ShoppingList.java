package nonOOP;

import java.util.*;

import static java.lang.System.*;
import static java.util.Collections.*;

public class ShoppingList {

    /*     This is a shopping list application menu:
 1 - add an item
 2 - list items
 3 - delete an item
 4 - exit
     Каждый пункт меню реализовать в программе в виде отдельного метода,
     массив или список создавать в начале программы (в методе main()) и передавать в каждый из методов в качестве параметра.
     Распечатку главного меню программы вынести в отдельный метод. Так же в отдельный метод вынести запрос у пользователя пункта меню, который надо выполнить.
 1) сделать так, что бы в список нельзя было добавлять одинаковые продукты, при попытке добавить в список уже существующий продукт выдавать пользователю предупреждение
 2) сделать пункт меню - удалить все продукты из списка
 3) сделать пункт меню - поиск продукта по названию
 4) сделать пункт меню - удаление продукта из списка по названию
 5) сделать пункт меню - сортировка списка продуктов в алфавитном порядке*/
    private static void printMenu() {
        out.print(" This is a shopping list application menu:\n" +
                "1 - add an item\n" +
                "2 - list items\n" +
                "3 - delete an item nr.\n" +
                "4 - delete an item by name\n" +
                "5 - delete all items\n" +
                "6 - find the item position\n" +
                "7 - sort Case Sensitive \n" +
                "8 - exit\n" +
                "\n" +
                "Enter your choice:");

    }

    private static int readChoice() {
        Scanner scanner = new Scanner(in);
        return scanner.nextInt();
    }

    private static ArrayList<String> addItem(ArrayList<String> listShopping) {
        out.print("Enter item to add:");
        Scanner scanner = new Scanner(in);
        String item = scanner.next();
        String itemFromList;
        boolean hasItemList = true;
        for (int i = 0; i < listShopping.size(); i++) {
            itemFromList = listShopping.get(i);
            if ((itemFromList.equalsIgnoreCase(item)) && (hasItemList)) {
                hasItemList = false;
            }
        }
        if (hasItemList) {
            listShopping.add(item);
            out.println();
            out.println(item + " added");
            out.println();
        } else {
            out.println();
            out.println("Item already in the list! You can't add that second time");
            out.println();
        }

        return listShopping;
    }

    private static ArrayList<String> listItems(ArrayList<String> listShopping) {
        if (listShopping.size() > 0) {
            for (String aListShopping : listShopping) {
                out.println(aListShopping);
            }
        } else {
            out.println("List is empty");
        }
        out.println();
        return listShopping;
    }

    public static ArrayList<String> deleteItemNr(ArrayList<String> listShopping) {
        String itemFromList;
        boolean condition = false;
        if (listShopping.size() > 0) {
            out.println();
            out.print("Enter item number in the list to delete:");
            out.println();
            Scanner scanner = new Scanner(in);
            int item = scanner.nextInt();
            String itemName;
            if ((item - 1) < listShopping.size()) {
                itemName = listShopping.get(item - 1);
                listShopping.remove(item - 1);
                out.println();
                out.println("Item nr. " + item + " is deleted. It was " + itemName);
            } else {
                out.println();
                out.println(item + " not found!");
                out.println();
            }
        } else {
            out.println("Can't delete, list is empty!");
            out.println();
        }
        return listShopping;
    }


    public static ArrayList<String> deleteItemName(ArrayList<String> listShopping) {
        String itemFromList;
        boolean condition = false;
        if (listShopping.size() > 0) {
            out.println();
            out.print("Enter item to delete:");
            out.println();
            Scanner scanner = new Scanner(in);
            String item = scanner.next();

            for (int i = 0; i < listShopping.size(); i++) {
                itemFromList = listShopping.get(i);
                if ((itemFromList.equalsIgnoreCase(item)) && (!condition)) {
                    listShopping.remove(item); /// check if this is ok
                    condition = true;
                }
            }
            if (condition) {
                out.println();
                out.println(item + " is deleted!");
                out.println();
            } else {
                out.println();
                out.println(item + "not found!");
                out.println();
            }
        } else {
            out.println();
            out.println("Can't delete, list is empty!");
            out.println();
        }
        return listShopping;
    }

    public static ArrayList<String> deleteAllItems(ArrayList<String> listShopping) {
        boolean condition = false;
        if (listShopping.size() > 0) {
            out.println();
            out.print("All items will be deleted");
            out.println();
            listShopping.clear();
        } else {
            out.println();
            out.println("Can't delete, list already  is empty!");
            out.println();
        }
        return listShopping;
    }


    private static void bye() {
        out.println();
        out.println("Good bye!");
    }

    private static void wrong(int choice) {
        out.println();
        out.println("Sorry, but your choice " + choice + " is incorrect!");
        out.println();
    }

    public static ArrayList<String> findItem(ArrayList<String> listShopping) {
        String itemFromList;
        int itemPosition = -1;
        if (listShopping.size() > 0) {
            out.println();
            out.print("Enter item to find that:");
            out.println();
            Scanner scanner = new Scanner(in);
            String item = scanner.next();

            for (int i = 0; i < listShopping.size(); i++) {
                itemFromList = listShopping.get(i);
                if (itemFromList.equalsIgnoreCase(item)) {
                    itemPosition = i;
                }
            }
            if (itemPosition != -1) {
                out.println();
                out.println(item + " is found! it's position is " + itemPosition);
                out.println();
            } else {
                out.println();
                out.println(item + "not found!");
                out.println();
            }
        } else {
            out.println();
            out.println("I will not looking for that! List is empty!");
            out.println();
        }
        return listShopping;
    }

    public static ArrayList<String> sortListAlph(ArrayList<String> listShopping) {
        out.println();
        out.println("I will try to sort your shopping list.");
        ArrayList<String> tempList = listShopping;
        sort(tempList);
        listItems(tempList);
        return listShopping;
    }


    public static void main(String[] args) {
        ArrayList<String> listShopping = new ArrayList<String>();
        int choice;
        do {
            printMenu();
            choice = readChoice();
            if (choice == 1) {
                listShopping = addItem(listShopping);
            } else if (choice == 2) {
                listShopping = listItems(listShopping);
            } else if (choice == 3) {
                listShopping = deleteItemNr(listShopping);
            } else if (choice == 4) {
                listShopping = deleteItemName(listShopping);
            } else if (choice == 5) {
                listShopping = deleteAllItems(listShopping);
            } else if (choice == 6) {
                listShopping = findItem(listShopping);
            } else if (choice == 7) {
                listShopping = sortListAlph(listShopping);
            } else if (choice == 8) {
                bye();
            } else {
                wrong(choice);
            }
        } while (choice != 8);

    }


}