package com.ithwang.wowheaven;

import java.sql.Date;
import com.ithwang.wowheaven.ReagentHandler.Reagent.AuctionPrice;

public class ReagentHandler {

  static final int LENGTH = 100;
  static Reagent[] reagents = new Reagent[LENGTH];
  static int size = 0;

  static class Reagent {
    int no;
    String name;
    String photo;
    String description;
    int sellPrice;
    boolean tradeable = true;
    AuctionPrice[] auctionPrice;
    static class AuctionPrice {
      int auctionPrice;
      Date auctionPriceUpdatedDate;
    }
  }

  static void add () {
    System.out.println("[재료 아이템 등록]");
    Reagent reagent = new Reagent();
    reagent.no = Prompt.inputInt("번호? ");
    reagent.name = Prompt.inputString("이름? ");
    reagent.photo = Prompt.inputString("사진? ");
    reagent.description = Prompt.inputString("설명? ");
    reagent.sellPrice = Prompt.inputInt("판매 가격? ");
    reagent.auctionPrice = new AuctionPrice[100];

    reagents[size++] = reagent;
  }

  static void list () {
    System.out.println("[재료 아이템 목록]");
    for (int i = 0; i < size; i++) {
      System.out.println(String.format("%d, %s, %s, %s, %d\n", 
          reagents[i].no, 
          reagents[i].name, 
          reagents[i].category, 
          reagents[i].photo, 
          reagents[i].sellPrice));
    }
  }
}
