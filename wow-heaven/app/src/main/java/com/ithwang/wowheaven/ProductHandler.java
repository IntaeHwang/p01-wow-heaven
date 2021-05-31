package com.ithwang.wowheaven;

public class ProductHandler {
  static class Product{
    int no;
    String name;
    String profession;
    int professionLevel;
    String trainer;
    String zone;
    int cost;
    int sellPrice;
    String description;
    String type;
    int buyoutPrice;
    int TrainingCost;
    int numOfReagent;
    int[] numPerReagent;
    String[] reagents;
  }

  static final int LENGTH = 100;
  static Product[] productRecipes = new Product[LENGTH];
  static int size = 0;



  static void service() {
    loop:
      while (true) {
        System.out.println("[전문기술 도안 메뉴]");
        System.out.println("1. 등록");
        System.out.println("2. 목록");
        //        System.out.println("3. 상세보기");
        //        System.out.println("4. 변경");
        //        System.out.println("5. 삭제");
        System.out.println("0. 이전메뉴");
        int input = Prompt.inputInt("회원");

        System.out.println();
        switch(input) {
          case 1: add(); break;
          case 2: list(); break;
          //          case 3: detail(); break;
          //          case 4: update(); break;
          //          case 5: delete(); break;
          case 0:
            System.out.println("이전 메뉴로 돌아갑니다.");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        // 이전 명령의 실행을 구분하기 위해 빈줄 출력
        System.out.println();
      }
  }

  static void add() {
    System.out.println("[제작품 등록]");

    Product p = new Product();

    p.no = Prompt.inputInt("번호");
    p.name = Prompt.inputString("이름");


    productRecipes[size++] = p;
  }

  static void list() {
    System.out.println("[제작품 레시피 목록]");

    if (size == 0) {
      System.out.println("등록된 제작품 레시피가 없습니다.");
    }

    for (int i = 0; i < size; i++) {
      Product p = productRecipes[i];

      String materialsString = ""; 
      for (int j = 0; j < p.materialSize; j++) {
        Material m = p.materials[j];
        if (j != 0) {
          materialsString += ", ";
        }
        materialsString += String.format("%s %d개", m.name, m.numberOfMaterial);
      }

      System.out.printf("%d, %s, 재료[%s]\n", p.no, p.productName, materialsString);
    }
  }
}
