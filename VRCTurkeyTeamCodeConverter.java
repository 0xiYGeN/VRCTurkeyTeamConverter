/** 
  * Find team names from team codes with this app
  * @author 0xiYGeN
  * @version March 2024
  */ 

import java.util.Scanner;

public class VRCTurkeyTeamCodeConverter {
  private static final String[] teamData = {
    "1885A=LIGHT SIDE PRO",
    "2871F=Florya Falcons",
    "2781R=Florya Robotics",
    "8862A=,Sercev Robotics",
    "10201A=Çatý-Disconnected",
    "11543G=GreenTech",
    "11725Z=Alanya Robokod",
    "11881U=Script Robotics",
    "16600X=Renacimecha",
    "18416S=alfatech",
    "18634D=Apollon Robotic",
    "19190T=Takevians",
    "19640A=FLrobotics",
    "20230T=Takevians",
    "22911M=Team Majors",
    "23349A=BEST ELITE",
    "25255E=Enkatech Seniors",
    "28390T=MARKUT",
    "33001A=TAC BEARS",
    "34001A=IORobot",
    "34035A=MVR",
    "34100A=Robotist",
    "34111A=Zynthify",
    "34115A=Hype Teens",
    "34666A=Alamet",
    "34666M=Musibet",
    "38218A=VEXTORIOUS",
    "46262X=HEXAGON",
    "54437A=Tech4Peace",
    "57570A=KGM ROBOTICS",
    "59001A=TFL Robotics",
    "59669M=Luminous",
    "62322A=FLORYA BISONS",
    "63840A=Baby Sharks",
    "63840R=Rumble",
    "63840T=Fusion",
    "71080V=volTRan Robotics",
    "80084S=ASRoboics",
    "82090A=SEZMECH",
    "86840B=NEO Robotics",
    "86840C=Veritas Robotics",
    "86840M=Maschinellkraft",
    "90622B=Bilkent Next",
  };
  
  public static String convertTeamCodeToName(String teamCode) {
    for (String data : teamData) {
      String[] parts = data.split("=");
      if (parts.length == 2 && parts[0].equals(teamCode)) {
        return parts[1];
      }
    }
    return "Takým bulunamadý! Lütfen eklemek için benimle iletiþime geçin.";
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Takým kodlarýný giriniz:");
    
    for (int i = 1; i <= 10; i++) {
      System.out.println("Maç " + i + ":");
      System.out.println("Mavi Takým:");
      String blueTeamCode1 = scanner.next().toUpperCase();
      String blueTeamCode2 = scanner.next().toUpperCase();
      
      System.out.println("Kýrmýzý Takým:");
      String redTeamCode1 = scanner.next().toUpperCase();
      String redTeamCode2 = scanner.next().toUpperCase();
      
      String blueTeamName1 = convertTeamCodeToName(blueTeamCode1);
      String blueTeamName2 = convertTeamCodeToName(blueTeamCode2);
      String redTeamName1 = convertTeamCodeToName(redTeamCode1);
      String redTeamName2 = convertTeamCodeToName(redTeamCode2);
      
      System.out.println("Maç " + i + " - Mavi Takým:");
      System.out.println(" - " + blueTeamName1);
      System.out.println(" - " + blueTeamName2);
      
      System.out.println("Maç " + i + " - Kýrmýzý Takým:");
      System.out.println(" - " + redTeamName1);
      System.out.println(" - " + redTeamName2);
    }
    
    scanner.close();
  }
}