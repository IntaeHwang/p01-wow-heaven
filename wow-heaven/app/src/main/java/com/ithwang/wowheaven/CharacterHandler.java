package com.ithwang.wowheaven;

public class CharacterHandler {

  static String[] servers = {"아즈샤라",
      "가로나", "굴단", "노르간논", "달라란", "말퓨리온", "세나리우스", "줄진", "하이잘", "헬스크림",
      "데스윙", "듀로탄", "렉사르", "불타는 군단",
      "스톰레이지", "알렉스트라자", "와일드해머", "윈드러너"};
  static String[] factions = {"얼라이언스", "호드"};
  static String[] AllianceRaces = {"인간", "드워프", "나이트 엘프", "노움", "드레나이", "늑대인간",
      "판다렌", "공허 엘프", "빛벼림 드레나이", "검은무쇠 드워프", "쿨 티란", "기계노움"};
  static String[] HordeRaces = {"오크", "언데드", "타우렌", "트롤", "블러드 엘프", "고블린", 
      "판다렌", "나이트본", "높은산 타우렌", "마그하르 오크", "잔달라 트롤", "불페라"};
  static String[] HumanClasses = {}

  static class Character{
    int no;
    String serverName;
    String charName;
    String icon;
    String faction;
    String race;
    String charClass;
    String specialization;
    String role;
    int charLevel;
    Slot[] slots[];
  }

  static final int LENGTH = 150;
  static Character[] characters = new Character[LENGTH];
  static int size = 0;

  static void add() {
    System.out.println("[케릭터 등록]");

    Character c = new Character();

    c.no = Prompt.inputInt("번호");
    c.serverName = Prompt.inputString("서버명");
    c.charName = Prompt.inputString("케릭터명");
    c.faction = Prompt.inputString("진영");
    c.race = Prompt.inputString("종족");
    c.charClass = Prompt.inputString("직업");
    c.specialization = Prompt.inputString("전문화");
    c.role = Prompt.inputString("역할");
    c.charLevel = Prompt.inputInt("캐릭터레벨", 1, 60);

    characters[size++] = c;
    System.out.println("케릭터 등록을 완료 하였습니다.");
  }

  static void list() {
    System.out.println("[케릭터 목록]");

    if (size == 0) {
      System.out.println("등록된 케릭터가 없습니다.");
    }

    for (int i = 0; i < size; i++) {
      Character c = characters[i];
      System.out.printf("%d, %s-%s, %s, %s, %s %s, %s, 레벨: %d\n",
          c.no, c.charName, c.serverName, c.faction, c.race, c.specialization,c.charClass, c.role, c.charLevel);
    }
  }
}
