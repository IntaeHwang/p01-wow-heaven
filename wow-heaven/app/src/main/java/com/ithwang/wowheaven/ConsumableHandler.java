package com.ithwang.wowheaven;

public class ConsumableHandler {

  static class Consumable {
    int no;
    String name;
    String icon;
    int itemLevel;
    String description;
    int requiresLevel;
    int maxStack;
    int cellPrice;
  }

  static final int Length = 100;
  static Consumable[] consumables = new Consumable[Length];
  static int size = 0;

  static void add() {
    System.out.println("[소모품 등록]");

    Consumable c = new Consumable();
    c.no = Prompt.inputInt("번호? ");
    c.name = Prompt.inputString("이름? ");
    c.icon = Prompt.inputString("아이콘? ");
    c.itemLevel = Prompt.inputInt("아이템 레벨? ");
    c.description = Prompt.inputString("설명? ");
    c.requiresLevel = Prompt.inputInt("요구 레벨? ");
    c.maxStack = Prompt.inputInt("최대 묶음 개수? ");
    c.cellPrice = Prompt.inputInt("판매 가격? ");
  }

  static void list() {
    System.out.println("[소모품 목록]");

    for (int i = 0; i < size; i++) {
      Consumable c = consumables[i];
      System.out.println(String.format("%d, %s, %s\n", c.no, c.name, c.icon));
    }

  }
}
