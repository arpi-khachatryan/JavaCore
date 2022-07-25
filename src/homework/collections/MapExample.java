package homework.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        List<FootballTeamMember> members = new ArrayList<>();
        members.add(new FootballTeamMember(1, "Tigran"));
        System.out.println(createFootballTeam(members));

        Map<Integer, String> footballTeamMember = new HashMap<>();
        footballTeamMember.put(11, "Poxos Poxosyan");
        footballTeamMember.put(12, "Petros Petrosyan");
        System.out.println(removeFromMap(footballTeamMember, 11));
        printAllMemberNames(footballTeamMember);
        printAllMembers(footballTeamMember);
    }

    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        FootballTeamMember footballTeamMember = members.get(0);
        Map<Integer, String> footballTeamMembers = new HashMap<>();
        footballTeamMembers.put(footballTeamMember.getNumber(), footballTeamMember.getName());
        return footballTeamMembers;
    }

    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        if (memberMap.containsKey(removedNumber)) {
            memberMap.remove(removedNumber);
            return true;
        } else {
            return false;
        }
    }

    static void printAllMemberNames(Map<Integer, String> memberMap) {
        System.out.println(memberMap.values());
    }

    static void printAllMembers(Map<Integer, String> memberMap) {
        System.out.println(memberMap.toString());
    }

    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
