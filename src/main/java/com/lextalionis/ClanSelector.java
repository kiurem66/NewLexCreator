package com.lextalionis;

import java.util.Iterator;

public class ClanSelector {
    private ClanSelector(){}

    public static Character charSel(int i){
        switch(i){
            case 0: return new Clan.Assamita();
            case 1: return new Clan.Baali();
            case 2: return new Clan.Brujah();
            case 3: return new Clan.CountryGangrel();
            case 4: return new Clan.CityGangrel();
            case 5: return new Clan.BloodBrothers();
            case 6: return new Clan.Giovanni();
            case 7: return new Clan.Lasombra();
            case 8: return new Clan.Malkavian();
            case 9: return new Clan.Nosferatu();
            case 10: return new Clan.Pander();
            case 11: return new Clan.Ravnos();
            case 12: return new Clan.Salubre();
            case 13: return new Clan.SetFollower();
            case 14: return new Clan.LightSerpent();
            case 15: return new Clan.Toreador();
            case 16: return new Clan.Tremere();
            case 17: return new Clan.Tzimisce();
            case 18: return new Clan.Ventrue();
            case 19: return new RevenantClan.Bratovich();
            case 20: return new RevenantClan.Grimaldi();
            case 21: return new RevenantClan.Obertus();
            case 22: return new RevenantClan.Zantosa();
            default: throw new IllegalArgumentException();
        }
    }


    public static String get(int i){
        switch(i){
            case 0: return "Assamita AT";
            case 1: return "Baali";
            case 2: return "Brujah AT";
            case 3: return "Gangrel \'di Campagna\'";
            case 4: return "Gangrel \'di Città\'";
            case 5: return "Gemelli di Sangue";
            case 6: return "Giovanni";
            case 7: return "Lasombra";
            case 8: return "Malkavian AT";
            case 9: return "Nosferatu AT";
            case 10: return "Pander";
            case 11: return "Ravnos AT";
            case 12: return "Salubre AT";
            case 13: return "Seguace del Set";
            case 14: return "Serpente della Luce";
            case 15: return "Toreador AT";
            case 16: return "Tremere AT";
            case 17: return "Tzimisce";
            case 18: return "Ventrue AT";
            case 19: return "Bratovich";
            case 20: return "Grimaldi";
            case 21: return "Obertus";
            case 22: return "Zantosa";
        }
        return null;
    }


    public static int get(String n){
        switch(n){
            case "Assamita AT": return 0;
            case "Baali": return 1;
            case "Brujah AT": return 2;
            case "Gangrel \'di Campagna\'": return 3;
            case "Gangrel \'di Città\'": return 4;
            case "Gemelli di Sangue": return 5;
            case "Giovanni": return 6;
            case "Lasombra": return 7;
            case "Malkavian AT": return 8;
            case "Nosferatu AT": return 9;
            case "Pander": return 10;
            case "Ravnos AT": return 11;
            case "Salubre AT": return 12;
            case "Seguace del Set": return 13;
            case "Serpente della Luce": return 14;
            case "Toreador AT": return 15;
            case "Tremere AT": return 16;
            case "Tzimisce": return 17;
            case "Ventrue AT": return 18;
            case "Bratovich": return 19;
            case "Grimaldi": return 20;
            case "Obertus": return 21;
            case "Zantosa": return 22;
        }
        return -1;
    }

    public static Iterator<String> iterator(){
        return new Iterator<String>() {
            int i=0;

            @Override
            public boolean hasNext() {
                return i<23;
            }

            @Override
            public String next() {
                return get(i++);
            }
        };
    }
}
