package com.ithwang.wowheaven;

public class App {

  //  static final int MIN_MAIN_MENU = 0;
  //  static final int MAX_MAIN_MENU = 3;

  public static void main(String[] args) {
    System.out.println("===================================================");
    System.out.println("==================== WOWHEAVEN ====================");
    System.out.println("===================================================");

    loop:
      while (true) {
        //        System.out.println("[메인메뉴]");
        //        System.out.println("1. 회원");
        //        System.out.println("2. 게시판");
        //        System.out.println("3. 전문기술 도안");
        //        System.out.println("0. 종료");
        String command = Prompt.inputString("명령> ");

        System.out.println();
        switch(command) {
          //          case 1: MemberHandler.service(); break;
          //          case 2: BoardHandler.service(); break;
          //          case 3: ProductHandler.service(); break;
          //          case 0: 

          case "/member/add": break;
          case "/member/list": break;
          case "/character/add": break;
          case "/character/list": break;
          case "/product/add": break;
          case "/product/list": break;
          case "/consumable/add": ConsumableHandler.add(); break;
          case "/consumable/list": ConsumableHandler.list();  break;
          case "/reagent/add": ReagentHandler.add(); break;
          case "/reagent/list": ReagentHandler.list();break;
          case "/gear/add": break;
          case "/gear/list": break;

          case "exit":
          case "quit":
            System.out.println("사용해주셔서 감사합니다.");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        // 이전 명령의 실행을 구분하기 위해 빈줄 출력
        System.out.println();
      }

    Prompt.close(); 
  }

  static void help() {
    System.out.println("[명령어 모음]");
    System.out.println("<기능명>                     <명령어>");
    System.out.println("----------------------------------------------------------------");
    System.out.println("회원 등록                    /member/add");
    System.out.println("회원 목록 보기               /member/list");
    System.out.println("케릭터 등록                  /character/add");
    System.out.println("케릭터 목록 보기             /character/list");
    System.out.println("전문기술 제품 등록           /product/add");
    System.out.println("전문기술 제품 목록 보기      /product/list");
    System.out.println("재료 등록                    /reagent/add");
    System.out.println("재료 목록 보기               /reagent/list");
    System.out.println("장비 등록                    /gear/add");
    System.out.println("장비 목록 보기               /gear/list");
  }
}

